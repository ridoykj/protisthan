package com.itbd.application.services.erp.core;

import com.itbd.application.db.dao.doctypes.DocPermDao;
import com.itbd.application.db.dto.doctypes.DocPermDto;
import com.itbd.application.db.repos.DocPermRepository;
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
public class DocPermDtoCrudService implements CrudService<DocPermDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final DocPermRepository docPermRepo;

    public DocPermDtoCrudService(DocPermRepository docPermRepo, JpaFilterConverter jpaFilterConverter) {
        this.docPermRepo = docPermRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull DocPermDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<DocPermDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, DocPermDao.class)
                : Specification.anyOf();
        Page<DocPermDao> persons = docPermRepo.findAll(spec, pageable);
        return persons.stream().map(DocPermDto::fromEntity).toList();
    }

    @Nonnull
    public List<@Nonnull String> docType(Pageable pageable, @Nullable String filter) {
        Page<String> persons = docPermRepo.findParent("%"+filter+"%", pageable);
        return persons.stream().map(String::trim).toList();
    }


    @Nonnull
    public List<@Nonnull String> roleProfile(Pageable pageable, @Nullable String filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Page<String> persons = docPermRepo.findRole("%"+filter+"%", pageable);
        return persons.stream().map(String::trim).toList();
    }


    @Override
    @Transactional
    public @Nullable DocPermDto save(DocPermDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        DocPermDao person = check
                ? docPermRepo.getReferenceById(value.name())
                : new DocPermDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        DocPermDto.fromDTO(value, person);
        return DocPermDto.fromEntity(docPermRepo.save(person));
    }

    @Override
    public void delete(String id) {
        docPermRepo.deleteById(id);
    }
}