package com.itbd.application.db.dto.qualitys;

import com.itbd.application.db.dao.stock.quality_inspection.QualityInspectionParameterDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record QualityInspectionParameterDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String parameter,
        String parameterGroup,
        String description,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static QualityInspectionParameterDto fromEntity(QualityInspectionParameterDao eQualityInspectionParameterDao) {
        return new QualityInspectionParameterDto(
                eQualityInspectionParameterDao.getName(),
                eQualityInspectionParameterDao.getCreation(),
                eQualityInspectionParameterDao.getModified(),
                eQualityInspectionParameterDao.getModifiedBy(),
                eQualityInspectionParameterDao.getOwner(),
                eQualityInspectionParameterDao.getIsDocStatus(),
                eQualityInspectionParameterDao.getIdx(),
                eQualityInspectionParameterDao.getParameter(),
                eQualityInspectionParameterDao.getParameterGroup(),
                eQualityInspectionParameterDao.getDescription(),
                eQualityInspectionParameterDao.getUserTags(),
                eQualityInspectionParameterDao.getComments(),
                eQualityInspectionParameterDao.getAssign(),
                eQualityInspectionParameterDao.getLikedBy());
    }

    public static void fromDTO(QualityInspectionParameterDto vQualityInspectionParameterDto, QualityInspectionParameterDao eQualityInspectionParameterDao) {
        eQualityInspectionParameterDao.setName(vQualityInspectionParameterDto.name());
        eQualityInspectionParameterDao.setCreation(vQualityInspectionParameterDto.creation());
        eQualityInspectionParameterDao.setModified(vQualityInspectionParameterDto.modified());
        eQualityInspectionParameterDao.setModifiedBy(vQualityInspectionParameterDto.modifiedBy());
        eQualityInspectionParameterDao.setOwner(vQualityInspectionParameterDto.owner());
        eQualityInspectionParameterDao.setIsDocStatus(vQualityInspectionParameterDto.isDocStatus());
        eQualityInspectionParameterDao.setIdx(vQualityInspectionParameterDto.idx());
        eQualityInspectionParameterDao.setParameter(vQualityInspectionParameterDto.parameter());
        eQualityInspectionParameterDao.setParameterGroup(vQualityInspectionParameterDto.parameterGroup());
        eQualityInspectionParameterDao.setDescription(vQualityInspectionParameterDto.description());
        eQualityInspectionParameterDao.setUserTags(vQualityInspectionParameterDto.userTags());
        eQualityInspectionParameterDao.setComments(vQualityInspectionParameterDto.comments());
        eQualityInspectionParameterDao.setAssign(vQualityInspectionParameterDto.assign());
        eQualityInspectionParameterDao.setLikedBy(vQualityInspectionParameterDto.likedBy());
    }
}