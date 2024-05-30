package com.itbd.application.db.dto.qualitys;

import com.itbd.application.db.dao.quality_management.QualityProcedureProcessDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record QualityProcedureProcessDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String processDescription,
        String procedure,
        String parent,
        String parentField,
        String parentType
) {
    public static QualityProcedureProcessDto fromEntity(QualityProcedureProcessDao eQualityProcedureProcessDao) {
        return new QualityProcedureProcessDto(
                eQualityProcedureProcessDao.getName(),
                eQualityProcedureProcessDao.getCreation(),
                eQualityProcedureProcessDao.getModified(),
                eQualityProcedureProcessDao.getModifiedBy(),
                eQualityProcedureProcessDao.getOwner(),
                eQualityProcedureProcessDao.getIsDocStatus(),
                eQualityProcedureProcessDao.getIdx(),
                eQualityProcedureProcessDao.getProcessDescription(),
                eQualityProcedureProcessDao.getProcedure(),
                eQualityProcedureProcessDao.getParent(),
                eQualityProcedureProcessDao.getParentField(),
                eQualityProcedureProcessDao.getParentType());
    }

    public static void fromDTO(QualityProcedureProcessDto vQualityProcedureProcessDto, QualityProcedureProcessDao eQualityProcedureProcessDao) {
        eQualityProcedureProcessDao.setName(vQualityProcedureProcessDto.name());
        eQualityProcedureProcessDao.setCreation(vQualityProcedureProcessDto.creation());
        eQualityProcedureProcessDao.setModified(vQualityProcedureProcessDto.modified());
        eQualityProcedureProcessDao.setModifiedBy(vQualityProcedureProcessDto.modifiedBy());
        eQualityProcedureProcessDao.setOwner(vQualityProcedureProcessDto.owner());
        eQualityProcedureProcessDao.setIsDocStatus(vQualityProcedureProcessDto.isDocStatus());
        eQualityProcedureProcessDao.setIdx(vQualityProcedureProcessDto.idx());
        eQualityProcedureProcessDao.setProcessDescription(vQualityProcedureProcessDto.processDescription());
        eQualityProcedureProcessDao.setProcedure(vQualityProcedureProcessDto.procedure());
        eQualityProcedureProcessDao.setParent(vQualityProcedureProcessDto.parent());
        eQualityProcedureProcessDao.setParentField(vQualityProcedureProcessDto.parentField());
        eQualityProcedureProcessDao.setParentType(vQualityProcedureProcessDto.parentType());
    }
}