package com.itbd.application.db.dto;

import com.itbd.application.db.dao.assets.LocationDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record LocationDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String locationName,
        String parentLocation,
        Boolean isContainer,
        Boolean isGroup,
        BigDecimal latitude,
        BigDecimal longitude,
        BigDecimal area,
        String areaUom,
        String location,
        Integer lft,
        Integer rgt,
        String oldParent,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static LocationDto fromEntity(LocationDao eLocationDao) {
        return new LocationDto(
                eLocationDao.getName(),
                eLocationDao.getCreation(),
                eLocationDao.getModified(),
                eLocationDao.getModifiedBy(),
                eLocationDao.getOwner(),
                eLocationDao.getIsDocStatus(),
                eLocationDao.getIdx(),
                eLocationDao.getLocationName(),
                eLocationDao.getParentLocation(),
                eLocationDao.getIsContainer(),
                eLocationDao.getIsGroup(),
                eLocationDao.getLatitude(),
                eLocationDao.getLongitude(),
                eLocationDao.getArea(),
                eLocationDao.getAreaUom(),
                eLocationDao.getLocation(),
                eLocationDao.getLft(),
                eLocationDao.getRgt(),
                eLocationDao.getOldParent(),
                eLocationDao.getUserTags(),
                eLocationDao.getComments(),
                eLocationDao.getAssign(),
                eLocationDao.getLikedBy());
    }

    public static void fromDTO(LocationDto vLocationDto, LocationDao eLocationDao) {
        eLocationDao.setName(vLocationDto.name());
        eLocationDao.setCreation(vLocationDto.creation());
        eLocationDao.setModified(vLocationDto.modified());
        eLocationDao.setModifiedBy(vLocationDto.modifiedBy());
        eLocationDao.setOwner(vLocationDto.owner());
        eLocationDao.setIsDocStatus(vLocationDto.isDocStatus());
        eLocationDao.setIdx(vLocationDto.idx());
        eLocationDao.setLocationName(vLocationDto.locationName());
        eLocationDao.setParentLocation(vLocationDto.parentLocation());
        eLocationDao.setIsContainer(vLocationDto.isContainer());
        eLocationDao.setIsGroup(vLocationDto.isGroup());
        eLocationDao.setLatitude(vLocationDto.latitude());
        eLocationDao.setLongitude(vLocationDto.longitude());
        eLocationDao.setArea(vLocationDto.area());
        eLocationDao.setAreaUom(vLocationDto.areaUom());
        eLocationDao.setLocation(vLocationDto.location());
        eLocationDao.setLft(vLocationDto.lft());
        eLocationDao.setRgt(vLocationDto.rgt());
        eLocationDao.setOldParent(vLocationDto.oldParent());
        eLocationDao.setUserTags(vLocationDto.userTags());
        eLocationDao.setComments(vLocationDto.comments());
        eLocationDao.setAssign(vLocationDto.assign());
        eLocationDao.setLikedBy(vLocationDto.likedBy());
    }
}