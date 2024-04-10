package com.itbd.application.db.dto.accounts.bank;

import com.itbd.application.db.dao.accounts.bank.BankTransactionMappingDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record BankTransactionMappingDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String bankTransactionField,
        String fileField,
        String parent,
        String parentField,
        String parentType
) {
    public static BankTransactionMappingDto fromEntity(BankTransactionMappingDao eBankTransactionMappingDao) {
        return new BankTransactionMappingDto(
                eBankTransactionMappingDao.getName(),
                eBankTransactionMappingDao.getCreation(),
                eBankTransactionMappingDao.getModified(),
                eBankTransactionMappingDao.getModifiedBy(),
                eBankTransactionMappingDao.getOwner(),
                eBankTransactionMappingDao.getIsDocStatus(),
                eBankTransactionMappingDao.getIdx(),
                eBankTransactionMappingDao.getBankTransactionField(),
                eBankTransactionMappingDao.getFileField(),
                eBankTransactionMappingDao.getParent(),
                eBankTransactionMappingDao.getParentField(),
                eBankTransactionMappingDao.getParentType());
    }

    public static void fromDTO(BankTransactionMappingDto vBankTransactionMappingDto, BankTransactionMappingDao eBankTransactionMappingDao) {
        eBankTransactionMappingDao.setName(vBankTransactionMappingDto.name());
        eBankTransactionMappingDao.setCreation(vBankTransactionMappingDto.creation());
        eBankTransactionMappingDao.setModified(vBankTransactionMappingDto.modified());
        eBankTransactionMappingDao.setModifiedBy(vBankTransactionMappingDto.modifiedBy());
        eBankTransactionMappingDao.setOwner(vBankTransactionMappingDto.owner());
        eBankTransactionMappingDao.setIsDocStatus(vBankTransactionMappingDto.isDocStatus());
        eBankTransactionMappingDao.setIdx(vBankTransactionMappingDto.idx());
        eBankTransactionMappingDao.setBankTransactionField(vBankTransactionMappingDto.bankTransactionField());
        eBankTransactionMappingDao.setFileField(vBankTransactionMappingDto.fileField());
        eBankTransactionMappingDao.setParent(vBankTransactionMappingDto.parent());
        eBankTransactionMappingDao.setParentField(vBankTransactionMappingDto.parentField());
        eBankTransactionMappingDao.setParentType(vBankTransactionMappingDto.parentType());
    }
}