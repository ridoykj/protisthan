package com.itbd.application.db.dto.pos;

import com.itbd.application.db.dao.pos.PosOpeningEntryDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record PosOpeningEntryDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        LocalDateTime periodStartDate,
        LocalDate periodEndDate,
        String status,
        LocalDate postingDate,
        Boolean setPostingDate,
        String company,
        String posProfile,
        String posClosingEntry,
        String user,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static PosOpeningEntryDto fromEntity(PosOpeningEntryDao ePosOpeningEntryDao) {
        return new PosOpeningEntryDto(
                ePosOpeningEntryDao.getName(),
                ePosOpeningEntryDao.getCreation(),
                ePosOpeningEntryDao.getModified(),
                ePosOpeningEntryDao.getModifiedBy(),
                ePosOpeningEntryDao.getOwner(),
                ePosOpeningEntryDao.getIsDocStatus(),
                ePosOpeningEntryDao.getIdx(),
                ePosOpeningEntryDao.getPeriodStartDate(),
                ePosOpeningEntryDao.getPeriodEndDate(),
                ePosOpeningEntryDao.getStatus(),
                ePosOpeningEntryDao.getPostingDate(),
                ePosOpeningEntryDao.getSetPostingDate(),
                ePosOpeningEntryDao.getCompany(),
                ePosOpeningEntryDao.getPosProfile(),
                ePosOpeningEntryDao.getPosClosingEntry(),
                ePosOpeningEntryDao.getUser(),
                ePosOpeningEntryDao.getAmendedFrom(),
                ePosOpeningEntryDao.getUserTags(),
                ePosOpeningEntryDao.getComments(),
                ePosOpeningEntryDao.getAssign(),
                ePosOpeningEntryDao.getLikedBy());
    }

    public static void fromDTO(PosOpeningEntryDto vPosOpeningEntryDto, PosOpeningEntryDao ePosOpeningEntryDao) {
        ePosOpeningEntryDao.setName(vPosOpeningEntryDto.name());
        ePosOpeningEntryDao.setCreation(vPosOpeningEntryDto.creation());
        ePosOpeningEntryDao.setModified(vPosOpeningEntryDto.modified());
        ePosOpeningEntryDao.setModifiedBy(vPosOpeningEntryDto.modifiedBy());
        ePosOpeningEntryDao.setOwner(vPosOpeningEntryDto.owner());
        ePosOpeningEntryDao.setIsDocStatus(vPosOpeningEntryDto.isDocStatus());
        ePosOpeningEntryDao.setIdx(vPosOpeningEntryDto.idx());
        ePosOpeningEntryDao.setPeriodStartDate(vPosOpeningEntryDto.periodStartDate());
        ePosOpeningEntryDao.setPeriodEndDate(vPosOpeningEntryDto.periodEndDate());
        ePosOpeningEntryDao.setStatus(vPosOpeningEntryDto.status());
        ePosOpeningEntryDao.setPostingDate(vPosOpeningEntryDto.postingDate());
        ePosOpeningEntryDao.setSetPostingDate(vPosOpeningEntryDto.setPostingDate());
        ePosOpeningEntryDao.setCompany(vPosOpeningEntryDto.company());
        ePosOpeningEntryDao.setPosProfile(vPosOpeningEntryDto.posProfile());
        ePosOpeningEntryDao.setPosClosingEntry(vPosOpeningEntryDto.posClosingEntry());
        ePosOpeningEntryDao.setUser(vPosOpeningEntryDto.user());
        ePosOpeningEntryDao.setAmendedFrom(vPosOpeningEntryDto.amendedFrom());
        ePosOpeningEntryDao.setUserTags(vPosOpeningEntryDto.userTags());
        ePosOpeningEntryDao.setComments(vPosOpeningEntryDto.comments());
        ePosOpeningEntryDao.setAssign(vPosOpeningEntryDto.assign());
        ePosOpeningEntryDao.setLikedBy(vPosOpeningEntryDto.likedBy());
    }
}