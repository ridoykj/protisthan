package com.itbd.application.services.erp.setup;

import com.itbd.application.db.dao.print.PrintHeadingDao;
import com.itbd.application.db.dto.print.PrintHeadingDto;
import com.itbd.application.db.repos.PrintHeadingRepository;
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
public class PrintHeadingDtoCrudService implements CrudService<PrintHeadingDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final PrintHeadingRepository printHeadingRepo;

    public PrintHeadingDtoCrudService(PrintHeadingRepository printHeadingRepo, JpaFilterConverter jpaFilterConverter) {
        this.printHeadingRepo = printHeadingRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull PrintHeadingDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<PrintHeadingDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, PrintHeadingDao.class)
                : Specification.anyOf();
        Page<PrintHeadingDao> persons = printHeadingRepo.findAll(spec, pageable);
        return persons.stream().map(PrintHeadingDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable PrintHeadingDto save(PrintHeadingDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        PrintHeadingDao person = check
                ? printHeadingRepo.getReferenceById(value.name())
                : new PrintHeadingDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        PrintHeadingDto.fromDTO(value, person);
        return PrintHeadingDto.fromEntity(printHeadingRepo.save(person));
    }

    @Override
    public void delete(String id) {
        printHeadingRepo.deleteById(id);
    }
}