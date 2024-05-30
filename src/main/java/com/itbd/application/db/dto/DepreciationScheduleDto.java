package com.itbd.application.db.dto;

import com.itbd.application.db.dao.assets.DepreciationScheduleDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record DepreciationScheduleDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        LocalDate scheduleDate,
        BigDecimal depreciationAmount,
        BigDecimal accumulatedDepreciationAmount,
        String journalEntry,
        String shift,
        String parent,
        String parentField,
        String parentType
) {
    public static DepreciationScheduleDto fromEntity(DepreciationScheduleDao eDepreciationScheduleDao) {
        return new DepreciationScheduleDto(
                eDepreciationScheduleDao.getName(),
                eDepreciationScheduleDao.getCreation(),
                eDepreciationScheduleDao.getModified(),
                eDepreciationScheduleDao.getModifiedBy(),
                eDepreciationScheduleDao.getOwner(),
                eDepreciationScheduleDao.getIsDocStatus(),
                eDepreciationScheduleDao.getIdx(),
                eDepreciationScheduleDao.getScheduleDate(),
                eDepreciationScheduleDao.getDepreciationAmount(),
                eDepreciationScheduleDao.getAccumulatedDepreciationAmount(),
                eDepreciationScheduleDao.getJournalEntry(),
                eDepreciationScheduleDao.getShift(),
                eDepreciationScheduleDao.getParent(),
                eDepreciationScheduleDao.getParentField(),
                eDepreciationScheduleDao.getParentType());
    }

    public static void fromDTO(DepreciationScheduleDto vDepreciationScheduleDto, DepreciationScheduleDao eDepreciationScheduleDao) {
        eDepreciationScheduleDao.setName(vDepreciationScheduleDto.name());
        eDepreciationScheduleDao.setCreation(vDepreciationScheduleDto.creation());
        eDepreciationScheduleDao.setModified(vDepreciationScheduleDto.modified());
        eDepreciationScheduleDao.setModifiedBy(vDepreciationScheduleDto.modifiedBy());
        eDepreciationScheduleDao.setOwner(vDepreciationScheduleDto.owner());
        eDepreciationScheduleDao.setIsDocStatus(vDepreciationScheduleDto.isDocStatus());
        eDepreciationScheduleDao.setIdx(vDepreciationScheduleDto.idx());
        eDepreciationScheduleDao.setScheduleDate(vDepreciationScheduleDto.scheduleDate());
        eDepreciationScheduleDao.setDepreciationAmount(vDepreciationScheduleDto.depreciationAmount());
        eDepreciationScheduleDao.setAccumulatedDepreciationAmount(vDepreciationScheduleDto.accumulatedDepreciationAmount());
        eDepreciationScheduleDao.setJournalEntry(vDepreciationScheduleDto.journalEntry());
        eDepreciationScheduleDao.setShift(vDepreciationScheduleDto.shift());
        eDepreciationScheduleDao.setParent(vDepreciationScheduleDto.parent());
        eDepreciationScheduleDao.setParentField(vDepreciationScheduleDto.parentField());
        eDepreciationScheduleDao.setParentType(vDepreciationScheduleDto.parentType());
    }
}