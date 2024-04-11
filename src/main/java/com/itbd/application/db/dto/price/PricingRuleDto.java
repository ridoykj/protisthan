package com.itbd.application.db.dto.price;

import com.itbd.application.db.dao.price.PricingRuleDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record PricingRuleDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String namingSeries,
        String title,
        Integer disable,
        String applyOn,
        String priceOrProductDiscount,
        String warehouse,
        Boolean mixedConditions,
        Boolean isCumulative,
        Boolean couponCodeBased,
        String applyRuleOnOther,
        String otherItemCode,
        String otherItemGroup,
        String otherBrand,
        Boolean selling,
        Boolean buying,
        String applicableFor,
        String customer,
        String customerGroup,
        String territory,
        String salesPartner,
        String campaign,
        String supplier,
        String supplierGroup,
        BigDecimal minQty,
        BigDecimal maxQty,
        BigDecimal minAmt,
        BigDecimal maxAmt,
        Boolean sameItem,
        String freeItem,
        BigDecimal freeQty,
        BigDecimal freeItemRate,
        String freeItemUom,
        Boolean roundFreeQty,
        Boolean isRecursive,
        BigDecimal recurseFor,
        BigDecimal applyRecursionOver,
        LocalDate validFrom,
        LocalDate validUpto,
        String company,
        String currency,
        String marginType,
        BigDecimal marginRateOrAmount,
        String rateOrDiscount,
        String applyDiscountOn,
        BigDecimal rate,
        BigDecimal discountAmount,
        BigDecimal discountPercentage,
        String forPriceList,
        BigDecimal thresholdPercentage,
        String priority,
        String condition,
        Boolean applyMultiplePricingRules,
        Boolean applyDiscountOnRate,
        Boolean validateAppliedRule,
        String ruleDescription,
        String promotionalSchemeId,
        String promotionalScheme,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static PricingRuleDto fromEntity(PricingRuleDao ePricingRuleDao) {
        return new PricingRuleDto(
                ePricingRuleDao.getName(),
                ePricingRuleDao.getCreation(),
                ePricingRuleDao.getModified(),
                ePricingRuleDao.getModifiedBy(),
                ePricingRuleDao.getOwner(),
                ePricingRuleDao.getIsDocStatus(),
                ePricingRuleDao.getIdx(),
                ePricingRuleDao.getNamingSeries(),
                ePricingRuleDao.getTitle(),
                ePricingRuleDao.getDisable(),
                ePricingRuleDao.getApplyOn(),
                ePricingRuleDao.getPriceOrProductDiscount(),
                ePricingRuleDao.getWarehouse(),
                ePricingRuleDao.getMixedConditions(),
                ePricingRuleDao.getIsCumulative(),
                ePricingRuleDao.getCouponCodeBased(),
                ePricingRuleDao.getApplyRuleOnOther(),
                ePricingRuleDao.getOtherItemCode(),
                ePricingRuleDao.getOtherItemGroup(),
                ePricingRuleDao.getOtherBrand(),
                ePricingRuleDao.getSelling(),
                ePricingRuleDao.getBuying(),
                ePricingRuleDao.getApplicableFor(),
                ePricingRuleDao.getCustomer(),
                ePricingRuleDao.getCustomerGroup(),
                ePricingRuleDao.getTerritory(),
                ePricingRuleDao.getSalesPartner(),
                ePricingRuleDao.getCampaign(),
                ePricingRuleDao.getSupplier(),
                ePricingRuleDao.getSupplierGroup(),
                ePricingRuleDao.getMinQty(),
                ePricingRuleDao.getMaxQty(),
                ePricingRuleDao.getMinAmt(),
                ePricingRuleDao.getMaxAmt(),
                ePricingRuleDao.getSameItem(),
                ePricingRuleDao.getFreeItem(),
                ePricingRuleDao.getFreeQty(),
                ePricingRuleDao.getFreeItemRate(),
                ePricingRuleDao.getFreeItemUom(),
                ePricingRuleDao.getRoundFreeQty(),
                ePricingRuleDao.getIsRecursive(),
                ePricingRuleDao.getRecurseFor(),
                ePricingRuleDao.getApplyRecursionOver(),
                ePricingRuleDao.getValidFrom(),
                ePricingRuleDao.getValidUpto(),
                ePricingRuleDao.getCompany(),
                ePricingRuleDao.getCurrency(),
                ePricingRuleDao.getMarginType(),
                ePricingRuleDao.getMarginRateOrAmount(),
                ePricingRuleDao.getRateOrDiscount(),
                ePricingRuleDao.getApplyDiscountOn(),
                ePricingRuleDao.getRate(),
                ePricingRuleDao.getDiscountAmount(),
                ePricingRuleDao.getDiscountPercentage(),
                ePricingRuleDao.getForPriceList(),
                ePricingRuleDao.getThresholdPercentage(),
                ePricingRuleDao.getPriority(),
                ePricingRuleDao.getCondition(),
                ePricingRuleDao.getApplyMultiplePricingRules(),
                ePricingRuleDao.getApplyDiscountOnRate(),
                ePricingRuleDao.getValidateAppliedRule(),
                ePricingRuleDao.getRuleDescription(),
                ePricingRuleDao.getPromotionalSchemeId(),
                ePricingRuleDao.getPromotionalScheme(),
                ePricingRuleDao.getUserTags(),
                ePricingRuleDao.getComments(),
                ePricingRuleDao.getAssign(),
                ePricingRuleDao.getLikedBy());
    }

    public static void fromDTO(PricingRuleDto vPricingRuleDto, PricingRuleDao ePricingRuleDao) {
        ePricingRuleDao.setName(vPricingRuleDto.name());
        ePricingRuleDao.setCreation(vPricingRuleDto.creation());
        ePricingRuleDao.setModified(vPricingRuleDto.modified());
        ePricingRuleDao.setModifiedBy(vPricingRuleDto.modifiedBy());
        ePricingRuleDao.setOwner(vPricingRuleDto.owner());
        ePricingRuleDao.setIsDocStatus(vPricingRuleDto.isDocStatus());
        ePricingRuleDao.setIdx(vPricingRuleDto.idx());
        ePricingRuleDao.setNamingSeries(vPricingRuleDto.namingSeries());
        ePricingRuleDao.setTitle(vPricingRuleDto.title());
        ePricingRuleDao.setDisable(vPricingRuleDto.disable());
        ePricingRuleDao.setApplyOn(vPricingRuleDto.applyOn());
        ePricingRuleDao.setPriceOrProductDiscount(vPricingRuleDto.priceOrProductDiscount());
        ePricingRuleDao.setWarehouse(vPricingRuleDto.warehouse());
        ePricingRuleDao.setMixedConditions(vPricingRuleDto.mixedConditions());
        ePricingRuleDao.setIsCumulative(vPricingRuleDto.isCumulative());
        ePricingRuleDao.setCouponCodeBased(vPricingRuleDto.couponCodeBased());
        ePricingRuleDao.setApplyRuleOnOther(vPricingRuleDto.applyRuleOnOther());
        ePricingRuleDao.setOtherItemCode(vPricingRuleDto.otherItemCode());
        ePricingRuleDao.setOtherItemGroup(vPricingRuleDto.otherItemGroup());
        ePricingRuleDao.setOtherBrand(vPricingRuleDto.otherBrand());
        ePricingRuleDao.setSelling(vPricingRuleDto.selling());
        ePricingRuleDao.setBuying(vPricingRuleDto.buying());
        ePricingRuleDao.setApplicableFor(vPricingRuleDto.applicableFor());
        ePricingRuleDao.setCustomer(vPricingRuleDto.customer());
        ePricingRuleDao.setCustomerGroup(vPricingRuleDto.customerGroup());
        ePricingRuleDao.setTerritory(vPricingRuleDto.territory());
        ePricingRuleDao.setSalesPartner(vPricingRuleDto.salesPartner());
        ePricingRuleDao.setCampaign(vPricingRuleDto.campaign());
        ePricingRuleDao.setSupplier(vPricingRuleDto.supplier());
        ePricingRuleDao.setSupplierGroup(vPricingRuleDto.supplierGroup());
        ePricingRuleDao.setMinQty(vPricingRuleDto.minQty());
        ePricingRuleDao.setMaxQty(vPricingRuleDto.maxQty());
        ePricingRuleDao.setMinAmt(vPricingRuleDto.minAmt());
        ePricingRuleDao.setMaxAmt(vPricingRuleDto.maxAmt());
        ePricingRuleDao.setSameItem(vPricingRuleDto.sameItem());
        ePricingRuleDao.setFreeItem(vPricingRuleDto.freeItem());
        ePricingRuleDao.setFreeQty(vPricingRuleDto.freeQty());
        ePricingRuleDao.setFreeItemRate(vPricingRuleDto.freeItemRate());
        ePricingRuleDao.setFreeItemUom(vPricingRuleDto.freeItemUom());
        ePricingRuleDao.setRoundFreeQty(vPricingRuleDto.roundFreeQty());
        ePricingRuleDao.setIsRecursive(vPricingRuleDto.isRecursive());
        ePricingRuleDao.setRecurseFor(vPricingRuleDto.recurseFor());
        ePricingRuleDao.setApplyRecursionOver(vPricingRuleDto.applyRecursionOver());
        ePricingRuleDao.setValidFrom(vPricingRuleDto.validFrom());
        ePricingRuleDao.setValidUpto(vPricingRuleDto.validUpto());
        ePricingRuleDao.setCompany(vPricingRuleDto.company());
        ePricingRuleDao.setCurrency(vPricingRuleDto.currency());
        ePricingRuleDao.setMarginType(vPricingRuleDto.marginType());
        ePricingRuleDao.setMarginRateOrAmount(vPricingRuleDto.marginRateOrAmount());
        ePricingRuleDao.setRateOrDiscount(vPricingRuleDto.rateOrDiscount());
        ePricingRuleDao.setApplyDiscountOn(vPricingRuleDto.applyDiscountOn());
        ePricingRuleDao.setRate(vPricingRuleDto.rate());
        ePricingRuleDao.setDiscountAmount(vPricingRuleDto.discountAmount());
        ePricingRuleDao.setDiscountPercentage(vPricingRuleDto.discountPercentage());
        ePricingRuleDao.setForPriceList(vPricingRuleDto.forPriceList());
        ePricingRuleDao.setThresholdPercentage(vPricingRuleDto.thresholdPercentage());
        ePricingRuleDao.setPriority(vPricingRuleDto.priority());
        ePricingRuleDao.setCondition(vPricingRuleDto.condition());
        ePricingRuleDao.setApplyMultiplePricingRules(vPricingRuleDto.applyMultiplePricingRules());
        ePricingRuleDao.setApplyDiscountOnRate(vPricingRuleDto.applyDiscountOnRate());
        ePricingRuleDao.setValidateAppliedRule(vPricingRuleDto.validateAppliedRule());
        ePricingRuleDao.setRuleDescription(vPricingRuleDto.ruleDescription());
        ePricingRuleDao.setPromotionalSchemeId(vPricingRuleDto.promotionalSchemeId());
        ePricingRuleDao.setPromotionalScheme(vPricingRuleDto.promotionalScheme());
        ePricingRuleDao.setUserTags(vPricingRuleDto.userTags());
        ePricingRuleDao.setComments(vPricingRuleDto.comments());
        ePricingRuleDao.setAssign(vPricingRuleDto.assign());
        ePricingRuleDao.setLikedBy(vPricingRuleDto.likedBy());
    }
}