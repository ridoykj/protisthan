package com.itbd.application.db.dto.qualitys;

import com.itbd.application.db.dao.qualitys.QualityInspectionDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record QualityInspectionDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String namingSeries,
        LocalDate reportDate,
        String status,
        Boolean manualInspection,
        String inspectionType,
        String referenceType,
        String referenceName,
        String itemCode,
        String itemSerialNo,
        String batchNo,
        BigDecimal sampleSize,
        String itemName,
        String description,
        String bomNo,
        String qualityInspectionTemplate,
        String inspectedBy,
        String verifiedBy,
        String remarks,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static QualityInspectionDto fromEntity(QualityInspectionDao eQualityInspectionDao) {
        return new QualityInspectionDto(
                eQualityInspectionDao.getName(),
                eQualityInspectionDao.getCreation(),
                eQualityInspectionDao.getModified(),
                eQualityInspectionDao.getModifiedBy(),
                eQualityInspectionDao.getOwner(),
                eQualityInspectionDao.getIsDocStatus(),
                eQualityInspectionDao.getIdx(),
                eQualityInspectionDao.getNamingSeries(),
                eQualityInspectionDao.getReportDate(),
                eQualityInspectionDao.getStatus(),
                eQualityInspectionDao.getManualInspection(),
                eQualityInspectionDao.getInspectionType(),
                eQualityInspectionDao.getReferenceType(),
                eQualityInspectionDao.getReferenceName(),
                eQualityInspectionDao.getItemCode(),
                eQualityInspectionDao.getItemSerialNo(),
                eQualityInspectionDao.getBatchNo(),
                eQualityInspectionDao.getSampleSize(),
                eQualityInspectionDao.getItemName(),
                eQualityInspectionDao.getDescription(),
                eQualityInspectionDao.getBomNo(),
                eQualityInspectionDao.getQualityInspectionTemplate(),
                eQualityInspectionDao.getInspectedBy(),
                eQualityInspectionDao.getVerifiedBy(),
                eQualityInspectionDao.getRemarks(),
                eQualityInspectionDao.getAmendedFrom(),
                eQualityInspectionDao.getUserTags(),
                eQualityInspectionDao.getComments(),
                eQualityInspectionDao.getAssign(),
                eQualityInspectionDao.getLikedBy());
    }

    public static void fromDTO(QualityInspectionDto vQualityInspectionDto, QualityInspectionDao eQualityInspectionDao) {
        eQualityInspectionDao.setName(vQualityInspectionDto.name());
        eQualityInspectionDao.setCreation(vQualityInspectionDto.creation());
        eQualityInspectionDao.setModified(vQualityInspectionDto.modified());
        eQualityInspectionDao.setModifiedBy(vQualityInspectionDto.modifiedBy());
        eQualityInspectionDao.setOwner(vQualityInspectionDto.owner());
        eQualityInspectionDao.setIsDocStatus(vQualityInspectionDto.isDocStatus());
        eQualityInspectionDao.setIdx(vQualityInspectionDto.idx());
        eQualityInspectionDao.setNamingSeries(vQualityInspectionDto.namingSeries());
        eQualityInspectionDao.setReportDate(vQualityInspectionDto.reportDate());
        eQualityInspectionDao.setStatus(vQualityInspectionDto.status());
        eQualityInspectionDao.setManualInspection(vQualityInspectionDto.manualInspection());
        eQualityInspectionDao.setInspectionType(vQualityInspectionDto.inspectionType());
        eQualityInspectionDao.setReferenceType(vQualityInspectionDto.referenceType());
        eQualityInspectionDao.setReferenceName(vQualityInspectionDto.referenceName());
        eQualityInspectionDao.setItemCode(vQualityInspectionDto.itemCode());
        eQualityInspectionDao.setItemSerialNo(vQualityInspectionDto.itemSerialNo());
        eQualityInspectionDao.setBatchNo(vQualityInspectionDto.batchNo());
        eQualityInspectionDao.setSampleSize(vQualityInspectionDto.sampleSize());
        eQualityInspectionDao.setItemName(vQualityInspectionDto.itemName());
        eQualityInspectionDao.setDescription(vQualityInspectionDto.description());
        eQualityInspectionDao.setBomNo(vQualityInspectionDto.bomNo());
        eQualityInspectionDao.setQualityInspectionTemplate(vQualityInspectionDto.qualityInspectionTemplate());
        eQualityInspectionDao.setInspectedBy(vQualityInspectionDto.inspectedBy());
        eQualityInspectionDao.setVerifiedBy(vQualityInspectionDto.verifiedBy());
        eQualityInspectionDao.setRemarks(vQualityInspectionDto.remarks());
        eQualityInspectionDao.setAmendedFrom(vQualityInspectionDto.amendedFrom());
        eQualityInspectionDao.setUserTags(vQualityInspectionDto.userTags());
        eQualityInspectionDao.setComments(vQualityInspectionDto.comments());
        eQualityInspectionDao.setAssign(vQualityInspectionDto.assign());
        eQualityInspectionDao.setLikedBy(vQualityInspectionDto.likedBy());
    }
}