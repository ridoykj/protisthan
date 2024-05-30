package com.itbd.application.db.dto.sales;

import com.itbd.application.db.dao.setup.SalesPersonDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record SalesPersonDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String salesPersonName,
        String parentSalesPerson,
        String commissionRate,
        Boolean isGroup,
        Boolean enabled,
        String employee,
        String department,
        Integer lft,
        Integer rgt,
        String oldParent,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static SalesPersonDto fromEntity(SalesPersonDao eSalesPersonDao) {
        return new SalesPersonDto(
                eSalesPersonDao.getName(),
                eSalesPersonDao.getCreation(),
                eSalesPersonDao.getModified(),
                eSalesPersonDao.getModifiedBy(),
                eSalesPersonDao.getOwner(),
                eSalesPersonDao.getIsDocStatus(),
                eSalesPersonDao.getIdx(),
                eSalesPersonDao.getSalesPersonName(),
                eSalesPersonDao.getParentSalesPerson(),
                eSalesPersonDao.getCommissionRate(),
                eSalesPersonDao.getIsGroup(),
                eSalesPersonDao.getEnabled(),
                eSalesPersonDao.getEmployee(),
                eSalesPersonDao.getDepartment(),
                eSalesPersonDao.getLft(),
                eSalesPersonDao.getRgt(),
                eSalesPersonDao.getOldParent(),
                eSalesPersonDao.getUserTags(),
                eSalesPersonDao.getComments(),
                eSalesPersonDao.getAssign(),
                eSalesPersonDao.getLikedBy());
    }

    public static void fromDTO(SalesPersonDto vSalesPersonDto, SalesPersonDao eSalesPersonDao) {
        eSalesPersonDao.setName(vSalesPersonDto.name());
        eSalesPersonDao.setCreation(vSalesPersonDto.creation());
        eSalesPersonDao.setModified(vSalesPersonDto.modified());
        eSalesPersonDao.setModifiedBy(vSalesPersonDto.modifiedBy());
        eSalesPersonDao.setOwner(vSalesPersonDto.owner());
        eSalesPersonDao.setIsDocStatus(vSalesPersonDto.isDocStatus());
        eSalesPersonDao.setIdx(vSalesPersonDto.idx());
        eSalesPersonDao.setSalesPersonName(vSalesPersonDto.salesPersonName());
        eSalesPersonDao.setParentSalesPerson(vSalesPersonDto.parentSalesPerson());
        eSalesPersonDao.setCommissionRate(vSalesPersonDto.commissionRate());
        eSalesPersonDao.setIsGroup(vSalesPersonDto.isGroup());
        eSalesPersonDao.setEnabled(vSalesPersonDto.enabled());
        eSalesPersonDao.setEmployee(vSalesPersonDto.employee());
        eSalesPersonDao.setDepartment(vSalesPersonDto.department());
        eSalesPersonDao.setLft(vSalesPersonDto.lft());
        eSalesPersonDao.setRgt(vSalesPersonDto.rgt());
        eSalesPersonDao.setOldParent(vSalesPersonDto.oldParent());
        eSalesPersonDao.setUserTags(vSalesPersonDto.userTags());
        eSalesPersonDao.setComments(vSalesPersonDto.comments());
        eSalesPersonDao.setAssign(vSalesPersonDto.assign());
        eSalesPersonDao.setLikedBy(vSalesPersonDto.likedBy());
    }
}