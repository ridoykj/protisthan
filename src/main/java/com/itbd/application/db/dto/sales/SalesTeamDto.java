package com.itbd.application.db.dto.sales;

import com.itbd.application.db.dao.sales.SalesTeamDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record SalesTeamDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String salesPerson,
        String contactNo,
        BigDecimal allocatedPercentage,
        BigDecimal allocatedAmount,
        String commissionRate,
        BigDecimal incentives,
        String parent,
        String parentField,
        String parentType
) {
    public static SalesTeamDto fromEntity(SalesTeamDao eSalesTeamDao) {
        return new SalesTeamDto(
                eSalesTeamDao.getName(),
                eSalesTeamDao.getCreation(),
                eSalesTeamDao.getModified(),
                eSalesTeamDao.getModifiedBy(),
                eSalesTeamDao.getOwner(),
                eSalesTeamDao.getIsDocStatus(),
                eSalesTeamDao.getIdx(),
                eSalesTeamDao.getSalesPerson(),
                eSalesTeamDao.getContactNo(),
                eSalesTeamDao.getAllocatedPercentage(),
                eSalesTeamDao.getAllocatedAmount(),
                eSalesTeamDao.getCommissionRate(),
                eSalesTeamDao.getIncentives(),
                eSalesTeamDao.getParent(),
                eSalesTeamDao.getParentField(),
                eSalesTeamDao.getParentType());
    }

    public static void fromDTO(SalesTeamDto vSalesTeamDto, SalesTeamDao eSalesTeamDao) {
        eSalesTeamDao.setName(vSalesTeamDto.name());
        eSalesTeamDao.setCreation(vSalesTeamDto.creation());
        eSalesTeamDao.setModified(vSalesTeamDto.modified());
        eSalesTeamDao.setModifiedBy(vSalesTeamDto.modifiedBy());
        eSalesTeamDao.setOwner(vSalesTeamDto.owner());
        eSalesTeamDao.setIsDocStatus(vSalesTeamDto.isDocStatus());
        eSalesTeamDao.setIdx(vSalesTeamDto.idx());
        eSalesTeamDao.setSalesPerson(vSalesTeamDto.salesPerson());
        eSalesTeamDao.setContactNo(vSalesTeamDto.contactNo());
        eSalesTeamDao.setAllocatedPercentage(vSalesTeamDto.allocatedPercentage());
        eSalesTeamDao.setAllocatedAmount(vSalesTeamDto.allocatedAmount());
        eSalesTeamDao.setCommissionRate(vSalesTeamDto.commissionRate());
        eSalesTeamDao.setIncentives(vSalesTeamDto.incentives());
        eSalesTeamDao.setParent(vSalesTeamDto.parent());
        eSalesTeamDao.setParentField(vSalesTeamDto.parentField());
        eSalesTeamDao.setParentType(vSalesTeamDto.parentType());
    }
}