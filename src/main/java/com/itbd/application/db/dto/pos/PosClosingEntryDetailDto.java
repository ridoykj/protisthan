package com.itbd.application.db.dto.pos;

import com.itbd.application.db.dao.pos.PosClosingEntryDetailDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PosClosingEntryDetailDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String modeOfPayment,
        BigDecimal openingAmount,
        BigDecimal expectedAmount,
        BigDecimal closingAmount,
        BigDecimal difference,
        String parent,
        String parentField,
        String parentType
) {
    public static PosClosingEntryDetailDto fromEntity(PosClosingEntryDetailDao ePosClosingEntryDetailDao) {
        return new PosClosingEntryDetailDto(
                ePosClosingEntryDetailDao.getName(),
                ePosClosingEntryDetailDao.getCreation(),
                ePosClosingEntryDetailDao.getModified(),
                ePosClosingEntryDetailDao.getModifiedBy(),
                ePosClosingEntryDetailDao.getOwner(),
                ePosClosingEntryDetailDao.getIsDocStatus(),
                ePosClosingEntryDetailDao.getIdx(),
                ePosClosingEntryDetailDao.getModeOfPayment(),
                ePosClosingEntryDetailDao.getOpeningAmount(),
                ePosClosingEntryDetailDao.getExpectedAmount(),
                ePosClosingEntryDetailDao.getClosingAmount(),
                ePosClosingEntryDetailDao.getDifference(),
                ePosClosingEntryDetailDao.getParent(),
                ePosClosingEntryDetailDao.getParentField(),
                ePosClosingEntryDetailDao.getParentType());
    }

    public static void fromDTO(PosClosingEntryDetailDto vPosClosingEntryDetailDto, PosClosingEntryDetailDao ePosClosingEntryDetailDao) {
        ePosClosingEntryDetailDao.setName(vPosClosingEntryDetailDto.name());
        ePosClosingEntryDetailDao.setCreation(vPosClosingEntryDetailDto.creation());
        ePosClosingEntryDetailDao.setModified(vPosClosingEntryDetailDto.modified());
        ePosClosingEntryDetailDao.setModifiedBy(vPosClosingEntryDetailDto.modifiedBy());
        ePosClosingEntryDetailDao.setOwner(vPosClosingEntryDetailDto.owner());
        ePosClosingEntryDetailDao.setIsDocStatus(vPosClosingEntryDetailDto.isDocStatus());
        ePosClosingEntryDetailDao.setIdx(vPosClosingEntryDetailDto.idx());
        ePosClosingEntryDetailDao.setModeOfPayment(vPosClosingEntryDetailDto.modeOfPayment());
        ePosClosingEntryDetailDao.setOpeningAmount(vPosClosingEntryDetailDto.openingAmount());
        ePosClosingEntryDetailDao.setExpectedAmount(vPosClosingEntryDetailDto.expectedAmount());
        ePosClosingEntryDetailDao.setClosingAmount(vPosClosingEntryDetailDto.closingAmount());
        ePosClosingEntryDetailDao.setDifference(vPosClosingEntryDetailDto.difference());
        ePosClosingEntryDetailDao.setParent(vPosClosingEntryDetailDto.parent());
        ePosClosingEntryDetailDao.setParentField(vPosClosingEntryDetailDto.parentField());
        ePosClosingEntryDetailDao.setParentType(vPosClosingEntryDetailDto.parentType());
    }
}