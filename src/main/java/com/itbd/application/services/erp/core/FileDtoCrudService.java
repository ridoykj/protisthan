package com.itbd.application.services.erp.core;

import com.itbd.application.db.dao.core.FileDao;
import com.itbd.application.db.dto.FileDto;
import com.itbd.application.db.repos.FileRepository;
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
public class FileDtoCrudService implements CrudService<FileDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final FileRepository fileRepo;

    public FileDtoCrudService(FileRepository fileRepo, JpaFilterConverter jpaFilterConverter) {
        this.fileRepo = fileRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull FileDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<FileDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, FileDao.class)
                : Specification.anyOf();
        Page<FileDao> persons = fileRepo.findAll(spec, pageable);
        return persons.stream().map(FileDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable FileDto save(FileDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        FileDao person = check
                ? fileRepo.getReferenceById(value.name())
                : new FileDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        FileDto.fromDTO(value, person);
        return FileDto.fromEntity(fileRepo.save(person));
    }

    @Override
    public void delete(String id) {
        fileRepo.deleteById(id);
    }
}