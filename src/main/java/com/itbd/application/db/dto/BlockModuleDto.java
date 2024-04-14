package com.itbd.application.db.dto;

import com.itbd.application.db.dao.BlockModuleDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record BlockModuleDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String module,
        String parent,
        String parentField,
        String parentType
) {
    public static BlockModuleDto fromEntity(BlockModuleDao eBlockModuleDao) {
        return new BlockModuleDto(
                eBlockModuleDao.getName(),
                eBlockModuleDao.getCreation(),
                eBlockModuleDao.getModified(),
                eBlockModuleDao.getModifiedBy(),
                eBlockModuleDao.getOwner(),
                eBlockModuleDao.getIsDocStatus(),
                eBlockModuleDao.getIdx(),
                eBlockModuleDao.getModule(),
                eBlockModuleDao.getParent(),
                eBlockModuleDao.getParentField(),
                eBlockModuleDao.getParentType());
    }

    public static void fromDTO(BlockModuleDto vBlockModuleDto, BlockModuleDao eBlockModuleDao) {
        eBlockModuleDao.setName(vBlockModuleDto.name());
        eBlockModuleDao.setCreation(vBlockModuleDto.creation());
        eBlockModuleDao.setModified(vBlockModuleDto.modified());
        eBlockModuleDao.setModifiedBy(vBlockModuleDto.modifiedBy());
        eBlockModuleDao.setOwner(vBlockModuleDto.owner());
        eBlockModuleDao.setIsDocStatus(vBlockModuleDto.isDocStatus());
        eBlockModuleDao.setIdx(vBlockModuleDto.idx());
        eBlockModuleDao.setModule(vBlockModuleDto.module());
        eBlockModuleDao.setParent(vBlockModuleDto.parent());
        eBlockModuleDao.setParentField(vBlockModuleDto.parentField());
        eBlockModuleDao.setParentType(vBlockModuleDto.parentType());
    }
}