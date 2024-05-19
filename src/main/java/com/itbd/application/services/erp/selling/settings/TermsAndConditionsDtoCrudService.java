package com.itbd.application.services.erp.selling.settings;

import com.itbd.application.db.dao.CouponCodeDao;
import com.itbd.application.db.dto.CouponCodeDto;
import com.itbd.application.db.repos.CouponCodeRepository;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import dev.hilla.BrowserCallable;
import dev.hilla.Nonnull;
import dev.hilla.Nullable;
import dev.hilla.crud.CrudService;
import dev.hilla.crud.JpaFilterConverter;
import dev.hilla.crud.filter.Filter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@BrowserCallable
@AnonymousAllowed
public class SellingSettingsDtoCrudService implements CrudService<Selling, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final CouponCodeRepository couponCodeRepo;

    public SellingSettingsDtoCrudService(CouponCodeRepository couponCodeRepo, JpaFilterConverter jpaFilterConverter) {
        this.couponCodeRepo = couponCodeRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull CouponCodeDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<CouponCodeDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, CouponCodeDao.class)
                : Specification.anyOf();
        Page<CouponCodeDao> persons = couponCodeRepo.findAll(spec, pageable);
        return persons.stream().map(CouponCodeDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable CouponCodeDto save(CouponCodeDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        CouponCodeDao person = check
                ? couponCodeRepo.getReferenceById(value.name())
                : new CouponCodeDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        CouponCodeDto.fromDTO(value, person);
        return CouponCodeDto.fromEntity(couponCodeRepo.save(person));
    }

    @Override
    public void delete(String id) {
        couponCodeRepo.deleteById(id);
    }
}