package com.itbd.application.db.dto.bom;

import com.itbd.application.db.dao.bom.BomOperationDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record BomOperationDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Integer sequenceId,
        String operation,
        String workstationType,
        String workstation,
        BigDecimal timeInMins,
        Boolean fixedTime,
        BigDecimal hourRate,
        BigDecimal baseHourRate,
        BigDecimal operatingCost,
        BigDecimal baseOperatingCost,
        Integer batchSize,
        Boolean setCostBasedOnBomQty,
        BigDecimal costPerUnit,
        BigDecimal baseCostPerUnit,
        String description,
        String image,
        String parent,
        String parentField,
        String parentType
) {
    public static BomOperationDto fromEntity(BomOperationDao eBomOperationDao) {
        return new BomOperationDto(
                eBomOperationDao.getName(),
                eBomOperationDao.getCreation(),
                eBomOperationDao.getModified(),
                eBomOperationDao.getModifiedBy(),
                eBomOperationDao.getOwner(),
                eBomOperationDao.getIsDocStatus(),
                eBomOperationDao.getIdx(),
                eBomOperationDao.getSequenceId(),
                eBomOperationDao.getOperation(),
                eBomOperationDao.getWorkstationType(),
                eBomOperationDao.getWorkstation(),
                eBomOperationDao.getTimeInMins(),
                eBomOperationDao.getFixedTime(),
                eBomOperationDao.getHourRate(),
                eBomOperationDao.getBaseHourRate(),
                eBomOperationDao.getOperatingCost(),
                eBomOperationDao.getBaseOperatingCost(),
                eBomOperationDao.getBatchSize(),
                eBomOperationDao.getSetCostBasedOnBomQty(),
                eBomOperationDao.getCostPerUnit(),
                eBomOperationDao.getBaseCostPerUnit(),
                eBomOperationDao.getDescription(),
                eBomOperationDao.getImage(),
                eBomOperationDao.getParent(),
                eBomOperationDao.getParentField(),
                eBomOperationDao.getParentType());
    }

    public static void fromDTO(BomOperationDto vBomOperationDto, BomOperationDao eBomOperationDao) {
        eBomOperationDao.setName(vBomOperationDto.name());
        eBomOperationDao.setCreation(vBomOperationDto.creation());
        eBomOperationDao.setModified(vBomOperationDto.modified());
        eBomOperationDao.setModifiedBy(vBomOperationDto.modifiedBy());
        eBomOperationDao.setOwner(vBomOperationDto.owner());
        eBomOperationDao.setIsDocStatus(vBomOperationDto.isDocStatus());
        eBomOperationDao.setIdx(vBomOperationDto.idx());
        eBomOperationDao.setSequenceId(vBomOperationDto.sequenceId());
        eBomOperationDao.setOperation(vBomOperationDto.operation());
        eBomOperationDao.setWorkstationType(vBomOperationDto.workstationType());
        eBomOperationDao.setWorkstation(vBomOperationDto.workstation());
        eBomOperationDao.setTimeInMins(vBomOperationDto.timeInMins());
        eBomOperationDao.setFixedTime(vBomOperationDto.fixedTime());
        eBomOperationDao.setHourRate(vBomOperationDto.hourRate());
        eBomOperationDao.setBaseHourRate(vBomOperationDto.baseHourRate());
        eBomOperationDao.setOperatingCost(vBomOperationDto.operatingCost());
        eBomOperationDao.setBaseOperatingCost(vBomOperationDto.baseOperatingCost());
        eBomOperationDao.setBatchSize(vBomOperationDto.batchSize());
        eBomOperationDao.setSetCostBasedOnBomQty(vBomOperationDto.setCostBasedOnBomQty());
        eBomOperationDao.setCostPerUnit(vBomOperationDto.costPerUnit());
        eBomOperationDao.setBaseCostPerUnit(vBomOperationDto.baseCostPerUnit());
        eBomOperationDao.setDescription(vBomOperationDto.description());
        eBomOperationDao.setImage(vBomOperationDto.image());
        eBomOperationDao.setParent(vBomOperationDto.parent());
        eBomOperationDao.setParentField(vBomOperationDto.parentField());
        eBomOperationDao.setParentType(vBomOperationDto.parentType());
    }
}