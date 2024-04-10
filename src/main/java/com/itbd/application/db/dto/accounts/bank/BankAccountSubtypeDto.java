package com.itbd.application.db.dto.accounts.bank;

import com.itbd.application.db.dao.accounts.bank.BankAccountSubtypeDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record BankAccountSubtypeDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String accountSubtype,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static BankAccountSubtypeDto fromEntity(BankAccountSubtypeDao eBankAccountSubtypeDao) {
        return new BankAccountSubtypeDto(
                eBankAccountSubtypeDao.getName(),
                eBankAccountSubtypeDao.getCreation(),
                eBankAccountSubtypeDao.getModified(),
                eBankAccountSubtypeDao.getModifiedBy(),
                eBankAccountSubtypeDao.getOwner(),
                eBankAccountSubtypeDao.getIsDocStatus(),
                eBankAccountSubtypeDao.getIdx(),
                eBankAccountSubtypeDao.getAccountSubtype(),
                eBankAccountSubtypeDao.getUserTags(),
                eBankAccountSubtypeDao.getComments(),
                eBankAccountSubtypeDao.getAssign(),
                eBankAccountSubtypeDao.getLikedBy());
    }

    public static void fromDTO(BankAccountSubtypeDto vBankAccountSubtypeDto, BankAccountSubtypeDao eBankAccountSubtypeDao) {
        eBankAccountSubtypeDao.setName(vBankAccountSubtypeDto.name());
        eBankAccountSubtypeDao.setCreation(vBankAccountSubtypeDto.creation());
        eBankAccountSubtypeDao.setModified(vBankAccountSubtypeDto.modified());
        eBankAccountSubtypeDao.setModifiedBy(vBankAccountSubtypeDto.modifiedBy());
        eBankAccountSubtypeDao.setOwner(vBankAccountSubtypeDto.owner());
        eBankAccountSubtypeDao.setIsDocStatus(vBankAccountSubtypeDto.isDocStatus());
        eBankAccountSubtypeDao.setIdx(vBankAccountSubtypeDto.idx());
        eBankAccountSubtypeDao.setAccountSubtype(vBankAccountSubtypeDto.accountSubtype());
        eBankAccountSubtypeDao.setUserTags(vBankAccountSubtypeDto.userTags());
        eBankAccountSubtypeDao.setComments(vBankAccountSubtypeDto.comments());
        eBankAccountSubtypeDao.setAssign(vBankAccountSubtypeDto.assign());
        eBankAccountSubtypeDao.setLikedBy(vBankAccountSubtypeDto.likedBy());
    }
}