package com.itbd.application.db.dto;

import com.itbd.application.db.dao.core.PackageImportDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record PackageImportDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String attachPackage,
        Boolean activate,
        Boolean force,
        String log,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static PackageImportDto fromEntity(PackageImportDao ePackageImportDao) {
        return new PackageImportDto(
                ePackageImportDao.getName(),
                ePackageImportDao.getCreation(),
                ePackageImportDao.getModified(),
                ePackageImportDao.getModifiedBy(),
                ePackageImportDao.getOwner(),
                ePackageImportDao.getIsDocStatus(),
                ePackageImportDao.getIdx(),
                ePackageImportDao.getAttachPackage(),
                ePackageImportDao.getActivate(),
                ePackageImportDao.getForce(),
                ePackageImportDao.getLog(),
                ePackageImportDao.getUserTags(),
                ePackageImportDao.getComments(),
                ePackageImportDao.getAssign(),
                ePackageImportDao.getLikedBy());
    }

    public static void fromDTO(PackageImportDto vPackageImportDto, PackageImportDao ePackageImportDao) {
        ePackageImportDao.setName(vPackageImportDto.name());
        ePackageImportDao.setCreation(vPackageImportDto.creation());
        ePackageImportDao.setModified(vPackageImportDto.modified());
        ePackageImportDao.setModifiedBy(vPackageImportDto.modifiedBy());
        ePackageImportDao.setOwner(vPackageImportDto.owner());
        ePackageImportDao.setIsDocStatus(vPackageImportDto.isDocStatus());
        ePackageImportDao.setIdx(vPackageImportDto.idx());
        ePackageImportDao.setAttachPackage(vPackageImportDto.attachPackage());
        ePackageImportDao.setActivate(vPackageImportDto.activate());
        ePackageImportDao.setForce(vPackageImportDto.force());
        ePackageImportDao.setLog(vPackageImportDto.log());
        ePackageImportDao.setUserTags(vPackageImportDto.userTags());
        ePackageImportDao.setComments(vPackageImportDto.comments());
        ePackageImportDao.setAssign(vPackageImportDto.assign());
        ePackageImportDao.setLikedBy(vPackageImportDto.likedBy());
    }
}