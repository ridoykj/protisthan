package com.itbd.application.db.dto.customers;

import com.itbd.application.db.dao.accounts.CustomerItemDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record CustomerItemDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String customer,
        String parent,
        String parentField,
        String parentType
) {
    public static CustomerItemDto fromEntity(CustomerItemDao eCustomerItemDao) {
        return new CustomerItemDto(
                eCustomerItemDao.getName(),
                eCustomerItemDao.getCreation(),
                eCustomerItemDao.getModified(),
                eCustomerItemDao.getModifiedBy(),
                eCustomerItemDao.getOwner(),
                eCustomerItemDao.getIsDocStatus(),
                eCustomerItemDao.getIdx(),
                eCustomerItemDao.getCustomer(),
                eCustomerItemDao.getParent(),
                eCustomerItemDao.getParentField(),
                eCustomerItemDao.getParentType());
    }

    public static void fromDTO(CustomerItemDto vCustomerItemDto, CustomerItemDao eCustomerItemDao) {
        eCustomerItemDao.setName(vCustomerItemDto.name());
        eCustomerItemDao.setCreation(vCustomerItemDto.creation());
        eCustomerItemDao.setModified(vCustomerItemDto.modified());
        eCustomerItemDao.setModifiedBy(vCustomerItemDto.modifiedBy());
        eCustomerItemDao.setOwner(vCustomerItemDto.owner());
        eCustomerItemDao.setIsDocStatus(vCustomerItemDto.isDocStatus());
        eCustomerItemDao.setIdx(vCustomerItemDto.idx());
        eCustomerItemDao.setCustomer(vCustomerItemDto.customer());
        eCustomerItemDao.setParent(vCustomerItemDto.parent());
        eCustomerItemDao.setParentField(vCustomerItemDto.parentField());
        eCustomerItemDao.setParentType(vCustomerItemDto.parentType());
    }
}