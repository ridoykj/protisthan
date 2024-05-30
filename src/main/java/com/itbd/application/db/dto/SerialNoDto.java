package com.itbd.application.db.dto;

import com.itbd.application.db.dao.stock.SerialNoDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record SerialNoDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String serialNo,
        String itemCode,
        String batchNo,
        String warehouse,
        BigDecimal purchaseRate,
        String status,
        String itemName,
        String description,
        String itemGroup,
        String brand,
        String asset,
        String assetStatus,
        String location,
        String employee,
        LocalDate warrantyExpiryDate,
        LocalDate amcExpiryDate,
        String maintenanceStatus,
        Integer warrantyPeriod,
        String company,
        String workOrder,
        String purchaseDocumentNo,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static SerialNoDto fromEntity(SerialNoDao eSerialNoDao) {
        return new SerialNoDto(
                eSerialNoDao.getName(),
                eSerialNoDao.getCreation(),
                eSerialNoDao.getModified(),
                eSerialNoDao.getModifiedBy(),
                eSerialNoDao.getOwner(),
                eSerialNoDao.getIsDocStatus(),
                eSerialNoDao.getIdx(),
                eSerialNoDao.getSerialNo(),
                eSerialNoDao.getItemCode(),
                eSerialNoDao.getBatchNo(),
                eSerialNoDao.getWarehouse(),
                eSerialNoDao.getPurchaseRate(),
                eSerialNoDao.getStatus(),
                eSerialNoDao.getItemName(),
                eSerialNoDao.getDescription(),
                eSerialNoDao.getItemGroup(),
                eSerialNoDao.getBrand(),
                eSerialNoDao.getAsset(),
                eSerialNoDao.getAssetStatus(),
                eSerialNoDao.getLocation(),
                eSerialNoDao.getEmployee(),
                eSerialNoDao.getWarrantyExpiryDate(),
                eSerialNoDao.getAmcExpiryDate(),
                eSerialNoDao.getMaintenanceStatus(),
                eSerialNoDao.getWarrantyPeriod(),
                eSerialNoDao.getCompany(),
                eSerialNoDao.getWorkOrder(),
                eSerialNoDao.getPurchaseDocumentNo(),
                eSerialNoDao.getUserTags(),
                eSerialNoDao.getComments(),
                eSerialNoDao.getAssign(),
                eSerialNoDao.getLikedBy());
    }

    public static void fromDTO(SerialNoDto vSerialNoDto, SerialNoDao eSerialNoDao) {
        eSerialNoDao.setName(vSerialNoDto.name());
        eSerialNoDao.setCreation(vSerialNoDto.creation());
        eSerialNoDao.setModified(vSerialNoDto.modified());
        eSerialNoDao.setModifiedBy(vSerialNoDto.modifiedBy());
        eSerialNoDao.setOwner(vSerialNoDto.owner());
        eSerialNoDao.setIsDocStatus(vSerialNoDto.isDocStatus());
        eSerialNoDao.setIdx(vSerialNoDto.idx());
        eSerialNoDao.setSerialNo(vSerialNoDto.serialNo());
        eSerialNoDao.setItemCode(vSerialNoDto.itemCode());
        eSerialNoDao.setBatchNo(vSerialNoDto.batchNo());
        eSerialNoDao.setWarehouse(vSerialNoDto.warehouse());
        eSerialNoDao.setPurchaseRate(vSerialNoDto.purchaseRate());
        eSerialNoDao.setStatus(vSerialNoDto.status());
        eSerialNoDao.setItemName(vSerialNoDto.itemName());
        eSerialNoDao.setDescription(vSerialNoDto.description());
        eSerialNoDao.setItemGroup(vSerialNoDto.itemGroup());
        eSerialNoDao.setBrand(vSerialNoDto.brand());
        eSerialNoDao.setAsset(vSerialNoDto.asset());
        eSerialNoDao.setAssetStatus(vSerialNoDto.assetStatus());
        eSerialNoDao.setLocation(vSerialNoDto.location());
        eSerialNoDao.setEmployee(vSerialNoDto.employee());
        eSerialNoDao.setWarrantyExpiryDate(vSerialNoDto.warrantyExpiryDate());
        eSerialNoDao.setAmcExpiryDate(vSerialNoDto.amcExpiryDate());
        eSerialNoDao.setMaintenanceStatus(vSerialNoDto.maintenanceStatus());
        eSerialNoDao.setWarrantyPeriod(vSerialNoDto.warrantyPeriod());
        eSerialNoDao.setCompany(vSerialNoDto.company());
        eSerialNoDao.setWorkOrder(vSerialNoDto.workOrder());
        eSerialNoDao.setPurchaseDocumentNo(vSerialNoDto.purchaseDocumentNo());
        eSerialNoDao.setUserTags(vSerialNoDto.userTags());
        eSerialNoDao.setComments(vSerialNoDto.comments());
        eSerialNoDao.setAssign(vSerialNoDto.assign());
        eSerialNoDao.setLikedBy(vSerialNoDto.likedBy());
    }
}