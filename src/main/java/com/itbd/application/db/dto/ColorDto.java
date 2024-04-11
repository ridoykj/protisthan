package com.itbd.application.db.dto;

import com.itbd.application.db.dao.ColorDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ColorDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String color,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ColorDto fromEntity(ColorDao eColorDao) {
        return new ColorDto(
                eColorDao.getName(),
                eColorDao.getCreation(),
                eColorDao.getModified(),
                eColorDao.getModifiedBy(),
                eColorDao.getOwner(),
                eColorDao.getIsDocStatus(),
                eColorDao.getIdx(),
                eColorDao.getColor(),
                eColorDao.getUserTags(),
                eColorDao.getComments(),
                eColorDao.getAssign(),
                eColorDao.getLikedBy());
    }

    public static void fromDTO(ColorDto vColorDto, ColorDao eColorDao) {
        eColorDao.setName(vColorDto.name());
        eColorDao.setCreation(vColorDto.creation());
        eColorDao.setModified(vColorDto.modified());
        eColorDao.setModifiedBy(vColorDto.modifiedBy());
        eColorDao.setOwner(vColorDto.owner());
        eColorDao.setIsDocStatus(vColorDto.isDocStatus());
        eColorDao.setIdx(vColorDto.idx());
        eColorDao.setColor(vColorDto.color());
        eColorDao.setUserTags(vColorDto.userTags());
        eColorDao.setComments(vColorDto.comments());
        eColorDao.setAssign(vColorDto.assign());
        eColorDao.setLikedBy(vColorDto.likedBy());
    }
}