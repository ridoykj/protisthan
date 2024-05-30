package com.itbd.application.db.dto;

import com.itbd.application.db.dao.accounts.CashierClosingPaymentsDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record CashierClosingPaymentsDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String modeOfPayment,
        BigDecimal amount,
        String parent,
        String parentField,
        String parentType
) {
    public static CashierClosingPaymentsDto fromEntity(CashierClosingPaymentsDao eCashierClosingPaymentsDao) {
        return new CashierClosingPaymentsDto(
                eCashierClosingPaymentsDao.getName(),
                eCashierClosingPaymentsDao.getCreation(),
                eCashierClosingPaymentsDao.getModified(),
                eCashierClosingPaymentsDao.getModifiedBy(),
                eCashierClosingPaymentsDao.getOwner(),
                eCashierClosingPaymentsDao.getIsDocStatus(),
                eCashierClosingPaymentsDao.getIdx(),
                eCashierClosingPaymentsDao.getModeOfPayment(),
                eCashierClosingPaymentsDao.getAmount(),
                eCashierClosingPaymentsDao.getParent(),
                eCashierClosingPaymentsDao.getParentField(),
                eCashierClosingPaymentsDao.getParentType());
    }

    public static void fromDTO(CashierClosingPaymentsDto vCashierClosingPaymentsDto, CashierClosingPaymentsDao eCashierClosingPaymentsDao) {
        eCashierClosingPaymentsDao.setName(vCashierClosingPaymentsDto.name());
        eCashierClosingPaymentsDao.setCreation(vCashierClosingPaymentsDto.creation());
        eCashierClosingPaymentsDao.setModified(vCashierClosingPaymentsDto.modified());
        eCashierClosingPaymentsDao.setModifiedBy(vCashierClosingPaymentsDto.modifiedBy());
        eCashierClosingPaymentsDao.setOwner(vCashierClosingPaymentsDto.owner());
        eCashierClosingPaymentsDao.setIsDocStatus(vCashierClosingPaymentsDto.isDocStatus());
        eCashierClosingPaymentsDao.setIdx(vCashierClosingPaymentsDto.idx());
        eCashierClosingPaymentsDao.setModeOfPayment(vCashierClosingPaymentsDto.modeOfPayment());
        eCashierClosingPaymentsDao.setAmount(vCashierClosingPaymentsDto.amount());
        eCashierClosingPaymentsDao.setParent(vCashierClosingPaymentsDto.parent());
        eCashierClosingPaymentsDao.setParentField(vCashierClosingPaymentsDto.parentField());
        eCashierClosingPaymentsDao.setParentType(vCashierClosingPaymentsDto.parentType());
    }
}