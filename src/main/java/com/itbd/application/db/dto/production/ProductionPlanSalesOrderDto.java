package com.itbd.application.db.dto.production;

import com.itbd.application.db.dao.production.ProductionPlanSalesOrderDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record ProductionPlanSalesOrderDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String salesOrder,
        LocalDate salesOrderDate,
        String customer,
        BigDecimal grandTotal,
        String parent,
        String parentField,
        String parentType
) {
    public static ProductionPlanSalesOrderDto fromEntity(ProductionPlanSalesOrderDao eProductionPlanSalesOrderDao) {
        return new ProductionPlanSalesOrderDto(
                eProductionPlanSalesOrderDao.getName(),
                eProductionPlanSalesOrderDao.getCreation(),
                eProductionPlanSalesOrderDao.getModified(),
                eProductionPlanSalesOrderDao.getModifiedBy(),
                eProductionPlanSalesOrderDao.getOwner(),
                eProductionPlanSalesOrderDao.getIsDocStatus(),
                eProductionPlanSalesOrderDao.getIdx(),
                eProductionPlanSalesOrderDao.getSalesOrder(),
                eProductionPlanSalesOrderDao.getSalesOrderDate(),
                eProductionPlanSalesOrderDao.getCustomer(),
                eProductionPlanSalesOrderDao.getGrandTotal(),
                eProductionPlanSalesOrderDao.getParent(),
                eProductionPlanSalesOrderDao.getParentField(),
                eProductionPlanSalesOrderDao.getParentType());
    }

    public static void fromDTO(ProductionPlanSalesOrderDto vProductionPlanSalesOrderDto, ProductionPlanSalesOrderDao eProductionPlanSalesOrderDao) {
        eProductionPlanSalesOrderDao.setName(vProductionPlanSalesOrderDto.name());
        eProductionPlanSalesOrderDao.setCreation(vProductionPlanSalesOrderDto.creation());
        eProductionPlanSalesOrderDao.setModified(vProductionPlanSalesOrderDto.modified());
        eProductionPlanSalesOrderDao.setModifiedBy(vProductionPlanSalesOrderDto.modifiedBy());
        eProductionPlanSalesOrderDao.setOwner(vProductionPlanSalesOrderDto.owner());
        eProductionPlanSalesOrderDao.setIsDocStatus(vProductionPlanSalesOrderDto.isDocStatus());
        eProductionPlanSalesOrderDao.setIdx(vProductionPlanSalesOrderDto.idx());
        eProductionPlanSalesOrderDao.setSalesOrder(vProductionPlanSalesOrderDto.salesOrder());
        eProductionPlanSalesOrderDao.setSalesOrderDate(vProductionPlanSalesOrderDto.salesOrderDate());
        eProductionPlanSalesOrderDao.setCustomer(vProductionPlanSalesOrderDto.customer());
        eProductionPlanSalesOrderDao.setGrandTotal(vProductionPlanSalesOrderDto.grandTotal());
        eProductionPlanSalesOrderDao.setParent(vProductionPlanSalesOrderDto.parent());
        eProductionPlanSalesOrderDao.setParentField(vProductionPlanSalesOrderDto.parentField());
        eProductionPlanSalesOrderDao.setParentType(vProductionPlanSalesOrderDto.parentType());
    }
}