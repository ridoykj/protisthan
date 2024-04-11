package com.itbd.application.db.dto.quotations;

import com.itbd.application.db.dao.quotations.QuotationDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record QuotationDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String title,
        String namingSeries,
        String quotationTo,
        String partyName,
        String customerName,
        LocalDate transactionDate,
        LocalDate validTill,
        String orderType,
        String company,
        String amendedFrom,
        String currency,
        BigDecimal conversionRate,
        String sellingPriceList,
        String priceListCurrency,
        BigDecimal plcConversionRate,
        Boolean ignorePricingRule,
        String scanBarcode,
        BigDecimal totalQty,
        BigDecimal totalNetWeight,
        BigDecimal baseTotal,
        BigDecimal baseNetTotal,
        BigDecimal total,
        BigDecimal netTotal,
        String taxCategory,
        String taxesAndCharges,
        String shippingRule,
        String incoterm,
        String namedPlace,
        BigDecimal baseTotalTaxesAndCharges,
        BigDecimal totalTaxesAndCharges,
        BigDecimal baseGrandTotal,
        BigDecimal baseRoundingAdjustment,
        BigDecimal baseRoundedTotal,
        String baseInWords,
        BigDecimal grandTotal,
        BigDecimal roundingAdjustment,
        BigDecimal roundedTotal,
        String inWords,
        String applyDiscountOn,
        BigDecimal baseDiscountAmount,
        String couponCode,
        BigDecimal additionalDiscountPercentage,
        BigDecimal discountAmount,
        String referralSalesPartner,
        String otherChargesCalculation,
        String customerAddress,
        String addressDisplay,
        String contactPerson,
        String contactDisplay,
        String contactMobile,
        String contactEmail,
        String shippingAddressName,
        String shippingAddress,
        String companyAddress,
        String companyAddressDisplay,
        String paymentTermsTemplate,
        String tcName,
        String terms,
        String autoRepeat,
        String letterHead,
        Boolean groupSameItems,
        String selectPrintHeading,
        String language,
        String orderLostReason,
        String status,
        String customerGroup,
        String territory,
        String campaign,
        String source,
        String opportunity,
        String supplierQuotation,
        String enqDet,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static QuotationDto fromEntity(QuotationDao eQuotationDao) {
        return new QuotationDto(
                eQuotationDao.getName(),
                eQuotationDao.getCreation(),
                eQuotationDao.getModified(),
                eQuotationDao.getModifiedBy(),
                eQuotationDao.getOwner(),
                eQuotationDao.getIsDocStatus(),
                eQuotationDao.getIdx(),
                eQuotationDao.getTitle(),
                eQuotationDao.getNamingSeries(),
                eQuotationDao.getQuotationTo(),
                eQuotationDao.getPartyName(),
                eQuotationDao.getCustomerName(),
                eQuotationDao.getTransactionDate(),
                eQuotationDao.getValidTill(),
                eQuotationDao.getOrderType(),
                eQuotationDao.getCompany(),
                eQuotationDao.getAmendedFrom(),
                eQuotationDao.getCurrency(),
                eQuotationDao.getConversionRate(),
                eQuotationDao.getSellingPriceList(),
                eQuotationDao.getPriceListCurrency(),
                eQuotationDao.getPlcConversionRate(),
                eQuotationDao.getIgnorePricingRule(),
                eQuotationDao.getScanBarcode(),
                eQuotationDao.getTotalQty(),
                eQuotationDao.getTotalNetWeight(),
                eQuotationDao.getBaseTotal(),
                eQuotationDao.getBaseNetTotal(),
                eQuotationDao.getTotal(),
                eQuotationDao.getNetTotal(),
                eQuotationDao.getTaxCategory(),
                eQuotationDao.getTaxesAndCharges(),
                eQuotationDao.getShippingRule(),
                eQuotationDao.getIncoterm(),
                eQuotationDao.getNamedPlace(),
                eQuotationDao.getBaseTotalTaxesAndCharges(),
                eQuotationDao.getTotalTaxesAndCharges(),
                eQuotationDao.getBaseGrandTotal(),
                eQuotationDao.getBaseRoundingAdjustment(),
                eQuotationDao.getBaseRoundedTotal(),
                eQuotationDao.getBaseInWords(),
                eQuotationDao.getGrandTotal(),
                eQuotationDao.getRoundingAdjustment(),
                eQuotationDao.getRoundedTotal(),
                eQuotationDao.getInWords(),
                eQuotationDao.getApplyDiscountOn(),
                eQuotationDao.getBaseDiscountAmount(),
                eQuotationDao.getCouponCode(),
                eQuotationDao.getAdditionalDiscountPercentage(),
                eQuotationDao.getDiscountAmount(),
                eQuotationDao.getReferralSalesPartner(),
                eQuotationDao.getOtherChargesCalculation(),
                eQuotationDao.getCustomerAddress(),
                eQuotationDao.getAddressDisplay(),
                eQuotationDao.getContactPerson(),
                eQuotationDao.getContactDisplay(),
                eQuotationDao.getContactMobile(),
                eQuotationDao.getContactEmail(),
                eQuotationDao.getShippingAddressName(),
                eQuotationDao.getShippingAddress(),
                eQuotationDao.getCompanyAddress(),
                eQuotationDao.getCompanyAddressDisplay(),
                eQuotationDao.getPaymentTermsTemplate(),
                eQuotationDao.getTcName(),
                eQuotationDao.getTerms(),
                eQuotationDao.getAutoRepeat(),
                eQuotationDao.getLetterHead(),
                eQuotationDao.getGroupSameItems(),
                eQuotationDao.getSelectPrintHeading(),
                eQuotationDao.getLanguage(),
                eQuotationDao.getOrderLostReason(),
                eQuotationDao.getStatus(),
                eQuotationDao.getCustomerGroup(),
                eQuotationDao.getTerritory(),
                eQuotationDao.getCampaign(),
                eQuotationDao.getSource(),
                eQuotationDao.getOpportunity(),
                eQuotationDao.getSupplierQuotation(),
                eQuotationDao.getEnqDet(),
                eQuotationDao.getUserTags(),
                eQuotationDao.getComments(),
                eQuotationDao.getAssign(),
                eQuotationDao.getLikedBy());
    }

    public static void fromDTO(QuotationDto vQuotationDto, QuotationDao eQuotationDao) {
        eQuotationDao.setName(vQuotationDto.name());
        eQuotationDao.setCreation(vQuotationDto.creation());
        eQuotationDao.setModified(vQuotationDto.modified());
        eQuotationDao.setModifiedBy(vQuotationDto.modifiedBy());
        eQuotationDao.setOwner(vQuotationDto.owner());
        eQuotationDao.setIsDocStatus(vQuotationDto.isDocStatus());
        eQuotationDao.setIdx(vQuotationDto.idx());
        eQuotationDao.setTitle(vQuotationDto.title());
        eQuotationDao.setNamingSeries(vQuotationDto.namingSeries());
        eQuotationDao.setQuotationTo(vQuotationDto.quotationTo());
        eQuotationDao.setPartyName(vQuotationDto.partyName());
        eQuotationDao.setCustomerName(vQuotationDto.customerName());
        eQuotationDao.setTransactionDate(vQuotationDto.transactionDate());
        eQuotationDao.setValidTill(vQuotationDto.validTill());
        eQuotationDao.setOrderType(vQuotationDto.orderType());
        eQuotationDao.setCompany(vQuotationDto.company());
        eQuotationDao.setAmendedFrom(vQuotationDto.amendedFrom());
        eQuotationDao.setCurrency(vQuotationDto.currency());
        eQuotationDao.setConversionRate(vQuotationDto.conversionRate());
        eQuotationDao.setSellingPriceList(vQuotationDto.sellingPriceList());
        eQuotationDao.setPriceListCurrency(vQuotationDto.priceListCurrency());
        eQuotationDao.setPlcConversionRate(vQuotationDto.plcConversionRate());
        eQuotationDao.setIgnorePricingRule(vQuotationDto.ignorePricingRule());
        eQuotationDao.setScanBarcode(vQuotationDto.scanBarcode());
        eQuotationDao.setTotalQty(vQuotationDto.totalQty());
        eQuotationDao.setTotalNetWeight(vQuotationDto.totalNetWeight());
        eQuotationDao.setBaseTotal(vQuotationDto.baseTotal());
        eQuotationDao.setBaseNetTotal(vQuotationDto.baseNetTotal());
        eQuotationDao.setTotal(vQuotationDto.total());
        eQuotationDao.setNetTotal(vQuotationDto.netTotal());
        eQuotationDao.setTaxCategory(vQuotationDto.taxCategory());
        eQuotationDao.setTaxesAndCharges(vQuotationDto.taxesAndCharges());
        eQuotationDao.setShippingRule(vQuotationDto.shippingRule());
        eQuotationDao.setIncoterm(vQuotationDto.incoterm());
        eQuotationDao.setNamedPlace(vQuotationDto.namedPlace());
        eQuotationDao.setBaseTotalTaxesAndCharges(vQuotationDto.baseTotalTaxesAndCharges());
        eQuotationDao.setTotalTaxesAndCharges(vQuotationDto.totalTaxesAndCharges());
        eQuotationDao.setBaseGrandTotal(vQuotationDto.baseGrandTotal());
        eQuotationDao.setBaseRoundingAdjustment(vQuotationDto.baseRoundingAdjustment());
        eQuotationDao.setBaseRoundedTotal(vQuotationDto.baseRoundedTotal());
        eQuotationDao.setBaseInWords(vQuotationDto.baseInWords());
        eQuotationDao.setGrandTotal(vQuotationDto.grandTotal());
        eQuotationDao.setRoundingAdjustment(vQuotationDto.roundingAdjustment());
        eQuotationDao.setRoundedTotal(vQuotationDto.roundedTotal());
        eQuotationDao.setInWords(vQuotationDto.inWords());
        eQuotationDao.setApplyDiscountOn(vQuotationDto.applyDiscountOn());
        eQuotationDao.setBaseDiscountAmount(vQuotationDto.baseDiscountAmount());
        eQuotationDao.setCouponCode(vQuotationDto.couponCode());
        eQuotationDao.setAdditionalDiscountPercentage(vQuotationDto.additionalDiscountPercentage());
        eQuotationDao.setDiscountAmount(vQuotationDto.discountAmount());
        eQuotationDao.setReferralSalesPartner(vQuotationDto.referralSalesPartner());
        eQuotationDao.setOtherChargesCalculation(vQuotationDto.otherChargesCalculation());
        eQuotationDao.setCustomerAddress(vQuotationDto.customerAddress());
        eQuotationDao.setAddressDisplay(vQuotationDto.addressDisplay());
        eQuotationDao.setContactPerson(vQuotationDto.contactPerson());
        eQuotationDao.setContactDisplay(vQuotationDto.contactDisplay());
        eQuotationDao.setContactMobile(vQuotationDto.contactMobile());
        eQuotationDao.setContactEmail(vQuotationDto.contactEmail());
        eQuotationDao.setShippingAddressName(vQuotationDto.shippingAddressName());
        eQuotationDao.setShippingAddress(vQuotationDto.shippingAddress());
        eQuotationDao.setCompanyAddress(vQuotationDto.companyAddress());
        eQuotationDao.setCompanyAddressDisplay(vQuotationDto.companyAddressDisplay());
        eQuotationDao.setPaymentTermsTemplate(vQuotationDto.paymentTermsTemplate());
        eQuotationDao.setTcName(vQuotationDto.tcName());
        eQuotationDao.setTerms(vQuotationDto.terms());
        eQuotationDao.setAutoRepeat(vQuotationDto.autoRepeat());
        eQuotationDao.setLetterHead(vQuotationDto.letterHead());
        eQuotationDao.setGroupSameItems(vQuotationDto.groupSameItems());
        eQuotationDao.setSelectPrintHeading(vQuotationDto.selectPrintHeading());
        eQuotationDao.setLanguage(vQuotationDto.language());
        eQuotationDao.setOrderLostReason(vQuotationDto.orderLostReason());
        eQuotationDao.setStatus(vQuotationDto.status());
        eQuotationDao.setCustomerGroup(vQuotationDto.customerGroup());
        eQuotationDao.setTerritory(vQuotationDto.territory());
        eQuotationDao.setCampaign(vQuotationDto.campaign());
        eQuotationDao.setSource(vQuotationDto.source());
        eQuotationDao.setOpportunity(vQuotationDto.opportunity());
        eQuotationDao.setSupplierQuotation(vQuotationDto.supplierQuotation());
        eQuotationDao.setEnqDet(vQuotationDto.enqDet());
        eQuotationDao.setUserTags(vQuotationDto.userTags());
        eQuotationDao.setComments(vQuotationDto.comments());
        eQuotationDao.setAssign(vQuotationDto.assign());
        eQuotationDao.setLikedBy(vQuotationDto.likedBy());
    }
}