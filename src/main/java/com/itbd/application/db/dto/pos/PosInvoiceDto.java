package com.itbd.application.db.dto.pos;

import com.itbd.application.db.dao.accounts.pos.PosInvoiceDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public record PosInvoiceDto(
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
        String posProfile,
        String consolidatedInvoice,
        Boolean isPos,
        Boolean isReturn,
        Boolean updateBilledAmountInSalesOrder,
        Boolean updateBilledAmountInDeliveryNote,
        String company,
        LocalDate postingDate,
        LocalTime postingTime,
        Boolean setPostingTime,
        LocalDate dueDate,
        String amendedFrom,
        String returnAgainst,
        String project,
        String costCenter,
        String poNo,
        LocalDate poDate,
        String customerAddress,
        String addressDisplay,
        String contactPerson,
        String contactDisplay,
        String contactMobile,
        String contactEmail,
        String territory,
        String shippingAddressName,
        String shippingAddress,
        String companyAddress,
        String companyAddressDisplay,
        String currency,
        BigDecimal conversionRate,
        String sellingPriceList,
        String priceListCurrency,
        BigDecimal plcConversionRate,
        Boolean ignorePricingRule,
        String setWarehouse,
        Boolean updateStock,
        String scanBarcode,
        BigDecimal totalBillingAmount,
        BigDecimal totalQty,
        BigDecimal baseTotal,
        BigDecimal baseNetTotal,
        BigDecimal total,
        BigDecimal netTotal,
        BigDecimal totalNetWeight,
        String taxesAndCharges,
        String shippingRule,
        String taxCategory,
        String otherChargesCalculation,
        BigDecimal baseTotalTaxesAndCharges,
        BigDecimal totalTaxesAndCharges,
        Integer loyaltyPoints,
        BigDecimal loyaltyAmount,
        Boolean redeemLoyaltyPoints,
        String loyaltyProgram,
        String loyaltyRedemptionAccount,
        String loyaltyRedemptionCostCenter,
        String couponCode,
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
        BigDecimal totalAdvance,
        BigDecimal outstandingAmount,
        Boolean allocateAdvancesAutomatically,
        String paymentTermsTemplate,
        String cashBankAccount,
        BigDecimal basePaidAmount,
        BigDecimal paidAmount,
        BigDecimal baseChangeAmount,
        BigDecimal changeAmount,
        String accountForChangeAmount,
        BigDecimal writeOffAmount,
        BigDecimal baseWriteOffAmount,
        Boolean writeOffOutstandingAmountAutomatically,
        String writeOffAccount,
        String writeOffCostCenter,
        String tcName,
        String terms,
        String letterHead,
        Boolean groupSameItems,
        String language,
        String selectPrintHeading,
        String interCompanyInvoiceReference,
        String customerGroup,
        String campaign,
        Boolean isDiscounted,
        String status,
        String source,
        String debitTo,
        String partyAccountCurrency,
        String isOpening,
        String remarks,
        String salesPartner,
        BigDecimal amountEligibleForCommission,
        BigDecimal commissionRate,
        BigDecimal totalCommission,
        LocalDate fromDate,
        LocalDate toDate,
        String autoRepeat,
        String againstIncomeAccount,
        String userTags,
        String comments,
        String assign,
        String likedBy,
        String seen
) {
    public static PosInvoiceDto fromEntity(PosInvoiceDao ePosInvoiceDao) {
        return new PosInvoiceDto(
                ePosInvoiceDao.getName(),
                ePosInvoiceDao.getCreation(),
                ePosInvoiceDao.getModified(),
                ePosInvoiceDao.getModifiedBy(),
                ePosInvoiceDao.getOwner(),
                ePosInvoiceDao.getIsDocStatus(),
                ePosInvoiceDao.getIdx(),
                ePosInvoiceDao.getTitle(),
                ePosInvoiceDao.getNamingSeries(),
                ePosInvoiceDao.getCustomer(),
                ePosInvoiceDao.getCustomerName(),
                ePosInvoiceDao.getTaxId(),
                ePosInvoiceDao.getPosProfile(),
                ePosInvoiceDao.getConsolidatedInvoice(),
                ePosInvoiceDao.getIsPos(),
                ePosInvoiceDao.getIsReturn(),
                ePosInvoiceDao.getUpdateBilledAmountInSalesOrder(),
                ePosInvoiceDao.getUpdateBilledAmountInDeliveryNote(),
                ePosInvoiceDao.getCompany(),
                ePosInvoiceDao.getPostingDate(),
                ePosInvoiceDao.getPostingTime(),
                ePosInvoiceDao.getSetPostingTime(),
                ePosInvoiceDao.getDueDate(),
                ePosInvoiceDao.getAmendedFrom(),
                ePosInvoiceDao.getReturnAgainst(),
                ePosInvoiceDao.getProject(),
                ePosInvoiceDao.getCostCenter(),
                ePosInvoiceDao.getPoNo(),
                ePosInvoiceDao.getPoDate(),
                ePosInvoiceDao.getCustomerAddress(),
                ePosInvoiceDao.getAddressDisplay(),
                ePosInvoiceDao.getContactPerson(),
                ePosInvoiceDao.getContactDisplay(),
                ePosInvoiceDao.getContactMobile(),
                ePosInvoiceDao.getContactEmail(),
                ePosInvoiceDao.getTerritory(),
                ePosInvoiceDao.getShippingAddressName(),
                ePosInvoiceDao.getShippingAddress(),
                ePosInvoiceDao.getCompanyAddress(),
                ePosInvoiceDao.getCompanyAddressDisplay(),
                ePosInvoiceDao.getCurrency(),
                ePosInvoiceDao.getConversionRate(),
                ePosInvoiceDao.getSellingPriceList(),
                ePosInvoiceDao.getPriceListCurrency(),
                ePosInvoiceDao.getPlcConversionRate(),
                ePosInvoiceDao.getIgnorePricingRule(),
                ePosInvoiceDao.getSetWarehouse(),
                ePosInvoiceDao.getUpdateStock(),
                ePosInvoiceDao.getScanBarcode(),
                ePosInvoiceDao.getTotalBillingAmount(),
                ePosInvoiceDao.getTotalQty(),
                ePosInvoiceDao.getBaseTotal(),
                ePosInvoiceDao.getBaseNetTotal(),
                ePosInvoiceDao.getTotal(),
                ePosInvoiceDao.getNetTotal(),
                ePosInvoiceDao.getTotalNetWeight(),
                ePosInvoiceDao.getTaxesAndCharges(),
                ePosInvoiceDao.getShippingRule(),
                ePosInvoiceDao.getTaxCategory(),
                ePosInvoiceDao.getOtherChargesCalculation(),
                ePosInvoiceDao.getBaseTotalTaxesAndCharges(),
                ePosInvoiceDao.getTotalTaxesAndCharges(),
                ePosInvoiceDao.getLoyaltyPoints(),
                ePosInvoiceDao.getLoyaltyAmount(),
                ePosInvoiceDao.getRedeemLoyaltyPoints(),
                ePosInvoiceDao.getLoyaltyProgram(),
                ePosInvoiceDao.getLoyaltyRedemptionAccount(),
                ePosInvoiceDao.getLoyaltyRedemptionCostCenter(),
                ePosInvoiceDao.getCouponCode(),
                ePosInvoiceDao.getApplyDiscountOn(),
                ePosInvoiceDao.getBaseDiscountAmount(),
                ePosInvoiceDao.getAdditionalDiscountPercentage(),
                ePosInvoiceDao.getDiscountAmount(),
                ePosInvoiceDao.getBaseGrandTotal(),
                ePosInvoiceDao.getBaseRoundingAdjustment(),
                ePosInvoiceDao.getBaseRoundedTotal(),
                ePosInvoiceDao.getBaseInWords(),
                ePosInvoiceDao.getGrandTotal(),
                ePosInvoiceDao.getRoundingAdjustment(),
                ePosInvoiceDao.getRoundedTotal(),
                ePosInvoiceDao.getInWords(),
                ePosInvoiceDao.getTotalAdvance(),
                ePosInvoiceDao.getOutstandingAmount(),
                ePosInvoiceDao.getAllocateAdvancesAutomatically(),
                ePosInvoiceDao.getPaymentTermsTemplate(),
                ePosInvoiceDao.getCashBankAccount(),
                ePosInvoiceDao.getBasePaidAmount(),
                ePosInvoiceDao.getPaidAmount(),
                ePosInvoiceDao.getBaseChangeAmount(),
                ePosInvoiceDao.getChangeAmount(),
                ePosInvoiceDao.getAccountForChangeAmount(),
                ePosInvoiceDao.getWriteOffAmount(),
                ePosInvoiceDao.getBaseWriteOffAmount(),
                ePosInvoiceDao.getWriteOffOutstandingAmountAutomatically(),
                ePosInvoiceDao.getWriteOffAccount(),
                ePosInvoiceDao.getWriteOffCostCenter(),
                ePosInvoiceDao.getTcName(),
                ePosInvoiceDao.getTerms(),
                ePosInvoiceDao.getLetterHead(),
                ePosInvoiceDao.getGroupSameItems(),
                ePosInvoiceDao.getLanguage(),
                ePosInvoiceDao.getSelectPrintHeading(),
                ePosInvoiceDao.getInterCompanyInvoiceReference(),
                ePosInvoiceDao.getCustomerGroup(),
                ePosInvoiceDao.getCampaign(),
                ePosInvoiceDao.getIsDiscounted(),
                ePosInvoiceDao.getStatus(),
                ePosInvoiceDao.getSource(),
                ePosInvoiceDao.getDebitTo(),
                ePosInvoiceDao.getPartyAccountCurrency(),
                ePosInvoiceDao.getIsOpening(),
                ePosInvoiceDao.getRemarks(),
                ePosInvoiceDao.getSalesPartner(),
                ePosInvoiceDao.getAmountEligibleForCommission(),
                ePosInvoiceDao.getCommissionRate(),
                ePosInvoiceDao.getTotalCommission(),
                ePosInvoiceDao.getFromDate(),
                ePosInvoiceDao.getToDate(),
                ePosInvoiceDao.getAutoRepeat(),
                ePosInvoiceDao.getAgainstIncomeAccount(),
                ePosInvoiceDao.getUserTags(),
                ePosInvoiceDao.getComments(),
                ePosInvoiceDao.getAssign(),
                ePosInvoiceDao.getLikedBy(),
                ePosInvoiceDao.getSeen());
    }

    public static void fromDTO(PosInvoiceDto vPosInvoiceDto, PosInvoiceDao ePosInvoiceDao) {
        ePosInvoiceDao.setName(vPosInvoiceDto.name());
        ePosInvoiceDao.setCreation(vPosInvoiceDto.creation());
        ePosInvoiceDao.setModified(vPosInvoiceDto.modified());
        ePosInvoiceDao.setModifiedBy(vPosInvoiceDto.modifiedBy());
        ePosInvoiceDao.setOwner(vPosInvoiceDto.owner());
        ePosInvoiceDao.setIsDocStatus(vPosInvoiceDto.isDocStatus());
        ePosInvoiceDao.setIdx(vPosInvoiceDto.idx());
        ePosInvoiceDao.setTitle(vPosInvoiceDto.title());
        ePosInvoiceDao.setNamingSeries(vPosInvoiceDto.namingSeries());
        ePosInvoiceDao.setCustomer(vPosInvoiceDto.customer());
        ePosInvoiceDao.setCustomerName(vPosInvoiceDto.customerName());
        ePosInvoiceDao.setTaxId(vPosInvoiceDto.taxId());
        ePosInvoiceDao.setPosProfile(vPosInvoiceDto.posProfile());
        ePosInvoiceDao.setConsolidatedInvoice(vPosInvoiceDto.consolidatedInvoice());
        ePosInvoiceDao.setIsPos(vPosInvoiceDto.isPos());
        ePosInvoiceDao.setIsReturn(vPosInvoiceDto.isReturn());
        ePosInvoiceDao.setUpdateBilledAmountInSalesOrder(vPosInvoiceDto.updateBilledAmountInSalesOrder());
        ePosInvoiceDao.setUpdateBilledAmountInDeliveryNote(vPosInvoiceDto.updateBilledAmountInDeliveryNote());
        ePosInvoiceDao.setCompany(vPosInvoiceDto.company());
        ePosInvoiceDao.setPostingDate(vPosInvoiceDto.postingDate());
        ePosInvoiceDao.setPostingTime(vPosInvoiceDto.postingTime());
        ePosInvoiceDao.setSetPostingTime(vPosInvoiceDto.setPostingTime());
        ePosInvoiceDao.setDueDate(vPosInvoiceDto.dueDate());
        ePosInvoiceDao.setAmendedFrom(vPosInvoiceDto.amendedFrom());
        ePosInvoiceDao.setReturnAgainst(vPosInvoiceDto.returnAgainst());
        ePosInvoiceDao.setProject(vPosInvoiceDto.project());
        ePosInvoiceDao.setCostCenter(vPosInvoiceDto.costCenter());
        ePosInvoiceDao.setPoNo(vPosInvoiceDto.poNo());
        ePosInvoiceDao.setPoDate(vPosInvoiceDto.poDate());
        ePosInvoiceDao.setCustomerAddress(vPosInvoiceDto.customerAddress());
        ePosInvoiceDao.setAddressDisplay(vPosInvoiceDto.addressDisplay());
        ePosInvoiceDao.setContactPerson(vPosInvoiceDto.contactPerson());
        ePosInvoiceDao.setContactDisplay(vPosInvoiceDto.contactDisplay());
        ePosInvoiceDao.setContactMobile(vPosInvoiceDto.contactMobile());
        ePosInvoiceDao.setContactEmail(vPosInvoiceDto.contactEmail());
        ePosInvoiceDao.setTerritory(vPosInvoiceDto.territory());
        ePosInvoiceDao.setShippingAddressName(vPosInvoiceDto.shippingAddressName());
        ePosInvoiceDao.setShippingAddress(vPosInvoiceDto.shippingAddress());
        ePosInvoiceDao.setCompanyAddress(vPosInvoiceDto.companyAddress());
        ePosInvoiceDao.setCompanyAddressDisplay(vPosInvoiceDto.companyAddressDisplay());
        ePosInvoiceDao.setCurrency(vPosInvoiceDto.currency());
        ePosInvoiceDao.setConversionRate(vPosInvoiceDto.conversionRate());
        ePosInvoiceDao.setSellingPriceList(vPosInvoiceDto.sellingPriceList());
        ePosInvoiceDao.setPriceListCurrency(vPosInvoiceDto.priceListCurrency());
        ePosInvoiceDao.setPlcConversionRate(vPosInvoiceDto.plcConversionRate());
        ePosInvoiceDao.setIgnorePricingRule(vPosInvoiceDto.ignorePricingRule());
        ePosInvoiceDao.setSetWarehouse(vPosInvoiceDto.setWarehouse());
        ePosInvoiceDao.setUpdateStock(vPosInvoiceDto.updateStock());
        ePosInvoiceDao.setScanBarcode(vPosInvoiceDto.scanBarcode());
        ePosInvoiceDao.setTotalBillingAmount(vPosInvoiceDto.totalBillingAmount());
        ePosInvoiceDao.setTotalQty(vPosInvoiceDto.totalQty());
        ePosInvoiceDao.setBaseTotal(vPosInvoiceDto.baseTotal());
        ePosInvoiceDao.setBaseNetTotal(vPosInvoiceDto.baseNetTotal());
        ePosInvoiceDao.setTotal(vPosInvoiceDto.total());
        ePosInvoiceDao.setNetTotal(vPosInvoiceDto.netTotal());
        ePosInvoiceDao.setTotalNetWeight(vPosInvoiceDto.totalNetWeight());
        ePosInvoiceDao.setTaxesAndCharges(vPosInvoiceDto.taxesAndCharges());
        ePosInvoiceDao.setShippingRule(vPosInvoiceDto.shippingRule());
        ePosInvoiceDao.setTaxCategory(vPosInvoiceDto.taxCategory());
        ePosInvoiceDao.setOtherChargesCalculation(vPosInvoiceDto.otherChargesCalculation());
        ePosInvoiceDao.setBaseTotalTaxesAndCharges(vPosInvoiceDto.baseTotalTaxesAndCharges());
        ePosInvoiceDao.setTotalTaxesAndCharges(vPosInvoiceDto.totalTaxesAndCharges());
        ePosInvoiceDao.setLoyaltyPoints(vPosInvoiceDto.loyaltyPoints());
        ePosInvoiceDao.setLoyaltyAmount(vPosInvoiceDto.loyaltyAmount());
        ePosInvoiceDao.setRedeemLoyaltyPoints(vPosInvoiceDto.redeemLoyaltyPoints());
        ePosInvoiceDao.setLoyaltyProgram(vPosInvoiceDto.loyaltyProgram());
        ePosInvoiceDao.setLoyaltyRedemptionAccount(vPosInvoiceDto.loyaltyRedemptionAccount());
        ePosInvoiceDao.setLoyaltyRedemptionCostCenter(vPosInvoiceDto.loyaltyRedemptionCostCenter());
        ePosInvoiceDao.setCouponCode(vPosInvoiceDto.couponCode());
        ePosInvoiceDao.setApplyDiscountOn(vPosInvoiceDto.applyDiscountOn());
        ePosInvoiceDao.setBaseDiscountAmount(vPosInvoiceDto.baseDiscountAmount());
        ePosInvoiceDao.setAdditionalDiscountPercentage(vPosInvoiceDto.additionalDiscountPercentage());
        ePosInvoiceDao.setDiscountAmount(vPosInvoiceDto.discountAmount());
        ePosInvoiceDao.setBaseGrandTotal(vPosInvoiceDto.baseGrandTotal());
        ePosInvoiceDao.setBaseRoundingAdjustment(vPosInvoiceDto.baseRoundingAdjustment());
        ePosInvoiceDao.setBaseRoundedTotal(vPosInvoiceDto.baseRoundedTotal());
        ePosInvoiceDao.setBaseInWords(vPosInvoiceDto.baseInWords());
        ePosInvoiceDao.setGrandTotal(vPosInvoiceDto.grandTotal());
        ePosInvoiceDao.setRoundingAdjustment(vPosInvoiceDto.roundingAdjustment());
        ePosInvoiceDao.setRoundedTotal(vPosInvoiceDto.roundedTotal());
        ePosInvoiceDao.setInWords(vPosInvoiceDto.inWords());
        ePosInvoiceDao.setTotalAdvance(vPosInvoiceDto.totalAdvance());
        ePosInvoiceDao.setOutstandingAmount(vPosInvoiceDto.outstandingAmount());
        ePosInvoiceDao.setAllocateAdvancesAutomatically(vPosInvoiceDto.allocateAdvancesAutomatically());
        ePosInvoiceDao.setPaymentTermsTemplate(vPosInvoiceDto.paymentTermsTemplate());
        ePosInvoiceDao.setCashBankAccount(vPosInvoiceDto.cashBankAccount());
        ePosInvoiceDao.setBasePaidAmount(vPosInvoiceDto.basePaidAmount());
        ePosInvoiceDao.setPaidAmount(vPosInvoiceDto.paidAmount());
        ePosInvoiceDao.setBaseChangeAmount(vPosInvoiceDto.baseChangeAmount());
        ePosInvoiceDao.setChangeAmount(vPosInvoiceDto.changeAmount());
        ePosInvoiceDao.setAccountForChangeAmount(vPosInvoiceDto.accountForChangeAmount());
        ePosInvoiceDao.setWriteOffAmount(vPosInvoiceDto.writeOffAmount());
        ePosInvoiceDao.setBaseWriteOffAmount(vPosInvoiceDto.baseWriteOffAmount());
        ePosInvoiceDao.setWriteOffOutstandingAmountAutomatically(vPosInvoiceDto.writeOffOutstandingAmountAutomatically());
        ePosInvoiceDao.setWriteOffAccount(vPosInvoiceDto.writeOffAccount());
        ePosInvoiceDao.setWriteOffCostCenter(vPosInvoiceDto.writeOffCostCenter());
        ePosInvoiceDao.setTcName(vPosInvoiceDto.tcName());
        ePosInvoiceDao.setTerms(vPosInvoiceDto.terms());
        ePosInvoiceDao.setLetterHead(vPosInvoiceDto.letterHead());
        ePosInvoiceDao.setGroupSameItems(vPosInvoiceDto.groupSameItems());
        ePosInvoiceDao.setLanguage(vPosInvoiceDto.language());
        ePosInvoiceDao.setSelectPrintHeading(vPosInvoiceDto.selectPrintHeading());
        ePosInvoiceDao.setInterCompanyInvoiceReference(vPosInvoiceDto.interCompanyInvoiceReference());
        ePosInvoiceDao.setCustomerGroup(vPosInvoiceDto.customerGroup());
        ePosInvoiceDao.setCampaign(vPosInvoiceDto.campaign());
        ePosInvoiceDao.setIsDiscounted(vPosInvoiceDto.isDiscounted());
        ePosInvoiceDao.setStatus(vPosInvoiceDto.status());
        ePosInvoiceDao.setSource(vPosInvoiceDto.source());
        ePosInvoiceDao.setDebitTo(vPosInvoiceDto.debitTo());
        ePosInvoiceDao.setPartyAccountCurrency(vPosInvoiceDto.partyAccountCurrency());
        ePosInvoiceDao.setIsOpening(vPosInvoiceDto.isOpening());
        ePosInvoiceDao.setRemarks(vPosInvoiceDto.remarks());
        ePosInvoiceDao.setSalesPartner(vPosInvoiceDto.salesPartner());
        ePosInvoiceDao.setAmountEligibleForCommission(vPosInvoiceDto.amountEligibleForCommission());
        ePosInvoiceDao.setCommissionRate(vPosInvoiceDto.commissionRate());
        ePosInvoiceDao.setTotalCommission(vPosInvoiceDto.totalCommission());
        ePosInvoiceDao.setFromDate(vPosInvoiceDto.fromDate());
        ePosInvoiceDao.setToDate(vPosInvoiceDto.toDate());
        ePosInvoiceDao.setAutoRepeat(vPosInvoiceDto.autoRepeat());
        ePosInvoiceDao.setAgainstIncomeAccount(vPosInvoiceDto.againstIncomeAccount());
        ePosInvoiceDao.setUserTags(vPosInvoiceDto.userTags());
        ePosInvoiceDao.setComments(vPosInvoiceDto.comments());
        ePosInvoiceDao.setAssign(vPosInvoiceDto.assign());
        ePosInvoiceDao.setLikedBy(vPosInvoiceDto.likedBy());
        ePosInvoiceDao.setSeen(vPosInvoiceDto.seen());
    }
}