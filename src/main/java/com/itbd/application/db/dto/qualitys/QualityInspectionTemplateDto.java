package com.itbd.application.db.dto.qualitys;

import com.itbd.application.db.dao.qualitys.QualityInspectionTemplateDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record QualityInspectionTemplateDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String qualityInspectionTemplateName,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static QualityInspectionTemplateDto fromEntity(QualityInspectionTemplateDao eQualityInspectionTemplateDao) {
        return new QualityInspectionTemplateDto(
                eQualityInspectionTemplateDao.getName(),
                eQualityInspectionTemplateDao.getCreation(),
                eQualityInspectionTemplateDao.getModified(),
                eQualityInspectionTemplateDao.getModifiedBy(),
                eQualityInspectionTemplateDao.getOwner(),
                eQualityInspectionTemplateDao.getIsDocStatus(),
                eQualityInspectionTemplateDao.getIdx(),
                eQualityInspectionTemplateDao.getQualityInspectionTemplateName(),
                eQualityInspectionTemplateDao.getUserTags(),
                eQualityInspectionTemplateDao.getComments(),
                eQualityInspectionTemplateDao.getAssign(),
                eQualityInspectionTemplateDao.getLikedBy());
    }

    public static void fromDTO(QualityInspectionTemplateDto vQualityInspectionTemplateDto, QualityInspectionTemplateDao eQualityInspectionTemplateDao) {
        eQualityInspectionTemplateDao.setName(vQualityInspectionTemplateDto.name());
        eQualityInspectionTemplateDao.setCreation(vQualityInspectionTemplateDto.creation());
        eQualityInspectionTemplateDao.setModified(vQualityInspectionTemplateDto.modified());
        eQualityInspectionTemplateDao.setModifiedBy(vQualityInspectionTemplateDto.modifiedBy());
        eQualityInspectionTemplateDao.setOwner(vQualityInspectionTemplateDto.owner());
        eQualityInspectionTemplateDao.setIsDocStatus(vQualityInspectionTemplateDto.isDocStatus());
        eQualityInspectionTemplateDao.setIdx(vQualityInspectionTemplateDto.idx());
        eQualityInspectionTemplateDao.setQualityInspectionTemplateName(vQualityInspectionTemplateDto.qualityInspectionTemplateName());
        eQualityInspectionTemplateDao.setUserTags(vQualityInspectionTemplateDto.userTags());
        eQualityInspectionTemplateDao.setComments(vQualityInspectionTemplateDto.comments());
        eQualityInspectionTemplateDao.setAssign(vQualityInspectionTemplateDto.assign());
        eQualityInspectionTemplateDao.setLikedBy(vQualityInspectionTemplateDto.likedBy());
    }
}