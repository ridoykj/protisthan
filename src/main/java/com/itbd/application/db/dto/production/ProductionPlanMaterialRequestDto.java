package com.itbd.application.db.dto.production;

import com.itbd.application.db.dao.production.ProductionPlanMaterialRequestDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record ProductionPlanMaterialRequestDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String materialRequest,
        LocalDate materialRequestDate,
        String parent,
        String parentField,
        String parentType
) {
    public static ProductionPlanMaterialRequestDto fromEntity(ProductionPlanMaterialRequestDao eProductionPlanMaterialRequestDao) {
        return new ProductionPlanMaterialRequestDto(
                eProductionPlanMaterialRequestDao.getName(),
                eProductionPlanMaterialRequestDao.getCreation(),
                eProductionPlanMaterialRequestDao.getModified(),
                eProductionPlanMaterialRequestDao.getModifiedBy(),
                eProductionPlanMaterialRequestDao.getOwner(),
                eProductionPlanMaterialRequestDao.getIsDocStatus(),
                eProductionPlanMaterialRequestDao.getIdx(),
                eProductionPlanMaterialRequestDao.getMaterialRequest(),
                eProductionPlanMaterialRequestDao.getMaterialRequestDate(),
                eProductionPlanMaterialRequestDao.getParent(),
                eProductionPlanMaterialRequestDao.getParentField(),
                eProductionPlanMaterialRequestDao.getParentType());
    }

    public static void fromDTO(ProductionPlanMaterialRequestDto vProductionPlanMaterialRequestDto, ProductionPlanMaterialRequestDao eProductionPlanMaterialRequestDao) {
        eProductionPlanMaterialRequestDao.setName(vProductionPlanMaterialRequestDto.name());
        eProductionPlanMaterialRequestDao.setCreation(vProductionPlanMaterialRequestDto.creation());
        eProductionPlanMaterialRequestDao.setModified(vProductionPlanMaterialRequestDto.modified());
        eProductionPlanMaterialRequestDao.setModifiedBy(vProductionPlanMaterialRequestDto.modifiedBy());
        eProductionPlanMaterialRequestDao.setOwner(vProductionPlanMaterialRequestDto.owner());
        eProductionPlanMaterialRequestDao.setIsDocStatus(vProductionPlanMaterialRequestDto.isDocStatus());
        eProductionPlanMaterialRequestDao.setIdx(vProductionPlanMaterialRequestDto.idx());
        eProductionPlanMaterialRequestDao.setMaterialRequest(vProductionPlanMaterialRequestDto.materialRequest());
        eProductionPlanMaterialRequestDao.setMaterialRequestDate(vProductionPlanMaterialRequestDto.materialRequestDate());
        eProductionPlanMaterialRequestDao.setParent(vProductionPlanMaterialRequestDto.parent());
        eProductionPlanMaterialRequestDao.setParentField(vProductionPlanMaterialRequestDto.parentField());
        eProductionPlanMaterialRequestDao.setParentType(vProductionPlanMaterialRequestDto.parentType());
    }
}