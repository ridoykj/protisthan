package com.itbd.application.db.dto.pos;

import com.itbd.application.db.dao.pos.PosClosingEntryDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public record PosClosingEntryDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        LocalDateTime periodStartDate,
        LocalDateTime periodEndDate,
        LocalDate postingDate,
        LocalTime postingTime,
        String posOpeningEntry,
        String status,
        String company,
        String posProfile,
        String user,
        BigDecimal grandTotal,
        BigDecimal netTotal,
        BigDecimal totalQuantity,
        String errorMessage,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static PosClosingEntryDto fromEntity(PosClosingEntryDao ePosClosingEntryDao) {
        return new PosClosingEntryDto(
                ePosClosingEntryDao.getName(),
                ePosClosingEntryDao.getCreation(),
                ePosClosingEntryDao.getModified(),
                ePosClosingEntryDao.getModifiedBy(),
                ePosClosingEntryDao.getOwner(),
                ePosClosingEntryDao.getIsDocStatus(),
                ePosClosingEntryDao.getIdx(),
                ePosClosingEntryDao.getPeriodStartDate(),
                ePosClosingEntryDao.getPeriodEndDate(),
                ePosClosingEntryDao.getPostingDate(),
                ePosClosingEntryDao.getPostingTime(),
                ePosClosingEntryDao.getPosOpeningEntry(),
                ePosClosingEntryDao.getStatus(),
                ePosClosingEntryDao.getCompany(),
                ePosClosingEntryDao.getPosProfile(),
                ePosClosingEntryDao.getUser(),
                ePosClosingEntryDao.getGrandTotal(),
                ePosClosingEntryDao.getNetTotal(),
                ePosClosingEntryDao.getTotalQuantity(),
                ePosClosingEntryDao.getErrorMessage(),
                ePosClosingEntryDao.getAmendedFrom(),
                ePosClosingEntryDao.getUserTags(),
                ePosClosingEntryDao.getComments(),
                ePosClosingEntryDao.getAssign(),
                ePosClosingEntryDao.getLikedBy());
    }

    public static void fromDTO(PosClosingEntryDto vPosClosingEntryDto, PosClosingEntryDao ePosClosingEntryDao) {
        ePosClosingEntryDao.setName(vPosClosingEntryDto.name());
        ePosClosingEntryDao.setCreation(vPosClosingEntryDto.creation());
        ePosClosingEntryDao.setModified(vPosClosingEntryDto.modified());
        ePosClosingEntryDao.setModifiedBy(vPosClosingEntryDto.modifiedBy());
        ePosClosingEntryDao.setOwner(vPosClosingEntryDto.owner());
        ePosClosingEntryDao.setIsDocStatus(vPosClosingEntryDto.isDocStatus());
        ePosClosingEntryDao.setIdx(vPosClosingEntryDto.idx());
        ePosClosingEntryDao.setPeriodStartDate(vPosClosingEntryDto.periodStartDate());
        ePosClosingEntryDao.setPeriodEndDate(vPosClosingEntryDto.periodEndDate());
        ePosClosingEntryDao.setPostingDate(vPosClosingEntryDto.postingDate());
        ePosClosingEntryDao.setPostingTime(vPosClosingEntryDto.postingTime());
        ePosClosingEntryDao.setPosOpeningEntry(vPosClosingEntryDto.posOpeningEntry());
        ePosClosingEntryDao.setStatus(vPosClosingEntryDto.status());
        ePosClosingEntryDao.setCompany(vPosClosingEntryDto.company());
        ePosClosingEntryDao.setPosProfile(vPosClosingEntryDto.posProfile());
        ePosClosingEntryDao.setUser(vPosClosingEntryDto.user());
        ePosClosingEntryDao.setGrandTotal(vPosClosingEntryDto.grandTotal());
        ePosClosingEntryDao.setNetTotal(vPosClosingEntryDto.netTotal());
        ePosClosingEntryDao.setTotalQuantity(vPosClosingEntryDto.totalQuantity());
        ePosClosingEntryDao.setErrorMessage(vPosClosingEntryDto.errorMessage());
        ePosClosingEntryDao.setAmendedFrom(vPosClosingEntryDto.amendedFrom());
        ePosClosingEntryDao.setUserTags(vPosClosingEntryDto.userTags());
        ePosClosingEntryDao.setComments(vPosClosingEntryDto.comments());
        ePosClosingEntryDao.setAssign(vPosClosingEntryDto.assign());
        ePosClosingEntryDao.setLikedBy(vPosClosingEntryDto.likedBy());
    }
}