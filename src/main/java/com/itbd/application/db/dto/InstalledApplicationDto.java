package com.itbd.application.db.dto;

import com.itbd.application.db.dao.InstalledApplicationDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record InstalledApplicationDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String appName,
        String appVersion,
        String gitBranch,
        String parent,
        String parentField,
        String parentType
) {
    public static InstalledApplicationDto fromEntity(InstalledApplicationDao eInstalledApplicationDao) {
        return new InstalledApplicationDto(
                eInstalledApplicationDao.getName(),
                eInstalledApplicationDao.getCreation(),
                eInstalledApplicationDao.getModified(),
                eInstalledApplicationDao.getModifiedBy(),
                eInstalledApplicationDao.getOwner(),
                eInstalledApplicationDao.getIsDocStatus(),
                eInstalledApplicationDao.getIdx(),
                eInstalledApplicationDao.getAppName(),
                eInstalledApplicationDao.getAppVersion(),
                eInstalledApplicationDao.getGitBranch(),
                eInstalledApplicationDao.getParent(),
                eInstalledApplicationDao.getParentField(),
                eInstalledApplicationDao.getParentType());
    }

    public static void fromDTO(InstalledApplicationDto vInstalledApplicationDto, InstalledApplicationDao eInstalledApplicationDao) {
        eInstalledApplicationDao.setName(vInstalledApplicationDto.name());
        eInstalledApplicationDao.setCreation(vInstalledApplicationDto.creation());
        eInstalledApplicationDao.setModified(vInstalledApplicationDto.modified());
        eInstalledApplicationDao.setModifiedBy(vInstalledApplicationDto.modifiedBy());
        eInstalledApplicationDao.setOwner(vInstalledApplicationDto.owner());
        eInstalledApplicationDao.setIsDocStatus(vInstalledApplicationDto.isDocStatus());
        eInstalledApplicationDao.setIdx(vInstalledApplicationDto.idx());
        eInstalledApplicationDao.setAppName(vInstalledApplicationDto.appName());
        eInstalledApplicationDao.setAppVersion(vInstalledApplicationDto.appVersion());
        eInstalledApplicationDao.setGitBranch(vInstalledApplicationDto.gitBranch());
        eInstalledApplicationDao.setParent(vInstalledApplicationDto.parent());
        eInstalledApplicationDao.setParentField(vInstalledApplicationDto.parentField());
        eInstalledApplicationDao.setParentType(vInstalledApplicationDto.parentType());
    }
}