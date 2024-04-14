package com.itbd.application.db.dto;

import com.itbd.application.db.dao.BudgetAccountDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record BudgetAccountDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String account,
        BigDecimal budgetAmount,
        String parent,
        String parentField,
        String parentType
) {
    public static BudgetAccountDto fromEntity(BudgetAccountDao eBudgetAccountDao) {
        return new BudgetAccountDto(
                eBudgetAccountDao.getName(),
                eBudgetAccountDao.getCreation(),
                eBudgetAccountDao.getModified(),
                eBudgetAccountDao.getModifiedBy(),
                eBudgetAccountDao.getOwner(),
                eBudgetAccountDao.getIsDocStatus(),
                eBudgetAccountDao.getIdx(),
                eBudgetAccountDao.getAccount(),
                eBudgetAccountDao.getBudgetAmount(),
                eBudgetAccountDao.getParent(),
                eBudgetAccountDao.getParentField(),
                eBudgetAccountDao.getParentType());
    }

    public static void fromDTO(BudgetAccountDto vBudgetAccountDto, BudgetAccountDao eBudgetAccountDao) {
        eBudgetAccountDao.setName(vBudgetAccountDto.name());
        eBudgetAccountDao.setCreation(vBudgetAccountDto.creation());
        eBudgetAccountDao.setModified(vBudgetAccountDto.modified());
        eBudgetAccountDao.setModifiedBy(vBudgetAccountDto.modifiedBy());
        eBudgetAccountDao.setOwner(vBudgetAccountDto.owner());
        eBudgetAccountDao.setIsDocStatus(vBudgetAccountDto.isDocStatus());
        eBudgetAccountDao.setIdx(vBudgetAccountDto.idx());
        eBudgetAccountDao.setAccount(vBudgetAccountDto.account());
        eBudgetAccountDao.setBudgetAmount(vBudgetAccountDto.budgetAmount());
        eBudgetAccountDao.setParent(vBudgetAccountDto.parent());
        eBudgetAccountDao.setParentField(vBudgetAccountDto.parentField());
        eBudgetAccountDao.setParentType(vBudgetAccountDto.parentType());
    }
}