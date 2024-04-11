package com.itbd.application.db.dto.landedcost;

import com.itbd.application.db.dao.landedcost.LandedCostTaxesAndChargesDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record LandedCostTaxesAndChargesDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String expenseAccount,
        String accountCurrency,
        BigDecimal exchangeRate,
        String description,
        BigDecimal amount,
        BigDecimal baseAmount,
        String parent,
        String parentField,
        String parentType
) {
    public static LandedCostTaxesAndChargesDto fromEntity(LandedCostTaxesAndChargesDao eLandedCostTaxesAndChargesDao) {
        return new LandedCostTaxesAndChargesDto(
                eLandedCostTaxesAndChargesDao.getName(),
                eLandedCostTaxesAndChargesDao.getCreation(),
                eLandedCostTaxesAndChargesDao.getModified(),
                eLandedCostTaxesAndChargesDao.getModifiedBy(),
                eLandedCostTaxesAndChargesDao.getOwner(),
                eLandedCostTaxesAndChargesDao.getIsDocStatus(),
                eLandedCostTaxesAndChargesDao.getIdx(),
                eLandedCostTaxesAndChargesDao.getExpenseAccount(),
                eLandedCostTaxesAndChargesDao.getAccountCurrency(),
                eLandedCostTaxesAndChargesDao.getExchangeRate(),
                eLandedCostTaxesAndChargesDao.getDescription(),
                eLandedCostTaxesAndChargesDao.getAmount(),
                eLandedCostTaxesAndChargesDao.getBaseAmount(),
                eLandedCostTaxesAndChargesDao.getParent(),
                eLandedCostTaxesAndChargesDao.getParentField(),
                eLandedCostTaxesAndChargesDao.getParentType());
    }

    public static void fromDTO(LandedCostTaxesAndChargesDto vLandedCostTaxesAndChargesDto, LandedCostTaxesAndChargesDao eLandedCostTaxesAndChargesDao) {
        eLandedCostTaxesAndChargesDao.setName(vLandedCostTaxesAndChargesDto.name());
        eLandedCostTaxesAndChargesDao.setCreation(vLandedCostTaxesAndChargesDto.creation());
        eLandedCostTaxesAndChargesDao.setModified(vLandedCostTaxesAndChargesDto.modified());
        eLandedCostTaxesAndChargesDao.setModifiedBy(vLandedCostTaxesAndChargesDto.modifiedBy());
        eLandedCostTaxesAndChargesDao.setOwner(vLandedCostTaxesAndChargesDto.owner());
        eLandedCostTaxesAndChargesDao.setIsDocStatus(vLandedCostTaxesAndChargesDto.isDocStatus());
        eLandedCostTaxesAndChargesDao.setIdx(vLandedCostTaxesAndChargesDto.idx());
        eLandedCostTaxesAndChargesDao.setExpenseAccount(vLandedCostTaxesAndChargesDto.expenseAccount());
        eLandedCostTaxesAndChargesDao.setAccountCurrency(vLandedCostTaxesAndChargesDto.accountCurrency());
        eLandedCostTaxesAndChargesDao.setExchangeRate(vLandedCostTaxesAndChargesDto.exchangeRate());
        eLandedCostTaxesAndChargesDao.setDescription(vLandedCostTaxesAndChargesDto.description());
        eLandedCostTaxesAndChargesDao.setAmount(vLandedCostTaxesAndChargesDto.amount());
        eLandedCostTaxesAndChargesDao.setBaseAmount(vLandedCostTaxesAndChargesDto.baseAmount());
        eLandedCostTaxesAndChargesDao.setParent(vLandedCostTaxesAndChargesDto.parent());
        eLandedCostTaxesAndChargesDao.setParentField(vLandedCostTaxesAndChargesDto.parentField());
        eLandedCostTaxesAndChargesDao.setParentType(vLandedCostTaxesAndChargesDto.parentType());
    }
}