package com.itbd.application.db.dto.accounts.bank;

import com.itbd.application.db.dao.accounts.bank.BankStatementImportDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record BankStatementImportDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String company,
        String bankAccount,
        String bank,
        String googleSheetsUrl,
        String importFile,
        String status,
        String templateOptions,
        String templateWarnings,
        String statementImportLog,
        Boolean showFailedLogs,
        String referenceDocType,
        String importType,
        Boolean submitAfterImport,
        Boolean muteEmails,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static BankStatementImportDto fromEntity(BankStatementImportDao eBankStatementImportDao) {
        return new BankStatementImportDto(
                eBankStatementImportDao.getName(),
                eBankStatementImportDao.getCreation(),
                eBankStatementImportDao.getModified(),
                eBankStatementImportDao.getModifiedBy(),
                eBankStatementImportDao.getOwner(),
                eBankStatementImportDao.getIsDocStatus(),
                eBankStatementImportDao.getIdx(),
                eBankStatementImportDao.getCompany(),
                eBankStatementImportDao.getBankAccount(),
                eBankStatementImportDao.getBank(),
                eBankStatementImportDao.getGoogleSheetsUrl(),
                eBankStatementImportDao.getImportFile(),
                eBankStatementImportDao.getStatus(),
                eBankStatementImportDao.getTemplateOptions(),
                eBankStatementImportDao.getTemplateWarnings(),
                eBankStatementImportDao.getStatementImportLog(),
                eBankStatementImportDao.getShowFailedLogs(),
                eBankStatementImportDao.getReferenceDocType(),
                eBankStatementImportDao.getImportType(),
                eBankStatementImportDao.getSubmitAfterImport(),
                eBankStatementImportDao.getMuteEmails(),
                eBankStatementImportDao.getUserTags(),
                eBankStatementImportDao.getComments(),
                eBankStatementImportDao.getAssign(),
                eBankStatementImportDao.getLikedBy());
    }

    public static void fromDTO(BankStatementImportDto vBankStatementImportDto, BankStatementImportDao eBankStatementImportDao) {
        eBankStatementImportDao.setName(vBankStatementImportDto.name());
        eBankStatementImportDao.setCreation(vBankStatementImportDto.creation());
        eBankStatementImportDao.setModified(vBankStatementImportDto.modified());
        eBankStatementImportDao.setModifiedBy(vBankStatementImportDto.modifiedBy());
        eBankStatementImportDao.setOwner(vBankStatementImportDto.owner());
        eBankStatementImportDao.setIsDocStatus(vBankStatementImportDto.isDocStatus());
        eBankStatementImportDao.setIdx(vBankStatementImportDto.idx());
        eBankStatementImportDao.setCompany(vBankStatementImportDto.company());
        eBankStatementImportDao.setBankAccount(vBankStatementImportDto.bankAccount());
        eBankStatementImportDao.setBank(vBankStatementImportDto.bank());
        eBankStatementImportDao.setGoogleSheetsUrl(vBankStatementImportDto.googleSheetsUrl());
        eBankStatementImportDao.setImportFile(vBankStatementImportDto.importFile());
        eBankStatementImportDao.setStatus(vBankStatementImportDto.status());
        eBankStatementImportDao.setTemplateOptions(vBankStatementImportDto.templateOptions());
        eBankStatementImportDao.setTemplateWarnings(vBankStatementImportDto.templateWarnings());
        eBankStatementImportDao.setStatementImportLog(vBankStatementImportDto.statementImportLog());
        eBankStatementImportDao.setShowFailedLogs(vBankStatementImportDto.showFailedLogs());
        eBankStatementImportDao.setReferenceDocType(vBankStatementImportDto.referenceDocType());
        eBankStatementImportDao.setImportType(vBankStatementImportDto.importType());
        eBankStatementImportDao.setSubmitAfterImport(vBankStatementImportDto.submitAfterImport());
        eBankStatementImportDao.setMuteEmails(vBankStatementImportDto.muteEmails());
        eBankStatementImportDao.setUserTags(vBankStatementImportDto.userTags());
        eBankStatementImportDao.setComments(vBankStatementImportDto.comments());
        eBankStatementImportDao.setAssign(vBankStatementImportDto.assign());
        eBankStatementImportDao.setLikedBy(vBankStatementImportDto.likedBy());
    }
}