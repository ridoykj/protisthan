package com.itbd.application.db.dto.qualitys;

import com.itbd.application.db.dao.qualitys.QualityProcedureDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record QualityProcedureDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String qualityProcedureName,
        String processOwner,
        String processOwnerFullName,
        String parentQualityProcedure,
        Boolean isGroup,
        Integer rgt,
        Integer lft,
        String oldParent,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static QualityProcedureDto fromEntity(QualityProcedureDao eQualityProcedureDao) {
        return new QualityProcedureDto(
                eQualityProcedureDao.getName(),
                eQualityProcedureDao.getCreation(),
                eQualityProcedureDao.getModified(),
                eQualityProcedureDao.getModifiedBy(),
                eQualityProcedureDao.getOwner(),
                eQualityProcedureDao.getIsDocStatus(),
                eQualityProcedureDao.getIdx(),
                eQualityProcedureDao.getQualityProcedureName(),
                eQualityProcedureDao.getProcessOwner(),
                eQualityProcedureDao.getProcessOwnerFullName(),
                eQualityProcedureDao.getParentQualityProcedure(),
                eQualityProcedureDao.getIsGroup(),
                eQualityProcedureDao.getRgt(),
                eQualityProcedureDao.getLft(),
                eQualityProcedureDao.getOldParent(),
                eQualityProcedureDao.getUserTags(),
                eQualityProcedureDao.getComments(),
                eQualityProcedureDao.getAssign(),
                eQualityProcedureDao.getLikedBy());
    }

    public static void fromDTO(QualityProcedureDto vQualityProcedureDto, QualityProcedureDao eQualityProcedureDao) {
        eQualityProcedureDao.setName(vQualityProcedureDto.name());
        eQualityProcedureDao.setCreation(vQualityProcedureDto.creation());
        eQualityProcedureDao.setModified(vQualityProcedureDto.modified());
        eQualityProcedureDao.setModifiedBy(vQualityProcedureDto.modifiedBy());
        eQualityProcedureDao.setOwner(vQualityProcedureDto.owner());
        eQualityProcedureDao.setIsDocStatus(vQualityProcedureDto.isDocStatus());
        eQualityProcedureDao.setIdx(vQualityProcedureDto.idx());
        eQualityProcedureDao.setQualityProcedureName(vQualityProcedureDto.qualityProcedureName());
        eQualityProcedureDao.setProcessOwner(vQualityProcedureDto.processOwner());
        eQualityProcedureDao.setProcessOwnerFullName(vQualityProcedureDto.processOwnerFullName());
        eQualityProcedureDao.setParentQualityProcedure(vQualityProcedureDto.parentQualityProcedure());
        eQualityProcedureDao.setIsGroup(vQualityProcedureDto.isGroup());
        eQualityProcedureDao.setRgt(vQualityProcedureDto.rgt());
        eQualityProcedureDao.setLft(vQualityProcedureDto.lft());
        eQualityProcedureDao.setOldParent(vQualityProcedureDto.oldParent());
        eQualityProcedureDao.setUserTags(vQualityProcedureDto.userTags());
        eQualityProcedureDao.setComments(vQualityProcedureDto.comments());
        eQualityProcedureDao.setAssign(vQualityProcedureDto.assign());
        eQualityProcedureDao.setLikedBy(vQualityProcedureDto.likedBy());
    }
}