package com.itbd.application.db.dto.modules;

import com.itbd.application.db.dao.desk.ModuleOnboardingDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ModuleOnboardingDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String title,
        String subtitle,
        String module,
        String successMessage,
        String documentationUrl,
        Boolean isComplete,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ModuleOnboardingDto fromEntity(ModuleOnboardingDao eModuleOnboardingDao) {
        return new ModuleOnboardingDto(
                eModuleOnboardingDao.getName(),
                eModuleOnboardingDao.getCreation(),
                eModuleOnboardingDao.getModified(),
                eModuleOnboardingDao.getModifiedBy(),
                eModuleOnboardingDao.getOwner(),
                eModuleOnboardingDao.getIsDocStatus(),
                eModuleOnboardingDao.getIdx(),
                eModuleOnboardingDao.getTitle(),
                eModuleOnboardingDao.getSubtitle(),
                eModuleOnboardingDao.getModule(),
                eModuleOnboardingDao.getSuccessMessage(),
                eModuleOnboardingDao.getDocumentationUrl(),
                eModuleOnboardingDao.getIsComplete(),
                eModuleOnboardingDao.getUserTags(),
                eModuleOnboardingDao.getComments(),
                eModuleOnboardingDao.getAssign(),
                eModuleOnboardingDao.getLikedBy());
    }

    public static void fromDTO(ModuleOnboardingDto vModuleOnboardingDto, ModuleOnboardingDao eModuleOnboardingDao) {
        eModuleOnboardingDao.setName(vModuleOnboardingDto.name());
        eModuleOnboardingDao.setCreation(vModuleOnboardingDto.creation());
        eModuleOnboardingDao.setModified(vModuleOnboardingDto.modified());
        eModuleOnboardingDao.setModifiedBy(vModuleOnboardingDto.modifiedBy());
        eModuleOnboardingDao.setOwner(vModuleOnboardingDto.owner());
        eModuleOnboardingDao.setIsDocStatus(vModuleOnboardingDto.isDocStatus());
        eModuleOnboardingDao.setIdx(vModuleOnboardingDto.idx());
        eModuleOnboardingDao.setTitle(vModuleOnboardingDto.title());
        eModuleOnboardingDao.setSubtitle(vModuleOnboardingDto.subtitle());
        eModuleOnboardingDao.setModule(vModuleOnboardingDto.module());
        eModuleOnboardingDao.setSuccessMessage(vModuleOnboardingDto.successMessage());
        eModuleOnboardingDao.setDocumentationUrl(vModuleOnboardingDto.documentationUrl());
        eModuleOnboardingDao.setIsComplete(vModuleOnboardingDto.isComplete());
        eModuleOnboardingDao.setUserTags(vModuleOnboardingDto.userTags());
        eModuleOnboardingDao.setComments(vModuleOnboardingDto.comments());
        eModuleOnboardingDao.setAssign(vModuleOnboardingDto.assign());
        eModuleOnboardingDao.setLikedBy(vModuleOnboardingDto.likedBy());
    }
}