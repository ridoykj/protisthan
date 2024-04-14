package com.itbd.application.db.dto.payments;

import com.itbd.application.db.dao.payments.PaymentEntryDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record PaymentEntryDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String namingSeries,
        String paymentType,
        String paymentOrderStatus,
        LocalDate postingDate,
        String company,
        String modeOfPayment,
        String partyType,
        String party,
        String partyName,
        Boolean bookAdvancePaymentsInSeparatePartyAccount,
        String bankAccount,
        String partyBankAccount,
        String contactPerson,
        String contactEmail,
        BigDecimal partyBalance,
        String paidFrom,
        String paidFromAccountType,
        String paidFromAccountCurrency,
        BigDecimal paidFromAccountBalance,
        String paidTo,
        String paidToAccountType,
        String paidToAccountCurrency,
        BigDecimal paidToAccountBalance,
        BigDecimal paidAmount,
        BigDecimal paidAmountAfterTax,
        BigDecimal sourceExchangeRate,
        BigDecimal basePaidAmount,
        BigDecimal basePaidAmountAfterTax,
        BigDecimal receivedAmount,
        BigDecimal receivedAmountAfterTax,
        BigDecimal targetExchangeRate,
        BigDecimal baseReceivedAmount,
        BigDecimal baseReceivedAmountAfterTax,
        BigDecimal totalAllocatedAmount,
        BigDecimal baseTotalAllocatedAmount,
        BigDecimal unallocatedAmount,
        BigDecimal differenceAmount,
        String purchaseTaxesAndChargesTemplate,
        String salesTaxesAndChargesTemplate,
        Boolean applyTaxWithholdingAmount,
        String taxWithholdingCategory,
        BigDecimal baseTotalTaxesAndCharges,
        BigDecimal totalTaxesAndCharges,
        String referenceNo,
        LocalDate referenceDate,
        LocalDate clearanceDate,
        String project,
        String costCenter,
        String status,
        Boolean customRemarks,
        String remarks,
        String baseInWords,
        String letterHead,
        String printHeading,
        String bank,
        String bankAccountNo,
        String paymentOrder,
        String inWords,
        String autoRepeat,
        String amendedFrom,
        String title,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static PaymentEntryDto fromEntity(PaymentEntryDao ePaymentEntryDao) {
        return new PaymentEntryDto(
                ePaymentEntryDao.getName(),
                ePaymentEntryDao.getCreation(),
                ePaymentEntryDao.getModified(),
                ePaymentEntryDao.getModifiedBy(),
                ePaymentEntryDao.getOwner(),
                ePaymentEntryDao.getIsDocStatus(),
                ePaymentEntryDao.getIdx(),
                ePaymentEntryDao.getNamingSeries(),
                ePaymentEntryDao.getPaymentType(),
                ePaymentEntryDao.getPaymentOrderStatus(),
                ePaymentEntryDao.getPostingDate(),
                ePaymentEntryDao.getCompany(),
                ePaymentEntryDao.getModeOfPayment(),
                ePaymentEntryDao.getPartyType(),
                ePaymentEntryDao.getParty(),
                ePaymentEntryDao.getPartyName(),
                ePaymentEntryDao.getBookAdvancePaymentsInSeparatePartyAccount(),
                ePaymentEntryDao.getBankAccount(),
                ePaymentEntryDao.getPartyBankAccount(),
                ePaymentEntryDao.getContactPerson(),
                ePaymentEntryDao.getContactEmail(),
                ePaymentEntryDao.getPartyBalance(),
                ePaymentEntryDao.getPaidFrom(),
                ePaymentEntryDao.getPaidFromAccountType(),
                ePaymentEntryDao.getPaidFromAccountCurrency(),
                ePaymentEntryDao.getPaidFromAccountBalance(),
                ePaymentEntryDao.getPaidTo(),
                ePaymentEntryDao.getPaidToAccountType(),
                ePaymentEntryDao.getPaidToAccountCurrency(),
                ePaymentEntryDao.getPaidToAccountBalance(),
                ePaymentEntryDao.getPaidAmount(),
                ePaymentEntryDao.getPaidAmountAfterTax(),
                ePaymentEntryDao.getSourceExchangeRate(),
                ePaymentEntryDao.getBasePaidAmount(),
                ePaymentEntryDao.getBasePaidAmountAfterTax(),
                ePaymentEntryDao.getReceivedAmount(),
                ePaymentEntryDao.getReceivedAmountAfterTax(),
                ePaymentEntryDao.getTargetExchangeRate(),
                ePaymentEntryDao.getBaseReceivedAmount(),
                ePaymentEntryDao.getBaseReceivedAmountAfterTax(),
                ePaymentEntryDao.getTotalAllocatedAmount(),
                ePaymentEntryDao.getBaseTotalAllocatedAmount(),
                ePaymentEntryDao.getUnallocatedAmount(),
                ePaymentEntryDao.getDifferenceAmount(),
                ePaymentEntryDao.getPurchaseTaxesAndChargesTemplate(),
                ePaymentEntryDao.getSalesTaxesAndChargesTemplate(),
                ePaymentEntryDao.getApplyTaxWithholdingAmount(),
                ePaymentEntryDao.getTaxWithholdingCategory(),
                ePaymentEntryDao.getBaseTotalTaxesAndCharges(),
                ePaymentEntryDao.getTotalTaxesAndCharges(),
                ePaymentEntryDao.getReferenceNo(),
                ePaymentEntryDao.getReferenceDate(),
                ePaymentEntryDao.getClearanceDate(),
                ePaymentEntryDao.getProject(),
                ePaymentEntryDao.getCostCenter(),
                ePaymentEntryDao.getStatus(),
                ePaymentEntryDao.getCustomRemarks(),
                ePaymentEntryDao.getRemarks(),
                ePaymentEntryDao.getBaseInWords(),
                ePaymentEntryDao.getLetterHead(),
                ePaymentEntryDao.getPrintHeading(),
                ePaymentEntryDao.getBank(),
                ePaymentEntryDao.getBankAccountNo(),
                ePaymentEntryDao.getPaymentOrder(),
                ePaymentEntryDao.getInWords(),
                ePaymentEntryDao.getAutoRepeat(),
                ePaymentEntryDao.getAmendedFrom(),
                ePaymentEntryDao.getTitle(),
                ePaymentEntryDao.getUserTags(),
                ePaymentEntryDao.getComments(),
                ePaymentEntryDao.getAssign(),
                ePaymentEntryDao.getLikedBy());
    }

    public static void fromDTO(PaymentEntryDto vPaymentEntryDto, PaymentEntryDao ePaymentEntryDao) {
        ePaymentEntryDao.setName(vPaymentEntryDto.name());
        ePaymentEntryDao.setCreation(vPaymentEntryDto.creation());
        ePaymentEntryDao.setModified(vPaymentEntryDto.modified());
        ePaymentEntryDao.setModifiedBy(vPaymentEntryDto.modifiedBy());
        ePaymentEntryDao.setOwner(vPaymentEntryDto.owner());
        ePaymentEntryDao.setIsDocStatus(vPaymentEntryDto.isDocStatus());
        ePaymentEntryDao.setIdx(vPaymentEntryDto.idx());
        ePaymentEntryDao.setNamingSeries(vPaymentEntryDto.namingSeries());
        ePaymentEntryDao.setPaymentType(vPaymentEntryDto.paymentType());
        ePaymentEntryDao.setPaymentOrderStatus(vPaymentEntryDto.paymentOrderStatus());
        ePaymentEntryDao.setPostingDate(vPaymentEntryDto.postingDate());
        ePaymentEntryDao.setCompany(vPaymentEntryDto.company());
        ePaymentEntryDao.setModeOfPayment(vPaymentEntryDto.modeOfPayment());
        ePaymentEntryDao.setPartyType(vPaymentEntryDto.partyType());
        ePaymentEntryDao.setParty(vPaymentEntryDto.party());
        ePaymentEntryDao.setPartyName(vPaymentEntryDto.partyName());
        ePaymentEntryDao.setBookAdvancePaymentsInSeparatePartyAccount(vPaymentEntryDto.bookAdvancePaymentsInSeparatePartyAccount());
        ePaymentEntryDao.setBankAccount(vPaymentEntryDto.bankAccount());
        ePaymentEntryDao.setPartyBankAccount(vPaymentEntryDto.partyBankAccount());
        ePaymentEntryDao.setContactPerson(vPaymentEntryDto.contactPerson());
        ePaymentEntryDao.setContactEmail(vPaymentEntryDto.contactEmail());
        ePaymentEntryDao.setPartyBalance(vPaymentEntryDto.partyBalance());
        ePaymentEntryDao.setPaidFrom(vPaymentEntryDto.paidFrom());
        ePaymentEntryDao.setPaidFromAccountType(vPaymentEntryDto.paidFromAccountType());
        ePaymentEntryDao.setPaidFromAccountCurrency(vPaymentEntryDto.paidFromAccountCurrency());
        ePaymentEntryDao.setPaidFromAccountBalance(vPaymentEntryDto.paidFromAccountBalance());
        ePaymentEntryDao.setPaidTo(vPaymentEntryDto.paidTo());
        ePaymentEntryDao.setPaidToAccountType(vPaymentEntryDto.paidToAccountType());
        ePaymentEntryDao.setPaidToAccountCurrency(vPaymentEntryDto.paidToAccountCurrency());
        ePaymentEntryDao.setPaidToAccountBalance(vPaymentEntryDto.paidToAccountBalance());
        ePaymentEntryDao.setPaidAmount(vPaymentEntryDto.paidAmount());
        ePaymentEntryDao.setPaidAmountAfterTax(vPaymentEntryDto.paidAmountAfterTax());
        ePaymentEntryDao.setSourceExchangeRate(vPaymentEntryDto.sourceExchangeRate());
        ePaymentEntryDao.setBasePaidAmount(vPaymentEntryDto.basePaidAmount());
        ePaymentEntryDao.setBasePaidAmountAfterTax(vPaymentEntryDto.basePaidAmountAfterTax());
        ePaymentEntryDao.setReceivedAmount(vPaymentEntryDto.receivedAmount());
        ePaymentEntryDao.setReceivedAmountAfterTax(vPaymentEntryDto.receivedAmountAfterTax());
        ePaymentEntryDao.setTargetExchangeRate(vPaymentEntryDto.targetExchangeRate());
        ePaymentEntryDao.setBaseReceivedAmount(vPaymentEntryDto.baseReceivedAmount());
        ePaymentEntryDao.setBaseReceivedAmountAfterTax(vPaymentEntryDto.baseReceivedAmountAfterTax());
        ePaymentEntryDao.setTotalAllocatedAmount(vPaymentEntryDto.totalAllocatedAmount());
        ePaymentEntryDao.setBaseTotalAllocatedAmount(vPaymentEntryDto.baseTotalAllocatedAmount());
        ePaymentEntryDao.setUnallocatedAmount(vPaymentEntryDto.unallocatedAmount());
        ePaymentEntryDao.setDifferenceAmount(vPaymentEntryDto.differenceAmount());
        ePaymentEntryDao.setPurchaseTaxesAndChargesTemplate(vPaymentEntryDto.purchaseTaxesAndChargesTemplate());
        ePaymentEntryDao.setSalesTaxesAndChargesTemplate(vPaymentEntryDto.salesTaxesAndChargesTemplate());
        ePaymentEntryDao.setApplyTaxWithholdingAmount(vPaymentEntryDto.applyTaxWithholdingAmount());
        ePaymentEntryDao.setTaxWithholdingCategory(vPaymentEntryDto.taxWithholdingCategory());
        ePaymentEntryDao.setBaseTotalTaxesAndCharges(vPaymentEntryDto.baseTotalTaxesAndCharges());
        ePaymentEntryDao.setTotalTaxesAndCharges(vPaymentEntryDto.totalTaxesAndCharges());
        ePaymentEntryDao.setReferenceNo(vPaymentEntryDto.referenceNo());
        ePaymentEntryDao.setReferenceDate(vPaymentEntryDto.referenceDate());
        ePaymentEntryDao.setClearanceDate(vPaymentEntryDto.clearanceDate());
        ePaymentEntryDao.setProject(vPaymentEntryDto.project());
        ePaymentEntryDao.setCostCenter(vPaymentEntryDto.costCenter());
        ePaymentEntryDao.setStatus(vPaymentEntryDto.status());
        ePaymentEntryDao.setCustomRemarks(vPaymentEntryDto.customRemarks());
        ePaymentEntryDao.setRemarks(vPaymentEntryDto.remarks());
        ePaymentEntryDao.setBaseInWords(vPaymentEntryDto.baseInWords());
        ePaymentEntryDao.setLetterHead(vPaymentEntryDto.letterHead());
        ePaymentEntryDao.setPrintHeading(vPaymentEntryDto.printHeading());
        ePaymentEntryDao.setBank(vPaymentEntryDto.bank());
        ePaymentEntryDao.setBankAccountNo(vPaymentEntryDto.bankAccountNo());
        ePaymentEntryDao.setPaymentOrder(vPaymentEntryDto.paymentOrder());
        ePaymentEntryDao.setInWords(vPaymentEntryDto.inWords());
        ePaymentEntryDao.setAutoRepeat(vPaymentEntryDto.autoRepeat());
        ePaymentEntryDao.setAmendedFrom(vPaymentEntryDto.amendedFrom());
        ePaymentEntryDao.setTitle(vPaymentEntryDto.title());
        ePaymentEntryDao.setUserTags(vPaymentEntryDto.userTags());
        ePaymentEntryDao.setComments(vPaymentEntryDto.comments());
        ePaymentEntryDao.setAssign(vPaymentEntryDto.assign());
        ePaymentEntryDao.setLikedBy(vPaymentEntryDto.likedBy());
    }
}