package com.itbd.application.db.dto;

import com.itbd.application.db.dao.accounts.ModeOfPaymentDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ModeOfPaymentDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String modeOfPayment,
        Boolean enabled,
        String type,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ModeOfPaymentDto fromEntity(ModeOfPaymentDao eModeOfPaymentDao) {
        return new ModeOfPaymentDto(
                eModeOfPaymentDao.getName(),
                eModeOfPaymentDao.getCreation(),
                eModeOfPaymentDao.getModified(),
                eModeOfPaymentDao.getModifiedBy(),
                eModeOfPaymentDao.getOwner(),
                eModeOfPaymentDao.getIsDocStatus(),
                eModeOfPaymentDao.getIdx(),
                eModeOfPaymentDao.getModeOfPayment(),
                eModeOfPaymentDao.getEnabled(),
                eModeOfPaymentDao.getType(),
                eModeOfPaymentDao.getUserTags(),
                eModeOfPaymentDao.getComments(),
                eModeOfPaymentDao.getAssign(),
                eModeOfPaymentDao.getLikedBy());
    }

    public static void fromDTO(ModeOfPaymentDto vModeOfPaymentDto, ModeOfPaymentDao eModeOfPaymentDao) {
        eModeOfPaymentDao.setName(vModeOfPaymentDto.name());
        eModeOfPaymentDao.setCreation(vModeOfPaymentDto.creation());
        eModeOfPaymentDao.setModified(vModeOfPaymentDto.modified());
        eModeOfPaymentDao.setModifiedBy(vModeOfPaymentDto.modifiedBy());
        eModeOfPaymentDao.setOwner(vModeOfPaymentDto.owner());
        eModeOfPaymentDao.setIsDocStatus(vModeOfPaymentDto.isDocStatus());
        eModeOfPaymentDao.setIdx(vModeOfPaymentDto.idx());
        eModeOfPaymentDao.setModeOfPayment(vModeOfPaymentDto.modeOfPayment());
        eModeOfPaymentDao.setEnabled(vModeOfPaymentDto.enabled());
        eModeOfPaymentDao.setType(vModeOfPaymentDto.type());
        eModeOfPaymentDao.setUserTags(vModeOfPaymentDto.userTags());
        eModeOfPaymentDao.setComments(vModeOfPaymentDto.comments());
        eModeOfPaymentDao.setAssign(vModeOfPaymentDto.assign());
        eModeOfPaymentDao.setLikedBy(vModeOfPaymentDto.likedBy());
    }
}