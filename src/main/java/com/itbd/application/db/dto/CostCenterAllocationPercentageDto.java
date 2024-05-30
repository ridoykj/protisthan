package com.itbd.application.db.dto;

import com.itbd.application.db.dao.accounts.CostCenterAllocationPercentageDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record CostCenterAllocationPercentageDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String costCenter,
        BigDecimal percentage,
        String parent,
        String parentField,
        String parentType
) {
    public static CostCenterAllocationPercentageDto fromEntity(CostCenterAllocationPercentageDao eCostCenterAllocationPercentageDao) {
        return new CostCenterAllocationPercentageDto(
                eCostCenterAllocationPercentageDao.getName(),
                eCostCenterAllocationPercentageDao.getCreation(),
                eCostCenterAllocationPercentageDao.getModified(),
                eCostCenterAllocationPercentageDao.getModifiedBy(),
                eCostCenterAllocationPercentageDao.getOwner(),
                eCostCenterAllocationPercentageDao.getIsDocStatus(),
                eCostCenterAllocationPercentageDao.getIdx(),
                eCostCenterAllocationPercentageDao.getCostCenter(),
                eCostCenterAllocationPercentageDao.getPercentage(),
                eCostCenterAllocationPercentageDao.getParent(),
                eCostCenterAllocationPercentageDao.getParentField(),
                eCostCenterAllocationPercentageDao.getParentType());
    }

    public static void fromDTO(CostCenterAllocationPercentageDto vCostCenterAllocationPercentageDto, CostCenterAllocationPercentageDao eCostCenterAllocationPercentageDao) {
        eCostCenterAllocationPercentageDao.setName(vCostCenterAllocationPercentageDto.name());
        eCostCenterAllocationPercentageDao.setCreation(vCostCenterAllocationPercentageDto.creation());
        eCostCenterAllocationPercentageDao.setModified(vCostCenterAllocationPercentageDto.modified());
        eCostCenterAllocationPercentageDao.setModifiedBy(vCostCenterAllocationPercentageDto.modifiedBy());
        eCostCenterAllocationPercentageDao.setOwner(vCostCenterAllocationPercentageDto.owner());
        eCostCenterAllocationPercentageDao.setIsDocStatus(vCostCenterAllocationPercentageDto.isDocStatus());
        eCostCenterAllocationPercentageDao.setIdx(vCostCenterAllocationPercentageDto.idx());
        eCostCenterAllocationPercentageDao.setCostCenter(vCostCenterAllocationPercentageDto.costCenter());
        eCostCenterAllocationPercentageDao.setPercentage(vCostCenterAllocationPercentageDto.percentage());
        eCostCenterAllocationPercentageDao.setParent(vCostCenterAllocationPercentageDto.parent());
        eCostCenterAllocationPercentageDao.setParentField(vCostCenterAllocationPercentageDto.parentField());
        eCostCenterAllocationPercentageDao.setParentType(vCostCenterAllocationPercentageDto.parentType());
    }
}