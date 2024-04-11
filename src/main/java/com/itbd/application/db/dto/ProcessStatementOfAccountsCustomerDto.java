package com.itbd.application.db.dto;

import com.itbd.application.db.dao.ProcessStatementOfAccountsCustomerDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ProcessStatementOfAccountsCustomerDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String customer,
        String customerName,
        String billingEmail,
        String primaryEmail,
        String parent,
        String parentField,
        String parentType
) {
    public static ProcessStatementOfAccountsCustomerDto fromEntity(ProcessStatementOfAccountsCustomerDao eProcessStatementOfAccountsCustomerDao) {
        return new ProcessStatementOfAccountsCustomerDto(
                eProcessStatementOfAccountsCustomerDao.getName(),
                eProcessStatementOfAccountsCustomerDao.getCreation(),
                eProcessStatementOfAccountsCustomerDao.getModified(),
                eProcessStatementOfAccountsCustomerDao.getModifiedBy(),
                eProcessStatementOfAccountsCustomerDao.getOwner(),
                eProcessStatementOfAccountsCustomerDao.getIsDocStatus(),
                eProcessStatementOfAccountsCustomerDao.getIdx(),
                eProcessStatementOfAccountsCustomerDao.getCustomer(),
                eProcessStatementOfAccountsCustomerDao.getCustomerName(),
                eProcessStatementOfAccountsCustomerDao.getBillingEmail(),
                eProcessStatementOfAccountsCustomerDao.getPrimaryEmail(),
                eProcessStatementOfAccountsCustomerDao.getParent(),
                eProcessStatementOfAccountsCustomerDao.getParentField(),
                eProcessStatementOfAccountsCustomerDao.getParentType());
    }

    public static void fromDTO(ProcessStatementOfAccountsCustomerDto vProcessStatementOfAccountsCustomerDto, ProcessStatementOfAccountsCustomerDao eProcessStatementOfAccountsCustomerDao) {
        eProcessStatementOfAccountsCustomerDao.setName(vProcessStatementOfAccountsCustomerDto.name());
        eProcessStatementOfAccountsCustomerDao.setCreation(vProcessStatementOfAccountsCustomerDto.creation());
        eProcessStatementOfAccountsCustomerDao.setModified(vProcessStatementOfAccountsCustomerDto.modified());
        eProcessStatementOfAccountsCustomerDao.setModifiedBy(vProcessStatementOfAccountsCustomerDto.modifiedBy());
        eProcessStatementOfAccountsCustomerDao.setOwner(vProcessStatementOfAccountsCustomerDto.owner());
        eProcessStatementOfAccountsCustomerDao.setIsDocStatus(vProcessStatementOfAccountsCustomerDto.isDocStatus());
        eProcessStatementOfAccountsCustomerDao.setIdx(vProcessStatementOfAccountsCustomerDto.idx());
        eProcessStatementOfAccountsCustomerDao.setCustomer(vProcessStatementOfAccountsCustomerDto.customer());
        eProcessStatementOfAccountsCustomerDao.setCustomerName(vProcessStatementOfAccountsCustomerDto.customerName());
        eProcessStatementOfAccountsCustomerDao.setBillingEmail(vProcessStatementOfAccountsCustomerDto.billingEmail());
        eProcessStatementOfAccountsCustomerDao.setPrimaryEmail(vProcessStatementOfAccountsCustomerDto.primaryEmail());
        eProcessStatementOfAccountsCustomerDao.setParent(vProcessStatementOfAccountsCustomerDto.parent());
        eProcessStatementOfAccountsCustomerDao.setParentField(vProcessStatementOfAccountsCustomerDto.parentField());
        eProcessStatementOfAccountsCustomerDao.setParentType(vProcessStatementOfAccountsCustomerDto.parentType());
    }
}