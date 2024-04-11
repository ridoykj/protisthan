package com.itbd.application.db.dto.purchases;

import com.itbd.application.db.dao.purchases.PurchaseOrderDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record PurchaseOrderDto(
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
        String orderConfirmationNo,
        LocalDate orderConfirmationDate,
        LocalDate transactionDate,
        LocalDate scheduleDate,
        String company,
        Boolean applyTds,
        String taxWithholdingCategory,
        Boolean isSubcontracted,
        String supplierWarehouse,
        String amendedFrom,
        String costCenter,
        String project,
        String currency,
        BigDecimal conversionRate,
        String buyingPriceList,
        String priceListCurrency,
        BigDecimal plcConversionRate,
        Boolean ignorePricingRule,
        String scanBarcode,
        String setFromWarehouse,
        String setWarehouse,
        BigDecimal totalQty,
        BigDecimal totalNetWeight,
        BigDecimal baseTotal,
        BigDecimal baseNetTotal,
        BigDecimal total,
        BigDecimal netTotal,
        BigDecimal taxWithholdingNetTotal,
        BigDecimal baseTaxWithholdingNetTotal,
        String setReserveWarehouse,
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
        String baseInWords,
        BigDecimal baseRoundedTotal,
        BigDecimal grandTotal,
        BigDecimal roundingAdjustment,
        BigDecimal roundedTotal,
        Boolean disableRoundedTotal,
        String inWords,
        BigDecimal advancePaid,
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
        String customer,
        String customerName,
        String customerContactPerson,
        String customerContactDisplay,
        String customerContactMobile,
        String customerContactEmail,
        String paymentTermsTemplate,
        String tcName,
        String terms,
        String status,
        BigDecimal perBilled,
        BigDecimal perReceived,
        String letterHead,
        Boolean groupSameItems,
        String selectPrintHeading,
        String language,
        LocalDate fromDate,
        LocalDate toDate,
        String autoRepeat,
        Boolean isInternalSupplier,
        String representsCompany,
        String refSq,
        String partyAccountCurrency,
        String interCompanyOrderReference,
        Boolean isOldSubcontractingFlow,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static PurchaseOrderDto fromEntity(PurchaseOrderDao ePurchaseOrderDao) {
        return new PurchaseOrderDto(
                ePurchaseOrderDao.getName(),
                ePurchaseOrderDao.getCreation(),
                ePurchaseOrderDao.getModified(),
                ePurchaseOrderDao.getModifiedBy(),
                ePurchaseOrderDao.getOwner(),
                ePurchaseOrderDao.getIsDocStatus(),
                ePurchaseOrderDao.getIdx(),
                ePurchaseOrderDao.getTitle(),
                ePurchaseOrderDao.getNamingSeries(),
                ePurchaseOrderDao.getSupplier(),
                ePurchaseOrderDao.getSupplierName(),
                ePurchaseOrderDao.getOrderConfirmationNo(),
                ePurchaseOrderDao.getOrderConfirmationDate(),
                ePurchaseOrderDao.getTransactionDate(),
                ePurchaseOrderDao.getScheduleDate(),
                ePurchaseOrderDao.getCompany(),
                ePurchaseOrderDao.getApplyTds(),
                ePurchaseOrderDao.getTaxWithholdingCategory(),
                ePurchaseOrderDao.getIsSubcontracted(),
                ePurchaseOrderDao.getSupplierWarehouse(),
                ePurchaseOrderDao.getAmendedFrom(),
                ePurchaseOrderDao.getCostCenter(),
                ePurchaseOrderDao.getProject(),
                ePurchaseOrderDao.getCurrency(),
                ePurchaseOrderDao.getConversionRate(),
                ePurchaseOrderDao.getBuyingPriceList(),
                ePurchaseOrderDao.getPriceListCurrency(),
                ePurchaseOrderDao.getPlcConversionRate(),
                ePurchaseOrderDao.getIgnorePricingRule(),
                ePurchaseOrderDao.getScanBarcode(),
                ePurchaseOrderDao.getSetFromWarehouse(),
                ePurchaseOrderDao.getSetWarehouse(),
                ePurchaseOrderDao.getTotalQty(),
                ePurchaseOrderDao.getTotalNetWeight(),
                ePurchaseOrderDao.getBaseTotal(),
                ePurchaseOrderDao.getBaseNetTotal(),
                ePurchaseOrderDao.getTotal(),
                ePurchaseOrderDao.getNetTotal(),
                ePurchaseOrderDao.getTaxWithholdingNetTotal(),
                ePurchaseOrderDao.getBaseTaxWithholdingNetTotal(),
                ePurchaseOrderDao.getSetReserveWarehouse(),
                ePurchaseOrderDao.getTaxCategory(),
                ePurchaseOrderDao.getTaxesAndCharges(),
                ePurchaseOrderDao.getShippingRule(),
                ePurchaseOrderDao.getIncoterm(),
                ePurchaseOrderDao.getNamedPlace(),
                ePurchaseOrderDao.getBaseTaxesAndChargesAdded(),
                ePurchaseOrderDao.getBaseTaxesAndChargesDeducted(),
                ePurchaseOrderDao.getBaseTotalTaxesAndCharges(),
                ePurchaseOrderDao.getTaxesAndChargesAdded(),
                ePurchaseOrderDao.getTaxesAndChargesDeducted(),
                ePurchaseOrderDao.getTotalTaxesAndCharges(),
                ePurchaseOrderDao.getBaseGrandTotal(),
                ePurchaseOrderDao.getBaseRoundingAdjustment(),
                ePurchaseOrderDao.getBaseInWords(),
                ePurchaseOrderDao.getBaseRoundedTotal(),
                ePurchaseOrderDao.getGrandTotal(),
                ePurchaseOrderDao.getRoundingAdjustment(),
                ePurchaseOrderDao.getRoundedTotal(),
                ePurchaseOrderDao.getDisableRoundedTotal(),
                ePurchaseOrderDao.getInWords(),
                ePurchaseOrderDao.getAdvancePaid(),
                ePurchaseOrderDao.getApplyDiscountOn(),
                ePurchaseOrderDao.getBaseDiscountAmount(),
                ePurchaseOrderDao.getAdditionalDiscountPercentage(),
                ePurchaseOrderDao.getDiscountAmount(),
                ePurchaseOrderDao.getOtherChargesCalculation(),
                ePurchaseOrderDao.getSupplierAddress(),
                ePurchaseOrderDao.getAddressDisplay(),
                ePurchaseOrderDao.getContactPerson(),
                ePurchaseOrderDao.getContactDisplay(),
                ePurchaseOrderDao.getContactMobile(),
                ePurchaseOrderDao.getContactEmail(),
                ePurchaseOrderDao.getShippingAddress(),
                ePurchaseOrderDao.getShippingAddressDisplay(),
                ePurchaseOrderDao.getBillingAddress(),
                ePurchaseOrderDao.getBillingAddressDisplay(),
                ePurchaseOrderDao.getCustomer(),
                ePurchaseOrderDao.getCustomerName(),
                ePurchaseOrderDao.getCustomerContactPerson(),
                ePurchaseOrderDao.getCustomerContactDisplay(),
                ePurchaseOrderDao.getCustomerContactMobile(),
                ePurchaseOrderDao.getCustomerContactEmail(),
                ePurchaseOrderDao.getPaymentTermsTemplate(),
                ePurchaseOrderDao.getTcName(),
                ePurchaseOrderDao.getTerms(),
                ePurchaseOrderDao.getStatus(),
                ePurchaseOrderDao.getPerBilled(),
                ePurchaseOrderDao.getPerReceived(),
                ePurchaseOrderDao.getLetterHead(),
                ePurchaseOrderDao.getGroupSameItems(),
                ePurchaseOrderDao.getSelectPrintHeading(),
                ePurchaseOrderDao.getLanguage(),
                ePurchaseOrderDao.getFromDate(),
                ePurchaseOrderDao.getToDate(),
                ePurchaseOrderDao.getAutoRepeat(),
                ePurchaseOrderDao.getIsInternalSupplier(),
                ePurchaseOrderDao.getRepresentsCompany(),
                ePurchaseOrderDao.getRefSq(),
                ePurchaseOrderDao.getPartyAccountCurrency(),
                ePurchaseOrderDao.getInterCompanyOrderReference(),
                ePurchaseOrderDao.getIsOldSubcontractingFlow(),
                ePurchaseOrderDao.getUserTags(),
                ePurchaseOrderDao.getComments(),
                ePurchaseOrderDao.getAssign(),
                ePurchaseOrderDao.getLikedBy());
    }

    public static void fromDTO(PurchaseOrderDto vPurchaseOrderDto, PurchaseOrderDao ePurchaseOrderDao) {
        ePurchaseOrderDao.setName(vPurchaseOrderDto.name());
        ePurchaseOrderDao.setCreation(vPurchaseOrderDto.creation());
        ePurchaseOrderDao.setModified(vPurchaseOrderDto.modified());
        ePurchaseOrderDao.setModifiedBy(vPurchaseOrderDto.modifiedBy());
        ePurchaseOrderDao.setOwner(vPurchaseOrderDto.owner());
        ePurchaseOrderDao.setIsDocStatus(vPurchaseOrderDto.isDocStatus());
        ePurchaseOrderDao.setIdx(vPurchaseOrderDto.idx());
        ePurchaseOrderDao.setTitle(vPurchaseOrderDto.title());
        ePurchaseOrderDao.setNamingSeries(vPurchaseOrderDto.namingSeries());
        ePurchaseOrderDao.setSupplier(vPurchaseOrderDto.supplier());
        ePurchaseOrderDao.setSupplierName(vPurchaseOrderDto.supplierName());
        ePurchaseOrderDao.setOrderConfirmationNo(vPurchaseOrderDto.orderConfirmationNo());
        ePurchaseOrderDao.setOrderConfirmationDate(vPurchaseOrderDto.orderConfirmationDate());
        ePurchaseOrderDao.setTransactionDate(vPurchaseOrderDto.transactionDate());
        ePurchaseOrderDao.setScheduleDate(vPurchaseOrderDto.scheduleDate());
        ePurchaseOrderDao.setCompany(vPurchaseOrderDto.company());
        ePurchaseOrderDao.setApplyTds(vPurchaseOrderDto.applyTds());
        ePurchaseOrderDao.setTaxWithholdingCategory(vPurchaseOrderDto.taxWithholdingCategory());
        ePurchaseOrderDao.setIsSubcontracted(vPurchaseOrderDto.isSubcontracted());
        ePurchaseOrderDao.setSupplierWarehouse(vPurchaseOrderDto.supplierWarehouse());
        ePurchaseOrderDao.setAmendedFrom(vPurchaseOrderDto.amendedFrom());
        ePurchaseOrderDao.setCostCenter(vPurchaseOrderDto.costCenter());
        ePurchaseOrderDao.setProject(vPurchaseOrderDto.project());
        ePurchaseOrderDao.setCurrency(vPurchaseOrderDto.currency());
        ePurchaseOrderDao.setConversionRate(vPurchaseOrderDto.conversionRate());
        ePurchaseOrderDao.setBuyingPriceList(vPurchaseOrderDto.buyingPriceList());
        ePurchaseOrderDao.setPriceListCurrency(vPurchaseOrderDto.priceListCurrency());
        ePurchaseOrderDao.setPlcConversionRate(vPurchaseOrderDto.plcConversionRate());
        ePurchaseOrderDao.setIgnorePricingRule(vPurchaseOrderDto.ignorePricingRule());
        ePurchaseOrderDao.setScanBarcode(vPurchaseOrderDto.scanBarcode());
        ePurchaseOrderDao.setSetFromWarehouse(vPurchaseOrderDto.setFromWarehouse());
        ePurchaseOrderDao.setSetWarehouse(vPurchaseOrderDto.setWarehouse());
        ePurchaseOrderDao.setTotalQty(vPurchaseOrderDto.totalQty());
        ePurchaseOrderDao.setTotalNetWeight(vPurchaseOrderDto.totalNetWeight());
        ePurchaseOrderDao.setBaseTotal(vPurchaseOrderDto.baseTotal());
        ePurchaseOrderDao.setBaseNetTotal(vPurchaseOrderDto.baseNetTotal());
        ePurchaseOrderDao.setTotal(vPurchaseOrderDto.total());
        ePurchaseOrderDao.setNetTotal(vPurchaseOrderDto.netTotal());
        ePurchaseOrderDao.setTaxWithholdingNetTotal(vPurchaseOrderDto.taxWithholdingNetTotal());
        ePurchaseOrderDao.setBaseTaxWithholdingNetTotal(vPurchaseOrderDto.baseTaxWithholdingNetTotal());
        ePurchaseOrderDao.setSetReserveWarehouse(vPurchaseOrderDto.setReserveWarehouse());
        ePurchaseOrderDao.setTaxCategory(vPurchaseOrderDto.taxCategory());
        ePurchaseOrderDao.setTaxesAndCharges(vPurchaseOrderDto.taxesAndCharges());
        ePurchaseOrderDao.setShippingRule(vPurchaseOrderDto.shippingRule());
        ePurchaseOrderDao.setIncoterm(vPurchaseOrderDto.incoterm());
        ePurchaseOrderDao.setNamedPlace(vPurchaseOrderDto.namedPlace());
        ePurchaseOrderDao.setBaseTaxesAndChargesAdded(vPurchaseOrderDto.baseTaxesAndChargesAdded());
        ePurchaseOrderDao.setBaseTaxesAndChargesDeducted(vPurchaseOrderDto.baseTaxesAndChargesDeducted());
        ePurchaseOrderDao.setBaseTotalTaxesAndCharges(vPurchaseOrderDto.baseTotalTaxesAndCharges());
        ePurchaseOrderDao.setTaxesAndChargesAdded(vPurchaseOrderDto.taxesAndChargesAdded());
        ePurchaseOrderDao.setTaxesAndChargesDeducted(vPurchaseOrderDto.taxesAndChargesDeducted());
        ePurchaseOrderDao.setTotalTaxesAndCharges(vPurchaseOrderDto.totalTaxesAndCharges());
        ePurchaseOrderDao.setBaseGrandTotal(vPurchaseOrderDto.baseGrandTotal());
        ePurchaseOrderDao.setBaseRoundingAdjustment(vPurchaseOrderDto.baseRoundingAdjustment());
        ePurchaseOrderDao.setBaseInWords(vPurchaseOrderDto.baseInWords());
        ePurchaseOrderDao.setBaseRoundedTotal(vPurchaseOrderDto.baseRoundedTotal());
        ePurchaseOrderDao.setGrandTotal(vPurchaseOrderDto.grandTotal());
        ePurchaseOrderDao.setRoundingAdjustment(vPurchaseOrderDto.roundingAdjustment());
        ePurchaseOrderDao.setRoundedTotal(vPurchaseOrderDto.roundedTotal());
        ePurchaseOrderDao.setDisableRoundedTotal(vPurchaseOrderDto.disableRoundedTotal());
        ePurchaseOrderDao.setInWords(vPurchaseOrderDto.inWords());
        ePurchaseOrderDao.setAdvancePaid(vPurchaseOrderDto.advancePaid());
        ePurchaseOrderDao.setApplyDiscountOn(vPurchaseOrderDto.applyDiscountOn());
        ePurchaseOrderDao.setBaseDiscountAmount(vPurchaseOrderDto.baseDiscountAmount());
        ePurchaseOrderDao.setAdditionalDiscountPercentage(vPurchaseOrderDto.additionalDiscountPercentage());
        ePurchaseOrderDao.setDiscountAmount(vPurchaseOrderDto.discountAmount());
        ePurchaseOrderDao.setOtherChargesCalculation(vPurchaseOrderDto.otherChargesCalculation());
        ePurchaseOrderDao.setSupplierAddress(vPurchaseOrderDto.supplierAddress());
        ePurchaseOrderDao.setAddressDisplay(vPurchaseOrderDto.addressDisplay());
        ePurchaseOrderDao.setContactPerson(vPurchaseOrderDto.contactPerson());
        ePurchaseOrderDao.setContactDisplay(vPurchaseOrderDto.contactDisplay());
        ePurchaseOrderDao.setContactMobile(vPurchaseOrderDto.contactMobile());
        ePurchaseOrderDao.setContactEmail(vPurchaseOrderDto.contactEmail());
        ePurchaseOrderDao.setShippingAddress(vPurchaseOrderDto.shippingAddress());
        ePurchaseOrderDao.setShippingAddressDisplay(vPurchaseOrderDto.shippingAddressDisplay());
        ePurchaseOrderDao.setBillingAddress(vPurchaseOrderDto.billingAddress());
        ePurchaseOrderDao.setBillingAddressDisplay(vPurchaseOrderDto.billingAddressDisplay());
        ePurchaseOrderDao.setCustomer(vPurchaseOrderDto.customer());
        ePurchaseOrderDao.setCustomerName(vPurchaseOrderDto.customerName());
        ePurchaseOrderDao.setCustomerContactPerson(vPurchaseOrderDto.customerContactPerson());
        ePurchaseOrderDao.setCustomerContactDisplay(vPurchaseOrderDto.customerContactDisplay());
        ePurchaseOrderDao.setCustomerContactMobile(vPurchaseOrderDto.customerContactMobile());
        ePurchaseOrderDao.setCustomerContactEmail(vPurchaseOrderDto.customerContactEmail());
        ePurchaseOrderDao.setPaymentTermsTemplate(vPurchaseOrderDto.paymentTermsTemplate());
        ePurchaseOrderDao.setTcName(vPurchaseOrderDto.tcName());
        ePurchaseOrderDao.setTerms(vPurchaseOrderDto.terms());
        ePurchaseOrderDao.setStatus(vPurchaseOrderDto.status());
        ePurchaseOrderDao.setPerBilled(vPurchaseOrderDto.perBilled());
        ePurchaseOrderDao.setPerReceived(vPurchaseOrderDto.perReceived());
        ePurchaseOrderDao.setLetterHead(vPurchaseOrderDto.letterHead());
        ePurchaseOrderDao.setGroupSameItems(vPurchaseOrderDto.groupSameItems());
        ePurchaseOrderDao.setSelectPrintHeading(vPurchaseOrderDto.selectPrintHeading());
        ePurchaseOrderDao.setLanguage(vPurchaseOrderDto.language());
        ePurchaseOrderDao.setFromDate(vPurchaseOrderDto.fromDate());
        ePurchaseOrderDao.setToDate(vPurchaseOrderDto.toDate());
        ePurchaseOrderDao.setAutoRepeat(vPurchaseOrderDto.autoRepeat());
        ePurchaseOrderDao.setIsInternalSupplier(vPurchaseOrderDto.isInternalSupplier());
        ePurchaseOrderDao.setRepresentsCompany(vPurchaseOrderDto.representsCompany());
        ePurchaseOrderDao.setRefSq(vPurchaseOrderDto.refSq());
        ePurchaseOrderDao.setPartyAccountCurrency(vPurchaseOrderDto.partyAccountCurrency());
        ePurchaseOrderDao.setInterCompanyOrderReference(vPurchaseOrderDto.interCompanyOrderReference());
        ePurchaseOrderDao.setIsOldSubcontractingFlow(vPurchaseOrderDto.isOldSubcontractingFlow());
        ePurchaseOrderDao.setUserTags(vPurchaseOrderDto.userTags());
        ePurchaseOrderDao.setComments(vPurchaseOrderDto.comments());
        ePurchaseOrderDao.setAssign(vPurchaseOrderDto.assign());
        ePurchaseOrderDao.setLikedBy(vPurchaseOrderDto.likedBy());
    }
}