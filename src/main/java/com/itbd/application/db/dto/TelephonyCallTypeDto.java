package com.itbd.application.db.dto;

import com.itbd.application.db.dao.TelephonyCallTypeDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record TelephonyCallTypeDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String callType,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static TelephonyCallTypeDto fromEntity(TelephonyCallTypeDao eTelephonyCallTypeDao) {
        return new TelephonyCallTypeDto(
                eTelephonyCallTypeDao.getName(),
                eTelephonyCallTypeDao.getCreation(),
                eTelephonyCallTypeDao.getModified(),
                eTelephonyCallTypeDao.getModifiedBy(),
                eTelephonyCallTypeDao.getOwner(),
                eTelephonyCallTypeDao.getIsDocStatus(),
                eTelephonyCallTypeDao.getIdx(),
                eTelephonyCallTypeDao.getCallType(),
                eTelephonyCallTypeDao.getAmendedFrom(),
                eTelephonyCallTypeDao.getUserTags(),
                eTelephonyCallTypeDao.getComments(),
                eTelephonyCallTypeDao.getAssign(),
                eTelephonyCallTypeDao.getLikedBy());
    }

    public static void fromDTO(TelephonyCallTypeDto vTelephonyCallTypeDto, TelephonyCallTypeDao eTelephonyCallTypeDao) {
        eTelephonyCallTypeDao.setName(vTelephonyCallTypeDto.name());
        eTelephonyCallTypeDao.setCreation(vTelephonyCallTypeDto.creation());
        eTelephonyCallTypeDao.setModified(vTelephonyCallTypeDto.modified());
        eTelephonyCallTypeDao.setModifiedBy(vTelephonyCallTypeDto.modifiedBy());
        eTelephonyCallTypeDao.setOwner(vTelephonyCallTypeDto.owner());
        eTelephonyCallTypeDao.setIsDocStatus(vTelephonyCallTypeDto.isDocStatus());
        eTelephonyCallTypeDao.setIdx(vTelephonyCallTypeDto.idx());
        eTelephonyCallTypeDao.setCallType(vTelephonyCallTypeDto.callType());
        eTelephonyCallTypeDao.setAmendedFrom(vTelephonyCallTypeDto.amendedFrom());
        eTelephonyCallTypeDao.setUserTags(vTelephonyCallTypeDto.userTags());
        eTelephonyCallTypeDao.setComments(vTelephonyCallTypeDto.comments());
        eTelephonyCallTypeDao.setAssign(vTelephonyCallTypeDto.assign());
        eTelephonyCallTypeDao.setLikedBy(vTelephonyCallTypeDto.likedBy());
    }
}