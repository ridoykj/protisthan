package com.itbd.application.services.erp.printing;

import com.itbd.application.db.dao.print.PrintFormatDao;
import com.itbd.application.db.dto.print.PrintFormatDto;
import com.itbd.application.db.repos.PrintFormatRepository;
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
public class PrintFormatDtoCrudService implements CrudService<PrintFormatDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final PrintFormatRepository printFormatRepo;

    public PrintFormatDtoCrudService(PrintFormatRepository printFormatRepo, JpaFilterConverter jpaFilterConverter) {
        this.printFormatRepo = printFormatRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull PrintFormatDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<PrintFormatDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, PrintFormatDao.class)
                : Specification.anyOf();
        Page<PrintFormatDao> persons = printFormatRepo.findAll(spec, pageable);
        return persons.stream().map(PrintFormatDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable PrintFormatDto save(PrintFormatDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        PrintFormatDao person = check
                ? printFormatRepo.getReferenceById(value.name())
                : new PrintFormatDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        PrintFormatDto.fromDTO(value, person);
        return PrintFormatDto.fromEntity(printFormatRepo.save(person));
    }

    @Override
    public void delete(String id) {
        printFormatRepo.deleteById(id);
    }
}