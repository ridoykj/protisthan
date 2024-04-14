package com.itbd.application.db.dto.supplier;

import com.itbd.application.db.dao.supplier.SupplierQuotationDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record SupplierQuotationDto(
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
        String supplier,
        String supplierName,
        String company,
        String status,
        LocalDate transactionDate,
        LocalDate validTill,
        String quotationNumber,
        String amendedFrom,
        String costCenter,
        String project,
        String currency,
        BigDecimal conversionRate,
        String buyingPriceList,
        String priceListCurrency,
        BigDecimal plcConversionRate,
        Boolean ignorePricingRule,
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
        BigDecimal baseTaxesAndChargesAdded,
        BigDecimal baseTaxesAndChargesDeducted,
        BigDecimal baseTotalTaxesAndCharges,
        BigDecimal taxesAndChargesAdded,
        BigDecimal taxesAndChargesDeducted,
        BigDecimal totalTaxesAndCharges,
        String applyDiscountOn,
        BigDecimal baseDiscountAmount,
        BigDecimal additionalDiscountPercentage,
        BigDecimal discountAmount,
        BigDecimal baseGrandTotal,
        BigDecimal baseRoundingAdjustment,
        BigDecimal baseRoundedTotal,
        String baseInWords,
        BigDecimal grandTotal,
        BigDecimal roundingAdjustment,
        BigDecimal roundedTotal,
        String inWords,
        Boolean disableRoundedTotal,
        String otherChargesCalculation,
        String supplierAddress,
        String addressDisplay,
        String contactPerson,
        String contactDisplay,
        String contactMobile,
        String contactEmail,
        String shippingAddress,
        String shippingAddressDisplay,
        String billingAddress,
        String billingAddressDisplay,
        String tcName,
        String terms,
        String letterHead,
        Boolean groupSameItems,
        String selectPrintHeading,
        String language,
        String autoRepeat,
        Boolean isSubcontracted,
        String opportunity,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static SupplierQuotationDto fromEntity(SupplierQuotationDao eSupplierQuotationDao) {
        return new SupplierQuotationDto(
                eSupplierQuotationDao.getName(),
                eSupplierQuotationDao.getCreation(),
                eSupplierQuotationDao.getModified(),
                eSupplierQuotationDao.getModifiedBy(),
                eSupplierQuotationDao.getOwner(),
                eSupplierQuotationDao.getIsDocStatus(),
                eSupplierQuotationDao.getIdx(),
                eSupplierQuotationDao.getTitle(),
                eSupplierQuotationDao.getNamingSeries(),
                eSupplierQuotationDao.getSupplier(),
                eSupplierQuotationDao.getSupplierName(),
                eSupplierQuotationDao.getCompany(),
                eSupplierQuotationDao.getStatus(),
                eSupplierQuotationDao.getTransactionDate(),
                eSupplierQuotationDao.getValidTill(),
                eSupplierQuotationDao.getQuotationNumber(),
                eSupplierQuotationDao.getAmendedFrom(),
                eSupplierQuotationDao.getCostCenter(),
                eSupplierQuotationDao.getProject(),
                eSupplierQuotationDao.getCurrency(),
                eSupplierQuotationDao.getConversionRate(),
                eSupplierQuotationDao.getBuyingPriceList(),
                eSupplierQuotationDao.getPriceListCurrency(),
                eSupplierQuotationDao.getPlcConversionRate(),
                eSupplierQuotationDao.getIgnorePricingRule(),
                eSupplierQuotationDao.getTotalQty(),
                eSupplierQuotationDao.getTotalNetWeight(),
                eSupplierQuotationDao.getBaseTotal(),
                eSupplierQuotationDao.getBaseNetTotal(),
                eSupplierQuotationDao.getTotal(),
                eSupplierQuotationDao.getNetTotal(),
                eSupplierQuotationDao.getTaxCategory(),
                eSupplierQuotationDao.getTaxesAndCharges(),
                eSupplierQuotationDao.getShippingRule(),
                eSupplierQuotationDao.getIncoterm(),
                eSupplierQuotationDao.getNamedPlace(),
                eSupplierQuotationDao.getBaseTaxesAndChargesAdded(),
                eSupplierQuotationDao.getBaseTaxesAndChargesDeducted(),
                eSupplierQuotationDao.getBaseTotalTaxesAndCharges(),
                eSupplierQuotationDao.getTaxesAndChargesAdded(),
                eSupplierQuotationDao.getTaxesAndChargesDeducted(),
                eSupplierQuotationDao.getTotalTaxesAndCharges(),
                eSupplierQuotationDao.getApplyDiscountOn(),
                eSupplierQuotationDao.getBaseDiscountAmount(),
                eSupplierQuotationDao.getAdditionalDiscountPercentage(),
                eSupplierQuotationDao.getDiscountAmount(),
                eSupplierQuotationDao.getBaseGrandTotal(),
                eSupplierQuotationDao.getBaseRoundingAdjustment(),
                eSupplierQuotationDao.getBaseRoundedTotal(),
                eSupplierQuotationDao.getBaseInWords(),
                eSupplierQuotationDao.getGrandTotal(),
                eSupplierQuotationDao.getRoundingAdjustment(),
                eSupplierQuotationDao.getRoundedTotal(),
                eSupplierQuotationDao.getInWords(),
                eSupplierQuotationDao.getDisableRoundedTotal(),
                eSupplierQuotationDao.getOtherChargesCalculation(),
                eSupplierQuotationDao.getSupplierAddress(),
                eSupplierQuotationDao.getAddressDisplay(),
                eSupplierQuotationDao.getContactPerson(),
                eSupplierQuotationDao.getContactDisplay(),
                eSupplierQuotationDao.getContactMobile(),
                eSupplierQuotationDao.getContactEmail(),
                eSupplierQuotationDao.getShippingAddress(),
                eSupplierQuotationDao.getShippingAddressDisplay(),
                eSupplierQuotationDao.getBillingAddress(),
                eSupplierQuotationDao.getBillingAddressDisplay(),
                eSupplierQuotationDao.getTcName(),
                eSupplierQuotationDao.getTerms(),
                eSupplierQuotationDao.getLetterHead(),
                eSupplierQuotationDao.getGroupSameItems(),
                eSupplierQuotationDao.getSelectPrintHeading(),
                eSupplierQuotationDao.getLanguage(),
                eSupplierQuotationDao.getAutoRepeat(),
                eSupplierQuotationDao.getIsSubcontracted(),
                eSupplierQuotationDao.getOpportunity(),
                eSupplierQuotationDao.getUserTags(),
                eSupplierQuotationDao.getComments(),
                eSupplierQuotationDao.getAssign(),
                eSupplierQuotationDao.getLikedBy());
    }

    public static void fromDTO(SupplierQuotationDto vSupplierQuotationDto, SupplierQuotationDao eSupplierQuotationDao) {
        eSupplierQuotationDao.setName(vSupplierQuotationDto.name());
        eSupplierQuotationDao.setCreation(vSupplierQuotationDto.creation());
        eSupplierQuotationDao.setModified(vSupplierQuotationDto.modified());
        eSupplierQuotationDao.setModifiedBy(vSupplierQuotationDto.modifiedBy());
        eSupplierQuotationDao.setOwner(vSupplierQuotationDto.owner());
        eSupplierQuotationDao.setIsDocStatus(vSupplierQuotationDto.isDocStatus());
        eSupplierQuotationDao.setIdx(vSupplierQuotationDto.idx());
        eSupplierQuotationDao.setTitle(vSupplierQuotationDto.title());
        eSupplierQuotationDao.setNamingSeries(vSupplierQuotationDto.namingSeries());
        eSupplierQuotationDao.setSupplier(vSupplierQuotationDto.supplier());
        eSupplierQuotationDao.setSupplierName(vSupplierQuotationDto.supplierName());
        eSupplierQuotationDao.setCompany(vSupplierQuotationDto.company());
        eSupplierQuotationDao.setStatus(vSupplierQuotationDto.status());
        eSupplierQuotationDao.setTransactionDate(vSupplierQuotationDto.transactionDate());
        eSupplierQuotationDao.setValidTill(vSupplierQuotationDto.validTill());
        eSupplierQuotationDao.setQuotationNumber(vSupplierQuotationDto.quotationNumber());
        eSupplierQuotationDao.setAmendedFrom(vSupplierQuotationDto.amendedFrom());
        eSupplierQuotationDao.setCostCenter(vSupplierQuotationDto.costCenter());
        eSupplierQuotationDao.setProject(vSupplierQuotationDto.project());
        eSupplierQuotationDao.setCurrency(vSupplierQuotationDto.currency());
        eSupplierQuotationDao.setConversionRate(vSupplierQuotationDto.conversionRate());
        eSupplierQuotationDao.setBuyingPriceList(vSupplierQuotationDto.buyingPriceList());
        eSupplierQuotationDao.setPriceListCurrency(vSupplierQuotationDto.priceListCurrency());
        eSupplierQuotationDao.setPlcConversionRate(vSupplierQuotationDto.plcConversionRate());
        eSupplierQuotationDao.setIgnorePricingRule(vSupplierQuotationDto.ignorePricingRule());
        eSupplierQuotationDao.setTotalQty(vSupplierQuotationDto.totalQty());
        eSupplierQuotationDao.setTotalNetWeight(vSupplierQuotationDto.totalNetWeight());
        eSupplierQuotationDao.setBaseTotal(vSupplierQuotationDto.baseTotal());
        eSupplierQuotationDao.setBaseNetTotal(vSupplierQuotationDto.baseNetTotal());
        eSupplierQuotationDao.setTotal(vSupplierQuotationDto.total());
        eSupplierQuotationDao.setNetTotal(vSupplierQuotationDto.netTotal());
        eSupplierQuotationDao.setTaxCategory(vSupplierQuotationDto.taxCategory());
        eSupplierQuotationDao.setTaxesAndCharges(vSupplierQuotationDto.taxesAndCharges());
        eSupplierQuotationDao.setShippingRule(vSupplierQuotationDto.shippingRule());
        eSupplierQuotationDao.setIncoterm(vSupplierQuotationDto.incoterm());
        eSupplierQuotationDao.setNamedPlace(vSupplierQuotationDto.namedPlace());
        eSupplierQuotationDao.setBaseTaxesAndChargesAdded(vSupplierQuotationDto.baseTaxesAndChargesAdded());
        eSupplierQuotationDao.setBaseTaxesAndChargesDeducted(vSupplierQuotationDto.baseTaxesAndChargesDeducted());
        eSupplierQuotationDao.setBaseTotalTaxesAndCharges(vSupplierQuotationDto.baseTotalTaxesAndCharges());
        eSupplierQuotationDao.setTaxesAndChargesAdded(vSupplierQuotationDto.taxesAndChargesAdded());
        eSupplierQuotationDao.setTaxesAndChargesDeducted(vSupplierQuotationDto.taxesAndChargesDeducted());
        eSupplierQuotationDao.setTotalTaxesAndCharges(vSupplierQuotationDto.totalTaxesAndCharges());
        eSupplierQuotationDao.setApplyDiscountOn(vSupplierQuotationDto.applyDiscountOn());
        eSupplierQuotationDao.setBaseDiscountAmount(vSupplierQuotationDto.baseDiscountAmount());
        eSupplierQuotationDao.setAdditionalDiscountPercentage(vSupplierQuotationDto.additionalDiscountPercentage());
        eSupplierQuotationDao.setDiscountAmount(vSupplierQuotationDto.discountAmount());
        eSupplierQuotationDao.setBaseGrandTotal(vSupplierQuotationDto.baseGrandTotal());
        eSupplierQuotationDao.setBaseRoundingAdjustment(vSupplierQuotationDto.baseRoundingAdjustment());
        eSupplierQuotationDao.setBaseRoundedTotal(vSupplierQuotationDto.baseRoundedTotal());
        eSupplierQuotationDao.setBaseInWords(vSupplierQuotationDto.baseInWords());
        eSupplierQuotationDao.setGrandTotal(vSupplierQuotationDto.grandTotal());
        eSupplierQuotationDao.setRoundingAdjustment(vSupplierQuotationDto.roundingAdjustment());
        eSupplierQuotationDao.setRoundedTotal(vSupplierQuotationDto.roundedTotal());
        eSupplierQuotationDao.setInWords(vSupplierQuotationDto.inWords());
        eSupplierQuotationDao.setDisableRoundedTotal(vSupplierQuotationDto.disableRoundedTotal());
        eSupplierQuotationDao.setOtherChargesCalculation(vSupplierQuotationDto.otherChargesCalculation());
        eSupplierQuotationDao.setSupplierAddress(vSupplierQuotationDto.supplierAddress());
        eSupplierQuotationDao.setAddressDisplay(vSupplierQuotationDto.addressDisplay());
        eSupplierQuotationDao.setContactPerson(vSupplierQuotationDto.contactPerson());
        eSupplierQuotationDao.setContactDisplay(vSupplierQuotationDto.contactDisplay());
        eSupplierQuotationDao.setContactMobile(vSupplierQuotationDto.contactMobile());
        eSupplierQuotationDao.setContactEmail(vSupplierQuotationDto.contactEmail());
        eSupplierQuotationDao.setShippingAddress(vSupplierQuotationDto.shippingAddress());
        eSupplierQuotationDao.setShippingAddressDisplay(vSupplierQuotationDto.shippingAddressDisplay());
        eSupplierQuotationDao.setBillingAddress(vSupplierQuotationDto.billingAddress());
        eSupplierQuotationDao.setBillingAddressDisplay(vSupplierQuotationDto.billingAddressDisplay());
        eSupplierQuotationDao.setTcName(vSupplierQuotationDto.tcName());
        eSupplierQuotationDao.setTerms(vSupplierQuotationDto.terms());
        eSupplierQuotationDao.setLetterHead(vSupplierQuotationDto.letterHead());
        eSupplierQuotationDao.setGroupSameItems(vSupplierQuotationDto.groupSameItems());
        eSupplierQuotationDao.setSelectPrintHeading(vSupplierQuotationDto.selectPrintHeading());
        eSupplierQuotationDao.setLanguage(vSupplierQuotationDto.language());
        eSupplierQuotationDao.setAutoRepeat(vSupplierQuotationDto.autoRepeat());
        eSupplierQuotationDao.setIsSubcontracted(vSupplierQuotationDto.isSubcontracted());
        eSupplierQuotationDao.setOpportunity(vSupplierQuotationDto.opportunity());
        eSupplierQuotationDao.setUserTags(vSupplierQuotationDto.userTags());
        eSupplierQuotationDao.setComments(vSupplierQuotationDto.comments());
        eSupplierQuotationDao.setAssign(vSupplierQuotationDto.assign());
        eSupplierQuotationDao.setLikedBy(vSupplierQuotationDto.likedBy());
    }
}