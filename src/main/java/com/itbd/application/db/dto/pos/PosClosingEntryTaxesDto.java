package com.itbd.application.db.dto.pos;

import com.itbd.application.db.dao.pos.PosClosingEntryTaxesDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PosClosingEntryTaxesDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String accountHead,
        BigDecimal rate,
        BigDecimal amount,
        String parent,
        String parentField,
        String parentType
) {
    public static PosClosingEntryTaxesDto fromEntity(PosClosingEntryTaxesDao ePosClosingEntryTaxesDao) {
        return new PosClosingEntryTaxesDto(
                ePosClosingEntryTaxesDao.getName(),
                ePosClosingEntryTaxesDao.getCreation(),
                ePosClosingEntryTaxesDao.getModified(),
                ePosClosingEntryTaxesDao.getModifiedBy(),
                ePosClosingEntryTaxesDao.getOwner(),
                ePosClosingEntryTaxesDao.getIsDocStatus(),
                ePosClosingEntryTaxesDao.getIdx(),
                ePosClosingEntryTaxesDao.getAccountHead(),
                ePosClosingEntryTaxesDao.getRate(),
                ePosClosingEntryTaxesDao.getAmount(),
                ePosClosingEntryTaxesDao.getParent(),
                ePosClosingEntryTaxesDao.getParentField(),
                ePosClosingEntryTaxesDao.getParentType());
    }

    public static void fromDTO(PosClosingEntryTaxesDto vPosClosingEntryTaxesDto, PosClosingEntryTaxesDao ePosClosingEntryTaxesDao) {
        ePosClosingEntryTaxesDao.setName(vPosClosingEntryTaxesDto.name());
        ePosClosingEntryTaxesDao.setCreation(vPosClosingEntryTaxesDto.creation());
        ePosClosingEntryTaxesDao.setModified(vPosClosingEntryTaxesDto.modified());
        ePosClosingEntryTaxesDao.setModifiedBy(vPosClosingEntryTaxesDto.modifiedBy());
        ePosClosingEntryTaxesDao.setOwner(vPosClosingEntryTaxesDto.owner());
        ePosClosingEntryTaxesDao.setIsDocStatus(vPosClosingEntryTaxesDto.isDocStatus());
        ePosClosingEntryTaxesDao.setIdx(vPosClosingEntryTaxesDto.idx());
        ePosClosingEntryTaxesDao.setAccountHead(vPosClosingEntryTaxesDto.accountHead());
        ePosClosingEntryTaxesDao.setRate(vPosClosingEntryTaxesDto.rate());
        ePosClosingEntryTaxesDao.setAmount(vPosClosingEntryTaxesDto.amount());
        ePosClosingEntryTaxesDao.setParent(vPosClosingEntryTaxesDto.parent());
        ePosClosingEntryTaxesDao.setParentField(vPosClosingEntryTaxesDto.parentField());
        ePosClosingEntryTaxesDao.setParentType(vPosClosingEntryTaxesDto.parentType());
    }
}