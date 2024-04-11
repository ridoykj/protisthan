package com.itbd.application.db.dto;

import com.itbd.application.db.dao.SouthAfricaVatSettingsDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record SouthAfricaVatSettingsDto(
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
    public static SouthAfricaVatSettingsDto fromEntity(SouthAfricaVatSettingsDao eSouthAfricaVatSettingsDao) {
        return new SouthAfricaVatSettingsDto(
                eSouthAfricaVatSettingsDao.getName(),
                eSouthAfricaVatSettingsDao.getCreation(),
                eSouthAfricaVatSettingsDao.getModified(),
                eSouthAfricaVatSettingsDao.getModifiedBy(),
                eSouthAfricaVatSettingsDao.getOwner(),
                eSouthAfricaVatSettingsDao.getIsDocStatus(),
                eSouthAfricaVatSettingsDao.getIdx(),
                eSouthAfricaVatSettingsDao.getCompany(),
                eSouthAfricaVatSettingsDao.getUserTags(),
                eSouthAfricaVatSettingsDao.getComments(),
                eSouthAfricaVatSettingsDao.getAssign(),
                eSouthAfricaVatSettingsDao.getLikedBy());
    }

    public static void fromDTO(SouthAfricaVatSettingsDto vSouthAfricaVatSettingsDto, SouthAfricaVatSettingsDao eSouthAfricaVatSettingsDao) {
        eSouthAfricaVatSettingsDao.setName(vSouthAfricaVatSettingsDto.name());
        eSouthAfricaVatSettingsDao.setCreation(vSouthAfricaVatSettingsDto.creation());
        eSouthAfricaVatSettingsDao.setModified(vSouthAfricaVatSettingsDto.modified());
        eSouthAfricaVatSettingsDao.setModifiedBy(vSouthAfricaVatSettingsDto.modifiedBy());
        eSouthAfricaVatSettingsDao.setOwner(vSouthAfricaVatSettingsDto.owner());
        eSouthAfricaVatSettingsDao.setIsDocStatus(vSouthAfricaVatSettingsDto.isDocStatus());
        eSouthAfricaVatSettingsDao.setIdx(vSouthAfricaVatSettingsDto.idx());
        eSouthAfricaVatSettingsDao.setCompany(vSouthAfricaVatSettingsDto.company());
        eSouthAfricaVatSettingsDao.setUserTags(vSouthAfricaVatSettingsDto.userTags());
        eSouthAfricaVatSettingsDao.setComments(vSouthAfricaVatSettingsDto.comments());
        eSouthAfricaVatSettingsDao.setAssign(vSouthAfricaVatSettingsDto.assign());
        eSouthAfricaVatSettingsDao.setLikedBy(vSouthAfricaVatSettingsDto.likedBy());
    }
}