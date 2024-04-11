package com.itbd.application.db.dto;

import com.itbd.application.db.dao.UaeVatSettingsDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record UaeVatSettingsDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String company,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static UaeVatSettingsDto fromEntity(UaeVatSettingsDao eUaeVatSettingsDao) {
        return new UaeVatSettingsDto(
                eUaeVatSettingsDao.getName(),
                eUaeVatSettingsDao.getCreation(),
                eUaeVatSettingsDao.getModified(),
                eUaeVatSettingsDao.getModifiedBy(),
                eUaeVatSettingsDao.getOwner(),
                eUaeVatSettingsDao.getIsDocStatus(),
                eUaeVatSettingsDao.getIdx(),
                eUaeVatSettingsDao.getCompany(),
                eUaeVatSettingsDao.getUserTags(),
                eUaeVatSettingsDao.getComments(),
                eUaeVatSettingsDao.getAssign(),
                eUaeVatSettingsDao.getLikedBy());
    }

    public static void fromDTO(UaeVatSettingsDto vUaeVatSettingsDto, UaeVatSettingsDao eUaeVatSettingsDao) {
        eUaeVatSettingsDao.setName(vUaeVatSettingsDto.name());
        eUaeVatSettingsDao.setCreation(vUaeVatSettingsDto.creation());
        eUaeVatSettingsDao.setModified(vUaeVatSettingsDto.modified());
        eUaeVatSettingsDao.setModifiedBy(vUaeVatSettingsDto.modifiedBy());
        eUaeVatSettingsDao.setOwner(vUaeVatSettingsDto.owner());
        eUaeVatSettingsDao.setIsDocStatus(vUaeVatSettingsDto.isDocStatus());
        eUaeVatSettingsDao.setIdx(vUaeVatSettingsDto.idx());
        eUaeVatSettingsDao.setCompany(vUaeVatSettingsDto.company());
        eUaeVatSettingsDao.setUserTags(vUaeVatSettingsDto.userTags());
        eUaeVatSettingsDao.setComments(vUaeVatSettingsDto.comments());
        eUaeVatSettingsDao.setAssign(vUaeVatSettingsDto.assign());
        eUaeVatSettingsDao.setLikedBy(vUaeVatSettingsDto.likedBy());
    }
}