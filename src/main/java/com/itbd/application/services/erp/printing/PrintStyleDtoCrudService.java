package com.itbd.application.services.erp.printing;

import com.itbd.application.db.dao.printing.PrintStyleDao;
import com.itbd.application.db.dto.print.PrintStyleDto;
import com.itbd.application.db.repos.PrintStyleRepository;
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
public class PrintStyleDtoCrudService implements CrudService<PrintStyleDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final PrintStyleRepository printStyleRepo;

    public PrintStyleDtoCrudService(PrintStyleRepository printStyleRepo, JpaFilterConverter jpaFilterConverter) {
        this.printStyleRepo = printStyleRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull PrintStyleDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<PrintStyleDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, PrintStyleDao.class)
                : Specification.anyOf();
        Page<PrintStyleDao> persons = printStyleRepo.findAll(spec, pageable);
        return persons.stream().map(PrintStyleDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable PrintStyleDto save(PrintStyleDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        PrintStyleDao person = check
                ? printStyleRepo.getReferenceById(value.name())
                : new PrintStyleDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        PrintStyleDto.fromDTO(value, person);
        return PrintStyleDto.fromEntity(printStyleRepo.save(person));
    }

    @Override
    public void delete(String id) {
        printStyleRepo.deleteById(id);
    }
}