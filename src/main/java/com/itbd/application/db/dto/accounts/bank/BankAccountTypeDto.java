package com.itbd.application.db.dto.accounts.bank;

import com.itbd.application.db.dao.accounts.bank.BankAccountTypeDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record BankAccountTypeDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String accountType,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static BankAccountTypeDto fromEntity(BankAccountTypeDao eBankAccountTypeDao) {
        return new BankAccountTypeDto(
                eBankAccountTypeDao.getName(),
                eBankAccountTypeDao.getCreation(),
                eBankAccountTypeDao.getModified(),
                eBankAccountTypeDao.getModifiedBy(),
                eBankAccountTypeDao.getOwner(),
                eBankAccountTypeDao.getIsDocStatus(),
                eBankAccountTypeDao.getIdx(),
                eBankAccountTypeDao.getAccountType(),
                eBankAccountTypeDao.getUserTags(),
                eBankAccountTypeDao.getComments(),
                eBankAccountTypeDao.getAssign(),
                eBankAccountTypeDao.getLikedBy());
    }

    public static void fromDTO(BankAccountTypeDto vBankAccountTypeDto, BankAccountTypeDao eBankAccountTypeDao) {
        eBankAccountTypeDao.setName(vBankAccountTypeDto.name());
        eBankAccountTypeDao.setCreation(vBankAccountTypeDto.creation());
        eBankAccountTypeDao.setModified(vBankAccountTypeDto.modified());
        eBankAccountTypeDao.setModifiedBy(vBankAccountTypeDto.modifiedBy());
        eBankAccountTypeDao.setOwner(vBankAccountTypeDto.owner());
        eBankAccountTypeDao.setIsDocStatus(vBankAccountTypeDto.isDocStatus());
        eBankAccountTypeDao.setIdx(vBankAccountTypeDto.idx());
        eBankAccountTypeDao.setAccountType(vBankAccountTypeDto.accountType());
        eBankAccountTypeDao.setUserTags(vBankAccountTypeDto.userTags());
        eBankAccountTypeDao.setComments(vBankAccountTypeDto.comments());
        eBankAccountTypeDao.setAssign(vBankAccountTypeDto.assign());
        eBankAccountTypeDao.setLikedBy(vBankAccountTypeDto.likedBy());
    }
}