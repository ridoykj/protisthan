package com.itbd.application.db.dto;

import com.itbd.application.db.dao.RequestForQuotationItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record RequestForQuotationItemDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String itemCode,
        String supplierPartNo,
        String itemName,
        LocalDate scheduleDate,
        String description,
        String itemGroup,
        String brand,
        String image,
        BigDecimal qty,
        String stockUom,
        String uom,
        BigDecimal conversionFactor,
        BigDecimal stockQty,
        String warehouse,
        String materialRequest,
        String materialRequestItem,
        String projectName,
        Boolean pageBreak,
        String parent,
        String parentField,
        String parentType
) {
    public static RequestForQuotationItemDto fromEntity(RequestForQuotationItemDao eRequestForQuotationItemDao) {
        return new RequestForQuotationItemDto(
                eRequestForQuotationItemDao.getName(),
                eRequestForQuotationItemDao.getCreation(),
                eRequestForQuotationItemDao.getModified(),
                eRequestForQuotationItemDao.getModifiedBy(),
                eRequestForQuotationItemDao.getOwner(),
                eRequestForQuotationItemDao.getIsDocStatus(),
                eRequestForQuotationItemDao.getIdx(),
                eRequestForQuotationItemDao.getItemCode(),
                eRequestForQuotationItemDao.getSupplierPartNo(),
                eRequestForQuotationItemDao.getItemName(),
                eRequestForQuotationItemDao.getScheduleDate(),
                eRequestForQuotationItemDao.getDescription(),
                eRequestForQuotationItemDao.getItemGroup(),
                eRequestForQuotationItemDao.getBrand(),
                eRequestForQuotationItemDao.getImage(),
                eRequestForQuotationItemDao.getQty(),
                eRequestForQuotationItemDao.getStockUom(),
                eRequestForQuotationItemDao.getUom(),
                eRequestForQuotationItemDao.getConversionFactor(),
                eRequestForQuotationItemDao.getStockQty(),
                eRequestForQuotationItemDao.getWarehouse(),
                eRequestForQuotationItemDao.getMaterialRequest(),
                eRequestForQuotationItemDao.getMaterialRequestItem(),
                eRequestForQuotationItemDao.getProjectName(),
                eRequestForQuotationItemDao.getPageBreak(),
                eRequestForQuotationItemDao.getParent(),
                eRequestForQuotationItemDao.getParentField(),
                eRequestForQuotationItemDao.getParentType());
    }

    public static void fromDTO(RequestForQuotationItemDto vRequestForQuotationItemDto, RequestForQuotationItemDao eRequestForQuotationItemDao) {
        eRequestForQuotationItemDao.setName(vRequestForQuotationItemDto.name());
        eRequestForQuotationItemDao.setCreation(vRequestForQuotationItemDto.creation());
        eRequestForQuotationItemDao.setModified(vRequestForQuotationItemDto.modified());
        eRequestForQuotationItemDao.setModifiedBy(vRequestForQuotationItemDto.modifiedBy());
        eRequestForQuotationItemDao.setOwner(vRequestForQuotationItemDto.owner());
        eRequestForQuotationItemDao.setIsDocStatus(vRequestForQuotationItemDto.isDocStatus());
        eRequestForQuotationItemDao.setIdx(vRequestForQuotationItemDto.idx());
        eRequestForQuotationItemDao.setItemCode(vRequestForQuotationItemDto.itemCode());
        eRequestForQuotationItemDao.setSupplierPartNo(vRequestForQuotationItemDto.supplierPartNo());
        eRequestForQuotationItemDao.setItemName(vRequestForQuotationItemDto.itemName());
        eRequestForQuotationItemDao.setScheduleDate(vRequestForQuotationItemDto.scheduleDate());
        eRequestForQuotationItemDao.setDescription(vRequestForQuotationItemDto.description());
        eRequestForQuotationItemDao.setItemGroup(vRequestForQuotationItemDto.itemGroup());
        eRequestForQuotationItemDao.setBrand(vRequestForQuotationItemDto.brand());
        eRequestForQuotationItemDao.setImage(vRequestForQuotationItemDto.image());
        eRequestForQuotationItemDao.setQty(vRequestForQuotationItemDto.qty());
        eRequestForQuotationItemDao.setStockUom(vRequestForQuotationItemDto.stockUom());
        eRequestForQuotationItemDao.setUom(vRequestForQuotationItemDto.uom());
        eRequestForQuotationItemDao.setConversionFactor(vRequestForQuotationItemDto.conversionFactor());
        eRequestForQuotationItemDao.setStockQty(vRequestForQuotationItemDto.stockQty());
        eRequestForQuotationItemDao.setWarehouse(vRequestForQuotationItemDto.warehouse());
        eRequestForQuotationItemDao.setMaterialRequest(vRequestForQuotationItemDto.materialRequest());
        eRequestForQuotationItemDao.setMaterialRequestItem(vRequestForQuotationItemDto.materialRequestItem());
        eRequestForQuotationItemDao.setProjectName(vRequestForQuotationItemDto.projectName());
        eRequestForQuotationItemDao.setPageBreak(vRequestForQuotationItemDto.pageBreak());
        eRequestForQuotationItemDao.setParent(vRequestForQuotationItemDto.parent());
        eRequestForQuotationItemDao.setParentField(vRequestForQuotationItemDto.parentField());
        eRequestForQuotationItemDao.setParentType(vRequestForQuotationItemDto.parentType());
    }
}