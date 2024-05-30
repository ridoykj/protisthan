package com.itbd.application.db.dto.quotations;

import com.itbd.application.db.dao.setup.QuotationLostReasonDetailDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record QuotationLostReasonDetailDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String lostReason,
        String parent,
        String parentField,
        String parentType
) {
    public static QuotationLostReasonDetailDto fromEntity(QuotationLostReasonDetailDao eQuotationLostReasonDetailDao) {
        return new QuotationLostReasonDetailDto(
                eQuotationLostReasonDetailDao.getName(),
                eQuotationLostReasonDetailDao.getCreation(),
                eQuotationLostReasonDetailDao.getModified(),
                eQuotationLostReasonDetailDao.getModifiedBy(),
                eQuotationLostReasonDetailDao.getOwner(),
                eQuotationLostReasonDetailDao.getIsDocStatus(),
                eQuotationLostReasonDetailDao.getIdx(),
                eQuotationLostReasonDetailDao.getLostReason(),
                eQuotationLostReasonDetailDao.getParent(),
                eQuotationLostReasonDetailDao.getParentField(),
                eQuotationLostReasonDetailDao.getParentType());
    }

    public static void fromDTO(QuotationLostReasonDetailDto vQuotationLostReasonDetailDto, QuotationLostReasonDetailDao eQuotationLostReasonDetailDao) {
        eQuotationLostReasonDetailDao.setName(vQuotationLostReasonDetailDto.name());
        eQuotationLostReasonDetailDao.setCreation(vQuotationLostReasonDetailDto.creation());
        eQuotationLostReasonDetailDao.setModified(vQuotationLostReasonDetailDto.modified());
        eQuotationLostReasonDetailDao.setModifiedBy(vQuotationLostReasonDetailDto.modifiedBy());
        eQuotationLostReasonDetailDao.setOwner(vQuotationLostReasonDetailDto.owner());
        eQuotationLostReasonDetailDao.setIsDocStatus(vQuotationLostReasonDetailDto.isDocStatus());
        eQuotationLostReasonDetailDao.setIdx(vQuotationLostReasonDetailDto.idx());
        eQuotationLostReasonDetailDao.setLostReason(vQuotationLostReasonDetailDto.lostReason());
        eQuotationLostReasonDetailDao.setParent(vQuotationLostReasonDetailDto.parent());
        eQuotationLostReasonDetailDao.setParentField(vQuotationLostReasonDetailDto.parentField());
        eQuotationLostReasonDetailDao.setParentType(vQuotationLostReasonDetailDto.parentType());
    }
}