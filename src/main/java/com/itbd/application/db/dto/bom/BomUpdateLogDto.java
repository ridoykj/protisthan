package com.itbd.application.db.dto.bom;

import com.itbd.application.db.dao.bom.BomUpdateLogDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record BomUpdateLogDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String updateType,
        String status,
        String currentBom,
        String newBom,
        String errorLog,
        Integer currentLevel,
        String processedBoms,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static BomUpdateLogDto fromEntity(BomUpdateLogDao eBomUpdateLogDao) {
        return new BomUpdateLogDto(
                eBomUpdateLogDao.getName(),
                eBomUpdateLogDao.getCreation(),
                eBomUpdateLogDao.getModified(),
                eBomUpdateLogDao.getModifiedBy(),
                eBomUpdateLogDao.getOwner(),
                eBomUpdateLogDao.getIsDocStatus(),
                eBomUpdateLogDao.getIdx(),
                eBomUpdateLogDao.getUpdateType(),
                eBomUpdateLogDao.getStatus(),
                eBomUpdateLogDao.getCurrentBom(),
                eBomUpdateLogDao.getNewBom(),
                eBomUpdateLogDao.getErrorLog(),
                eBomUpdateLogDao.getCurrentLevel(),
                eBomUpdateLogDao.getProcessedBoms(),
                eBomUpdateLogDao.getAmendedFrom(),
                eBomUpdateLogDao.getUserTags(),
                eBomUpdateLogDao.getComments(),
                eBomUpdateLogDao.getAssign(),
                eBomUpdateLogDao.getLikedBy());
    }

    public static void fromDTO(BomUpdateLogDto vBomUpdateLogDto, BomUpdateLogDao eBomUpdateLogDao) {
        eBomUpdateLogDao.setName(vBomUpdateLogDto.name());
        eBomUpdateLogDao.setCreation(vBomUpdateLogDto.creation());
        eBomUpdateLogDao.setModified(vBomUpdateLogDto.modified());
        eBomUpdateLogDao.setModifiedBy(vBomUpdateLogDto.modifiedBy());
        eBomUpdateLogDao.setOwner(vBomUpdateLogDto.owner());
        eBomUpdateLogDao.setIsDocStatus(vBomUpdateLogDto.isDocStatus());
        eBomUpdateLogDao.setIdx(vBomUpdateLogDto.idx());
        eBomUpdateLogDao.setUpdateType(vBomUpdateLogDto.updateType());
        eBomUpdateLogDao.setStatus(vBomUpdateLogDto.status());
        eBomUpdateLogDao.setCurrentBom(vBomUpdateLogDto.currentBom());
        eBomUpdateLogDao.setNewBom(vBomUpdateLogDto.newBom());
        eBomUpdateLogDao.setErrorLog(vBomUpdateLogDto.errorLog());
        eBomUpdateLogDao.setCurrentLevel(vBomUpdateLogDto.currentLevel());
        eBomUpdateLogDao.setProcessedBoms(vBomUpdateLogDto.processedBoms());
        eBomUpdateLogDao.setAmendedFrom(vBomUpdateLogDto.amendedFrom());
        eBomUpdateLogDao.setUserTags(vBomUpdateLogDto.userTags());
        eBomUpdateLogDao.setComments(vBomUpdateLogDto.comments());
        eBomUpdateLogDao.setAssign(vBomUpdateLogDto.assign());
        eBomUpdateLogDao.setLikedBy(vBomUpdateLogDto.likedBy());
    }
}