package com.itbd.application.db.dto;

import com.itbd.application.db.dao.ManufacturerDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ManufacturerDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String shortName,
        String fullName,
        String website,
        String country,
        String logo,
        String notes,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ManufacturerDto fromEntity(ManufacturerDao eManufacturerDao) {
        return new ManufacturerDto(
                eManufacturerDao.getName(),
                eManufacturerDao.getCreation(),
                eManufacturerDao.getModified(),
                eManufacturerDao.getModifiedBy(),
                eManufacturerDao.getOwner(),
                eManufacturerDao.getIsDocStatus(),
                eManufacturerDao.getIdx(),
                eManufacturerDao.getShortName(),
                eManufacturerDao.getFullName(),
                eManufacturerDao.getWebsite(),
                eManufacturerDao.getCountry(),
                eManufacturerDao.getLogo(),
                eManufacturerDao.getNotes(),
                eManufacturerDao.getUserTags(),
                eManufacturerDao.getComments(),
                eManufacturerDao.getAssign(),
                eManufacturerDao.getLikedBy());
    }

    public static void fromDTO(ManufacturerDto vManufacturerDto, ManufacturerDao eManufacturerDao) {
        eManufacturerDao.setName(vManufacturerDto.name());
        eManufacturerDao.setCreation(vManufacturerDto.creation());
        eManufacturerDao.setModified(vManufacturerDto.modified());
        eManufacturerDao.setModifiedBy(vManufacturerDto.modifiedBy());
        eManufacturerDao.setOwner(vManufacturerDto.owner());
        eManufacturerDao.setIsDocStatus(vManufacturerDto.isDocStatus());
        eManufacturerDao.setIdx(vManufacturerDto.idx());
        eManufacturerDao.setShortName(vManufacturerDto.shortName());
        eManufacturerDao.setFullName(vManufacturerDto.fullName());
        eManufacturerDao.setWebsite(vManufacturerDto.website());
        eManufacturerDao.setCountry(vManufacturerDto.country());
        eManufacturerDao.setLogo(vManufacturerDto.logo());
        eManufacturerDao.setNotes(vManufacturerDto.notes());
        eManufacturerDao.setUserTags(vManufacturerDto.userTags());
        eManufacturerDao.setComments(vManufacturerDto.comments());
        eManufacturerDao.setAssign(vManufacturerDto.assign());
        eManufacturerDao.setLikedBy(vManufacturerDto.likedBy());
    }
}