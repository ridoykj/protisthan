package com.itbd.application.db.dto;

import com.itbd.application.db.dao.core.DataImportDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record DataImportDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String referenceDocType,
        String importType,
        String importFile,
        Integer payloadCount,
        String googleSheetsUrl,
        String status,
        Boolean submitAfterImport,
        Boolean muteEmails,
        String templateOptions,
        String templateWarnings,
        Boolean showFailedLogs,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static DataImportDto fromEntity(DataImportDao eDataImportDao) {
        return new DataImportDto(
                eDataImportDao.getName(),
                eDataImportDao.getCreation(),
                eDataImportDao.getModified(),
                eDataImportDao.getModifiedBy(),
                eDataImportDao.getOwner(),
                eDataImportDao.getIsDocStatus(),
                eDataImportDao.getIdx(),
                eDataImportDao.getReferenceDocType(),
                eDataImportDao.getImportType(),
                eDataImportDao.getImportFile(),
                eDataImportDao.getPayloadCount(),
                eDataImportDao.getGoogleSheetsUrl(),
                eDataImportDao.getStatus(),
                eDataImportDao.getSubmitAfterImport(),
                eDataImportDao.getMuteEmails(),
                eDataImportDao.getTemplateOptions(),
                eDataImportDao.getTemplateWarnings(),
                eDataImportDao.getShowFailedLogs(),
                eDataImportDao.getUserTags(),
                eDataImportDao.getComments(),
                eDataImportDao.getAssign(),
                eDataImportDao.getLikedBy());
    }

    public static void fromDTO(DataImportDto vDataImportDto, DataImportDao eDataImportDao) {
        eDataImportDao.setName(vDataImportDto.name());
        eDataImportDao.setCreation(vDataImportDto.creation());
        eDataImportDao.setModified(vDataImportDto.modified());
        eDataImportDao.setModifiedBy(vDataImportDto.modifiedBy());
        eDataImportDao.setOwner(vDataImportDto.owner());
        eDataImportDao.setIsDocStatus(vDataImportDto.isDocStatus());
        eDataImportDao.setIdx(vDataImportDto.idx());
        eDataImportDao.setReferenceDocType(vDataImportDto.referenceDocType());
        eDataImportDao.setImportType(vDataImportDto.importType());
        eDataImportDao.setImportFile(vDataImportDto.importFile());
        eDataImportDao.setPayloadCount(vDataImportDto.payloadCount());
        eDataImportDao.setGoogleSheetsUrl(vDataImportDto.googleSheetsUrl());
        eDataImportDao.setStatus(vDataImportDto.status());
        eDataImportDao.setSubmitAfterImport(vDataImportDto.submitAfterImport());
        eDataImportDao.setMuteEmails(vDataImportDto.muteEmails());
        eDataImportDao.setTemplateOptions(vDataImportDto.templateOptions());
        eDataImportDao.setTemplateWarnings(vDataImportDto.templateWarnings());
        eDataImportDao.setShowFailedLogs(vDataImportDto.showFailedLogs());
        eDataImportDao.setUserTags(vDataImportDto.userTags());
        eDataImportDao.setComments(vDataImportDto.comments());
        eDataImportDao.setAssign(vDataImportDto.assign());
        eDataImportDao.setLikedBy(vDataImportDto.likedBy());
    }
}