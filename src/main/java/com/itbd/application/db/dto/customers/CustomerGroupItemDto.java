package com.itbd.application.db.dto.customers;

import com.itbd.application.db.dao.customers.CustomerGroupItemDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record CustomerGroupItemDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String customerGroup,
        String parent,
        String parentField,
        String parentType
) {
    public static CustomerGroupItemDto fromEntity(CustomerGroupItemDao eCustomerGroupItemDao) {
        return new CustomerGroupItemDto(
                eCustomerGroupItemDao.getName(),
                eCustomerGroupItemDao.getCreation(),
                eCustomerGroupItemDao.getModified(),
                eCustomerGroupItemDao.getModifiedBy(),
                eCustomerGroupItemDao.getOwner(),
                eCustomerGroupItemDao.getIsDocStatus(),
                eCustomerGroupItemDao.getIdx(),
                eCustomerGroupItemDao.getCustomerGroup(),
                eCustomerGroupItemDao.getParent(),
                eCustomerGroupItemDao.getParentField(),
                eCustomerGroupItemDao.getParentType());
    }

    public static void fromDTO(CustomerGroupItemDto vCustomerGroupItemDto, CustomerGroupItemDao eCustomerGroupItemDao) {
        eCustomerGroupItemDao.setName(vCustomerGroupItemDto.name());
        eCustomerGroupItemDao.setCreation(vCustomerGroupItemDto.creation());
        eCustomerGroupItemDao.setModified(vCustomerGroupItemDto.modified());
        eCustomerGroupItemDao.setModifiedBy(vCustomerGroupItemDto.modifiedBy());
        eCustomerGroupItemDao.setOwner(vCustomerGroupItemDto.owner());
        eCustomerGroupItemDao.setIsDocStatus(vCustomerGroupItemDto.isDocStatus());
        eCustomerGroupItemDao.setIdx(vCustomerGroupItemDto.idx());
        eCustomerGroupItemDao.setCustomerGroup(vCustomerGroupItemDto.customerGroup());
        eCustomerGroupItemDao.setParent(vCustomerGroupItemDto.parent());
        eCustomerGroupItemDao.setParentField(vCustomerGroupItemDto.parentField());
        eCustomerGroupItemDao.setParentType(vCustomerGroupItemDto.parentType());
    }
}