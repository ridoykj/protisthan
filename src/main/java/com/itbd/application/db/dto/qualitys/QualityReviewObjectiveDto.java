package com.itbd.application.db.dto.qualitys;

import com.itbd.application.db.dao.qualitys.QualityReviewObjectiveDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record QualityReviewObjectiveDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String objective,
        String target,
        String uom,
        String status,
        String review,
        String parent,
        String parentField,
        String parentType
) {
    public static QualityReviewObjectiveDto fromEntity(QualityReviewObjectiveDao eQualityReviewObjectiveDao) {
        return new QualityReviewObjectiveDto(
                eQualityReviewObjectiveDao.getName(),
                eQualityReviewObjectiveDao.getCreation(),
                eQualityReviewObjectiveDao.getModified(),
                eQualityReviewObjectiveDao.getModifiedBy(),
                eQualityReviewObjectiveDao.getOwner(),
                eQualityReviewObjectiveDao.getIsDocStatus(),
                eQualityReviewObjectiveDao.getIdx(),
                eQualityReviewObjectiveDao.getObjective(),
                eQualityReviewObjectiveDao.getTarget(),
                eQualityReviewObjectiveDao.getUom(),
                eQualityReviewObjectiveDao.getStatus(),
                eQualityReviewObjectiveDao.getReview(),
                eQualityReviewObjectiveDao.getParent(),
                eQualityReviewObjectiveDao.getParentField(),
                eQualityReviewObjectiveDao.getParentType());
    }

    public static void fromDTO(QualityReviewObjectiveDto vQualityReviewObjectiveDto, QualityReviewObjectiveDao eQualityReviewObjectiveDao) {
        eQualityReviewObjectiveDao.setName(vQualityReviewObjectiveDto.name());
        eQualityReviewObjectiveDao.setCreation(vQualityReviewObjectiveDto.creation());
        eQualityReviewObjectiveDao.setModified(vQualityReviewObjectiveDto.modified());
        eQualityReviewObjectiveDao.setModifiedBy(vQualityReviewObjectiveDto.modifiedBy());
        eQualityReviewObjectiveDao.setOwner(vQualityReviewObjectiveDto.owner());
        eQualityReviewObjectiveDao.setIsDocStatus(vQualityReviewObjectiveDto.isDocStatus());
        eQualityReviewObjectiveDao.setIdx(vQualityReviewObjectiveDto.idx());
        eQualityReviewObjectiveDao.setObjective(vQualityReviewObjectiveDto.objective());
        eQualityReviewObjectiveDao.setTarget(vQualityReviewObjectiveDto.target());
        eQualityReviewObjectiveDao.setUom(vQualityReviewObjectiveDto.uom());
        eQualityReviewObjectiveDao.setStatus(vQualityReviewObjectiveDto.status());
        eQualityReviewObjectiveDao.setReview(vQualityReviewObjectiveDto.review());
        eQualityReviewObjectiveDao.setParent(vQualityReviewObjectiveDto.parent());
        eQualityReviewObjectiveDao.setParentField(vQualityReviewObjectiveDto.parentField());
        eQualityReviewObjectiveDao.setParentType(vQualityReviewObjectiveDto.parentType());
    }
}