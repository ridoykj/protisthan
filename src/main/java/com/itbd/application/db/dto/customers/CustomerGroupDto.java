package com.itbd.application.db.dto.customers;

import com.itbd.application.db.dao.customers.CustomerGroupDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record CustomerGroupDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String customerGroupName,
        String parentCustomerGroup,
        Boolean isGroup,
        String defaultPriceList,
        String paymentTerms,
        Integer lft,
        Integer rgt,
        String oldParent,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static CustomerGroupDto fromEntity(CustomerGroupDao eCustomerGroupDao) {
        return new CustomerGroupDto(
                eCustomerGroupDao.getName(),
                eCustomerGroupDao.getCreation(),
                eCustomerGroupDao.getModified(),
                eCustomerGroupDao.getModifiedBy(),
                eCustomerGroupDao.getOwner(),
                eCustomerGroupDao.getIsDocStatus(),
                eCustomerGroupDao.getIdx(),
                eCustomerGroupDao.getCustomerGroupName(),
                eCustomerGroupDao.getParentCustomerGroup(),
                eCustomerGroupDao.getIsGroup(),
                eCustomerGroupDao.getDefaultPriceList(),
                eCustomerGroupDao.getPaymentTerms(),
                eCustomerGroupDao.getLft(),
                eCustomerGroupDao.getRgt(),
                eCustomerGroupDao.getOldParent(),
                eCustomerGroupDao.getUserTags(),
                eCustomerGroupDao.getComments(),
                eCustomerGroupDao.getAssign(),
                eCustomerGroupDao.getLikedBy());
    }

    public static void fromDTO(CustomerGroupDto vCustomerGroupDto, CustomerGroupDao eCustomerGroupDao) {
        eCustomerGroupDao.setName(vCustomerGroupDto.name());
        eCustomerGroupDao.setCreation(vCustomerGroupDto.creation());
        eCustomerGroupDao.setModified(vCustomerGroupDto.modified());
        eCustomerGroupDao.setModifiedBy(vCustomerGroupDto.modifiedBy());
        eCustomerGroupDao.setOwner(vCustomerGroupDto.owner());
        eCustomerGroupDao.setIsDocStatus(vCustomerGroupDto.isDocStatus());
        eCustomerGroupDao.setIdx(vCustomerGroupDto.idx());
        eCustomerGroupDao.setCustomerGroupName(vCustomerGroupDto.customerGroupName());
        eCustomerGroupDao.setParentCustomerGroup(vCustomerGroupDto.parentCustomerGroup());
        eCustomerGroupDao.setIsGroup(vCustomerGroupDto.isGroup());
        eCustomerGroupDao.setDefaultPriceList(vCustomerGroupDto.defaultPriceList());
        eCustomerGroupDao.setPaymentTerms(vCustomerGroupDto.paymentTerms());
        eCustomerGroupDao.setLft(vCustomerGroupDto.lft());
        eCustomerGroupDao.setRgt(vCustomerGroupDto.rgt());
        eCustomerGroupDao.setOldParent(vCustomerGroupDto.oldParent());
        eCustomerGroupDao.setUserTags(vCustomerGroupDto.userTags());
        eCustomerGroupDao.setComments(vCustomerGroupDto.comments());
        eCustomerGroupDao.setAssign(vCustomerGroupDto.assign());
        eCustomerGroupDao.setLikedBy(vCustomerGroupDto.likedBy());
    }
}