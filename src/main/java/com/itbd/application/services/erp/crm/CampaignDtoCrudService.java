package com.itbd.application.services.erp.crm;

import com.itbd.application.db.dao.crm.CampaignDao;
import com.itbd.application.db.dto.campaign.CampaignDto;
import com.itbd.application.db.repos.CampaignRepository;
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
public class CampaignDtoCrudService implements CrudService<CampaignDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final CampaignRepository campaignRepo;

    public CampaignDtoCrudService(CampaignRepository campaignRepo, JpaFilterConverter jpaFilterConverter) {
        this.campaignRepo = campaignRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull CampaignDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<CampaignDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, CampaignDao.class)
                : Specification.anyOf();
        Page<CampaignDao> persons = campaignRepo.findAll(spec, pageable);
        return persons.stream().map(CampaignDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable CampaignDto save(CampaignDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        CampaignDao person = check
                ? campaignRepo.getReferenceById(value.name())
                : new CampaignDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        CampaignDto.fromDTO(value, person);
        return CampaignDto.fromEntity(campaignRepo.save(person));
    }

    @Override
    public void delete(String id) {
        campaignRepo.deleteById(id);
    }
}