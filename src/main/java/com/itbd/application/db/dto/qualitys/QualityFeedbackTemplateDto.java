package com.itbd.application.db.dto.qualitys;

import com.itbd.application.db.dao.qualitys.QualityFeedbackTemplateDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record QualityFeedbackTemplateDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String template,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static QualityFeedbackTemplateDto fromEntity(QualityFeedbackTemplateDao eQualityFeedbackTemplateDao) {
        return new QualityFeedbackTemplateDto(
                eQualityFeedbackTemplateDao.getName(),
                eQualityFeedbackTemplateDao.getCreation(),
                eQualityFeedbackTemplateDao.getModified(),
                eQualityFeedbackTemplateDao.getModifiedBy(),
                eQualityFeedbackTemplateDao.getOwner(),
                eQualityFeedbackTemplateDao.getIsDocStatus(),
                eQualityFeedbackTemplateDao.getIdx(),
                eQualityFeedbackTemplateDao.getTemplate(),
                eQualityFeedbackTemplateDao.getUserTags(),
                eQualityFeedbackTemplateDao.getComments(),
                eQualityFeedbackTemplateDao.getAssign(),
                eQualityFeedbackTemplateDao.getLikedBy());
    }

    public static void fromDTO(QualityFeedbackTemplateDto vQualityFeedbackTemplateDto, QualityFeedbackTemplateDao eQualityFeedbackTemplateDao) {
        eQualityFeedbackTemplateDao.setName(vQualityFeedbackTemplateDto.name());
        eQualityFeedbackTemplateDao.setCreation(vQualityFeedbackTemplateDto.creation());
        eQualityFeedbackTemplateDao.setModified(vQualityFeedbackTemplateDto.modified());
        eQualityFeedbackTemplateDao.setModifiedBy(vQualityFeedbackTemplateDto.modifiedBy());
        eQualityFeedbackTemplateDao.setOwner(vQualityFeedbackTemplateDto.owner());
        eQualityFeedbackTemplateDao.setIsDocStatus(vQualityFeedbackTemplateDto.isDocStatus());
        eQualityFeedbackTemplateDao.setIdx(vQualityFeedbackTemplateDto.idx());
        eQualityFeedbackTemplateDao.setTemplate(vQualityFeedbackTemplateDto.template());
        eQualityFeedbackTemplateDao.setUserTags(vQualityFeedbackTemplateDto.userTags());
        eQualityFeedbackTemplateDao.setComments(vQualityFeedbackTemplateDto.comments());
        eQualityFeedbackTemplateDao.setAssign(vQualityFeedbackTemplateDto.assign());
        eQualityFeedbackTemplateDao.setLikedBy(vQualityFeedbackTemplateDto.likedBy());
    }
}