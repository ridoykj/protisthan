package com.itbd.application.db.dto;

import com.itbd.application.db.dao.PackageDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record PackageDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String packageName,
        String readme,
        String licenseType,
        String license,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static PackageDto fromEntity(PackageDao ePackageDao) {
        return new PackageDto(
                ePackageDao.getName(),
                ePackageDao.getCreation(),
                ePackageDao.getModified(),
                ePackageDao.getModifiedBy(),
                ePackageDao.getOwner(),
                ePackageDao.getIsDocStatus(),
                ePackageDao.getIdx(),
                ePackageDao.getPackageName(),
                ePackageDao.getReadme(),
                ePackageDao.getLicenseType(),
                ePackageDao.getLicense(),
                ePackageDao.getUserTags(),
                ePackageDao.getComments(),
                ePackageDao.getAssign(),
                ePackageDao.getLikedBy());
    }

    public static void fromDTO(PackageDto vPackageDto, PackageDao ePackageDao) {
        ePackageDao.setName(vPackageDto.name());
        ePackageDao.setCreation(vPackageDto.creation());
        ePackageDao.setModified(vPackageDto.modified());
        ePackageDao.setModifiedBy(vPackageDto.modifiedBy());
        ePackageDao.setOwner(vPackageDto.owner());
        ePackageDao.setIsDocStatus(vPackageDto.isDocStatus());
        ePackageDao.setIdx(vPackageDto.idx());
        ePackageDao.setPackageName(vPackageDto.packageName());
        ePackageDao.setReadme(vPackageDto.readme());
        ePackageDao.setLicenseType(vPackageDto.licenseType());
        ePackageDao.setLicense(vPackageDto.license());
        ePackageDao.setUserTags(vPackageDto.userTags());
        ePackageDao.setComments(vPackageDto.comments());
        ePackageDao.setAssign(vPackageDto.assign());
        ePackageDao.setLikedBy(vPackageDto.likedBy());
    }
}