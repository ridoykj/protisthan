package com.itbd.application.db.dto.qualitys;

import com.itbd.application.db.dao.qualitys.QualityFeedbackTemplateParameterDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record QualityFeedbackTemplateParameterDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String parameter,
        String parent,
        String parentField,
        String parentType
) {
    public static QualityFeedbackTemplateParameterDto fromEntity(QualityFeedbackTemplateParameterDao eQualityFeedbackTemplateParameterDao) {
        return new QualityFeedbackTemplateParameterDto(
                eQualityFeedbackTemplateParameterDao.getName(),
                eQualityFeedbackTemplateParameterDao.getCreation(),
                eQualityFeedbackTemplateParameterDao.getModified(),
                eQualityFeedbackTemplateParameterDao.getModifiedBy(),
                eQualityFeedbackTemplateParameterDao.getOwner(),
                eQualityFeedbackTemplateParameterDao.getIsDocStatus(),
                eQualityFeedbackTemplateParameterDao.getIdx(),
                eQualityFeedbackTemplateParameterDao.getParameter(),
                eQualityFeedbackTemplateParameterDao.getParent(),
                eQualityFeedbackTemplateParameterDao.getParentField(),
                eQualityFeedbackTemplateParameterDao.getParentType());
    }

    public static void fromDTO(QualityFeedbackTemplateParameterDto vQualityFeedbackTemplateParameterDto, QualityFeedbackTemplateParameterDao eQualityFeedbackTemplateParameterDao) {
        eQualityFeedbackTemplateParameterDao.setName(vQualityFeedbackTemplateParameterDto.name());
        eQualityFeedbackTemplateParameterDao.setCreation(vQualityFeedbackTemplateParameterDto.creation());
        eQualityFeedbackTemplateParameterDao.setModified(vQualityFeedbackTemplateParameterDto.modified());
        eQualityFeedbackTemplateParameterDao.setModifiedBy(vQualityFeedbackTemplateParameterDto.modifiedBy());
        eQualityFeedbackTemplateParameterDao.setOwner(vQualityFeedbackTemplateParameterDto.owner());
        eQualityFeedbackTemplateParameterDao.setIsDocStatus(vQualityFeedbackTemplateParameterDto.isDocStatus());
        eQualityFeedbackTemplateParameterDao.setIdx(vQualityFeedbackTemplateParameterDto.idx());
        eQualityFeedbackTemplateParameterDao.setParameter(vQualityFeedbackTemplateParameterDto.parameter());
        eQualityFeedbackTemplateParameterDao.setParent(vQualityFeedbackTemplateParameterDto.parent());
        eQualityFeedbackTemplateParameterDao.setParentField(vQualityFeedbackTemplateParameterDto.parentField());
        eQualityFeedbackTemplateParameterDao.setParentType(vQualityFeedbackTemplateParameterDto.parentType());
    }
}