package com.itbd.application.db.dto.modules;

import com.itbd.application.db.dao.modules.ModuleProfileDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ModuleProfileDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String moduleProfileName,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ModuleProfileDto fromEntity(ModuleProfileDao eModuleProfileDao) {
        return new ModuleProfileDto(
                eModuleProfileDao.getName(),
                eModuleProfileDao.getCreation(),
                eModuleProfileDao.getModified(),
                eModuleProfileDao.getModifiedBy(),
                eModuleProfileDao.getOwner(),
                eModuleProfileDao.getIsDocStatus(),
                eModuleProfileDao.getIdx(),
                eModuleProfileDao.getModuleProfileName(),
                eModuleProfileDao.getUserTags(),
                eModuleProfileDao.getComments(),
                eModuleProfileDao.getAssign(),
                eModuleProfileDao.getLikedBy());
    }

    public static void fromDTO(ModuleProfileDto vModuleProfileDto, ModuleProfileDao eModuleProfileDao) {
        eModuleProfileDao.setName(vModuleProfileDto.name());
        eModuleProfileDao.setCreation(vModuleProfileDto.creation());
        eModuleProfileDao.setModified(vModuleProfileDto.modified());
        eModuleProfileDao.setModifiedBy(vModuleProfileDto.modifiedBy());
        eModuleProfileDao.setOwner(vModuleProfileDto.owner());
        eModuleProfileDao.setIsDocStatus(vModuleProfileDto.isDocStatus());
        eModuleProfileDao.setIdx(vModuleProfileDto.idx());
        eModuleProfileDao.setModuleProfileName(vModuleProfileDto.moduleProfileName());
        eModuleProfileDao.setUserTags(vModuleProfileDto.userTags());
        eModuleProfileDao.setComments(vModuleProfileDto.comments());
        eModuleProfileDao.setAssign(vModuleProfileDto.assign());
        eModuleProfileDao.setLikedBy(vModuleProfileDto.likedBy());
    }
}