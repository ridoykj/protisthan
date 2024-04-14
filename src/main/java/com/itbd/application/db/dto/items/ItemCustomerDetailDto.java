package com.itbd.application.db.dto.items;

import com.itbd.application.db.dao.items.ItemCustomerDetailDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ItemCustomerDetailDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String customerName,
        String customerGroup,
        String refCode,
        String parent,
        String parentField,
        String parentType
) {
    public static ItemCustomerDetailDto fromEntity(ItemCustomerDetailDao eItemCustomerDetailDao) {
        return new ItemCustomerDetailDto(
                eItemCustomerDetailDao.getName(),
                eItemCustomerDetailDao.getCreation(),
                eItemCustomerDetailDao.getModified(),
                eItemCustomerDetailDao.getModifiedBy(),
                eItemCustomerDetailDao.getOwner(),
                eItemCustomerDetailDao.getIsDocStatus(),
                eItemCustomerDetailDao.getIdx(),
                eItemCustomerDetailDao.getCustomerName(),
                eItemCustomerDetailDao.getCustomerGroup(),
                eItemCustomerDetailDao.getRefCode(),
                eItemCustomerDetailDao.getParent(),
                eItemCustomerDetailDao.getParentField(),
                eItemCustomerDetailDao.getParentType());
    }

    public static void fromDTO(ItemCustomerDetailDto vItemCustomerDetailDto, ItemCustomerDetailDao eItemCustomerDetailDao) {
        eItemCustomerDetailDao.setName(vItemCustomerDetailDto.name());
        eItemCustomerDetailDao.setCreation(vItemCustomerDetailDto.creation());
        eItemCustomerDetailDao.setModified(vItemCustomerDetailDto.modified());
        eItemCustomerDetailDao.setModifiedBy(vItemCustomerDetailDto.modifiedBy());
        eItemCustomerDetailDao.setOwner(vItemCustomerDetailDto.owner());
        eItemCustomerDetailDao.setIsDocStatus(vItemCustomerDetailDto.isDocStatus());
        eItemCustomerDetailDao.setIdx(vItemCustomerDetailDto.idx());
        eItemCustomerDetailDao.setCustomerName(vItemCustomerDetailDto.customerName());
        eItemCustomerDetailDao.setCustomerGroup(vItemCustomerDetailDto.customerGroup());
        eItemCustomerDetailDao.setRefCode(vItemCustomerDetailDto.refCode());
        eItemCustomerDetailDao.setParent(vItemCustomerDetailDto.parent());
        eItemCustomerDetailDao.setParentField(vItemCustomerDetailDto.parentField());
        eItemCustomerDetailDao.setParentType(vItemCustomerDetailDto.parentType());
    }
}