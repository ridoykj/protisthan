package com.itbd.application.db.dto.modules;

import com.itbd.application.db.dao.core.ModuleDefDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ModuleDefDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String moduleName,
        Boolean custom,
        String packages,
        String appName,
        String restrictToDomain,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ModuleDefDto fromEntity(ModuleDefDao eModuleDefDao) {
        return new ModuleDefDto(
                eModuleDefDao.getName(),
                eModuleDefDao.getCreation(),
                eModuleDefDao.getModified(),
                eModuleDefDao.getModifiedBy(),
                eModuleDefDao.getOwner(),
                eModuleDefDao.getIsDocStatus(),
                eModuleDefDao.getIdx(),
                eModuleDefDao.getModuleName(),
                eModuleDefDao.getCustom(),
                eModuleDefDao.getPackages(),
                eModuleDefDao.getAppName(),
                eModuleDefDao.getRestrictToDomain(),
                eModuleDefDao.getUserTags(),
                eModuleDefDao.getComments(),
                eModuleDefDao.getAssign(),
                eModuleDefDao.getLikedBy());
    }

    public static void fromDTO(ModuleDefDto vModuleDefDto, ModuleDefDao eModuleDefDao) {
        eModuleDefDao.setName(vModuleDefDto.name());
        eModuleDefDao.setCreation(vModuleDefDto.creation());
        eModuleDefDao.setModified(vModuleDefDto.modified());
        eModuleDefDao.setModifiedBy(vModuleDefDto.modifiedBy());
        eModuleDefDao.setOwner(vModuleDefDto.owner());
        eModuleDefDao.setIsDocStatus(vModuleDefDto.isDocStatus());
        eModuleDefDao.setIdx(vModuleDefDto.idx());
        eModuleDefDao.setModuleName(vModuleDefDto.moduleName());
        eModuleDefDao.setCustom(vModuleDefDto.custom());
        eModuleDefDao.setPackages(vModuleDefDto.packages());
        eModuleDefDao.setAppName(vModuleDefDto.appName());
        eModuleDefDao.setRestrictToDomain(vModuleDefDto.restrictToDomain());
        eModuleDefDao.setUserTags(vModuleDefDto.userTags());
        eModuleDefDao.setComments(vModuleDefDto.comments());
        eModuleDefDao.setAssign(vModuleDefDto.assign());
        eModuleDefDao.setLikedBy(vModuleDefDto.likedBy());
    }
}