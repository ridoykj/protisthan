package com.itbd.application.db.dto.quotations;

import com.itbd.application.db.dao.setup.QuotationLostReasonDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record QuotationLostReasonDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String orderLostReason,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static QuotationLostReasonDto fromEntity(QuotationLostReasonDao eQuotationLostReasonDao) {
        return new QuotationLostReasonDto(
                eQuotationLostReasonDao.getName(),
                eQuotationLostReasonDao.getCreation(),
                eQuotationLostReasonDao.getModified(),
                eQuotationLostReasonDao.getModifiedBy(),
                eQuotationLostReasonDao.getOwner(),
                eQuotationLostReasonDao.getIsDocStatus(),
                eQuotationLostReasonDao.getIdx(),
                eQuotationLostReasonDao.getOrderLostReason(),
                eQuotationLostReasonDao.getUserTags(),
                eQuotationLostReasonDao.getComments(),
                eQuotationLostReasonDao.getAssign(),
                eQuotationLostReasonDao.getLikedBy());
    }

    public static void fromDTO(QuotationLostReasonDto vQuotationLostReasonDto, QuotationLostReasonDao eQuotationLostReasonDao) {
        eQuotationLostReasonDao.setName(vQuotationLostReasonDto.name());
        eQuotationLostReasonDao.setCreation(vQuotationLostReasonDto.creation());
        eQuotationLostReasonDao.setModified(vQuotationLostReasonDto.modified());
        eQuotationLostReasonDao.setModifiedBy(vQuotationLostReasonDto.modifiedBy());
        eQuotationLostReasonDao.setOwner(vQuotationLostReasonDto.owner());
        eQuotationLostReasonDao.setIsDocStatus(vQuotationLostReasonDto.isDocStatus());
        eQuotationLostReasonDao.setIdx(vQuotationLostReasonDto.idx());
        eQuotationLostReasonDao.setOrderLostReason(vQuotationLostReasonDto.orderLostReason());
        eQuotationLostReasonDao.setUserTags(vQuotationLostReasonDto.userTags());
        eQuotationLostReasonDao.setComments(vQuotationLostReasonDto.comments());
        eQuotationLostReasonDao.setAssign(vQuotationLostReasonDto.assign());
        eQuotationLostReasonDao.setLikedBy(vQuotationLostReasonDto.likedBy());
    }
}