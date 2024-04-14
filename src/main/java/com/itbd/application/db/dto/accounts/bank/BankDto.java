package com.itbd.application.db.dto.accounts.bank;

import com.itbd.application.db.dao.accounts.bank.BankDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record BankDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String bankName,
        String swiftNumber,
        String website,
        String plaidAccessToken,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static BankDto fromEntity(BankDao eBankDao) {
        return new BankDto(
                eBankDao.getName(),
                eBankDao.getCreation(),
                eBankDao.getModified(),
                eBankDao.getModifiedBy(),
                eBankDao.getOwner(),
                eBankDao.getIsDocStatus(),
                eBankDao.getIdx(),
                eBankDao.getBankName(),
                eBankDao.getSwiftNumber(),
                eBankDao.getWebsite(),
                eBankDao.getPlaidAccessToken(),
                eBankDao.getUserTags(),
                eBankDao.getComments(),
                eBankDao.getAssign(),
                eBankDao.getLikedBy());
    }

    public static void fromDTO(BankDto vBankDto, BankDao eBankDao) {
        eBankDao.setName(vBankDto.name());
        eBankDao.setCreation(vBankDto.creation());
        eBankDao.setModified(vBankDto.modified());
        eBankDao.setModifiedBy(vBankDto.modifiedBy());
        eBankDao.setOwner(vBankDto.owner());
        eBankDao.setIsDocStatus(vBankDto.isDocStatus());
        eBankDao.setIdx(vBankDto.idx());
        eBankDao.setBankName(vBankDto.bankName());
        eBankDao.setSwiftNumber(vBankDto.swiftNumber());
        eBankDao.setWebsite(vBankDto.website());
        eBankDao.setPlaidAccessToken(vBankDto.plaidAccessToken());
        eBankDao.setUserTags(vBankDto.userTags());
        eBankDao.setComments(vBankDto.comments());
        eBankDao.setAssign(vBankDto.assign());
        eBankDao.setLikedBy(vBankDto.likedBy());
    }
}