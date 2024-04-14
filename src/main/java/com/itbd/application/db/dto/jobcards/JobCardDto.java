package com.itbd.application.db.dto.jobcards;

import com.itbd.application.db.dao.jobcards.JobCardDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record JobCardDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String namingSeries,
        String workOrder,
        String bomNo,
        String productionItem,
        LocalDate postingDate,
        String company,
        BigDecimal forQuantity,
        BigDecimal totalCompletedQty,
        BigDecimal processLossQty,
        LocalDateTime expectedStartDate,
        BigDecimal timeRequired,
        LocalDateTime expectedEndDate,
        LocalDateTime actualStartDate,
        BigDecimal totalTimeInMins,
        LocalDateTime actualEndDate,
        String operation,
        String wipWarehouse,
        String workstationType,
        String workstation,
        String qualityInspectionTemplate,
        String qualityInspection,
        String forJobCard,
        Boolean isCorrectiveJobCard,
        BigDecimal hourRate,
        String forOperation,
        String project,
        String itemName,
        BigDecimal transferredQty,
        BigDecimal requestedQty,
        String status,
        String operationRowNumber,
        String operationId,
        Integer sequenceId,
        String remarks,
        String serialAndBatchBundle,
        String batchNo,
        String serialNo,
        String barcode,
        Boolean jobStarted,
        LocalDateTime startedTime,
        Integer currentTime,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static JobCardDto fromEntity(JobCardDao eJobCardDao) {
        return new JobCardDto(
                eJobCardDao.getName(),
                eJobCardDao.getCreation(),
                eJobCardDao.getModified(),
                eJobCardDao.getModifiedBy(),
                eJobCardDao.getOwner(),
                eJobCardDao.getIsDocStatus(),
                eJobCardDao.getIdx(),
                eJobCardDao.getNamingSeries(),
                eJobCardDao.getWorkOrder(),
                eJobCardDao.getBomNo(),
                eJobCardDao.getProductionItem(),
                eJobCardDao.getPostingDate(),
                eJobCardDao.getCompany(),
                eJobCardDao.getForQuantity(),
                eJobCardDao.getTotalCompletedQty(),
                eJobCardDao.getProcessLossQty(),
                eJobCardDao.getExpectedStartDate(),
                eJobCardDao.getTimeRequired(),
                eJobCardDao.getExpectedEndDate(),
                eJobCardDao.getActualStartDate(),
                eJobCardDao.getTotalTimeInMins(),
                eJobCardDao.getActualEndDate(),
                eJobCardDao.getOperation(),
                eJobCardDao.getWipWarehouse(),
                eJobCardDao.getWorkstationType(),
                eJobCardDao.getWorkstation(),
                eJobCardDao.getQualityInspectionTemplate(),
                eJobCardDao.getQualityInspection(),
                eJobCardDao.getForJobCard(),
                eJobCardDao.getIsCorrectiveJobCard(),
                eJobCardDao.getHourRate(),
                eJobCardDao.getForOperation(),
                eJobCardDao.getProject(),
                eJobCardDao.getItemName(),
                eJobCardDao.getTransferredQty(),
                eJobCardDao.getRequestedQty(),
                eJobCardDao.getStatus(),
                eJobCardDao.getOperationRowNumber(),
                eJobCardDao.getOperationId(),
                eJobCardDao.getSequenceId(),
                eJobCardDao.getRemarks(),
                eJobCardDao.getSerialAndBatchBundle(),
                eJobCardDao.getBatchNo(),
                eJobCardDao.getSerialNo(),
                eJobCardDao.getBarcode(),
                eJobCardDao.getJobStarted(),
                eJobCardDao.getStartedTime(),
                eJobCardDao.getCurrentTime(),
                eJobCardDao.getAmendedFrom(),
                eJobCardDao.getUserTags(),
                eJobCardDao.getComments(),
                eJobCardDao.getAssign(),
                eJobCardDao.getLikedBy());
    }

    public static void fromDTO(JobCardDto vJobCardDto, JobCardDao eJobCardDao) {
        eJobCardDao.setName(vJobCardDto.name());
        eJobCardDao.setCreation(vJobCardDto.creation());
        eJobCardDao.setModified(vJobCardDto.modified());
        eJobCardDao.setModifiedBy(vJobCardDto.modifiedBy());
        eJobCardDao.setOwner(vJobCardDto.owner());
        eJobCardDao.setIsDocStatus(vJobCardDto.isDocStatus());
        eJobCardDao.setIdx(vJobCardDto.idx());
        eJobCardDao.setNamingSeries(vJobCardDto.namingSeries());
        eJobCardDao.setWorkOrder(vJobCardDto.workOrder());
        eJobCardDao.setBomNo(vJobCardDto.bomNo());
        eJobCardDao.setProductionItem(vJobCardDto.productionItem());
        eJobCardDao.setPostingDate(vJobCardDto.postingDate());
        eJobCardDao.setCompany(vJobCardDto.company());
        eJobCardDao.setForQuantity(vJobCardDto.forQuantity());
        eJobCardDao.setTotalCompletedQty(vJobCardDto.totalCompletedQty());
        eJobCardDao.setProcessLossQty(vJobCardDto.processLossQty());
        eJobCardDao.setExpectedStartDate(vJobCardDto.expectedStartDate());
        eJobCardDao.setTimeRequired(vJobCardDto.timeRequired());
        eJobCardDao.setExpectedEndDate(vJobCardDto.expectedEndDate());
        eJobCardDao.setActualStartDate(vJobCardDto.actualStartDate());
        eJobCardDao.setTotalTimeInMins(vJobCardDto.totalTimeInMins());
        eJobCardDao.setActualEndDate(vJobCardDto.actualEndDate());
        eJobCardDao.setOperation(vJobCardDto.operation());
        eJobCardDao.setWipWarehouse(vJobCardDto.wipWarehouse());
        eJobCardDao.setWorkstationType(vJobCardDto.workstationType());
        eJobCardDao.setWorkstation(vJobCardDto.workstation());
        eJobCardDao.setQualityInspectionTemplate(vJobCardDto.qualityInspectionTemplate());
        eJobCardDao.setQualityInspection(vJobCardDto.qualityInspection());
        eJobCardDao.setForJobCard(vJobCardDto.forJobCard());
        eJobCardDao.setIsCorrectiveJobCard(vJobCardDto.isCorrectiveJobCard());
        eJobCardDao.setHourRate(vJobCardDto.hourRate());
        eJobCardDao.setForOperation(vJobCardDto.forOperation());
        eJobCardDao.setProject(vJobCardDto.project());
        eJobCardDao.setItemName(vJobCardDto.itemName());
        eJobCardDao.setTransferredQty(vJobCardDto.transferredQty());
        eJobCardDao.setRequestedQty(vJobCardDto.requestedQty());
        eJobCardDao.setStatus(vJobCardDto.status());
        eJobCardDao.setOperationRowNumber(vJobCardDto.operationRowNumber());
        eJobCardDao.setOperationId(vJobCardDto.operationId());
        eJobCardDao.setSequenceId(vJobCardDto.sequenceId());
        eJobCardDao.setRemarks(vJobCardDto.remarks());
        eJobCardDao.setSerialAndBatchBundle(vJobCardDto.serialAndBatchBundle());
        eJobCardDao.setBatchNo(vJobCardDto.batchNo());
        eJobCardDao.setSerialNo(vJobCardDto.serialNo());
        eJobCardDao.setBarcode(vJobCardDto.barcode());
        eJobCardDao.setJobStarted(vJobCardDto.jobStarted());
        eJobCardDao.setStartedTime(vJobCardDto.startedTime());
        eJobCardDao.setCurrentTime(vJobCardDto.currentTime());
        eJobCardDao.setAmendedFrom(vJobCardDto.amendedFrom());
        eJobCardDao.setUserTags(vJobCardDto.userTags());
        eJobCardDao.setComments(vJobCardDto.comments());
        eJobCardDao.setAssign(vJobCardDto.assign());
        eJobCardDao.setLikedBy(vJobCardDto.likedBy());
    }
}