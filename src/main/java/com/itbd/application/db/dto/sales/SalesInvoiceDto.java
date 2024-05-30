package com.itbd.application.db.dto.sales;

import com.itbd.application.db.dao.accounts.sales.SalesInvoiceDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public record SalesInvoiceDto(
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
        String customer,
        String customerName,
        String taxId,
        String company,
        String companyTaxId,
        LocalDate postingDate,
        LocalTime postingTime,
        Boolean setPostingTime,
        LocalDate dueDate,
        Boolean isPos,
        String posProfile,
        Boolean isConsolidated,
        Boolean isReturn,
        String returnAgainst,
        Boolean updateOutstandingForSelf,
        Boolean updateBilledAmountInSalesOrder,
        Boolean updateBilledAmountInDeliveryNote,
        Boolean isDebitNote,
        String amendedFrom,
        String costCenter,
        String project,
        String currency,
        BigDecimal conversionRate,
        String sellingPriceList,
        String priceListCurrency,
        BigDecimal plcConversionRate,
        Boolean ignorePricingRule,
        String scanBarcode,
        Boolean updateStock,
        String setWarehouse,
        String setTargetWarehouse,
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
        Boolean useCompanyRoundoffCostCenter,
        BigDecimal roundedTotal,
        String inWords,
        BigDecimal totalAdvance,
        BigDecimal outstandingAmount,
        Boolean disableRoundedTotal,
        String applyDiscountOn,
        BigDecimal baseDiscountAmount,
        Boolean isCashOrNonTradeDiscount,
        String additionalDiscountAccount,
        BigDecimal additionalDiscountPercentage,
        BigDecimal discountAmount,
        String otherChargesCalculation,
        BigDecimal totalBillingHours,
        BigDecimal totalBillingAmount,
        String cashBankAccount,
        BigDecimal basePaidAmount,
        BigDecimal paidAmount,
        BigDecimal baseChangeAmount,
        BigDecimal changeAmount,
        String accountForChangeAmount,
        Boolean allocateAdvancesAutomatically,
        Boolean onlyIncludeAllocatedPayments,
        BigDecimal writeOffAmount,
        BigDecimal baseWriteOffAmount,
        Boolean writeOffOutstandingAmountAutomatically,
        String writeOffAccount,
        String writeOffCostCenter,
        Boolean redeemLoyaltyPoints,
        Integer loyaltyPoints,
        BigDecimal loyaltyAmount,
        String loyaltyProgram,
        String loyaltyRedemptionAccount,
        String loyaltyRedemptionCostCenter,
        String customerAddress,
        String addressDisplay,
        String contactPerson,
        String contactDisplay,
        String contactMobile,
        String contactEmail,
        String territory,
        String shippingAddressName,
        String shippingAddress,
        String dispatchAddressName,
        String dispatchAddress,
        String companyAddress,
        String companyAddressDisplay,
        Boolean ignoreDefaultPaymentTermsTemplate,
        String paymentTermsTemplate,
        String tcName,
        String terms,
        String poNo,
        LocalDate poDate,
        String debitTo,
        String partyAccountCurrency,
        String isOpening,
        String unrealizedProfitLossAccount,
        String againstIncomeAccount,
        String salesPartner,
        BigDecimal amountEligibleForCommission,
        BigDecimal commissionRate,
        BigDecimal totalCommission,
        String letterHead,
        Boolean groupSameItems,
        String selectPrintHeading,
        String language,
        String subscription,
        LocalDate fromDate,
        String autoRepeat,
        LocalDate toDate,
        String status,
        String interCompanyInvoiceReference,
        String campaign,
        String representsCompany,
        String source,
        String customerGroup,
        Boolean isInternalCustomer,
        Boolean isDiscounted,
        String remarks,
        Boolean repostRequired,
        String userTags,
        String comments,
        String assign,
        String likedBy,
        String seen
) {
    public static SalesInvoiceDto fromEntity(SalesInvoiceDao eSalesInvoiceDao) {
        return new SalesInvoiceDto(
                eSalesInvoiceDao.getName(),
                eSalesInvoiceDao.getCreation(),
                eSalesInvoiceDao.getModified(),
                eSalesInvoiceDao.getModifiedBy(),
                eSalesInvoiceDao.getOwner(),
                eSalesInvoiceDao.getIsDocStatus(),
                eSalesInvoiceDao.getIdx(),
                eSalesInvoiceDao.getTitle(),
                eSalesInvoiceDao.getNamingSeries(),
                eSalesInvoiceDao.getCustomer(),
                eSalesInvoiceDao.getCustomerName(),
                eSalesInvoiceDao.getTaxId(),
                eSalesInvoiceDao.getCompany(),
                eSalesInvoiceDao.getCompanyTaxId(),
                eSalesInvoiceDao.getPostingDate(),
                eSalesInvoiceDao.getPostingTime(),
                eSalesInvoiceDao.getSetPostingTime(),
                eSalesInvoiceDao.getDueDate(),
                eSalesInvoiceDao.getIsPos(),
                eSalesInvoiceDao.getPosProfile(),
                eSalesInvoiceDao.getIsConsolidated(),
                eSalesInvoiceDao.getIsReturn(),
                eSalesInvoiceDao.getReturnAgainst(),
                eSalesInvoiceDao.getUpdateOutstandingForSelf(),
                eSalesInvoiceDao.getUpdateBilledAmountInSalesOrder(),
                eSalesInvoiceDao.getUpdateBilledAmountInDeliveryNote(),
                eSalesInvoiceDao.getIsDebitNote(),
                eSalesInvoiceDao.getAmendedFrom(),
                eSalesInvoiceDao.getCostCenter(),
                eSalesInvoiceDao.getProject(),
                eSalesInvoiceDao.getCurrency(),
                eSalesInvoiceDao.getConversionRate(),
                eSalesInvoiceDao.getSellingPriceList(),
                eSalesInvoiceDao.getPriceListCurrency(),
                eSalesInvoiceDao.getPlcConversionRate(),
                eSalesInvoiceDao.getIgnorePricingRule(),
                eSalesInvoiceDao.getScanBarcode(),
                eSalesInvoiceDao.getUpdateStock(),
                eSalesInvoiceDao.getSetWarehouse(),
                eSalesInvoiceDao.getSetTargetWarehouse(),
                eSalesInvoiceDao.getTotalQty(),
                eSalesInvoiceDao.getTotalNetWeight(),
                eSalesInvoiceDao.getBaseTotal(),
                eSalesInvoiceDao.getBaseNetTotal(),
                eSalesInvoiceDao.getTotal(),
                eSalesInvoiceDao.getNetTotal(),
                eSalesInvoiceDao.getTaxCategory(),
                eSalesInvoiceDao.getTaxesAndCharges(),
                eSalesInvoiceDao.getShippingRule(),
                eSalesInvoiceDao.getIncoterm(),
                eSalesInvoiceDao.getNamedPlace(),
                eSalesInvoiceDao.getBaseTotalTaxesAndCharges(),
                eSalesInvoiceDao.getTotalTaxesAndCharges(),
                eSalesInvoiceDao.getBaseGrandTotal(),
                eSalesInvoiceDao.getBaseRoundingAdjustment(),
                eSalesInvoiceDao.getBaseRoundedTotal(),
                eSalesInvoiceDao.getBaseInWords(),
                eSalesInvoiceDao.getGrandTotal(),
                eSalesInvoiceDao.getRoundingAdjustment(),
                eSalesInvoiceDao.getUseCompanyRoundoffCostCenter(),
                eSalesInvoiceDao.getRoundedTotal(),
                eSalesInvoiceDao.getInWords(),
                eSalesInvoiceDao.getTotalAdvance(),
                eSalesInvoiceDao.getOutstandingAmount(),
                eSalesInvoiceDao.getDisableRoundedTotal(),
                eSalesInvoiceDao.getApplyDiscountOn(),
                eSalesInvoiceDao.getBaseDiscountAmount(),
                eSalesInvoiceDao.getIsCashOrNonTradeDiscount(),
                eSalesInvoiceDao.getAdditionalDiscountAccount(),
                eSalesInvoiceDao.getAdditionalDiscountPercentage(),
                eSalesInvoiceDao.getDiscountAmount(),
                eSalesInvoiceDao.getOtherChargesCalculation(),
                eSalesInvoiceDao.getTotalBillingHours(),
                eSalesInvoiceDao.getTotalBillingAmount(),
                eSalesInvoiceDao.getCashBankAccount(),
                eSalesInvoiceDao.getBasePaidAmount(),
                eSalesInvoiceDao.getPaidAmount(),
                eSalesInvoiceDao.getBaseChangeAmount(),
                eSalesInvoiceDao.getChangeAmount(),
                eSalesInvoiceDao.getAccountForChangeAmount(),
                eSalesInvoiceDao.getAllocateAdvancesAutomatically(),
                eSalesInvoiceDao.getOnlyIncludeAllocatedPayments(),
                eSalesInvoiceDao.getWriteOffAmount(),
                eSalesInvoiceDao.getBaseWriteOffAmount(),
                eSalesInvoiceDao.getWriteOffOutstandingAmountAutomatically(),
                eSalesInvoiceDao.getWriteOffAccount(),
                eSalesInvoiceDao.getWriteOffCostCenter(),
                eSalesInvoiceDao.getRedeemLoyaltyPoints(),
                eSalesInvoiceDao.getLoyaltyPoints(),
                eSalesInvoiceDao.getLoyaltyAmount(),
                eSalesInvoiceDao.getLoyaltyProgram(),
                eSalesInvoiceDao.getLoyaltyRedemptionAccount(),
                eSalesInvoiceDao.getLoyaltyRedemptionCostCenter(),
                eSalesInvoiceDao.getCustomerAddress(),
                eSalesInvoiceDao.getAddressDisplay(),
                eSalesInvoiceDao.getContactPerson(),
                eSalesInvoiceDao.getContactDisplay(),
                eSalesInvoiceDao.getContactMobile(),
                eSalesInvoiceDao.getContactEmail(),
                eSalesInvoiceDao.getTerritory(),
                eSalesInvoiceDao.getShippingAddressName(),
                eSalesInvoiceDao.getShippingAddress(),
                eSalesInvoiceDao.getDispatchAddressName(),
                eSalesInvoiceDao.getDispatchAddress(),
                eSalesInvoiceDao.getCompanyAddress(),
                eSalesInvoiceDao.getCompanyAddressDisplay(),
                eSalesInvoiceDao.getIgnoreDefaultPaymentTermsTemplate(),
                eSalesInvoiceDao.getPaymentTermsTemplate(),
                eSalesInvoiceDao.getTcName(),
                eSalesInvoiceDao.getTerms(),
                eSalesInvoiceDao.getPoNo(),
                eSalesInvoiceDao.getPoDate(),
                eSalesInvoiceDao.getDebitTo(),
                eSalesInvoiceDao.getPartyAccountCurrency(),
                eSalesInvoiceDao.getIsOpening(),
                eSalesInvoiceDao.getUnrealizedProfitLossAccount(),
                eSalesInvoiceDao.getAgainstIncomeAccount(),
                eSalesInvoiceDao.getSalesPartner(),
                eSalesInvoiceDao.getAmountEligibleForCommission(),
                eSalesInvoiceDao.getCommissionRate(),
                eSalesInvoiceDao.getTotalCommission(),
                eSalesInvoiceDao.getLetterHead(),
                eSalesInvoiceDao.getGroupSameItems(),
                eSalesInvoiceDao.getSelectPrintHeading(),
                eSalesInvoiceDao.getLanguage(),
                eSalesInvoiceDao.getSubscription(),
                eSalesInvoiceDao.getFromDate(),
                eSalesInvoiceDao.getAutoRepeat(),
                eSalesInvoiceDao.getToDate(),
                eSalesInvoiceDao.getStatus(),
                eSalesInvoiceDao.getInterCompanyInvoiceReference(),
                eSalesInvoiceDao.getCampaign(),
                eSalesInvoiceDao.getRepresentsCompany(),
                eSalesInvoiceDao.getSource(),
                eSalesInvoiceDao.getCustomerGroup(),
                eSalesInvoiceDao.getIsInternalCustomer(),
                eSalesInvoiceDao.getIsDiscounted(),
                eSalesInvoiceDao.getRemarks(),
                eSalesInvoiceDao.getRepostRequired(),
                eSalesInvoiceDao.getUserTags(),
                eSalesInvoiceDao.getComments(),
                eSalesInvoiceDao.getAssign(),
                eSalesInvoiceDao.getLikedBy(),
                eSalesInvoiceDao.getSeen());
    }

    public static void fromDTO(SalesInvoiceDto vSalesInvoiceDto, SalesInvoiceDao eSalesInvoiceDao) {
        eSalesInvoiceDao.setName(vSalesInvoiceDto.name());
        eSalesInvoiceDao.setCreation(vSalesInvoiceDto.creation());
        eSalesInvoiceDao.setModified(vSalesInvoiceDto.modified());
        eSalesInvoiceDao.setModifiedBy(vSalesInvoiceDto.modifiedBy());
        eSalesInvoiceDao.setOwner(vSalesInvoiceDto.owner());
        eSalesInvoiceDao.setIsDocStatus(vSalesInvoiceDto.isDocStatus());
        eSalesInvoiceDao.setIdx(vSalesInvoiceDto.idx());
        eSalesInvoiceDao.setTitle(vSalesInvoiceDto.title());
        eSalesInvoiceDao.setNamingSeries(vSalesInvoiceDto.namingSeries());
        eSalesInvoiceDao.setCustomer(vSalesInvoiceDto.customer());
        eSalesInvoiceDao.setCustomerName(vSalesInvoiceDto.customerName());
        eSalesInvoiceDao.setTaxId(vSalesInvoiceDto.taxId());
        eSalesInvoiceDao.setCompany(vSalesInvoiceDto.company());
        eSalesInvoiceDao.setCompanyTaxId(vSalesInvoiceDto.companyTaxId());
        eSalesInvoiceDao.setPostingDate(vSalesInvoiceDto.postingDate());
        eSalesInvoiceDao.setPostingTime(vSalesInvoiceDto.postingTime());
        eSalesInvoiceDao.setSetPostingTime(vSalesInvoiceDto.setPostingTime());
        eSalesInvoiceDao.setDueDate(vSalesInvoiceDto.dueDate());
        eSalesInvoiceDao.setIsPos(vSalesInvoiceDto.isPos());
        eSalesInvoiceDao.setPosProfile(vSalesInvoiceDto.posProfile());
        eSalesInvoiceDao.setIsConsolidated(vSalesInvoiceDto.isConsolidated());
        eSalesInvoiceDao.setIsReturn(vSalesInvoiceDto.isReturn());
        eSalesInvoiceDao.setReturnAgainst(vSalesInvoiceDto.returnAgainst());
        eSalesInvoiceDao.setUpdateOutstandingForSelf(vSalesInvoiceDto.updateOutstandingForSelf());
        eSalesInvoiceDao.setUpdateBilledAmountInSalesOrder(vSalesInvoiceDto.updateBilledAmountInSalesOrder());
        eSalesInvoiceDao.setUpdateBilledAmountInDeliveryNote(vSalesInvoiceDto.updateBilledAmountInDeliveryNote());
        eSalesInvoiceDao.setIsDebitNote(vSalesInvoiceDto.isDebitNote());
        eSalesInvoiceDao.setAmendedFrom(vSalesInvoiceDto.amendedFrom());
        eSalesInvoiceDao.setCostCenter(vSalesInvoiceDto.costCenter());
        eSalesInvoiceDao.setProject(vSalesInvoiceDto.project());
        eSalesInvoiceDao.setCurrency(vSalesInvoiceDto.currency());
        eSalesInvoiceDao.setConversionRate(vSalesInvoiceDto.conversionRate());
        eSalesInvoiceDao.setSellingPriceList(vSalesInvoiceDto.sellingPriceList());
        eSalesInvoiceDao.setPriceListCurrency(vSalesInvoiceDto.priceListCurrency());
        eSalesInvoiceDao.setPlcConversionRate(vSalesInvoiceDto.plcConversionRate());
        eSalesInvoiceDao.setIgnorePricingRule(vSalesInvoiceDto.ignorePricingRule());
        eSalesInvoiceDao.setScanBarcode(vSalesInvoiceDto.scanBarcode());
        eSalesInvoiceDao.setUpdateStock(vSalesInvoiceDto.updateStock());
        eSalesInvoiceDao.setSetWarehouse(vSalesInvoiceDto.setWarehouse());
        eSalesInvoiceDao.setSetTargetWarehouse(vSalesInvoiceDto.setTargetWarehouse());
        eSalesInvoiceDao.setTotalQty(vSalesInvoiceDto.totalQty());
        eSalesInvoiceDao.setTotalNetWeight(vSalesInvoiceDto.totalNetWeight());
        eSalesInvoiceDao.setBaseTotal(vSalesInvoiceDto.baseTotal());
        eSalesInvoiceDao.setBaseNetTotal(vSalesInvoiceDto.baseNetTotal());
        eSalesInvoiceDao.setTotal(vSalesInvoiceDto.total());
        eSalesInvoiceDao.setNetTotal(vSalesInvoiceDto.netTotal());
        eSalesInvoiceDao.setTaxCategory(vSalesInvoiceDto.taxCategory());
        eSalesInvoiceDao.setTaxesAndCharges(vSalesInvoiceDto.taxesAndCharges());
        eSalesInvoiceDao.setShippingRule(vSalesInvoiceDto.shippingRule());
        eSalesInvoiceDao.setIncoterm(vSalesInvoiceDto.incoterm());
        eSalesInvoiceDao.setNamedPlace(vSalesInvoiceDto.namedPlace());
        eSalesInvoiceDao.setBaseTotalTaxesAndCharges(vSalesInvoiceDto.baseTotalTaxesAndCharges());
        eSalesInvoiceDao.setTotalTaxesAndCharges(vSalesInvoiceDto.totalTaxesAndCharges());
        eSalesInvoiceDao.setBaseGrandTotal(vSalesInvoiceDto.baseGrandTotal());
        eSalesInvoiceDao.setBaseRoundingAdjustment(vSalesInvoiceDto.baseRoundingAdjustment());
        eSalesInvoiceDao.setBaseRoundedTotal(vSalesInvoiceDto.baseRoundedTotal());
        eSalesInvoiceDao.setBaseInWords(vSalesInvoiceDto.baseInWords());
        eSalesInvoiceDao.setGrandTotal(vSalesInvoiceDto.grandTotal());
        eSalesInvoiceDao.setRoundingAdjustment(vSalesInvoiceDto.roundingAdjustment());
        eSalesInvoiceDao.setUseCompanyRoundoffCostCenter(vSalesInvoiceDto.useCompanyRoundoffCostCenter());
        eSalesInvoiceDao.setRoundedTotal(vSalesInvoiceDto.roundedTotal());
        eSalesInvoiceDao.setInWords(vSalesInvoiceDto.inWords());
        eSalesInvoiceDao.setTotalAdvance(vSalesInvoiceDto.totalAdvance());
        eSalesInvoiceDao.setOutstandingAmount(vSalesInvoiceDto.outstandingAmount());
        eSalesInvoiceDao.setDisableRoundedTotal(vSalesInvoiceDto.disableRoundedTotal());
        eSalesInvoiceDao.setApplyDiscountOn(vSalesInvoiceDto.applyDiscountOn());
        eSalesInvoiceDao.setBaseDiscountAmount(vSalesInvoiceDto.baseDiscountAmount());
        eSalesInvoiceDao.setIsCashOrNonTradeDiscount(vSalesInvoiceDto.isCashOrNonTradeDiscount());
        eSalesInvoiceDao.setAdditionalDiscountAccount(vSalesInvoiceDto.additionalDiscountAccount());
        eSalesInvoiceDao.setAdditionalDiscountPercentage(vSalesInvoiceDto.additionalDiscountPercentage());
        eSalesInvoiceDao.setDiscountAmount(vSalesInvoiceDto.discountAmount());
        eSalesInvoiceDao.setOtherChargesCalculation(vSalesInvoiceDto.otherChargesCalculation());
        eSalesInvoiceDao.setTotalBillingHours(vSalesInvoiceDto.totalBillingHours());
        eSalesInvoiceDao.setTotalBillingAmount(vSalesInvoiceDto.totalBillingAmount());
        eSalesInvoiceDao.setCashBankAccount(vSalesInvoiceDto.cashBankAccount());
        eSalesInvoiceDao.setBasePaidAmount(vSalesInvoiceDto.basePaidAmount());
        eSalesInvoiceDao.setPaidAmount(vSalesInvoiceDto.paidAmount());
        eSalesInvoiceDao.setBaseChangeAmount(vSalesInvoiceDto.baseChangeAmount());
        eSalesInvoiceDao.setChangeAmount(vSalesInvoiceDto.changeAmount());
        eSalesInvoiceDao.setAccountForChangeAmount(vSalesInvoiceDto.accountForChangeAmount());
        eSalesInvoiceDao.setAllocateAdvancesAutomatically(vSalesInvoiceDto.allocateAdvancesAutomatically());
        eSalesInvoiceDao.setOnlyIncludeAllocatedPayments(vSalesInvoiceDto.onlyIncludeAllocatedPayments());
        eSalesInvoiceDao.setWriteOffAmount(vSalesInvoiceDto.writeOffAmount());
        eSalesInvoiceDao.setBaseWriteOffAmount(vSalesInvoiceDto.baseWriteOffAmount());
        eSalesInvoiceDao.setWriteOffOutstandingAmountAutomatically(vSalesInvoiceDto.writeOffOutstandingAmountAutomatically());
        eSalesInvoiceDao.setWriteOffAccount(vSalesInvoiceDto.writeOffAccount());
        eSalesInvoiceDao.setWriteOffCostCenter(vSalesInvoiceDto.writeOffCostCenter());
        eSalesInvoiceDao.setRedeemLoyaltyPoints(vSalesInvoiceDto.redeemLoyaltyPoints());
        eSalesInvoiceDao.setLoyaltyPoints(vSalesInvoiceDto.loyaltyPoints());
        eSalesInvoiceDao.setLoyaltyAmount(vSalesInvoiceDto.loyaltyAmount());
        eSalesInvoiceDao.setLoyaltyProgram(vSalesInvoiceDto.loyaltyProgram());
        eSalesInvoiceDao.setLoyaltyRedemptionAccount(vSalesInvoiceDto.loyaltyRedemptionAccount());
        eSalesInvoiceDao.setLoyaltyRedemptionCostCenter(vSalesInvoiceDto.loyaltyRedemptionCostCenter());
        eSalesInvoiceDao.setCustomerAddress(vSalesInvoiceDto.customerAddress());
        eSalesInvoiceDao.setAddressDisplay(vSalesInvoiceDto.addressDisplay());
        eSalesInvoiceDao.setContactPerson(vSalesInvoiceDto.contactPerson());
        eSalesInvoiceDao.setContactDisplay(vSalesInvoiceDto.contactDisplay());
        eSalesInvoiceDao.setContactMobile(vSalesInvoiceDto.contactMobile());
        eSalesInvoiceDao.setContactEmail(vSalesInvoiceDto.contactEmail());
        eSalesInvoiceDao.setTerritory(vSalesInvoiceDto.territory());
        eSalesInvoiceDao.setShippingAddressName(vSalesInvoiceDto.shippingAddressName());
        eSalesInvoiceDao.setShippingAddress(vSalesInvoiceDto.shippingAddress());
        eSalesInvoiceDao.setDispatchAddressName(vSalesInvoiceDto.dispatchAddressName());
        eSalesInvoiceDao.setDispatchAddress(vSalesInvoiceDto.dispatchAddress());
        eSalesInvoiceDao.setCompanyAddress(vSalesInvoiceDto.companyAddress());
        eSalesInvoiceDao.setCompanyAddressDisplay(vSalesInvoiceDto.companyAddressDisplay());
        eSalesInvoiceDao.setIgnoreDefaultPaymentTermsTemplate(vSalesInvoiceDto.ignoreDefaultPaymentTermsTemplate());
        eSalesInvoiceDao.setPaymentTermsTemplate(vSalesInvoiceDto.paymentTermsTemplate());
        eSalesInvoiceDao.setTcName(vSalesInvoiceDto.tcName());
        eSalesInvoiceDao.setTerms(vSalesInvoiceDto.terms());
        eSalesInvoiceDao.setPoNo(vSalesInvoiceDto.poNo());
        eSalesInvoiceDao.setPoDate(vSalesInvoiceDto.poDate());
        eSalesInvoiceDao.setDebitTo(vSalesInvoiceDto.debitTo());
        eSalesInvoiceDao.setPartyAccountCurrency(vSalesInvoiceDto.partyAccountCurrency());
        eSalesInvoiceDao.setIsOpening(vSalesInvoiceDto.isOpening());
        eSalesInvoiceDao.setUnrealizedProfitLossAccount(vSalesInvoiceDto.unrealizedProfitLossAccount());
        eSalesInvoiceDao.setAgainstIncomeAccount(vSalesInvoiceDto.againstIncomeAccount());
        eSalesInvoiceDao.setSalesPartner(vSalesInvoiceDto.salesPartner());
        eSalesInvoiceDao.setAmountEligibleForCommission(vSalesInvoiceDto.amountEligibleForCommission());
        eSalesInvoiceDao.setCommissionRate(vSalesInvoiceDto.commissionRate());
        eSalesInvoiceDao.setTotalCommission(vSalesInvoiceDto.totalCommission());
        eSalesInvoiceDao.setLetterHead(vSalesInvoiceDto.letterHead());
        eSalesInvoiceDao.setGroupSameItems(vSalesInvoiceDto.groupSameItems());
        eSalesInvoiceDao.setSelectPrintHeading(vSalesInvoiceDto.selectPrintHeading());
        eSalesInvoiceDao.setLanguage(vSalesInvoiceDto.language());
        eSalesInvoiceDao.setSubscription(vSalesInvoiceDto.subscription());
        eSalesInvoiceDao.setFromDate(vSalesInvoiceDto.fromDate());
        eSalesInvoiceDao.setAutoRepeat(vSalesInvoiceDto.autoRepeat());
        eSalesInvoiceDao.setToDate(vSalesInvoiceDto.toDate());
        eSalesInvoiceDao.setStatus(vSalesInvoiceDto.status());
        eSalesInvoiceDao.setInterCompanyInvoiceReference(vSalesInvoiceDto.interCompanyInvoiceReference());
        eSalesInvoiceDao.setCampaign(vSalesInvoiceDto.campaign());
        eSalesInvoiceDao.setRepresentsCompany(vSalesInvoiceDto.representsCompany());
        eSalesInvoiceDao.setSource(vSalesInvoiceDto.source());
        eSalesInvoiceDao.setCustomerGroup(vSalesInvoiceDto.customerGroup());
        eSalesInvoiceDao.setIsInternalCustomer(vSalesInvoiceDto.isInternalCustomer());
        eSalesInvoiceDao.setIsDiscounted(vSalesInvoiceDto.isDiscounted());
        eSalesInvoiceDao.setRemarks(vSalesInvoiceDto.remarks());
        eSalesInvoiceDao.setRepostRequired(vSalesInvoiceDto.repostRequired());
        eSalesInvoiceDao.setUserTags(vSalesInvoiceDto.userTags());
        eSalesInvoiceDao.setComments(vSalesInvoiceDto.comments());
        eSalesInvoiceDao.setAssign(vSalesInvoiceDto.assign());
        eSalesInvoiceDao.setLikedBy(vSalesInvoiceDto.likedBy());
        eSalesInvoiceDao.setSeen(vSalesInvoiceDto.seen());
    }
}