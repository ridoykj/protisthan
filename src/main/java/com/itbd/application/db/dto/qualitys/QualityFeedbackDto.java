package com.itbd.application.db.dto.qualitys;

import com.itbd.application.db.dao.quality_management.QualityFeedbackDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record QualityFeedbackDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String template,
        String documentType,
        String documentName,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static QualityFeedbackDto fromEntity(QualityFeedbackDao eQualityFeedbackDao) {
        return new QualityFeedbackDto(
                eQualityFeedbackDao.getName(),
                eQualityFeedbackDao.getCreation(),
                eQualityFeedbackDao.getModified(),
                eQualityFeedbackDao.getModifiedBy(),
                eQualityFeedbackDao.getOwner(),
                eQualityFeedbackDao.getIsDocStatus(),
                eQualityFeedbackDao.getIdx(),
                eQualityFeedbackDao.getTemplate(),
                eQualityFeedbackDao.getDocumentType(),
                eQualityFeedbackDao.getDocumentName(),
                eQualityFeedbackDao.getUserTags(),
                eQualityFeedbackDao.getComments(),
                eQualityFeedbackDao.getAssign(),
                eQualityFeedbackDao.getLikedBy());
    }

    public static void fromDTO(QualityFeedbackDto vQualityFeedbackDto, QualityFeedbackDao eQualityFeedbackDao) {
        eQualityFeedbackDao.setName(vQualityFeedbackDto.name());
        eQualityFeedbackDao.setCreation(vQualityFeedbackDto.creation());
        eQualityFeedbackDao.setModified(vQualityFeedbackDto.modified());
        eQualityFeedbackDao.setModifiedBy(vQualityFeedbackDto.modifiedBy());
        eQualityFeedbackDao.setOwner(vQualityFeedbackDto.owner());
        eQualityFeedbackDao.setIsDocStatus(vQualityFeedbackDto.isDocStatus());
        eQualityFeedbackDao.setIdx(vQualityFeedbackDto.idx());
        eQualityFeedbackDao.setTemplate(vQualityFeedbackDto.template());
        eQualityFeedbackDao.setDocumentType(vQualityFeedbackDto.documentType());
        eQualityFeedbackDao.setDocumentName(vQualityFeedbackDto.documentName());
        eQualityFeedbackDao.setUserTags(vQualityFeedbackDto.userTags());
        eQualityFeedbackDao.setComments(vQualityFeedbackDto.comments());
        eQualityFeedbackDao.setAssign(vQualityFeedbackDto.assign());
        eQualityFeedbackDao.setLikedBy(vQualityFeedbackDto.likedBy());
    }
}