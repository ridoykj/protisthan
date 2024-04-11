package com.itbd.application.db.dto;

import com.itbd.application.db.dao.UnreconcilePaymentDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record UnreconcilePaymentDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String company,
        String voucherType,
        String voucherNo,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static UnreconcilePaymentDto fromEntity(UnreconcilePaymentDao eUnreconcilePaymentDao) {
        return new UnreconcilePaymentDto(
                eUnreconcilePaymentDao.getName(),
                eUnreconcilePaymentDao.getCreation(),
                eUnreconcilePaymentDao.getModified(),
                eUnreconcilePaymentDao.getModifiedBy(),
                eUnreconcilePaymentDao.getOwner(),
                eUnreconcilePaymentDao.getIsDocStatus(),
                eUnreconcilePaymentDao.getIdx(),
                eUnreconcilePaymentDao.getCompany(),
                eUnreconcilePaymentDao.getVoucherType(),
                eUnreconcilePaymentDao.getVoucherNo(),
                eUnreconcilePaymentDao.getAmendedFrom(),
                eUnreconcilePaymentDao.getUserTags(),
                eUnreconcilePaymentDao.getComments(),
                eUnreconcilePaymentDao.getAssign(),
                eUnreconcilePaymentDao.getLikedBy());
    }

    public static void fromDTO(UnreconcilePaymentDto vUnreconcilePaymentDto, UnreconcilePaymentDao eUnreconcilePaymentDao) {
        eUnreconcilePaymentDao.setName(vUnreconcilePaymentDto.name());
        eUnreconcilePaymentDao.setCreation(vUnreconcilePaymentDto.creation());
        eUnreconcilePaymentDao.setModified(vUnreconcilePaymentDto.modified());
        eUnreconcilePaymentDao.setModifiedBy(vUnreconcilePaymentDto.modifiedBy());
        eUnreconcilePaymentDao.setOwner(vUnreconcilePaymentDto.owner());
        eUnreconcilePaymentDao.setIsDocStatus(vUnreconcilePaymentDto.isDocStatus());
        eUnreconcilePaymentDao.setIdx(vUnreconcilePaymentDto.idx());
        eUnreconcilePaymentDao.setCompany(vUnreconcilePaymentDto.company());
        eUnreconcilePaymentDao.setVoucherType(vUnreconcilePaymentDto.voucherType());
        eUnreconcilePaymentDao.setVoucherNo(vUnreconcilePaymentDto.voucherNo());
        eUnreconcilePaymentDao.setAmendedFrom(vUnreconcilePaymentDto.amendedFrom());
        eUnreconcilePaymentDao.setUserTags(vUnreconcilePaymentDto.userTags());
        eUnreconcilePaymentDao.setComments(vUnreconcilePaymentDto.comments());
        eUnreconcilePaymentDao.setAssign(vUnreconcilePaymentDto.assign());
        eUnreconcilePaymentDao.setLikedBy(vUnreconcilePaymentDto.likedBy());
    }
}