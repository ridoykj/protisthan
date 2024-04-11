package com.itbd.application.db.dto.qualitys;

import com.itbd.application.db.dao.qualitys.QualityActionResolutionDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record QualityActionResolutionDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String problem,
        String resolution,
        String status,
        String responsible,
        LocalDate completionBy,
        String parent,
        String parentField,
        String parentType
) {
    public static QualityActionResolutionDto fromEntity(QualityActionResolutionDao eQualityActionResolutionDao) {
        return new QualityActionResolutionDto(
                eQualityActionResolutionDao.getName(),
                eQualityActionResolutionDao.getCreation(),
                eQualityActionResolutionDao.getModified(),
                eQualityActionResolutionDao.getModifiedBy(),
                eQualityActionResolutionDao.getOwner(),
                eQualityActionResolutionDao.getIsDocStatus(),
                eQualityActionResolutionDao.getIdx(),
                eQualityActionResolutionDao.getProblem(),
                eQualityActionResolutionDao.getResolution(),
                eQualityActionResolutionDao.getStatus(),
                eQualityActionResolutionDao.getResponsible(),
                eQualityActionResolutionDao.getCompletionBy(),
                eQualityActionResolutionDao.getParent(),
                eQualityActionResolutionDao.getParentField(),
                eQualityActionResolutionDao.getParentType());
    }

    public static void fromDTO(QualityActionResolutionDto vQualityActionResolutionDto, QualityActionResolutionDao eQualityActionResolutionDao) {
        eQualityActionResolutionDao.setName(vQualityActionResolutionDto.name());
        eQualityActionResolutionDao.setCreation(vQualityActionResolutionDto.creation());
        eQualityActionResolutionDao.setModified(vQualityActionResolutionDto.modified());
        eQualityActionResolutionDao.setModifiedBy(vQualityActionResolutionDto.modifiedBy());
        eQualityActionResolutionDao.setOwner(vQualityActionResolutionDto.owner());
        eQualityActionResolutionDao.setIsDocStatus(vQualityActionResolutionDto.isDocStatus());
        eQualityActionResolutionDao.setIdx(vQualityActionResolutionDto.idx());
        eQualityActionResolutionDao.setProblem(vQualityActionResolutionDto.problem());
        eQualityActionResolutionDao.setResolution(vQualityActionResolutionDto.resolution());
        eQualityActionResolutionDao.setStatus(vQualityActionResolutionDto.status());
        eQualityActionResolutionDao.setResponsible(vQualityActionResolutionDto.responsible());
        eQualityActionResolutionDao.setCompletionBy(vQualityActionResolutionDto.completionBy());
        eQualityActionResolutionDao.setParent(vQualityActionResolutionDto.parent());
        eQualityActionResolutionDao.setParentField(vQualityActionResolutionDto.parentField());
        eQualityActionResolutionDao.setParentType(vQualityActionResolutionDto.parentType());
    }
}