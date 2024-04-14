package com.itbd.application.db.dto.workorder;

import com.itbd.application.db.dao.workorder.WorkOrderOperationDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record WorkOrderOperationDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String operation,
        String status,
        BigDecimal completedQty,
        BigDecimal processLossQty,
        String bom,
        String workstationType,
        String workstation,
        Integer sequenceId,
        String description,
        LocalDateTime plannedStartTime,
        BigDecimal hourRate,
        BigDecimal timeInMins,
        LocalDateTime plannedEndTime,
        BigDecimal batchSize,
        BigDecimal plannedOperatingCost,
        LocalDateTime actualStartTime,
        BigDecimal actualOperationTime,
        LocalDateTime actualEndTime,
        BigDecimal actualOperatingCost,
        String parent,
        String parentField,
        String parentType
) {
    public static WorkOrderOperationDto fromEntity(WorkOrderOperationDao eWorkOrderOperationDao) {
        return new WorkOrderOperationDto(
                eWorkOrderOperationDao.getName(),
                eWorkOrderOperationDao.getCreation(),
                eWorkOrderOperationDao.getModified(),
                eWorkOrderOperationDao.getModifiedBy(),
                eWorkOrderOperationDao.getOwner(),
                eWorkOrderOperationDao.getIsDocStatus(),
                eWorkOrderOperationDao.getIdx(),
                eWorkOrderOperationDao.getOperation(),
                eWorkOrderOperationDao.getStatus(),
                eWorkOrderOperationDao.getCompletedQty(),
                eWorkOrderOperationDao.getProcessLossQty(),
                eWorkOrderOperationDao.getBom(),
                eWorkOrderOperationDao.getWorkstationType(),
                eWorkOrderOperationDao.getWorkstation(),
                eWorkOrderOperationDao.getSequenceId(),
                eWorkOrderOperationDao.getDescription(),
                eWorkOrderOperationDao.getPlannedStartTime(),
                eWorkOrderOperationDao.getHourRate(),
                eWorkOrderOperationDao.getTimeInMins(),
                eWorkOrderOperationDao.getPlannedEndTime(),
                eWorkOrderOperationDao.getBatchSize(),
                eWorkOrderOperationDao.getPlannedOperatingCost(),
                eWorkOrderOperationDao.getActualStartTime(),
                eWorkOrderOperationDao.getActualOperationTime(),
                eWorkOrderOperationDao.getActualEndTime(),
                eWorkOrderOperationDao.getActualOperatingCost(),
                eWorkOrderOperationDao.getParent(),
                eWorkOrderOperationDao.getParentField(),
                eWorkOrderOperationDao.getParentType());
    }

    public static void fromDTO(WorkOrderOperationDto vWorkOrderOperationDto, WorkOrderOperationDao eWorkOrderOperationDao) {
        eWorkOrderOperationDao.setName(vWorkOrderOperationDto.name());
        eWorkOrderOperationDao.setCreation(vWorkOrderOperationDto.creation());
        eWorkOrderOperationDao.setModified(vWorkOrderOperationDto.modified());
        eWorkOrderOperationDao.setModifiedBy(vWorkOrderOperationDto.modifiedBy());
        eWorkOrderOperationDao.setOwner(vWorkOrderOperationDto.owner());
        eWorkOrderOperationDao.setIsDocStatus(vWorkOrderOperationDto.isDocStatus());
        eWorkOrderOperationDao.setIdx(vWorkOrderOperationDto.idx());
        eWorkOrderOperationDao.setOperation(vWorkOrderOperationDto.operation());
        eWorkOrderOperationDao.setStatus(vWorkOrderOperationDto.status());
        eWorkOrderOperationDao.setCompletedQty(vWorkOrderOperationDto.completedQty());
        eWorkOrderOperationDao.setProcessLossQty(vWorkOrderOperationDto.processLossQty());
        eWorkOrderOperationDao.setBom(vWorkOrderOperationDto.bom());
        eWorkOrderOperationDao.setWorkstationType(vWorkOrderOperationDto.workstationType());
        eWorkOrderOperationDao.setWorkstation(vWorkOrderOperationDto.workstation());
        eWorkOrderOperationDao.setSequenceId(vWorkOrderOperationDto.sequenceId());
        eWorkOrderOperationDao.setDescription(vWorkOrderOperationDto.description());
        eWorkOrderOperationDao.setPlannedStartTime(vWorkOrderOperationDto.plannedStartTime());
        eWorkOrderOperationDao.setHourRate(vWorkOrderOperationDto.hourRate());
        eWorkOrderOperationDao.setTimeInMins(vWorkOrderOperationDto.timeInMins());
        eWorkOrderOperationDao.setPlannedEndTime(vWorkOrderOperationDto.plannedEndTime());
        eWorkOrderOperationDao.setBatchSize(vWorkOrderOperationDto.batchSize());
        eWorkOrderOperationDao.setPlannedOperatingCost(vWorkOrderOperationDto.plannedOperatingCost());
        eWorkOrderOperationDao.setActualStartTime(vWorkOrderOperationDto.actualStartTime());
        eWorkOrderOperationDao.setActualOperationTime(vWorkOrderOperationDto.actualOperationTime());
        eWorkOrderOperationDao.setActualEndTime(vWorkOrderOperationDto.actualEndTime());
        eWorkOrderOperationDao.setActualOperatingCost(vWorkOrderOperationDto.actualOperatingCost());
        eWorkOrderOperationDao.setParent(vWorkOrderOperationDto.parent());
        eWorkOrderOperationDao.setParentField(vWorkOrderOperationDto.parentField());
        eWorkOrderOperationDao.setParentType(vWorkOrderOperationDto.parentType());
    }
}