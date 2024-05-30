package com.itbd.application.db.dto.sales;

import com.itbd.application.db.dao.accounts.sales.SalesPartnerItemDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record SalesPartnerItemDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String salesPartner,
        String parent,
        String parentField,
        String parentType
) {
    public static SalesPartnerItemDto fromEntity(SalesPartnerItemDao eSalesPartnerItemDao) {
        return new SalesPartnerItemDto(
                eSalesPartnerItemDao.getName(),
                eSalesPartnerItemDao.getCreation(),
                eSalesPartnerItemDao.getModified(),
                eSalesPartnerItemDao.getModifiedBy(),
                eSalesPartnerItemDao.getOwner(),
                eSalesPartnerItemDao.getIsDocStatus(),
                eSalesPartnerItemDao.getIdx(),
                eSalesPartnerItemDao.getSalesPartner(),
                eSalesPartnerItemDao.getParent(),
                eSalesPartnerItemDao.getParentField(),
                eSalesPartnerItemDao.getParentType());
    }

    public static void fromDTO(SalesPartnerItemDto vSalesPartnerItemDto, SalesPartnerItemDao eSalesPartnerItemDao) {
        eSalesPartnerItemDao.setName(vSalesPartnerItemDto.name());
        eSalesPartnerItemDao.setCreation(vSalesPartnerItemDto.creation());
        eSalesPartnerItemDao.setModified(vSalesPartnerItemDto.modified());
        eSalesPartnerItemDao.setModifiedBy(vSalesPartnerItemDto.modifiedBy());
        eSalesPartnerItemDao.setOwner(vSalesPartnerItemDto.owner());
        eSalesPartnerItemDao.setIsDocStatus(vSalesPartnerItemDto.isDocStatus());
        eSalesPartnerItemDao.setIdx(vSalesPartnerItemDto.idx());
        eSalesPartnerItemDao.setSalesPartner(vSalesPartnerItemDto.salesPartner());
        eSalesPartnerItemDao.setParent(vSalesPartnerItemDto.parent());
        eSalesPartnerItemDao.setParentField(vSalesPartnerItemDto.parentField());
        eSalesPartnerItemDao.setParentType(vSalesPartnerItemDto.parentType());
    }
}