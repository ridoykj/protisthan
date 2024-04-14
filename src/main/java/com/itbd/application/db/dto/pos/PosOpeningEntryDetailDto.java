package com.itbd.application.db.dto.pos;

import com.itbd.application.db.dao.pos.PosOpeningEntryDetailDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PosOpeningEntryDetailDto(
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
        String parent,
        String parentField,
        String parentType
) {
    public static PosOpeningEntryDetailDto fromEntity(PosOpeningEntryDetailDao ePosOpeningEntryDetailDao) {
        return new PosOpeningEntryDetailDto(
                ePosOpeningEntryDetailDao.getName(),
                ePosOpeningEntryDetailDao.getCreation(),
                ePosOpeningEntryDetailDao.getModified(),
                ePosOpeningEntryDetailDao.getModifiedBy(),
                ePosOpeningEntryDetailDao.getOwner(),
                ePosOpeningEntryDetailDao.getIsDocStatus(),
                ePosOpeningEntryDetailDao.getIdx(),
                ePosOpeningEntryDetailDao.getModeOfPayment(),
                ePosOpeningEntryDetailDao.getOpeningAmount(),
                ePosOpeningEntryDetailDao.getParent(),
                ePosOpeningEntryDetailDao.getParentField(),
                ePosOpeningEntryDetailDao.getParentType());
    }

    public static void fromDTO(PosOpeningEntryDetailDto vPosOpeningEntryDetailDto, PosOpeningEntryDetailDao ePosOpeningEntryDetailDao) {
        ePosOpeningEntryDetailDao.setName(vPosOpeningEntryDetailDto.name());
        ePosOpeningEntryDetailDao.setCreation(vPosOpeningEntryDetailDto.creation());
        ePosOpeningEntryDetailDao.setModified(vPosOpeningEntryDetailDto.modified());
        ePosOpeningEntryDetailDao.setModifiedBy(vPosOpeningEntryDetailDto.modifiedBy());
        ePosOpeningEntryDetailDao.setOwner(vPosOpeningEntryDetailDto.owner());
        ePosOpeningEntryDetailDao.setIsDocStatus(vPosOpeningEntryDetailDto.isDocStatus());
        ePosOpeningEntryDetailDao.setIdx(vPosOpeningEntryDetailDto.idx());
        ePosOpeningEntryDetailDao.setModeOfPayment(vPosOpeningEntryDetailDto.modeOfPayment());
        ePosOpeningEntryDetailDao.setOpeningAmount(vPosOpeningEntryDetailDto.openingAmount());
        ePosOpeningEntryDetailDao.setParent(vPosOpeningEntryDetailDto.parent());
        ePosOpeningEntryDetailDao.setParentField(vPosOpeningEntryDetailDto.parentField());
        ePosOpeningEntryDetailDao.setParentType(vPosOpeningEntryDetailDto.parentType());
    }
}