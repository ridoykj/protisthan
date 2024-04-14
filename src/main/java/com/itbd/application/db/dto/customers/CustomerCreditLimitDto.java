package com.itbd.application.db.dto.customers;

import com.itbd.application.db.dao.customers.CustomerCreditLimitDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record CustomerCreditLimitDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String company,
        BigDecimal creditLimit,
        Boolean bypass,
        String parent,
        String parentField,
        String parentType
) {
    public static CustomerCreditLimitDto fromEntity(CustomerCreditLimitDao eCustomerCreditLimitDao) {
        return new CustomerCreditLimitDto(
                eCustomerCreditLimitDao.getName(),
                eCustomerCreditLimitDao.getCreation(),
                eCustomerCreditLimitDao.getModified(),
                eCustomerCreditLimitDao.getModifiedBy(),
                eCustomerCreditLimitDao.getOwner(),
                eCustomerCreditLimitDao.getIsDocStatus(),
                eCustomerCreditLimitDao.getIdx(),
                eCustomerCreditLimitDao.getCompany(),
                eCustomerCreditLimitDao.getCreditLimit(),
                eCustomerCreditLimitDao.getBypass(),
                eCustomerCreditLimitDao.getParent(),
                eCustomerCreditLimitDao.getParentField(),
                eCustomerCreditLimitDao.getParentType());
    }

    public static void fromDTO(CustomerCreditLimitDto vCustomerCreditLimitDto, CustomerCreditLimitDao eCustomerCreditLimitDao) {
        eCustomerCreditLimitDao.setName(vCustomerCreditLimitDto.name());
        eCustomerCreditLimitDao.setCreation(vCustomerCreditLimitDto.creation());
        eCustomerCreditLimitDao.setModified(vCustomerCreditLimitDto.modified());
        eCustomerCreditLimitDao.setModifiedBy(vCustomerCreditLimitDto.modifiedBy());
        eCustomerCreditLimitDao.setOwner(vCustomerCreditLimitDto.owner());
        eCustomerCreditLimitDao.setIsDocStatus(vCustomerCreditLimitDto.isDocStatus());
        eCustomerCreditLimitDao.setIdx(vCustomerCreditLimitDto.idx());
        eCustomerCreditLimitDao.setCompany(vCustomerCreditLimitDto.company());
        eCustomerCreditLimitDao.setCreditLimit(vCustomerCreditLimitDto.creditLimit());
        eCustomerCreditLimitDao.setBypass(vCustomerCreditLimitDto.bypass());
        eCustomerCreditLimitDao.setParent(vCustomerCreditLimitDto.parent());
        eCustomerCreditLimitDao.setParentField(vCustomerCreditLimitDto.parentField());
        eCustomerCreditLimitDao.setParentType(vCustomerCreditLimitDto.parentType());
    }
}