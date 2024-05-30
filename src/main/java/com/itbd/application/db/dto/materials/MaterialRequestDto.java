package com.itbd.application.db.dto.materials;

import com.itbd.application.db.dao.stock.MaterialRequestDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record MaterialRequestDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String namingSeries,
        String title,
        String materialRequestType,
        String customer,
        String company,
        LocalDate transactionDate,
        LocalDate scheduleDate,
        String amendedFrom,
        String scanBarcode,
        String setFromWarehouse,
        String setWarehouse,
        String tcName,
        String terms,
        String status,
        BigDecimal perOrdered,
        String transferStatus,
        BigDecimal perReceived,
        String letterHead,
        String selectPrintHeading,
        String jobCard,
        String workOrder,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static MaterialRequestDto fromEntity(MaterialRequestDao eMaterialRequestDao) {
        return new MaterialRequestDto(
                eMaterialRequestDao.getName(),
                eMaterialRequestDao.getCreation(),
                eMaterialRequestDao.getModified(),
                eMaterialRequestDao.getModifiedBy(),
                eMaterialRequestDao.getOwner(),
                eMaterialRequestDao.getIsDocStatus(),
                eMaterialRequestDao.getIdx(),
                eMaterialRequestDao.getNamingSeries(),
                eMaterialRequestDao.getTitle(),
                eMaterialRequestDao.getMaterialRequestType(),
                eMaterialRequestDao.getCustomer(),
                eMaterialRequestDao.getCompany(),
                eMaterialRequestDao.getTransactionDate(),
                eMaterialRequestDao.getScheduleDate(),
                eMaterialRequestDao.getAmendedFrom(),
                eMaterialRequestDao.getScanBarcode(),
                eMaterialRequestDao.getSetFromWarehouse(),
                eMaterialRequestDao.getSetWarehouse(),
                eMaterialRequestDao.getTcName(),
                eMaterialRequestDao.getTerms(),
                eMaterialRequestDao.getStatus(),
                eMaterialRequestDao.getPerOrdered(),
                eMaterialRequestDao.getTransferStatus(),
                eMaterialRequestDao.getPerReceived(),
                eMaterialRequestDao.getLetterHead(),
                eMaterialRequestDao.getSelectPrintHeading(),
                eMaterialRequestDao.getJobCard(),
                eMaterialRequestDao.getWorkOrder(),
                eMaterialRequestDao.getUserTags(),
                eMaterialRequestDao.getComments(),
                eMaterialRequestDao.getAssign(),
                eMaterialRequestDao.getLikedBy());
    }

    public static void fromDTO(MaterialRequestDto vMaterialRequestDto, MaterialRequestDao eMaterialRequestDao) {
        eMaterialRequestDao.setName(vMaterialRequestDto.name());
        eMaterialRequestDao.setCreation(vMaterialRequestDto.creation());
        eMaterialRequestDao.setModified(vMaterialRequestDto.modified());
        eMaterialRequestDao.setModifiedBy(vMaterialRequestDto.modifiedBy());
        eMaterialRequestDao.setOwner(vMaterialRequestDto.owner());
        eMaterialRequestDao.setIsDocStatus(vMaterialRequestDto.isDocStatus());
        eMaterialRequestDao.setIdx(vMaterialRequestDto.idx());
        eMaterialRequestDao.setNamingSeries(vMaterialRequestDto.namingSeries());
        eMaterialRequestDao.setTitle(vMaterialRequestDto.title());
        eMaterialRequestDao.setMaterialRequestType(vMaterialRequestDto.materialRequestType());
        eMaterialRequestDao.setCustomer(vMaterialRequestDto.customer());
        eMaterialRequestDao.setCompany(vMaterialRequestDto.company());
        eMaterialRequestDao.setTransactionDate(vMaterialRequestDto.transactionDate());
        eMaterialRequestDao.setScheduleDate(vMaterialRequestDto.scheduleDate());
        eMaterialRequestDao.setAmendedFrom(vMaterialRequestDto.amendedFrom());
        eMaterialRequestDao.setScanBarcode(vMaterialRequestDto.scanBarcode());
        eMaterialRequestDao.setSetFromWarehouse(vMaterialRequestDto.setFromWarehouse());
        eMaterialRequestDao.setSetWarehouse(vMaterialRequestDto.setWarehouse());
        eMaterialRequestDao.setTcName(vMaterialRequestDto.tcName());
        eMaterialRequestDao.setTerms(vMaterialRequestDto.terms());
        eMaterialRequestDao.setStatus(vMaterialRequestDto.status());
        eMaterialRequestDao.setPerOrdered(vMaterialRequestDto.perOrdered());
        eMaterialRequestDao.setTransferStatus(vMaterialRequestDto.transferStatus());
        eMaterialRequestDao.setPerReceived(vMaterialRequestDto.perReceived());
        eMaterialRequestDao.setLetterHead(vMaterialRequestDto.letterHead());
        eMaterialRequestDao.setSelectPrintHeading(vMaterialRequestDto.selectPrintHeading());
        eMaterialRequestDao.setJobCard(vMaterialRequestDto.jobCard());
        eMaterialRequestDao.setWorkOrder(vMaterialRequestDto.workOrder());
        eMaterialRequestDao.setUserTags(vMaterialRequestDto.userTags());
        eMaterialRequestDao.setComments(vMaterialRequestDto.comments());
        eMaterialRequestDao.setAssign(vMaterialRequestDto.assign());
        eMaterialRequestDao.setLikedBy(vMaterialRequestDto.likedBy());
    }
}