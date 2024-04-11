package com.itbd.application.db.dto.pos;

import com.itbd.application.db.dao.pos.PosProfileDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PosProfileDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String company,
        String customer,
        String country,
        Boolean disabled,
        String warehouse,
        String campaign,
        String companyAddress,
        Boolean hideImages,
        Boolean hideUnavailableItems,
        Boolean autoAddItemToCart,
        Boolean validateStockOnSave,
        Boolean updateStock,
        Boolean ignorePricingRule,
        Boolean allowRateChange,
        Boolean allowDiscountChange,
        String printFormat,
        String letterHead,
        String tcName,
        String selectPrintHeading,
        String sellingPriceList,
        String currency,
        String writeOffAccount,
        String writeOffCostCenter,
        BigDecimal writeOffLimit,
        String accountForChangeAmount,
        Boolean disableRoundedTotal,
        String incomeAccount,
        String expenseAccount,
        String taxesAndCharges,
        String taxCategory,
        String applyDiscountOn,
        String costCenter,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static PosProfileDto fromEntity(PosProfileDao ePosProfileDao) {
        return new PosProfileDto(
                ePosProfileDao.getName(),
                ePosProfileDao.getCreation(),
                ePosProfileDao.getModified(),
                ePosProfileDao.getModifiedBy(),
                ePosProfileDao.getOwner(),
                ePosProfileDao.getIsDocStatus(),
                ePosProfileDao.getIdx(),
                ePosProfileDao.getCompany(),
                ePosProfileDao.getCustomer(),
                ePosProfileDao.getCountry(),
                ePosProfileDao.getDisabled(),
                ePosProfileDao.getWarehouse(),
                ePosProfileDao.getCampaign(),
                ePosProfileDao.getCompanyAddress(),
                ePosProfileDao.getHideImages(),
                ePosProfileDao.getHideUnavailableItems(),
                ePosProfileDao.getAutoAddItemToCart(),
                ePosProfileDao.getValidateStockOnSave(),
                ePosProfileDao.getUpdateStock(),
                ePosProfileDao.getIgnorePricingRule(),
                ePosProfileDao.getAllowRateChange(),
                ePosProfileDao.getAllowDiscountChange(),
                ePosProfileDao.getPrintFormat(),
                ePosProfileDao.getLetterHead(),
                ePosProfileDao.getTcName(),
                ePosProfileDao.getSelectPrintHeading(),
                ePosProfileDao.getSellingPriceList(),
                ePosProfileDao.getCurrency(),
                ePosProfileDao.getWriteOffAccount(),
                ePosProfileDao.getWriteOffCostCenter(),
                ePosProfileDao.getWriteOffLimit(),
                ePosProfileDao.getAccountForChangeAmount(),
                ePosProfileDao.getDisableRoundedTotal(),
                ePosProfileDao.getIncomeAccount(),
                ePosProfileDao.getExpenseAccount(),
                ePosProfileDao.getTaxesAndCharges(),
                ePosProfileDao.getTaxCategory(),
                ePosProfileDao.getApplyDiscountOn(),
                ePosProfileDao.getCostCenter(),
                ePosProfileDao.getUserTags(),
                ePosProfileDao.getComments(),
                ePosProfileDao.getAssign(),
                ePosProfileDao.getLikedBy());
    }

    public static void fromDTO(PosProfileDto vPosProfileDto, PosProfileDao ePosProfileDao) {
        ePosProfileDao.setName(vPosProfileDto.name());
        ePosProfileDao.setCreation(vPosProfileDto.creation());
        ePosProfileDao.setModified(vPosProfileDto.modified());
        ePosProfileDao.setModifiedBy(vPosProfileDto.modifiedBy());
        ePosProfileDao.setOwner(vPosProfileDto.owner());
        ePosProfileDao.setIsDocStatus(vPosProfileDto.isDocStatus());
        ePosProfileDao.setIdx(vPosProfileDto.idx());
        ePosProfileDao.setCompany(vPosProfileDto.company());
        ePosProfileDao.setCustomer(vPosProfileDto.customer());
        ePosProfileDao.setCountry(vPosProfileDto.country());
        ePosProfileDao.setDisabled(vPosProfileDto.disabled());
        ePosProfileDao.setWarehouse(vPosProfileDto.warehouse());
        ePosProfileDao.setCampaign(vPosProfileDto.campaign());
        ePosProfileDao.setCompanyAddress(vPosProfileDto.companyAddress());
        ePosProfileDao.setHideImages(vPosProfileDto.hideImages());
        ePosProfileDao.setHideUnavailableItems(vPosProfileDto.hideUnavailableItems());
        ePosProfileDao.setAutoAddItemToCart(vPosProfileDto.autoAddItemToCart());
        ePosProfileDao.setValidateStockOnSave(vPosProfileDto.validateStockOnSave());
        ePosProfileDao.setUpdateStock(vPosProfileDto.updateStock());
        ePosProfileDao.setIgnorePricingRule(vPosProfileDto.ignorePricingRule());
        ePosProfileDao.setAllowRateChange(vPosProfileDto.allowRateChange());
        ePosProfileDao.setAllowDiscountChange(vPosProfileDto.allowDiscountChange());
        ePosProfileDao.setPrintFormat(vPosProfileDto.printFormat());
        ePosProfileDao.setLetterHead(vPosProfileDto.letterHead());
        ePosProfileDao.setTcName(vPosProfileDto.tcName());
        ePosProfileDao.setSelectPrintHeading(vPosProfileDto.selectPrintHeading());
        ePosProfileDao.setSellingPriceList(vPosProfileDto.sellingPriceList());
        ePosProfileDao.setCurrency(vPosProfileDto.currency());
        ePosProfileDao.setWriteOffAccount(vPosProfileDto.writeOffAccount());
        ePosProfileDao.setWriteOffCostCenter(vPosProfileDto.writeOffCostCenter());
        ePosProfileDao.setWriteOffLimit(vPosProfileDto.writeOffLimit());
        ePosProfileDao.setAccountForChangeAmount(vPosProfileDto.accountForChangeAmount());
        ePosProfileDao.setDisableRoundedTotal(vPosProfileDto.disableRoundedTotal());
        ePosProfileDao.setIncomeAccount(vPosProfileDto.incomeAccount());
        ePosProfileDao.setExpenseAccount(vPosProfileDto.expenseAccount());
        ePosProfileDao.setTaxesAndCharges(vPosProfileDto.taxesAndCharges());
        ePosProfileDao.setTaxCategory(vPosProfileDto.taxCategory());
        ePosProfileDao.setApplyDiscountOn(vPosProfileDto.applyDiscountOn());
        ePosProfileDao.setCostCenter(vPosProfileDto.costCenter());
        ePosProfileDao.setUserTags(vPosProfileDto.userTags());
        ePosProfileDao.setComments(vPosProfileDto.comments());
        ePosProfileDao.setAssign(vPosProfileDto.assign());
        ePosProfileDao.setLikedBy(vPosProfileDto.likedBy());
    }
}