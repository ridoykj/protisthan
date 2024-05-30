package com.itbd.application.db.dto;

import com.itbd.application.db.dao.core.PackageReleaseDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record PackageReleaseDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String packages,
        Boolean publish,
        String path,
        Integer major,
        Integer minor,
        Integer patch,
        String releaseNotes,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static PackageReleaseDto fromEntity(PackageReleaseDao ePackageReleaseDao) {
        return new PackageReleaseDto(
                ePackageReleaseDao.getName(),
                ePackageReleaseDao.getCreation(),
                ePackageReleaseDao.getModified(),
                ePackageReleaseDao.getModifiedBy(),
                ePackageReleaseDao.getOwner(),
                ePackageReleaseDao.getIsDocStatus(),
                ePackageReleaseDao.getIdx(),
                ePackageReleaseDao.getPackages(),
                ePackageReleaseDao.getPublish(),
                ePackageReleaseDao.getPath(),
                ePackageReleaseDao.getMajor(),
                ePackageReleaseDao.getMinor(),
                ePackageReleaseDao.getPatch(),
                ePackageReleaseDao.getReleaseNotes(),
                ePackageReleaseDao.getUserTags(),
                ePackageReleaseDao.getComments(),
                ePackageReleaseDao.getAssign(),
                ePackageReleaseDao.getLikedBy());
    }

    public static void fromDTO(PackageReleaseDto vPackageReleaseDto, PackageReleaseDao ePackageReleaseDao) {
        ePackageReleaseDao.setName(vPackageReleaseDto.name());
        ePackageReleaseDao.setCreation(vPackageReleaseDto.creation());
        ePackageReleaseDao.setModified(vPackageReleaseDto.modified());
        ePackageReleaseDao.setModifiedBy(vPackageReleaseDto.modifiedBy());
        ePackageReleaseDao.setOwner(vPackageReleaseDto.owner());
        ePackageReleaseDao.setIsDocStatus(vPackageReleaseDto.isDocStatus());
        ePackageReleaseDao.setIdx(vPackageReleaseDto.idx());
        ePackageReleaseDao.setPackages(vPackageReleaseDto.packages());
        ePackageReleaseDao.setPublish(vPackageReleaseDto.publish());
        ePackageReleaseDao.setPath(vPackageReleaseDto.path());
        ePackageReleaseDao.setMajor(vPackageReleaseDto.major());
        ePackageReleaseDao.setMinor(vPackageReleaseDto.minor());
        ePackageReleaseDao.setPatch(vPackageReleaseDto.patch());
        ePackageReleaseDao.setReleaseNotes(vPackageReleaseDto.releaseNotes());
        ePackageReleaseDao.setUserTags(vPackageReleaseDto.userTags());
        ePackageReleaseDao.setComments(vPackageReleaseDto.comments());
        ePackageReleaseDao.setAssign(vPackageReleaseDto.assign());
        ePackageReleaseDao.setLikedBy(vPackageReleaseDto.likedBy());
    }
}