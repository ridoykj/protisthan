package com.itbd.application.db.dto.qualitys;

import com.itbd.application.db.dao.qualitys.QualityGoalObjectiveDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record QualityGoalObjectiveDto(
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
        String parent,
        String parentField,
        String parentType
) {
    public static QualityGoalObjectiveDto fromEntity(QualityGoalObjectiveDao eQualityGoalObjectiveDao) {
        return new QualityGoalObjectiveDto(
                eQualityGoalObjectiveDao.getName(),
                eQualityGoalObjectiveDao.getCreation(),
                eQualityGoalObjectiveDao.getModified(),
                eQualityGoalObjectiveDao.getModifiedBy(),
                eQualityGoalObjectiveDao.getOwner(),
                eQualityGoalObjectiveDao.getIsDocStatus(),
                eQualityGoalObjectiveDao.getIdx(),
                eQualityGoalObjectiveDao.getObjective(),
                eQualityGoalObjectiveDao.getTarget(),
                eQualityGoalObjectiveDao.getUom(),
                eQualityGoalObjectiveDao.getParent(),
                eQualityGoalObjectiveDao.getParentField(),
                eQualityGoalObjectiveDao.getParentType());
    }

    public static void fromDTO(QualityGoalObjectiveDto vQualityGoalObjectiveDto, QualityGoalObjectiveDao eQualityGoalObjectiveDao) {
        eQualityGoalObjectiveDao.setName(vQualityGoalObjectiveDto.name());
        eQualityGoalObjectiveDao.setCreation(vQualityGoalObjectiveDto.creation());
        eQualityGoalObjectiveDao.setModified(vQualityGoalObjectiveDto.modified());
        eQualityGoalObjectiveDao.setModifiedBy(vQualityGoalObjectiveDto.modifiedBy());
        eQualityGoalObjectiveDao.setOwner(vQualityGoalObjectiveDto.owner());
        eQualityGoalObjectiveDao.setIsDocStatus(vQualityGoalObjectiveDto.isDocStatus());
        eQualityGoalObjectiveDao.setIdx(vQualityGoalObjectiveDto.idx());
        eQualityGoalObjectiveDao.setObjective(vQualityGoalObjectiveDto.objective());
        eQualityGoalObjectiveDao.setTarget(vQualityGoalObjectiveDto.target());
        eQualityGoalObjectiveDao.setUom(vQualityGoalObjectiveDto.uom());
        eQualityGoalObjectiveDao.setParent(vQualityGoalObjectiveDto.parent());
        eQualityGoalObjectiveDao.setParentField(vQualityGoalObjectiveDto.parentField());
        eQualityGoalObjectiveDao.setParentType(vQualityGoalObjectiveDto.parentType());
    }
}