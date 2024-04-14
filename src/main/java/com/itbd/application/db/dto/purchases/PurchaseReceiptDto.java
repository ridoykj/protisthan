package com.itbd.application.db.dto.purchases;

import com.itbd.application.db.dao.purchases.PurchaseReceiptDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public record PurchaseReceiptDto(
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
        String supplierDeliveryNote,
        String subcontractingReceipt,
        LocalDate postingDate,
        LocalTime postingTime,
        Boolean setPostingTime,
        String company,
        Boolean applyPutawayRule,
        Boolean isReturn,
        String returnAgainst,
        String costCenter,
        String project,
        String currency,
        BigDecimal conversionRate,
        String buyingPriceList,
        String priceListCurrency,
        BigDecimal plcConversionRate,
        Boolean ignorePricingRule,
        String scanBarcode,
        String setWarehouse,
        String setFromWarehouse,
        String rejectedWarehouse,
        Boolean isSubcontracted,
        String supplierWarehouse,
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
        BigDecimal baseGrandTotal,
        BigDecimal baseRoundingAdjustment,
        BigDecimal baseRoundedTotal,
        String baseInWords,
        BigDecimal grandTotal,
        BigDecimal roundingAdjustment,
        BigDecimal roundedTotal,
        String inWords,
        Boolean disableRoundedTotal,
        String applyDiscountOn,
        BigDecimal baseDiscountAmount,
        BigDecimal additionalDiscountPercentage,
        BigDecimal discountAmount,
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
        String status,
        BigDecimal perBilled,
        BigDecimal perReturned,
        String autoRepeat,
        String letterHead,
        Boolean groupSameItems,
        String selectPrintHeading,
        String language,
        String transporterName,
        String lrNo,
        LocalDate lrDate,
        String instructions,
        Boolean isInternalSupplier,
        String representsCompany,
        String interCompanyReference,
        String remarks,
        String range,
        String amendedFrom,
        Boolean isOldSubcontractingFlow,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static PurchaseReceiptDto fromEntity(PurchaseReceiptDao ePurchaseReceiptDao) {
        return new PurchaseReceiptDto(
                ePurchaseReceiptDao.getName(),
                ePurchaseReceiptDao.getCreation(),
                ePurchaseReceiptDao.getModified(),
                ePurchaseReceiptDao.getModifiedBy(),
                ePurchaseReceiptDao.getOwner(),
                ePurchaseReceiptDao.getIsDocStatus(),
                ePurchaseReceiptDao.getIdx(),
                ePurchaseReceiptDao.getTitle(),
                ePurchaseReceiptDao.getNamingSeries(),
                ePurchaseReceiptDao.getSupplier(),
                ePurchaseReceiptDao.getSupplierName(),
                ePurchaseReceiptDao.getSupplierDeliveryNote(),
                ePurchaseReceiptDao.getSubcontractingReceipt(),
                ePurchaseReceiptDao.getPostingDate(),
                ePurchaseReceiptDao.getPostingTime(),
                ePurchaseReceiptDao.getSetPostingTime(),
                ePurchaseReceiptDao.getCompany(),
                ePurchaseReceiptDao.getApplyPutawayRule(),
                ePurchaseReceiptDao.getIsReturn(),
                ePurchaseReceiptDao.getReturnAgainst(),
                ePurchaseReceiptDao.getCostCenter(),
                ePurchaseReceiptDao.getProject(),
                ePurchaseReceiptDao.getCurrency(),
                ePurchaseReceiptDao.getConversionRate(),
                ePurchaseReceiptDao.getBuyingPriceList(),
                ePurchaseReceiptDao.getPriceListCurrency(),
                ePurchaseReceiptDao.getPlcConversionRate(),
                ePurchaseReceiptDao.getIgnorePricingRule(),
                ePurchaseReceiptDao.getScanBarcode(),
                ePurchaseReceiptDao.getSetWarehouse(),
                ePurchaseReceiptDao.getSetFromWarehouse(),
                ePurchaseReceiptDao.getRejectedWarehouse(),
                ePurchaseReceiptDao.getIsSubcontracted(),
                ePurchaseReceiptDao.getSupplierWarehouse(),
                ePurchaseReceiptDao.getTotalQty(),
                ePurchaseReceiptDao.getTotalNetWeight(),
                ePurchaseReceiptDao.getBaseTotal(),
                ePurchaseReceiptDao.getBaseNetTotal(),
                ePurchaseReceiptDao.getTotal(),
                ePurchaseReceiptDao.getNetTotal(),
                ePurchaseReceiptDao.getTaxCategory(),
                ePurchaseReceiptDao.getTaxesAndCharges(),
                ePurchaseReceiptDao.getShippingRule(),
                ePurchaseReceiptDao.getIncoterm(),
                ePurchaseReceiptDao.getNamedPlace(),
                ePurchaseReceiptDao.getBaseTaxesAndChargesAdded(),
                ePurchaseReceiptDao.getBaseTaxesAndChargesDeducted(),
                ePurchaseReceiptDao.getBaseTotalTaxesAndCharges(),
                ePurchaseReceiptDao.getTaxesAndChargesAdded(),
                ePurchaseReceiptDao.getTaxesAndChargesDeducted(),
                ePurchaseReceiptDao.getTotalTaxesAndCharges(),
                ePurchaseReceiptDao.getBaseGrandTotal(),
                ePurchaseReceiptDao.getBaseRoundingAdjustment(),
                ePurchaseReceiptDao.getBaseRoundedTotal(),
                ePurchaseReceiptDao.getBaseInWords(),
                ePurchaseReceiptDao.getGrandTotal(),
                ePurchaseReceiptDao.getRoundingAdjustment(),
                ePurchaseReceiptDao.getRoundedTotal(),
                ePurchaseReceiptDao.getInWords(),
                ePurchaseReceiptDao.getDisableRoundedTotal(),
                ePurchaseReceiptDao.getApplyDiscountOn(),
                ePurchaseReceiptDao.getBaseDiscountAmount(),
                ePurchaseReceiptDao.getAdditionalDiscountPercentage(),
                ePurchaseReceiptDao.getDiscountAmount(),
                ePurchaseReceiptDao.getOtherChargesCalculation(),
                ePurchaseReceiptDao.getSupplierAddress(),
                ePurchaseReceiptDao.getAddressDisplay(),
                ePurchaseReceiptDao.getContactPerson(),
                ePurchaseReceiptDao.getContactDisplay(),
                ePurchaseReceiptDao.getContactMobile(),
                ePurchaseReceiptDao.getContactEmail(),
                ePurchaseReceiptDao.getShippingAddress(),
                ePurchaseReceiptDao.getShippingAddressDisplay(),
                ePurchaseReceiptDao.getBillingAddress(),
                ePurchaseReceiptDao.getBillingAddressDisplay(),
                ePurchaseReceiptDao.getTcName(),
                ePurchaseReceiptDao.getTerms(),
                ePurchaseReceiptDao.getStatus(),
                ePurchaseReceiptDao.getPerBilled(),
                ePurchaseReceiptDao.getPerReturned(),
                ePurchaseReceiptDao.getAutoRepeat(),
                ePurchaseReceiptDao.getLetterHead(),
                ePurchaseReceiptDao.getGroupSameItems(),
                ePurchaseReceiptDao.getSelectPrintHeading(),
                ePurchaseReceiptDao.getLanguage(),
                ePurchaseReceiptDao.getTransporterName(),
                ePurchaseReceiptDao.getLrNo(),
                ePurchaseReceiptDao.getLrDate(),
                ePurchaseReceiptDao.getInstructions(),
                ePurchaseReceiptDao.getIsInternalSupplier(),
                ePurchaseReceiptDao.getRepresentsCompany(),
                ePurchaseReceiptDao.getInterCompanyReference(),
                ePurchaseReceiptDao.getRemarks(),
                ePurchaseReceiptDao.getRange(),
                ePurchaseReceiptDao.getAmendedFrom(),
                ePurchaseReceiptDao.getIsOldSubcontractingFlow(),
                ePurchaseReceiptDao.getUserTags(),
                ePurchaseReceiptDao.getComments(),
                ePurchaseReceiptDao.getAssign(),
                ePurchaseReceiptDao.getLikedBy());
    }

    public static void fromDTO(PurchaseReceiptDto vPurchaseReceiptDto, PurchaseReceiptDao ePurchaseReceiptDao) {
        ePurchaseReceiptDao.setName(vPurchaseReceiptDto.name());
        ePurchaseReceiptDao.setCreation(vPurchaseReceiptDto.creation());
        ePurchaseReceiptDao.setModified(vPurchaseReceiptDto.modified());
        ePurchaseReceiptDao.setModifiedBy(vPurchaseReceiptDto.modifiedBy());
        ePurchaseReceiptDao.setOwner(vPurchaseReceiptDto.owner());
        ePurchaseReceiptDao.setIsDocStatus(vPurchaseReceiptDto.isDocStatus());
        ePurchaseReceiptDao.setIdx(vPurchaseReceiptDto.idx());
        ePurchaseReceiptDao.setTitle(vPurchaseReceiptDto.title());
        ePurchaseReceiptDao.setNamingSeries(vPurchaseReceiptDto.namingSeries());
        ePurchaseReceiptDao.setSupplier(vPurchaseReceiptDto.supplier());
        ePurchaseReceiptDao.setSupplierName(vPurchaseReceiptDto.supplierName());
        ePurchaseReceiptDao.setSupplierDeliveryNote(vPurchaseReceiptDto.supplierDeliveryNote());
        ePurchaseReceiptDao.setSubcontractingReceipt(vPurchaseReceiptDto.subcontractingReceipt());
        ePurchaseReceiptDao.setPostingDate(vPurchaseReceiptDto.postingDate());
        ePurchaseReceiptDao.setPostingTime(vPurchaseReceiptDto.postingTime());
        ePurchaseReceiptDao.setSetPostingTime(vPurchaseReceiptDto.setPostingTime());
        ePurchaseReceiptDao.setCompany(vPurchaseReceiptDto.company());
        ePurchaseReceiptDao.setApplyPutawayRule(vPurchaseReceiptDto.applyPutawayRule());
        ePurchaseReceiptDao.setIsReturn(vPurchaseReceiptDto.isReturn());
        ePurchaseReceiptDao.setReturnAgainst(vPurchaseReceiptDto.returnAgainst());
        ePurchaseReceiptDao.setCostCenter(vPurchaseReceiptDto.costCenter());
        ePurchaseReceiptDao.setProject(vPurchaseReceiptDto.project());
        ePurchaseReceiptDao.setCurrency(vPurchaseReceiptDto.currency());
        ePurchaseReceiptDao.setConversionRate(vPurchaseReceiptDto.conversionRate());
        ePurchaseReceiptDao.setBuyingPriceList(vPurchaseReceiptDto.buyingPriceList());
        ePurchaseReceiptDao.setPriceListCurrency(vPurchaseReceiptDto.priceListCurrency());
        ePurchaseReceiptDao.setPlcConversionRate(vPurchaseReceiptDto.plcConversionRate());
        ePurchaseReceiptDao.setIgnorePricingRule(vPurchaseReceiptDto.ignorePricingRule());
        ePurchaseReceiptDao.setScanBarcode(vPurchaseReceiptDto.scanBarcode());
        ePurchaseReceiptDao.setSetWarehouse(vPurchaseReceiptDto.setWarehouse());
        ePurchaseReceiptDao.setSetFromWarehouse(vPurchaseReceiptDto.setFromWarehouse());
        ePurchaseReceiptDao.setRejectedWarehouse(vPurchaseReceiptDto.rejectedWarehouse());
        ePurchaseReceiptDao.setIsSubcontracted(vPurchaseReceiptDto.isSubcontracted());
        ePurchaseReceiptDao.setSupplierWarehouse(vPurchaseReceiptDto.supplierWarehouse());
        ePurchaseReceiptDao.setTotalQty(vPurchaseReceiptDto.totalQty());
        ePurchaseReceiptDao.setTotalNetWeight(vPurchaseReceiptDto.totalNetWeight());
        ePurchaseReceiptDao.setBaseTotal(vPurchaseReceiptDto.baseTotal());
        ePurchaseReceiptDao.setBaseNetTotal(vPurchaseReceiptDto.baseNetTotal());
        ePurchaseReceiptDao.setTotal(vPurchaseReceiptDto.total());
        ePurchaseReceiptDao.setNetTotal(vPurchaseReceiptDto.netTotal());
        ePurchaseReceiptDao.setTaxCategory(vPurchaseReceiptDto.taxCategory());
        ePurchaseReceiptDao.setTaxesAndCharges(vPurchaseReceiptDto.taxesAndCharges());
        ePurchaseReceiptDao.setShippingRule(vPurchaseReceiptDto.shippingRule());
        ePurchaseReceiptDao.setIncoterm(vPurchaseReceiptDto.incoterm());
        ePurchaseReceiptDao.setNamedPlace(vPurchaseReceiptDto.namedPlace());
        ePurchaseReceiptDao.setBaseTaxesAndChargesAdded(vPurchaseReceiptDto.baseTaxesAndChargesAdded());
        ePurchaseReceiptDao.setBaseTaxesAndChargesDeducted(vPurchaseReceiptDto.baseTaxesAndChargesDeducted());
        ePurchaseReceiptDao.setBaseTotalTaxesAndCharges(vPurchaseReceiptDto.baseTotalTaxesAndCharges());
        ePurchaseReceiptDao.setTaxesAndChargesAdded(vPurchaseReceiptDto.taxesAndChargesAdded());
        ePurchaseReceiptDao.setTaxesAndChargesDeducted(vPurchaseReceiptDto.taxesAndChargesDeducted());
        ePurchaseReceiptDao.setTotalTaxesAndCharges(vPurchaseReceiptDto.totalTaxesAndCharges());
        ePurchaseReceiptDao.setBaseGrandTotal(vPurchaseReceiptDto.baseGrandTotal());
        ePurchaseReceiptDao.setBaseRoundingAdjustment(vPurchaseReceiptDto.baseRoundingAdjustment());
        ePurchaseReceiptDao.setBaseRoundedTotal(vPurchaseReceiptDto.baseRoundedTotal());
        ePurchaseReceiptDao.setBaseInWords(vPurchaseReceiptDto.baseInWords());
        ePurchaseReceiptDao.setGrandTotal(vPurchaseReceiptDto.grandTotal());
        ePurchaseReceiptDao.setRoundingAdjustment(vPurchaseReceiptDto.roundingAdjustment());
        ePurchaseReceiptDao.setRoundedTotal(vPurchaseReceiptDto.roundedTotal());
        ePurchaseReceiptDao.setInWords(vPurchaseReceiptDto.inWords());
        ePurchaseReceiptDao.setDisableRoundedTotal(vPurchaseReceiptDto.disableRoundedTotal());
        ePurchaseReceiptDao.setApplyDiscountOn(vPurchaseReceiptDto.applyDiscountOn());
        ePurchaseReceiptDao.setBaseDiscountAmount(vPurchaseReceiptDto.baseDiscountAmount());
        ePurchaseReceiptDao.setAdditionalDiscountPercentage(vPurchaseReceiptDto.additionalDiscountPercentage());
        ePurchaseReceiptDao.setDiscountAmount(vPurchaseReceiptDto.discountAmount());
        ePurchaseReceiptDao.setOtherChargesCalculation(vPurchaseReceiptDto.otherChargesCalculation());
        ePurchaseReceiptDao.setSupplierAddress(vPurchaseReceiptDto.supplierAddress());
        ePurchaseReceiptDao.setAddressDisplay(vPurchaseReceiptDto.addressDisplay());
        ePurchaseReceiptDao.setContactPerson(vPurchaseReceiptDto.contactPerson());
        ePurchaseReceiptDao.setContactDisplay(vPurchaseReceiptDto.contactDisplay());
        ePurchaseReceiptDao.setContactMobile(vPurchaseReceiptDto.contactMobile());
        ePurchaseReceiptDao.setContactEmail(vPurchaseReceiptDto.contactEmail());
        ePurchaseReceiptDao.setShippingAddress(vPurchaseReceiptDto.shippingAddress());
        ePurchaseReceiptDao.setShippingAddressDisplay(vPurchaseReceiptDto.shippingAddressDisplay());
        ePurchaseReceiptDao.setBillingAddress(vPurchaseReceiptDto.billingAddress());
        ePurchaseReceiptDao.setBillingAddressDisplay(vPurchaseReceiptDto.billingAddressDisplay());
        ePurchaseReceiptDao.setTcName(vPurchaseReceiptDto.tcName());
        ePurchaseReceiptDao.setTerms(vPurchaseReceiptDto.terms());
        ePurchaseReceiptDao.setStatus(vPurchaseReceiptDto.status());
        ePurchaseReceiptDao.setPerBilled(vPurchaseReceiptDto.perBilled());
        ePurchaseReceiptDao.setPerReturned(vPurchaseReceiptDto.perReturned());
        ePurchaseReceiptDao.setAutoRepeat(vPurchaseReceiptDto.autoRepeat());
        ePurchaseReceiptDao.setLetterHead(vPurchaseReceiptDto.letterHead());
        ePurchaseReceiptDao.setGroupSameItems(vPurchaseReceiptDto.groupSameItems());
        ePurchaseReceiptDao.setSelectPrintHeading(vPurchaseReceiptDto.selectPrintHeading());
        ePurchaseReceiptDao.setLanguage(vPurchaseReceiptDto.language());
        ePurchaseReceiptDao.setTransporterName(vPurchaseReceiptDto.transporterName());
        ePurchaseReceiptDao.setLrNo(vPurchaseReceiptDto.lrNo());
        ePurchaseReceiptDao.setLrDate(vPurchaseReceiptDto.lrDate());
        ePurchaseReceiptDao.setInstructions(vPurchaseReceiptDto.instructions());
        ePurchaseReceiptDao.setIsInternalSupplier(vPurchaseReceiptDto.isInternalSupplier());
        ePurchaseReceiptDao.setRepresentsCompany(vPurchaseReceiptDto.representsCompany());
        ePurchaseReceiptDao.setInterCompanyReference(vPurchaseReceiptDto.interCompanyReference());
        ePurchaseReceiptDao.setRemarks(vPurchaseReceiptDto.remarks());
        ePurchaseReceiptDao.setRange(vPurchaseReceiptDto.range());
        ePurchaseReceiptDao.setAmendedFrom(vPurchaseReceiptDto.amendedFrom());
        ePurchaseReceiptDao.setIsOldSubcontractingFlow(vPurchaseReceiptDto.isOldSubcontractingFlow());
        ePurchaseReceiptDao.setUserTags(vPurchaseReceiptDto.userTags());
        ePurchaseReceiptDao.setComments(vPurchaseReceiptDto.comments());
        ePurchaseReceiptDao.setAssign(vPurchaseReceiptDto.assign());
        ePurchaseReceiptDao.setLikedBy(vPurchaseReceiptDto.likedBy());
    }
}