package com.itbd.application.db.dto.payments;

import com.itbd.application.db.dao.accounts.payment.PaymentRequestDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record PaymentRequestDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String paymentRequestType,
        LocalDate transactionDate,
        String namingSeries,
        String modeOfPayment,
        String partyType,
        String party,
        String referenceDocType,
        String referenceName,
        BigDecimal grandTotal,
        Boolean isASubscription,
        String currency,
        String bankAccount,
        String bank,
        String bankAccountNo,
        String account,
        String iban,
        String branchCode,
        String swiftNumber,
        String costCenter,
        String project,
        String printFormat,
        String emailTo,
        String subject,
        String paymentGatewayAccount,
        String status,
        Boolean makeSalesInvoice,
        String message,
        Boolean muteEmail,
        String paymentUrl,
        String paymentGateway,
        String paymentAccount,
        String paymentChannel,
        String paymentOrder,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static PaymentRequestDto fromEntity(PaymentRequestDao ePaymentRequestDao) {
        return new PaymentRequestDto(
                ePaymentRequestDao.getName(),
                ePaymentRequestDao.getCreation(),
                ePaymentRequestDao.getModified(),
                ePaymentRequestDao.getModifiedBy(),
                ePaymentRequestDao.getOwner(),
                ePaymentRequestDao.getIsDocStatus(),
                ePaymentRequestDao.getIdx(),
                ePaymentRequestDao.getPaymentRequestType(),
                ePaymentRequestDao.getTransactionDate(),
                ePaymentRequestDao.getNamingSeries(),
                ePaymentRequestDao.getModeOfPayment(),
                ePaymentRequestDao.getPartyType(),
                ePaymentRequestDao.getParty(),
                ePaymentRequestDao.getReferenceDocType(),
                ePaymentRequestDao.getReferenceName(),
                ePaymentRequestDao.getGrandTotal(),
                ePaymentRequestDao.getIsASubscription(),
                ePaymentRequestDao.getCurrency(),
                ePaymentRequestDao.getBankAccount(),
                ePaymentRequestDao.getBank(),
                ePaymentRequestDao.getBankAccountNo(),
                ePaymentRequestDao.getAccount(),
                ePaymentRequestDao.getIban(),
                ePaymentRequestDao.getBranchCode(),
                ePaymentRequestDao.getSwiftNumber(),
                ePaymentRequestDao.getCostCenter(),
                ePaymentRequestDao.getProject(),
                ePaymentRequestDao.getPrintFormat(),
                ePaymentRequestDao.getEmailTo(),
                ePaymentRequestDao.getSubject(),
                ePaymentRequestDao.getPaymentGatewayAccount(),
                ePaymentRequestDao.getStatus(),
                ePaymentRequestDao.getMakeSalesInvoice(),
                ePaymentRequestDao.getMessage(),
                ePaymentRequestDao.getMuteEmail(),
                ePaymentRequestDao.getPaymentUrl(),
                ePaymentRequestDao.getPaymentGateway(),
                ePaymentRequestDao.getPaymentAccount(),
                ePaymentRequestDao.getPaymentChannel(),
                ePaymentRequestDao.getPaymentOrder(),
                ePaymentRequestDao.getAmendedFrom(),
                ePaymentRequestDao.getUserTags(),
                ePaymentRequestDao.getComments(),
                ePaymentRequestDao.getAssign(),
                ePaymentRequestDao.getLikedBy());
    }

    public static void fromDTO(PaymentRequestDto vPaymentRequestDto, PaymentRequestDao ePaymentRequestDao) {
        ePaymentRequestDao.setName(vPaymentRequestDto.name());
        ePaymentRequestDao.setCreation(vPaymentRequestDto.creation());
        ePaymentRequestDao.setModified(vPaymentRequestDto.modified());
        ePaymentRequestDao.setModifiedBy(vPaymentRequestDto.modifiedBy());
        ePaymentRequestDao.setOwner(vPaymentRequestDto.owner());
        ePaymentRequestDao.setIsDocStatus(vPaymentRequestDto.isDocStatus());
        ePaymentRequestDao.setIdx(vPaymentRequestDto.idx());
        ePaymentRequestDao.setPaymentRequestType(vPaymentRequestDto.paymentRequestType());
        ePaymentRequestDao.setTransactionDate(vPaymentRequestDto.transactionDate());
        ePaymentRequestDao.setNamingSeries(vPaymentRequestDto.namingSeries());
        ePaymentRequestDao.setModeOfPayment(vPaymentRequestDto.modeOfPayment());
        ePaymentRequestDao.setPartyType(vPaymentRequestDto.partyType());
        ePaymentRequestDao.setParty(vPaymentRequestDto.party());
        ePaymentRequestDao.setReferenceDocType(vPaymentRequestDto.referenceDocType());
        ePaymentRequestDao.setReferenceName(vPaymentRequestDto.referenceName());
        ePaymentRequestDao.setGrandTotal(vPaymentRequestDto.grandTotal());
        ePaymentRequestDao.setIsASubscription(vPaymentRequestDto.isASubscription());
        ePaymentRequestDao.setCurrency(vPaymentRequestDto.currency());
        ePaymentRequestDao.setBankAccount(vPaymentRequestDto.bankAccount());
        ePaymentRequestDao.setBank(vPaymentRequestDto.bank());
        ePaymentRequestDao.setBankAccountNo(vPaymentRequestDto.bankAccountNo());
        ePaymentRequestDao.setAccount(vPaymentRequestDto.account());
        ePaymentRequestDao.setIban(vPaymentRequestDto.iban());
        ePaymentRequestDao.setBranchCode(vPaymentRequestDto.branchCode());
        ePaymentRequestDao.setSwiftNumber(vPaymentRequestDto.swiftNumber());
        ePaymentRequestDao.setCostCenter(vPaymentRequestDto.costCenter());
        ePaymentRequestDao.setProject(vPaymentRequestDto.project());
        ePaymentRequestDao.setPrintFormat(vPaymentRequestDto.printFormat());
        ePaymentRequestDao.setEmailTo(vPaymentRequestDto.emailTo());
        ePaymentRequestDao.setSubject(vPaymentRequestDto.subject());
        ePaymentRequestDao.setPaymentGatewayAccount(vPaymentRequestDto.paymentGatewayAccount());
        ePaymentRequestDao.setStatus(vPaymentRequestDto.status());
        ePaymentRequestDao.setMakeSalesInvoice(vPaymentRequestDto.makeSalesInvoice());
        ePaymentRequestDao.setMessage(vPaymentRequestDto.message());
        ePaymentRequestDao.setMuteEmail(vPaymentRequestDto.muteEmail());
        ePaymentRequestDao.setPaymentUrl(vPaymentRequestDto.paymentUrl());
        ePaymentRequestDao.setPaymentGateway(vPaymentRequestDto.paymentGateway());
        ePaymentRequestDao.setPaymentAccount(vPaymentRequestDto.paymentAccount());
        ePaymentRequestDao.setPaymentChannel(vPaymentRequestDto.paymentChannel());
        ePaymentRequestDao.setPaymentOrder(vPaymentRequestDto.paymentOrder());
        ePaymentRequestDao.setAmendedFrom(vPaymentRequestDto.amendedFrom());
        ePaymentRequestDao.setUserTags(vPaymentRequestDto.userTags());
        ePaymentRequestDao.setComments(vPaymentRequestDto.comments());
        ePaymentRequestDao.setAssign(vPaymentRequestDto.assign());
        ePaymentRequestDao.setLikedBy(vPaymentRequestDto.likedBy());
    }
}