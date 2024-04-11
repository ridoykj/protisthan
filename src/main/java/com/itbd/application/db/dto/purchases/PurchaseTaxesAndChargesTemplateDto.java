package com.itbd.application.db.dto.purchases;

import com.itbd.application.db.dao.purchases.PurchaseTaxesAndChargesTemplateDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record PurchaseTaxesAndChargesTemplateDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String title,
        Boolean isDefault,
        Boolean disabled,
        String company,
        String taxCategory,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static PurchaseTaxesAndChargesTemplateDto fromEntity(PurchaseTaxesAndChargesTemplateDao ePurchaseTaxesAndChargesTemplateDao) {
        return new PurchaseTaxesAndChargesTemplateDto(
                ePurchaseTaxesAndChargesTemplateDao.getName(),
                ePurchaseTaxesAndChargesTemplateDao.getCreation(),
                ePurchaseTaxesAndChargesTemplateDao.getModified(),
                ePurchaseTaxesAndChargesTemplateDao.getModifiedBy(),
                ePurchaseTaxesAndChargesTemplateDao.getOwner(),
                ePurchaseTaxesAndChargesTemplateDao.getIsDocStatus(),
                ePurchaseTaxesAndChargesTemplateDao.getIdx(),
                ePurchaseTaxesAndChargesTemplateDao.getTitle(),
                ePurchaseTaxesAndChargesTemplateDao.getIsDefault(),
                ePurchaseTaxesAndChargesTemplateDao.getDisabled(),
                ePurchaseTaxesAndChargesTemplateDao.getCompany(),
                ePurchaseTaxesAndChargesTemplateDao.getTaxCategory(),
                ePurchaseTaxesAndChargesTemplateDao.getUserTags(),
                ePurchaseTaxesAndChargesTemplateDao.getComments(),
                ePurchaseTaxesAndChargesTemplateDao.getAssign(),
                ePurchaseTaxesAndChargesTemplateDao.getLikedBy());
    }

    public static void fromDTO(PurchaseTaxesAndChargesTemplateDto vPurchaseTaxesAndChargesTemplateDto, PurchaseTaxesAndChargesTemplateDao ePurchaseTaxesAndChargesTemplateDao) {
        ePurchaseTaxesAndChargesTemplateDao.setName(vPurchaseTaxesAndChargesTemplateDto.name());
        ePurchaseTaxesAndChargesTemplateDao.setCreation(vPurchaseTaxesAndChargesTemplateDto.creation());
        ePurchaseTaxesAndChargesTemplateDao.setModified(vPurchaseTaxesAndChargesTemplateDto.modified());
        ePurchaseTaxesAndChargesTemplateDao.setModifiedBy(vPurchaseTaxesAndChargesTemplateDto.modifiedBy());
        ePurchaseTaxesAndChargesTemplateDao.setOwner(vPurchaseTaxesAndChargesTemplateDto.owner());
        ePurchaseTaxesAndChargesTemplateDao.setIsDocStatus(vPurchaseTaxesAndChargesTemplateDto.isDocStatus());
        ePurchaseTaxesAndChargesTemplateDao.setIdx(vPurchaseTaxesAndChargesTemplateDto.idx());
        ePurchaseTaxesAndChargesTemplateDao.setTitle(vPurchaseTaxesAndChargesTemplateDto.title());
        ePurchaseTaxesAndChargesTemplateDao.setIsDefault(vPurchaseTaxesAndChargesTemplateDto.isDefault());
        ePurchaseTaxesAndChargesTemplateDao.setDisabled(vPurchaseTaxesAndChargesTemplateDto.disabled());
        ePurchaseTaxesAndChargesTemplateDao.setCompany(vPurchaseTaxesAndChargesTemplateDto.company());
        ePurchaseTaxesAndChargesTemplateDao.setTaxCategory(vPurchaseTaxesAndChargesTemplateDto.taxCategory());
        ePurchaseTaxesAndChargesTemplateDao.setUserTags(vPurchaseTaxesAndChargesTemplateDto.userTags());
        ePurchaseTaxesAndChargesTemplateDao.setComments(vPurchaseTaxesAndChargesTemplateDto.comments());
        ePurchaseTaxesAndChargesTemplateDao.setAssign(vPurchaseTaxesAndChargesTemplateDto.assign());
        ePurchaseTaxesAndChargesTemplateDao.setLikedBy(vPurchaseTaxesAndChargesTemplateDto.likedBy());
    }
}