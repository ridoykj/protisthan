package com.itbd.application.db.dto.qualitys;

import com.itbd.application.db.dao.quality_management.QualityFeedbackParameterDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record QualityFeedbackParameterDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String parameter,
        String rating,
        String feedback,
        String parent,
        String parentField,
        String parentType
) {
    public static QualityFeedbackParameterDto fromEntity(QualityFeedbackParameterDao eQualityFeedbackParameterDao) {
        return new QualityFeedbackParameterDto(
                eQualityFeedbackParameterDao.getName(),
                eQualityFeedbackParameterDao.getCreation(),
                eQualityFeedbackParameterDao.getModified(),
                eQualityFeedbackParameterDao.getModifiedBy(),
                eQualityFeedbackParameterDao.getOwner(),
                eQualityFeedbackParameterDao.getIsDocStatus(),
                eQualityFeedbackParameterDao.getIdx(),
                eQualityFeedbackParameterDao.getParameter(),
                eQualityFeedbackParameterDao.getRating(),
                eQualityFeedbackParameterDao.getFeedback(),
                eQualityFeedbackParameterDao.getParent(),
                eQualityFeedbackParameterDao.getParentField(),
                eQualityFeedbackParameterDao.getParentType());
    }

    public static void fromDTO(QualityFeedbackParameterDto vQualityFeedbackParameterDto, QualityFeedbackParameterDao eQualityFeedbackParameterDao) {
        eQualityFeedbackParameterDao.setName(vQualityFeedbackParameterDto.name());
        eQualityFeedbackParameterDao.setCreation(vQualityFeedbackParameterDto.creation());
        eQualityFeedbackParameterDao.setModified(vQualityFeedbackParameterDto.modified());
        eQualityFeedbackParameterDao.setModifiedBy(vQualityFeedbackParameterDto.modifiedBy());
        eQualityFeedbackParameterDao.setOwner(vQualityFeedbackParameterDto.owner());
        eQualityFeedbackParameterDao.setIsDocStatus(vQualityFeedbackParameterDto.isDocStatus());
        eQualityFeedbackParameterDao.setIdx(vQualityFeedbackParameterDto.idx());
        eQualityFeedbackParameterDao.setParameter(vQualityFeedbackParameterDto.parameter());
        eQualityFeedbackParameterDao.setRating(vQualityFeedbackParameterDto.rating());
        eQualityFeedbackParameterDao.setFeedback(vQualityFeedbackParameterDto.feedback());
        eQualityFeedbackParameterDao.setParent(vQualityFeedbackParameterDto.parent());
        eQualityFeedbackParameterDao.setParentField(vQualityFeedbackParameterDto.parentField());
        eQualityFeedbackParameterDao.setParentType(vQualityFeedbackParameterDto.parentType());
    }
}