package com.itbd.application.db.dto.accounts.bank;

import com.itbd.application.db.dao.accounts.bank.BankGuaranteeDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record BankGuaranteeDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String bgType,
        String referenceDocType,
        String referenceDocName,
        String customer,
        String supplier,
        String project,
        BigDecimal amount,
        LocalDate startDate,
        Integer validity,
        LocalDate endDate,
        String bank,
        String bankAccount,
        String account,
        String bankAccountNo,
        String iban,
        String branchCode,
        String swiftNumber,
        String moreInformation,
        String bankGuaranteeNumber,
        String nameOfBeneficiary,
        BigDecimal marginMoney,
        BigDecimal charges,
        String fixedDepositNumber,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static BankGuaranteeDto fromEntity(BankGuaranteeDao eBankGuaranteeDao) {
        return new BankGuaranteeDto(
                eBankGuaranteeDao.getName(),
                eBankGuaranteeDao.getCreation(),
                eBankGuaranteeDao.getModified(),
                eBankGuaranteeDao.getModifiedBy(),
                eBankGuaranteeDao.getOwner(),
                eBankGuaranteeDao.getIsDocStatus(),
                eBankGuaranteeDao.getIdx(),
                eBankGuaranteeDao.getBgType(),
                eBankGuaranteeDao.getReferenceDocType(),
                eBankGuaranteeDao.getReferenceDocName(),
                eBankGuaranteeDao.getCustomer(),
                eBankGuaranteeDao.getSupplier(),
                eBankGuaranteeDao.getProject(),
                eBankGuaranteeDao.getAmount(),
                eBankGuaranteeDao.getStartDate(),
                eBankGuaranteeDao.getValidity(),
                eBankGuaranteeDao.getEndDate(),
                eBankGuaranteeDao.getBank(),
                eBankGuaranteeDao.getBankAccount(),
                eBankGuaranteeDao.getAccount(),
                eBankGuaranteeDao.getBankAccountNo(),
                eBankGuaranteeDao.getIban(),
                eBankGuaranteeDao.getBranchCode(),
                eBankGuaranteeDao.getSwiftNumber(),
                eBankGuaranteeDao.getMoreInformation(),
                eBankGuaranteeDao.getBankGuaranteeNumber(),
                eBankGuaranteeDao.getNameOfBeneficiary(),
                eBankGuaranteeDao.getMarginMoney(),
                eBankGuaranteeDao.getCharges(),
                eBankGuaranteeDao.getFixedDepositNumber(),
                eBankGuaranteeDao.getAmendedFrom(),
                eBankGuaranteeDao.getUserTags(),
                eBankGuaranteeDao.getComments(),
                eBankGuaranteeDao.getAssign(),
                eBankGuaranteeDao.getLikedBy());
    }

    public static void fromDTO(BankGuaranteeDto vBankGuaranteeDto, BankGuaranteeDao eBankGuaranteeDao) {
        eBankGuaranteeDao.setName(vBankGuaranteeDto.name());
        eBankGuaranteeDao.setCreation(vBankGuaranteeDto.creation());
        eBankGuaranteeDao.setModified(vBankGuaranteeDto.modified());
        eBankGuaranteeDao.setModifiedBy(vBankGuaranteeDto.modifiedBy());
        eBankGuaranteeDao.setOwner(vBankGuaranteeDto.owner());
        eBankGuaranteeDao.setIsDocStatus(vBankGuaranteeDto.isDocStatus());
        eBankGuaranteeDao.setIdx(vBankGuaranteeDto.idx());
        eBankGuaranteeDao.setBgType(vBankGuaranteeDto.bgType());
        eBankGuaranteeDao.setReferenceDocType(vBankGuaranteeDto.referenceDocType());
        eBankGuaranteeDao.setReferenceDocName(vBankGuaranteeDto.referenceDocName());
        eBankGuaranteeDao.setCustomer(vBankGuaranteeDto.customer());
        eBankGuaranteeDao.setSupplier(vBankGuaranteeDto.supplier());
        eBankGuaranteeDao.setProject(vBankGuaranteeDto.project());
        eBankGuaranteeDao.setAmount(vBankGuaranteeDto.amount());
        eBankGuaranteeDao.setStartDate(vBankGuaranteeDto.startDate());
        eBankGuaranteeDao.setValidity(vBankGuaranteeDto.validity());
        eBankGuaranteeDao.setEndDate(vBankGuaranteeDto.endDate());
        eBankGuaranteeDao.setBank(vBankGuaranteeDto.bank());
        eBankGuaranteeDao.setBankAccount(vBankGuaranteeDto.bankAccount());
        eBankGuaranteeDao.setAccount(vBankGuaranteeDto.account());
        eBankGuaranteeDao.setBankAccountNo(vBankGuaranteeDto.bankAccountNo());
        eBankGuaranteeDao.setIban(vBankGuaranteeDto.iban());
        eBankGuaranteeDao.setBranchCode(vBankGuaranteeDto.branchCode());
        eBankGuaranteeDao.setSwiftNumber(vBankGuaranteeDto.swiftNumber());
        eBankGuaranteeDao.setMoreInformation(vBankGuaranteeDto.moreInformation());
        eBankGuaranteeDao.setBankGuaranteeNumber(vBankGuaranteeDto.bankGuaranteeNumber());
        eBankGuaranteeDao.setNameOfBeneficiary(vBankGuaranteeDto.nameOfBeneficiary());
        eBankGuaranteeDao.setMarginMoney(vBankGuaranteeDto.marginMoney());
        eBankGuaranteeDao.setCharges(vBankGuaranteeDto.charges());
        eBankGuaranteeDao.setFixedDepositNumber(vBankGuaranteeDto.fixedDepositNumber());
        eBankGuaranteeDao.setAmendedFrom(vBankGuaranteeDto.amendedFrom());
        eBankGuaranteeDao.setUserTags(vBankGuaranteeDto.userTags());
        eBankGuaranteeDao.setComments(vBankGuaranteeDto.comments());
        eBankGuaranteeDao.setAssign(vBankGuaranteeDto.assign());
        eBankGuaranteeDao.setLikedBy(vBankGuaranteeDto.likedBy());
    }
}