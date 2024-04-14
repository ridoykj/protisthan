package com.itbd.application.db.dto.sales;

import com.itbd.application.db.dao.sales.SalesTaxesAndChargesTemplateDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record SalesTaxesAndChargesTemplateDto(
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
    public static SalesTaxesAndChargesTemplateDto fromEntity(SalesTaxesAndChargesTemplateDao eSalesTaxesAndChargesTemplateDao) {
        return new SalesTaxesAndChargesTemplateDto(
                eSalesTaxesAndChargesTemplateDao.getName(),
                eSalesTaxesAndChargesTemplateDao.getCreation(),
                eSalesTaxesAndChargesTemplateDao.getModified(),
                eSalesTaxesAndChargesTemplateDao.getModifiedBy(),
                eSalesTaxesAndChargesTemplateDao.getOwner(),
                eSalesTaxesAndChargesTemplateDao.getIsDocStatus(),
                eSalesTaxesAndChargesTemplateDao.getIdx(),
                eSalesTaxesAndChargesTemplateDao.getTitle(),
                eSalesTaxesAndChargesTemplateDao.getIsDefault(),
                eSalesTaxesAndChargesTemplateDao.getDisabled(),
                eSalesTaxesAndChargesTemplateDao.getCompany(),
                eSalesTaxesAndChargesTemplateDao.getTaxCategory(),
                eSalesTaxesAndChargesTemplateDao.getUserTags(),
                eSalesTaxesAndChargesTemplateDao.getComments(),
                eSalesTaxesAndChargesTemplateDao.getAssign(),
                eSalesTaxesAndChargesTemplateDao.getLikedBy());
    }

    public static void fromDTO(SalesTaxesAndChargesTemplateDto vSalesTaxesAndChargesTemplateDto, SalesTaxesAndChargesTemplateDao eSalesTaxesAndChargesTemplateDao) {
        eSalesTaxesAndChargesTemplateDao.setName(vSalesTaxesAndChargesTemplateDto.name());
        eSalesTaxesAndChargesTemplateDao.setCreation(vSalesTaxesAndChargesTemplateDto.creation());
        eSalesTaxesAndChargesTemplateDao.setModified(vSalesTaxesAndChargesTemplateDto.modified());
        eSalesTaxesAndChargesTemplateDao.setModifiedBy(vSalesTaxesAndChargesTemplateDto.modifiedBy());
        eSalesTaxesAndChargesTemplateDao.setOwner(vSalesTaxesAndChargesTemplateDto.owner());
        eSalesTaxesAndChargesTemplateDao.setIsDocStatus(vSalesTaxesAndChargesTemplateDto.isDocStatus());
        eSalesTaxesAndChargesTemplateDao.setIdx(vSalesTaxesAndChargesTemplateDto.idx());
        eSalesTaxesAndChargesTemplateDao.setTitle(vSalesTaxesAndChargesTemplateDto.title());
        eSalesTaxesAndChargesTemplateDao.setIsDefault(vSalesTaxesAndChargesTemplateDto.isDefault());
        eSalesTaxesAndChargesTemplateDao.setDisabled(vSalesTaxesAndChargesTemplateDto.disabled());
        eSalesTaxesAndChargesTemplateDao.setCompany(vSalesTaxesAndChargesTemplateDto.company());
        eSalesTaxesAndChargesTemplateDao.setTaxCategory(vSalesTaxesAndChargesTemplateDto.taxCategory());
        eSalesTaxesAndChargesTemplateDao.setUserTags(vSalesTaxesAndChargesTemplateDto.userTags());
        eSalesTaxesAndChargesTemplateDao.setComments(vSalesTaxesAndChargesTemplateDto.comments());
        eSalesTaxesAndChargesTemplateDao.setAssign(vSalesTaxesAndChargesTemplateDto.assign());
        eSalesTaxesAndChargesTemplateDao.setLikedBy(vSalesTaxesAndChargesTemplateDto.likedBy());
    }
}