package com.itbd.application.db.dto;

import com.itbd.application.db.dao.DataImportLogDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record DataImportLogDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String dataImport,
        String rowIndexes,
        Boolean success,
        String docName,
        String messages,
        String exception,
        Integer logIndex,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static DataImportLogDto fromEntity(DataImportLogDao eDataImportLogDao) {
        return new DataImportLogDto(
                eDataImportLogDao.getName(),
                eDataImportLogDao.getCreation(),
                eDataImportLogDao.getModified(),
                eDataImportLogDao.getModifiedBy(),
                eDataImportLogDao.getOwner(),
                eDataImportLogDao.getIsDocStatus(),
                eDataImportLogDao.getIdx(),
                eDataImportLogDao.getDataImport(),
                eDataImportLogDao.getRowIndexes(),
                eDataImportLogDao.getSuccess(),
                eDataImportLogDao.getDocName(),
                eDataImportLogDao.getMessages(),
                eDataImportLogDao.getException(),
                eDataImportLogDao.getLogIndex(),
                eDataImportLogDao.getUserTags(),
                eDataImportLogDao.getComments(),
                eDataImportLogDao.getAssign(),
                eDataImportLogDao.getLikedBy());
    }

    public static void fromDTO(DataImportLogDto vDataImportLogDto, DataImportLogDao eDataImportLogDao) {
        eDataImportLogDao.setName(vDataImportLogDto.name());
        eDataImportLogDao.setCreation(vDataImportLogDto.creation());
        eDataImportLogDao.setModified(vDataImportLogDto.modified());
        eDataImportLogDao.setModifiedBy(vDataImportLogDto.modifiedBy());
        eDataImportLogDao.setOwner(vDataImportLogDto.owner());
        eDataImportLogDao.setIsDocStatus(vDataImportLogDto.isDocStatus());
        eDataImportLogDao.setIdx(vDataImportLogDto.idx());
        eDataImportLogDao.setDataImport(vDataImportLogDto.dataImport());
        eDataImportLogDao.setRowIndexes(vDataImportLogDto.rowIndexes());
        eDataImportLogDao.setSuccess(vDataImportLogDto.success());
        eDataImportLogDao.setDocName(vDataImportLogDto.docName());
        eDataImportLogDao.setMessages(vDataImportLogDto.messages());
        eDataImportLogDao.setException(vDataImportLogDto.exception());
        eDataImportLogDao.setLogIndex(vDataImportLogDto.logIndex());
        eDataImportLogDao.setUserTags(vDataImportLogDto.userTags());
        eDataImportLogDao.setComments(vDataImportLogDto.comments());
        eDataImportLogDao.setAssign(vDataImportLogDto.assign());
        eDataImportLogDao.setLikedBy(vDataImportLogDto.likedBy());
    }
}