package com.itbd.application.db.dto;

import com.itbd.application.db.dao.social.EnergyPointLogDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record EnergyPointLogDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String user,
        String type,
        Integer points,
        String rule,
        String referenceDocType,
        String referenceName,
        Boolean reverted,
        String revertOf,
        String reason,
        Boolean seen,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static EnergyPointLogDto fromEntity(EnergyPointLogDao eEnergyPointLogDao) {
        return new EnergyPointLogDto(
                eEnergyPointLogDao.getName(),
                eEnergyPointLogDao.getCreation(),
                eEnergyPointLogDao.getModified(),
                eEnergyPointLogDao.getModifiedBy(),
                eEnergyPointLogDao.getOwner(),
                eEnergyPointLogDao.getIsDocStatus(),
                eEnergyPointLogDao.getIdx(),
                eEnergyPointLogDao.getUser(),
                eEnergyPointLogDao.getType(),
                eEnergyPointLogDao.getPoints(),
                eEnergyPointLogDao.getRule(),
                eEnergyPointLogDao.getReferenceDocType(),
                eEnergyPointLogDao.getReferenceName(),
                eEnergyPointLogDao.getReverted(),
                eEnergyPointLogDao.getRevertOf(),
                eEnergyPointLogDao.getReason(),
                eEnergyPointLogDao.getSeen(),
                eEnergyPointLogDao.getUserTags(),
                eEnergyPointLogDao.getComments(),
                eEnergyPointLogDao.getAssign(),
                eEnergyPointLogDao.getLikedBy());
    }

    public static void fromDTO(EnergyPointLogDto vEnergyPointLogDto, EnergyPointLogDao eEnergyPointLogDao) {
        eEnergyPointLogDao.setName(vEnergyPointLogDto.name());
        eEnergyPointLogDao.setCreation(vEnergyPointLogDto.creation());
        eEnergyPointLogDao.setModified(vEnergyPointLogDto.modified());
        eEnergyPointLogDao.setModifiedBy(vEnergyPointLogDto.modifiedBy());
        eEnergyPointLogDao.setOwner(vEnergyPointLogDto.owner());
        eEnergyPointLogDao.setIsDocStatus(vEnergyPointLogDto.isDocStatus());
        eEnergyPointLogDao.setIdx(vEnergyPointLogDto.idx());
        eEnergyPointLogDao.setUser(vEnergyPointLogDto.user());
        eEnergyPointLogDao.setType(vEnergyPointLogDto.type());
        eEnergyPointLogDao.setPoints(vEnergyPointLogDto.points());
        eEnergyPointLogDao.setRule(vEnergyPointLogDto.rule());
        eEnergyPointLogDao.setReferenceDocType(vEnergyPointLogDto.referenceDocType());
        eEnergyPointLogDao.setReferenceName(vEnergyPointLogDto.referenceName());
        eEnergyPointLogDao.setReverted(vEnergyPointLogDto.reverted());
        eEnergyPointLogDao.setRevertOf(vEnergyPointLogDto.revertOf());
        eEnergyPointLogDao.setReason(vEnergyPointLogDto.reason());
        eEnergyPointLogDao.setSeen(vEnergyPointLogDto.seen());
        eEnergyPointLogDao.setUserTags(vEnergyPointLogDto.userTags());
        eEnergyPointLogDao.setComments(vEnergyPointLogDto.comments());
        eEnergyPointLogDao.setAssign(vEnergyPointLogDto.assign());
        eEnergyPointLogDao.setLikedBy(vEnergyPointLogDto.likedBy());
    }
}