package com.itbd.application.db.dto.accounts.bank;

import com.itbd.application.db.dao.accounts.bank.BankAccountDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record BankAccountDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String accountName,
        String account,
        String bank,
        String accountType,
        String accountSubtype,
        Boolean disabled,
        Boolean isDefault,
        Boolean isCompanyAccount,
        String company,
        String partyType,
        String party,
        String iban,
        String branchCode,
        String bankAccountNo,
        String integrationId,
        LocalDate lastIntegrationDate,
        String mask,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static BankAccountDto fromEntity(BankAccountDao eBankAccountDao) {
        return new BankAccountDto(
                eBankAccountDao.getName(),
                eBankAccountDao.getCreation(),
                eBankAccountDao.getModified(),
                eBankAccountDao.getModifiedBy(),
                eBankAccountDao.getOwner(),
                eBankAccountDao.getIsDocStatus(),
                eBankAccountDao.getIdx(),
                eBankAccountDao.getAccountName(),
                eBankAccountDao.getAccount(),
                eBankAccountDao.getBank(),
                eBankAccountDao.getAccountType(),
                eBankAccountDao.getAccountSubtype(),
                eBankAccountDao.getDisabled(),
                eBankAccountDao.getIsDefault(),
                eBankAccountDao.getIsCompanyAccount(),
                eBankAccountDao.getCompany(),
                eBankAccountDao.getPartyType(),
                eBankAccountDao.getParty(),
                eBankAccountDao.getIban(),
                eBankAccountDao.getBranchCode(),
                eBankAccountDao.getBankAccountNo(),
                eBankAccountDao.getIntegrationId(),
                eBankAccountDao.getLastIntegrationDate(),
                eBankAccountDao.getMask(),
                eBankAccountDao.getUserTags(),
                eBankAccountDao.getComments(),
                eBankAccountDao.getAssign(),
                eBankAccountDao.getLikedBy());
    }

    public static void fromDTO(BankAccountDto vBankAccountDto, BankAccountDao eBankAccountDao) {
        eBankAccountDao.setName(vBankAccountDto.name());
        eBankAccountDao.setCreation(vBankAccountDto.creation());
        eBankAccountDao.setModified(vBankAccountDto.modified());
        eBankAccountDao.setModifiedBy(vBankAccountDto.modifiedBy());
        eBankAccountDao.setOwner(vBankAccountDto.owner());
        eBankAccountDao.setIsDocStatus(vBankAccountDto.isDocStatus());
        eBankAccountDao.setIdx(vBankAccountDto.idx());
        eBankAccountDao.setAccountName(vBankAccountDto.accountName());
        eBankAccountDao.setAccount(vBankAccountDto.account());
        eBankAccountDao.setBank(vBankAccountDto.bank());
        eBankAccountDao.setAccountType(vBankAccountDto.accountType());
        eBankAccountDao.setAccountSubtype(vBankAccountDto.accountSubtype());
        eBankAccountDao.setDisabled(vBankAccountDto.disabled());
        eBankAccountDao.setIsDefault(vBankAccountDto.isDefault());
        eBankAccountDao.setIsCompanyAccount(vBankAccountDto.isCompanyAccount());
        eBankAccountDao.setCompany(vBankAccountDto.company());
        eBankAccountDao.setPartyType(vBankAccountDto.partyType());
        eBankAccountDao.setParty(vBankAccountDto.party());
        eBankAccountDao.setIban(vBankAccountDto.iban());
        eBankAccountDao.setBranchCode(vBankAccountDto.branchCode());
        eBankAccountDao.setBankAccountNo(vBankAccountDto.bankAccountNo());
        eBankAccountDao.setIntegrationId(vBankAccountDto.integrationId());
        eBankAccountDao.setLastIntegrationDate(vBankAccountDto.lastIntegrationDate());
        eBankAccountDao.setMask(vBankAccountDto.mask());
        eBankAccountDao.setUserTags(vBankAccountDto.userTags());
        eBankAccountDao.setComments(vBankAccountDto.comments());
        eBankAccountDao.setAssign(vBankAccountDto.assign());
        eBankAccountDao.setLikedBy(vBankAccountDto.likedBy());
    }
}