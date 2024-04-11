package com.itbd.application.db.dto.payments;

import com.itbd.application.db.dao.payments.PaymentTermsTemplateDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record PaymentTermsTemplateDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String templateName,
        Boolean allocatePaymentBasedOnPaymentTerms,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static PaymentTermsTemplateDto fromEntity(PaymentTermsTemplateDao ePaymentTermsTemplateDao) {
        return new PaymentTermsTemplateDto(
                ePaymentTermsTemplateDao.getName(),
                ePaymentTermsTemplateDao.getCreation(),
                ePaymentTermsTemplateDao.getModified(),
                ePaymentTermsTemplateDao.getModifiedBy(),
                ePaymentTermsTemplateDao.getOwner(),
                ePaymentTermsTemplateDao.getIsDocStatus(),
                ePaymentTermsTemplateDao.getIdx(),
                ePaymentTermsTemplateDao.getTemplateName(),
                ePaymentTermsTemplateDao.getAllocatePaymentBasedOnPaymentTerms(),
                ePaymentTermsTemplateDao.getUserTags(),
                ePaymentTermsTemplateDao.getComments(),
                ePaymentTermsTemplateDao.getAssign(),
                ePaymentTermsTemplateDao.getLikedBy());
    }

    public static void fromDTO(PaymentTermsTemplateDto vPaymentTermsTemplateDto, PaymentTermsTemplateDao ePaymentTermsTemplateDao) {
        ePaymentTermsTemplateDao.setName(vPaymentTermsTemplateDto.name());
        ePaymentTermsTemplateDao.setCreation(vPaymentTermsTemplateDto.creation());
        ePaymentTermsTemplateDao.setModified(vPaymentTermsTemplateDto.modified());
        ePaymentTermsTemplateDao.setModifiedBy(vPaymentTermsTemplateDto.modifiedBy());
        ePaymentTermsTemplateDao.setOwner(vPaymentTermsTemplateDto.owner());
        ePaymentTermsTemplateDao.setIsDocStatus(vPaymentTermsTemplateDto.isDocStatus());
        ePaymentTermsTemplateDao.setIdx(vPaymentTermsTemplateDto.idx());
        ePaymentTermsTemplateDao.setTemplateName(vPaymentTermsTemplateDto.templateName());
        ePaymentTermsTemplateDao.setAllocatePaymentBasedOnPaymentTerms(vPaymentTermsTemplateDto.allocatePaymentBasedOnPaymentTerms());
        ePaymentTermsTemplateDao.setUserTags(vPaymentTermsTemplateDto.userTags());
        ePaymentTermsTemplateDao.setComments(vPaymentTermsTemplateDto.comments());
        ePaymentTermsTemplateDao.setAssign(vPaymentTermsTemplateDto.assign());
        ePaymentTermsTemplateDao.setLikedBy(vPaymentTermsTemplateDto.likedBy());
    }
}