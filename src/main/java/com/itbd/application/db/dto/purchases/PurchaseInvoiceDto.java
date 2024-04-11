package com.itbd.application.db.dto.purchases;

import com.itbd.application.db.dao.purchases.PurchaseInvoiceDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public record PurchaseInvoiceDto(
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
        String taxId,
        String company,
        LocalDate postingDate,
        LocalTime postingTime,
        Boolean setPostingTime,
        LocalDate dueDate,
        Boolean isPaid,
        Boolean isReturn,
        String returnAgainst,
        Boolean updateOutstandingForSelf,
        Boolean updateBilledAmountInPurchaseOrder,
        Boolean updateBilledAmountInPurchaseReceipt,
        Boolean applyTds,
        String taxWithholdingCategory,
        String amendedFrom,
        String billNo,
        LocalDate billDate,
        String costCenter,
        String project,
        String currency,
        BigDecimal conversionRate,
        Boolean useTransactionDateExchangeRate,
        String buyingPriceList,
        String priceListCurrency,
        BigDecimal plcConversionRate,
        Boolean ignorePricingRule,
        String scanBarcode,
        Boolean updateStock,
        String setWarehouse,
        String setFromWarehouse,
        Boolean isSubcontracted,
        String rejectedWarehouse,
        String supplierWarehouse,
        BigDecimal totalQty,
        BigDecimal totalNetWeight,
        BigDecimal baseTotal,
        BigDecimal baseNetTotal,
        BigDecimal total,
        BigDecimal netTotal,
        BigDecimal taxWithholdingNetTotal,
        BigDecimal baseTaxWithholdingNetTotal,
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
        Boolean useCompanyRoundoffCostCenter,
        BigDecimal roundedTotal,
        String inWords,
        BigDecimal totalAdvance,
        BigDecimal outstandingAmount,
        Boolean disableRoundedTotal,
        String applyDiscountOn,
        BigDecimal baseDiscountAmount,
        BigDecimal additionalDiscountPercentage,
        BigDecimal discountAmount,
        String otherChargesCalculation,
        String modeOfPayment,
        BigDecimal basePaidAmount,
        LocalDate clearanceDate,
        String cashBankAccount,
        BigDecimal paidAmount,
        Boolean allocateAdvancesAutomatically,
        Boolean onlyIncludeAllocatedPayments,
        BigDecimal writeOffAmount,
        BigDecimal baseWriteOffAmount,
        String writeOffAccount,
        String writeOffCostCenter,
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
        String paymentTermsTemplate,
        Boolean ignoreDefaultPaymentTermsTemplate,
        String tcName,
        String terms,
        String status,
        BigDecimal perReceived,
        String creditTo,
        String partyAccountCurrency,
        String isOpening,
        String againstExpenseAccount,
        String unrealizedProfitLossAccount,
        Boolean repostRequired,
        String subscription,
        String autoRepeat,
        LocalDate fromDate,
        LocalDate toDate,
        String letterHead,
        Boolean groupSameItems,
        String selectPrintHeading,
        String language,
        Boolean onHold,
        LocalDate releaseDate,
        String holdComment,
        Boolean isInternalSupplier,
        String representsCompany,
        String supplierGroup,
        String interCompanyInvoiceReference,
        Boolean isOldSubcontractingFlow,
        String remarks,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static PurchaseInvoiceDto fromEntity(PurchaseInvoiceDao ePurchaseInvoiceDao) {
        return new PurchaseInvoiceDto(
                ePurchaseInvoiceDao.getName(),
                ePurchaseInvoiceDao.getCreation(),
                ePurchaseInvoiceDao.getModified(),
                ePurchaseInvoiceDao.getModifiedBy(),
                ePurchaseInvoiceDao.getOwner(),
                ePurchaseInvoiceDao.getIsDocStatus(),
                ePurchaseInvoiceDao.getIdx(),
                ePurchaseInvoiceDao.getTitle(),
                ePurchaseInvoiceDao.getNamingSeries(),
                ePurchaseInvoiceDao.getSupplier(),
                ePurchaseInvoiceDao.getSupplierName(),
                ePurchaseInvoiceDao.getTaxId(),
                ePurchaseInvoiceDao.getCompany(),
                ePurchaseInvoiceDao.getPostingDate(),
                ePurchaseInvoiceDao.getPostingTime(),
                ePurchaseInvoiceDao.getSetPostingTime(),
                ePurchaseInvoiceDao.getDueDate(),
                ePurchaseInvoiceDao.getIsPaid(),
                ePurchaseInvoiceDao.getIsReturn(),
                ePurchaseInvoiceDao.getReturnAgainst(),
                ePurchaseInvoiceDao.getUpdateOutstandingForSelf(),
                ePurchaseInvoiceDao.getUpdateBilledAmountInPurchaseOrder(),
                ePurchaseInvoiceDao.getUpdateBilledAmountInPurchaseReceipt(),
                ePurchaseInvoiceDao.getApplyTds(),
                ePurchaseInvoiceDao.getTaxWithholdingCategory(),
                ePurchaseInvoiceDao.getAmendedFrom(),
                ePurchaseInvoiceDao.getBillNo(),
                ePurchaseInvoiceDao.getBillDate(),
                ePurchaseInvoiceDao.getCostCenter(),
                ePurchaseInvoiceDao.getProject(),
                ePurchaseInvoiceDao.getCurrency(),
                ePurchaseInvoiceDao.getConversionRate(),
                ePurchaseInvoiceDao.getUseTransactionDateExchangeRate(),
                ePurchaseInvoiceDao.getBuyingPriceList(),
                ePurchaseInvoiceDao.getPriceListCurrency(),
                ePurchaseInvoiceDao.getPlcConversionRate(),
                ePurchaseInvoiceDao.getIgnorePricingRule(),
                ePurchaseInvoiceDao.getScanBarcode(),
                ePurchaseInvoiceDao.getUpdateStock(),
                ePurchaseInvoiceDao.getSetWarehouse(),
                ePurchaseInvoiceDao.getSetFromWarehouse(),
                ePurchaseInvoiceDao.getIsSubcontracted(),
                ePurchaseInvoiceDao.getRejectedWarehouse(),
                ePurchaseInvoiceDao.getSupplierWarehouse(),
                ePurchaseInvoiceDao.getTotalQty(),
                ePurchaseInvoiceDao.getTotalNetWeight(),
                ePurchaseInvoiceDao.getBaseTotal(),
                ePurchaseInvoiceDao.getBaseNetTotal(),
                ePurchaseInvoiceDao.getTotal(),
                ePurchaseInvoiceDao.getNetTotal(),
                ePurchaseInvoiceDao.getTaxWithholdingNetTotal(),
                ePurchaseInvoiceDao.getBaseTaxWithholdingNetTotal(),
                ePurchaseInvoiceDao.getTaxCategory(),
                ePurchaseInvoiceDao.getTaxesAndCharges(),
                ePurchaseInvoiceDao.getShippingRule(),
                ePurchaseInvoiceDao.getIncoterm(),
                ePurchaseInvoiceDao.getNamedPlace(),
                ePurchaseInvoiceDao.getBaseTaxesAndChargesAdded(),
                ePurchaseInvoiceDao.getBaseTaxesAndChargesDeducted(),
                ePurchaseInvoiceDao.getBaseTotalTaxesAndCharges(),
                ePurchaseInvoiceDao.getTaxesAndChargesAdded(),
                ePurchaseInvoiceDao.getTaxesAndChargesDeducted(),
                ePurchaseInvoiceDao.getTotalTaxesAndCharges(),
                ePurchaseInvoiceDao.getBaseGrandTotal(),
                ePurchaseInvoiceDao.getBaseRoundingAdjustment(),
                ePurchaseInvoiceDao.getBaseRoundedTotal(),
                ePurchaseInvoiceDao.getBaseInWords(),
                ePurchaseInvoiceDao.getGrandTotal(),
                ePurchaseInvoiceDao.getRoundingAdjustment(),
                ePurchaseInvoiceDao.getUseCompanyRoundoffCostCenter(),
                ePurchaseInvoiceDao.getRoundedTotal(),
                ePurchaseInvoiceDao.getInWords(),
                ePurchaseInvoiceDao.getTotalAdvance(),
                ePurchaseInvoiceDao.getOutstandingAmount(),
                ePurchaseInvoiceDao.getDisableRoundedTotal(),
                ePurchaseInvoiceDao.getApplyDiscountOn(),
                ePurchaseInvoiceDao.getBaseDiscountAmount(),
                ePurchaseInvoiceDao.getAdditionalDiscountPercentage(),
                ePurchaseInvoiceDao.getDiscountAmount(),
                ePurchaseInvoiceDao.getOtherChargesCalculation(),
                ePurchaseInvoiceDao.getModeOfPayment(),
                ePurchaseInvoiceDao.getBasePaidAmount(),
                ePurchaseInvoiceDao.getClearanceDate(),
                ePurchaseInvoiceDao.getCashBankAccount(),
                ePurchaseInvoiceDao.getPaidAmount(),
                ePurchaseInvoiceDao.getAllocateAdvancesAutomatically(),
                ePurchaseInvoiceDao.getOnlyIncludeAllocatedPayments(),
                ePurchaseInvoiceDao.getWriteOffAmount(),
                ePurchaseInvoiceDao.getBaseWriteOffAmount(),
                ePurchaseInvoiceDao.getWriteOffAccount(),
                ePurchaseInvoiceDao.getWriteOffCostCenter(),
                ePurchaseInvoiceDao.getSupplierAddress(),
                ePurchaseInvoiceDao.getAddressDisplay(),
                ePurchaseInvoiceDao.getContactPerson(),
                ePurchaseInvoiceDao.getContactDisplay(),
                ePurchaseInvoiceDao.getContactMobile(),
                ePurchaseInvoiceDao.getContactEmail(),
                ePurchaseInvoiceDao.getShippingAddress(),
                ePurchaseInvoiceDao.getShippingAddressDisplay(),
                ePurchaseInvoiceDao.getBillingAddress(),
                ePurchaseInvoiceDao.getBillingAddressDisplay(),
                ePurchaseInvoiceDao.getPaymentTermsTemplate(),
                ePurchaseInvoiceDao.getIgnoreDefaultPaymentTermsTemplate(),
                ePurchaseInvoiceDao.getTcName(),
                ePurchaseInvoiceDao.getTerms(),
                ePurchaseInvoiceDao.getStatus(),
                ePurchaseInvoiceDao.getPerReceived(),
                ePurchaseInvoiceDao.getCreditTo(),
                ePurchaseInvoiceDao.getPartyAccountCurrency(),
                ePurchaseInvoiceDao.getIsOpening(),
                ePurchaseInvoiceDao.getAgainstExpenseAccount(),
                ePurchaseInvoiceDao.getUnrealizedProfitLossAccount(),
                ePurchaseInvoiceDao.getRepostRequired(),
                ePurchaseInvoiceDao.getSubscription(),
                ePurchaseInvoiceDao.getAutoRepeat(),
                ePurchaseInvoiceDao.getFromDate(),
                ePurchaseInvoiceDao.getToDate(),
                ePurchaseInvoiceDao.getLetterHead(),
                ePurchaseInvoiceDao.getGroupSameItems(),
                ePurchaseInvoiceDao.getSelectPrintHeading(),
                ePurchaseInvoiceDao.getLanguage(),
                ePurchaseInvoiceDao.getOnHold(),
                ePurchaseInvoiceDao.getReleaseDate(),
                ePurchaseInvoiceDao.getHoldComment(),
                ePurchaseInvoiceDao.getIsInternalSupplier(),
                ePurchaseInvoiceDao.getRepresentsCompany(),
                ePurchaseInvoiceDao.getSupplierGroup(),
                ePurchaseInvoiceDao.getInterCompanyInvoiceReference(),
                ePurchaseInvoiceDao.getIsOldSubcontractingFlow(),
                ePurchaseInvoiceDao.getRemarks(),
                ePurchaseInvoiceDao.getUserTags(),
                ePurchaseInvoiceDao.getComments(),
                ePurchaseInvoiceDao.getAssign(),
                ePurchaseInvoiceDao.getLikedBy());
    }

    public static void fromDTO(PurchaseInvoiceDto vPurchaseInvoiceDto, PurchaseInvoiceDao ePurchaseInvoiceDao) {
        ePurchaseInvoiceDao.setName(vPurchaseInvoiceDto.name());
        ePurchaseInvoiceDao.setCreation(vPurchaseInvoiceDto.creation());
        ePurchaseInvoiceDao.setModified(vPurchaseInvoiceDto.modified());
        ePurchaseInvoiceDao.setModifiedBy(vPurchaseInvoiceDto.modifiedBy());
        ePurchaseInvoiceDao.setOwner(vPurchaseInvoiceDto.owner());
        ePurchaseInvoiceDao.setIsDocStatus(vPurchaseInvoiceDto.isDocStatus());
        ePurchaseInvoiceDao.setIdx(vPurchaseInvoiceDto.idx());
        ePurchaseInvoiceDao.setTitle(vPurchaseInvoiceDto.title());
        ePurchaseInvoiceDao.setNamingSeries(vPurchaseInvoiceDto.namingSeries());
        ePurchaseInvoiceDao.setSupplier(vPurchaseInvoiceDto.supplier());
        ePurchaseInvoiceDao.setSupplierName(vPurchaseInvoiceDto.supplierName());
        ePurchaseInvoiceDao.setTaxId(vPurchaseInvoiceDto.taxId());
        ePurchaseInvoiceDao.setCompany(vPurchaseInvoiceDto.company());
        ePurchaseInvoiceDao.setPostingDate(vPurchaseInvoiceDto.postingDate());
        ePurchaseInvoiceDao.setPostingTime(vPurchaseInvoiceDto.postingTime());
        ePurchaseInvoiceDao.setSetPostingTime(vPurchaseInvoiceDto.setPostingTime());
        ePurchaseInvoiceDao.setDueDate(vPurchaseInvoiceDto.dueDate());
        ePurchaseInvoiceDao.setIsPaid(vPurchaseInvoiceDto.isPaid());
        ePurchaseInvoiceDao.setIsReturn(vPurchaseInvoiceDto.isReturn());
        ePurchaseInvoiceDao.setReturnAgainst(vPurchaseInvoiceDto.returnAgainst());
        ePurchaseInvoiceDao.setUpdateOutstandingForSelf(vPurchaseInvoiceDto.updateOutstandingForSelf());
        ePurchaseInvoiceDao.setUpdateBilledAmountInPurchaseOrder(vPurchaseInvoiceDto.updateBilledAmountInPurchaseOrder());
        ePurchaseInvoiceDao.setUpdateBilledAmountInPurchaseReceipt(vPurchaseInvoiceDto.updateBilledAmountInPurchaseReceipt());
        ePurchaseInvoiceDao.setApplyTds(vPurchaseInvoiceDto.applyTds());
        ePurchaseInvoiceDao.setTaxWithholdingCategory(vPurchaseInvoiceDto.taxWithholdingCategory());
        ePurchaseInvoiceDao.setAmendedFrom(vPurchaseInvoiceDto.amendedFrom());
        ePurchaseInvoiceDao.setBillNo(vPurchaseInvoiceDto.billNo());
        ePurchaseInvoiceDao.setBillDate(vPurchaseInvoiceDto.billDate());
        ePurchaseInvoiceDao.setCostCenter(vPurchaseInvoiceDto.costCenter());
        ePurchaseInvoiceDao.setProject(vPurchaseInvoiceDto.project());
        ePurchaseInvoiceDao.setCurrency(vPurchaseInvoiceDto.currency());
        ePurchaseInvoiceDao.setConversionRate(vPurchaseInvoiceDto.conversionRate());
        ePurchaseInvoiceDao.setUseTransactionDateExchangeRate(vPurchaseInvoiceDto.useTransactionDateExchangeRate());
        ePurchaseInvoiceDao.setBuyingPriceList(vPurchaseInvoiceDto.buyingPriceList());
        ePurchaseInvoiceDao.setPriceListCurrency(vPurchaseInvoiceDto.priceListCurrency());
        ePurchaseInvoiceDao.setPlcConversionRate(vPurchaseInvoiceDto.plcConversionRate());
        ePurchaseInvoiceDao.setIgnorePricingRule(vPurchaseInvoiceDto.ignorePricingRule());
        ePurchaseInvoiceDao.setScanBarcode(vPurchaseInvoiceDto.scanBarcode());
        ePurchaseInvoiceDao.setUpdateStock(vPurchaseInvoiceDto.updateStock());
        ePurchaseInvoiceDao.setSetWarehouse(vPurchaseInvoiceDto.setWarehouse());
        ePurchaseInvoiceDao.setSetFromWarehouse(vPurchaseInvoiceDto.setFromWarehouse());
        ePurchaseInvoiceDao.setIsSubcontracted(vPurchaseInvoiceDto.isSubcontracted());
        ePurchaseInvoiceDao.setRejectedWarehouse(vPurchaseInvoiceDto.rejectedWarehouse());
        ePurchaseInvoiceDao.setSupplierWarehouse(vPurchaseInvoiceDto.supplierWarehouse());
        ePurchaseInvoiceDao.setTotalQty(vPurchaseInvoiceDto.totalQty());
        ePurchaseInvoiceDao.setTotalNetWeight(vPurchaseInvoiceDto.totalNetWeight());
        ePurchaseInvoiceDao.setBaseTotal(vPurchaseInvoiceDto.baseTotal());
        ePurchaseInvoiceDao.setBaseNetTotal(vPurchaseInvoiceDto.baseNetTotal());
        ePurchaseInvoiceDao.setTotal(vPurchaseInvoiceDto.total());
        ePurchaseInvoiceDao.setNetTotal(vPurchaseInvoiceDto.netTotal());
        ePurchaseInvoiceDao.setTaxWithholdingNetTotal(vPurchaseInvoiceDto.taxWithholdingNetTotal());
        ePurchaseInvoiceDao.setBaseTaxWithholdingNetTotal(vPurchaseInvoiceDto.baseTaxWithholdingNetTotal());
        ePurchaseInvoiceDao.setTaxCategory(vPurchaseInvoiceDto.taxCategory());
        ePurchaseInvoiceDao.setTaxesAndCharges(vPurchaseInvoiceDto.taxesAndCharges());
        ePurchaseInvoiceDao.setShippingRule(vPurchaseInvoiceDto.shippingRule());
        ePurchaseInvoiceDao.setIncoterm(vPurchaseInvoiceDto.incoterm());
        ePurchaseInvoiceDao.setNamedPlace(vPurchaseInvoiceDto.namedPlace());
        ePurchaseInvoiceDao.setBaseTaxesAndChargesAdded(vPurchaseInvoiceDto.baseTaxesAndChargesAdded());
        ePurchaseInvoiceDao.setBaseTaxesAndChargesDeducted(vPurchaseInvoiceDto.baseTaxesAndChargesDeducted());
        ePurchaseInvoiceDao.setBaseTotalTaxesAndCharges(vPurchaseInvoiceDto.baseTotalTaxesAndCharges());
        ePurchaseInvoiceDao.setTaxesAndChargesAdded(vPurchaseInvoiceDto.taxesAndChargesAdded());
        ePurchaseInvoiceDao.setTaxesAndChargesDeducted(vPurchaseInvoiceDto.taxesAndChargesDeducted());
        ePurchaseInvoiceDao.setTotalTaxesAndCharges(vPurchaseInvoiceDto.totalTaxesAndCharges());
        ePurchaseInvoiceDao.setBaseGrandTotal(vPurchaseInvoiceDto.baseGrandTotal());
        ePurchaseInvoiceDao.setBaseRoundingAdjustment(vPurchaseInvoiceDto.baseRoundingAdjustment());
        ePurchaseInvoiceDao.setBaseRoundedTotal(vPurchaseInvoiceDto.baseRoundedTotal());
        ePurchaseInvoiceDao.setBaseInWords(vPurchaseInvoiceDto.baseInWords());
        ePurchaseInvoiceDao.setGrandTotal(vPurchaseInvoiceDto.grandTotal());
        ePurchaseInvoiceDao.setRoundingAdjustment(vPurchaseInvoiceDto.roundingAdjustment());
        ePurchaseInvoiceDao.setUseCompanyRoundoffCostCenter(vPurchaseInvoiceDto.useCompanyRoundoffCostCenter());
        ePurchaseInvoiceDao.setRoundedTotal(vPurchaseInvoiceDto.roundedTotal());
        ePurchaseInvoiceDao.setInWords(vPurchaseInvoiceDto.inWords());
        ePurchaseInvoiceDao.setTotalAdvance(vPurchaseInvoiceDto.totalAdvance());
        ePurchaseInvoiceDao.setOutstandingAmount(vPurchaseInvoiceDto.outstandingAmount());
        ePurchaseInvoiceDao.setDisableRoundedTotal(vPurchaseInvoiceDto.disableRoundedTotal());
        ePurchaseInvoiceDao.setApplyDiscountOn(vPurchaseInvoiceDto.applyDiscountOn());
        ePurchaseInvoiceDao.setBaseDiscountAmount(vPurchaseInvoiceDto.baseDiscountAmount());
        ePurchaseInvoiceDao.setAdditionalDiscountPercentage(vPurchaseInvoiceDto.additionalDiscountPercentage());
        ePurchaseInvoiceDao.setDiscountAmount(vPurchaseInvoiceDto.discountAmount());
        ePurchaseInvoiceDao.setOtherChargesCalculation(vPurchaseInvoiceDto.otherChargesCalculation());
        ePurchaseInvoiceDao.setModeOfPayment(vPurchaseInvoiceDto.modeOfPayment());
        ePurchaseInvoiceDao.setBasePaidAmount(vPurchaseInvoiceDto.basePaidAmount());
        ePurchaseInvoiceDao.setClearanceDate(vPurchaseInvoiceDto.clearanceDate());
        ePurchaseInvoiceDao.setCashBankAccount(vPurchaseInvoiceDto.cashBankAccount());
        ePurchaseInvoiceDao.setPaidAmount(vPurchaseInvoiceDto.paidAmount());
        ePurchaseInvoiceDao.setAllocateAdvancesAutomatically(vPurchaseInvoiceDto.allocateAdvancesAutomatically());
        ePurchaseInvoiceDao.setOnlyIncludeAllocatedPayments(vPurchaseInvoiceDto.onlyIncludeAllocatedPayments());
        ePurchaseInvoiceDao.setWriteOffAmount(vPurchaseInvoiceDto.writeOffAmount());
        ePurchaseInvoiceDao.setBaseWriteOffAmount(vPurchaseInvoiceDto.baseWriteOffAmount());
        ePurchaseInvoiceDao.setWriteOffAccount(vPurchaseInvoiceDto.writeOffAccount());
        ePurchaseInvoiceDao.setWriteOffCostCenter(vPurchaseInvoiceDto.writeOffCostCenter());
        ePurchaseInvoiceDao.setSupplierAddress(vPurchaseInvoiceDto.supplierAddress());
        ePurchaseInvoiceDao.setAddressDisplay(vPurchaseInvoiceDto.addressDisplay());
        ePurchaseInvoiceDao.setContactPerson(vPurchaseInvoiceDto.contactPerson());
        ePurchaseInvoiceDao.setContactDisplay(vPurchaseInvoiceDto.contactDisplay());
        ePurchaseInvoiceDao.setContactMobile(vPurchaseInvoiceDto.contactMobile());
        ePurchaseInvoiceDao.setContactEmail(vPurchaseInvoiceDto.contactEmail());
        ePurchaseInvoiceDao.setShippingAddress(vPurchaseInvoiceDto.shippingAddress());
        ePurchaseInvoiceDao.setShippingAddressDisplay(vPurchaseInvoiceDto.shippingAddressDisplay());
        ePurchaseInvoiceDao.setBillingAddress(vPurchaseInvoiceDto.billingAddress());
        ePurchaseInvoiceDao.setBillingAddressDisplay(vPurchaseInvoiceDto.billingAddressDisplay());
        ePurchaseInvoiceDao.setPaymentTermsTemplate(vPurchaseInvoiceDto.paymentTermsTemplate());
        ePurchaseInvoiceDao.setIgnoreDefaultPaymentTermsTemplate(vPurchaseInvoiceDto.ignoreDefaultPaymentTermsTemplate());
        ePurchaseInvoiceDao.setTcName(vPurchaseInvoiceDto.tcName());
        ePurchaseInvoiceDao.setTerms(vPurchaseInvoiceDto.terms());
        ePurchaseInvoiceDao.setStatus(vPurchaseInvoiceDto.status());
        ePurchaseInvoiceDao.setPerReceived(vPurchaseInvoiceDto.perReceived());
        ePurchaseInvoiceDao.setCreditTo(vPurchaseInvoiceDto.creditTo());
        ePurchaseInvoiceDao.setPartyAccountCurrency(vPurchaseInvoiceDto.partyAccountCurrency());
        ePurchaseInvoiceDao.setIsOpening(vPurchaseInvoiceDto.isOpening());
        ePurchaseInvoiceDao.setAgainstExpenseAccount(vPurchaseInvoiceDto.againstExpenseAccount());
        ePurchaseInvoiceDao.setUnrealizedProfitLossAccount(vPurchaseInvoiceDto.unrealizedProfitLossAccount());
        ePurchaseInvoiceDao.setRepostRequired(vPurchaseInvoiceDto.repostRequired());
        ePurchaseInvoiceDao.setSubscription(vPurchaseInvoiceDto.subscription());
        ePurchaseInvoiceDao.setAutoRepeat(vPurchaseInvoiceDto.autoRepeat());
        ePurchaseInvoiceDao.setFromDate(vPurchaseInvoiceDto.fromDate());
        ePurchaseInvoiceDao.setToDate(vPurchaseInvoiceDto.toDate());
        ePurchaseInvoiceDao.setLetterHead(vPurchaseInvoiceDto.letterHead());
        ePurchaseInvoiceDao.setGroupSameItems(vPurchaseInvoiceDto.groupSameItems());
        ePurchaseInvoiceDao.setSelectPrintHeading(vPurchaseInvoiceDto.selectPrintHeading());
        ePurchaseInvoiceDao.setLanguage(vPurchaseInvoiceDto.language());
        ePurchaseInvoiceDao.setOnHold(vPurchaseInvoiceDto.onHold());
        ePurchaseInvoiceDao.setReleaseDate(vPurchaseInvoiceDto.releaseDate());
        ePurchaseInvoiceDao.setHoldComment(vPurchaseInvoiceDto.holdComment());
        ePurchaseInvoiceDao.setIsInternalSupplier(vPurchaseInvoiceDto.isInternalSupplier());
        ePurchaseInvoiceDao.setRepresentsCompany(vPurchaseInvoiceDto.representsCompany());
        ePurchaseInvoiceDao.setSupplierGroup(vPurchaseInvoiceDto.supplierGroup());
        ePurchaseInvoiceDao.setInterCompanyInvoiceReference(vPurchaseInvoiceDto.interCompanyInvoiceReference());
        ePurchaseInvoiceDao.setIsOldSubcontractingFlow(vPurchaseInvoiceDto.isOldSubcontractingFlow());
        ePurchaseInvoiceDao.setRemarks(vPurchaseInvoiceDto.remarks());
        ePurchaseInvoiceDao.setUserTags(vPurchaseInvoiceDto.userTags());
        ePurchaseInvoiceDao.setComments(vPurchaseInvoiceDto.comments());
        ePurchaseInvoiceDao.setAssign(vPurchaseInvoiceDto.assign());
        ePurchaseInvoiceDao.setLikedBy(vPurchaseInvoiceDto.likedBy());
    }
}