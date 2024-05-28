package com.itbd.application.services.erp.core;

import com.itbd.application.db.dao.BlockModuleDao;
import com.itbd.application.db.dto.BlockModuleDto;
import com.itbd.application.db.repos.BlockModuleRepository;
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
public class BlockModuleDtoCrudService implements CrudService<BlockModuleDto, String> {
    private final JpaFilterConverter jpaFilterConverter;
    private final BlockModuleRepository blockModuleRepo;

    public BlockModuleDtoCrudService(BlockModuleRepository blockModuleRepo, JpaFilterConverter jpaFilterConverter) {
        this.blockModuleRepo = blockModuleRepo;
        this.jpaFilterConverter = jpaFilterConverter;
    }

    @Override
    @Nonnull
    public List<@Nonnull BlockModuleDto> list(Pageable pageable, @Nullable Filter filter) {
        // Basic list implementation that only covers pagination,
        // but not sorting or filtering
        Specification<BlockModuleDao> spec = filter != null
                ? jpaFilterConverter.toSpec(filter, BlockModuleDao.class)
                : Specification.anyOf();
        Page<BlockModuleDao> persons = blockModuleRepo.findAll(spec, pageable);
        return persons.stream().map(BlockModuleDto::fromEntity).toList();
    }

    @Override
    @Transactional
    public @Nullable BlockModuleDto save(BlockModuleDto value) {
        boolean check = value.name() != null && !value.name().isEmpty();
        BlockModuleDao person = check
                ? blockModuleRepo.getReferenceById(value.name())
                : new BlockModuleDao();

        // person.setRecordComment(check ? "UPDATE" : "NEW");
        BlockModuleDto.fromDTO(value, person);
        return BlockModuleDto.fromEntity(blockModuleRepo.save(person));
    }

    @Override
    public void delete(String id) {
        blockModuleRepo.deleteById(id);
    }
}