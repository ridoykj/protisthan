package com.itbd.application.db.dto;

import com.itbd.application.db.dao.ProcessDeferredAccountingDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record ProcessDeferredAccountingDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String company,
        String type,
        String account,
        LocalDate postingDate,
        LocalDate startDate,
        LocalDate endDate,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ProcessDeferredAccountingDto fromEntity(ProcessDeferredAccountingDao eProcessDeferredAccountingDao) {
        return new ProcessDeferredAccountingDto(
                eProcessDeferredAccountingDao.getName(),
                eProcessDeferredAccountingDao.getCreation(),
                eProcessDeferredAccountingDao.getModified(),
                eProcessDeferredAccountingDao.getModifiedBy(),
                eProcessDeferredAccountingDao.getOwner(),
                eProcessDeferredAccountingDao.getIsDocStatus(),
                eProcessDeferredAccountingDao.getIdx(),
                eProcessDeferredAccountingDao.getCompany(),
                eProcessDeferredAccountingDao.getType(),
                eProcessDeferredAccountingDao.getAccount(),
                eProcessDeferredAccountingDao.getPostingDate(),
                eProcessDeferredAccountingDao.getStartDate(),
                eProcessDeferredAccountingDao.getEndDate(),
                eProcessDeferredAccountingDao.getAmendedFrom(),
                eProcessDeferredAccountingDao.getUserTags(),
                eProcessDeferredAccountingDao.getComments(),
                eProcessDeferredAccountingDao.getAssign(),
                eProcessDeferredAccountingDao.getLikedBy());
    }

    public static void fromDTO(ProcessDeferredAccountingDto vProcessDeferredAccountingDto, ProcessDeferredAccountingDao eProcessDeferredAccountingDao) {
        eProcessDeferredAccountingDao.setName(vProcessDeferredAccountingDto.name());
        eProcessDeferredAccountingDao.setCreation(vProcessDeferredAccountingDto.creation());
        eProcessDeferredAccountingDao.setModified(vProcessDeferredAccountingDto.modified());
        eProcessDeferredAccountingDao.setModifiedBy(vProcessDeferredAccountingDto.modifiedBy());
        eProcessDeferredAccountingDao.setOwner(vProcessDeferredAccountingDto.owner());
        eProcessDeferredAccountingDao.setIsDocStatus(vProcessDeferredAccountingDto.isDocStatus());
        eProcessDeferredAccountingDao.setIdx(vProcessDeferredAccountingDto.idx());
        eProcessDeferredAccountingDao.setCompany(vProcessDeferredAccountingDto.company());
        eProcessDeferredAccountingDao.setType(vProcessDeferredAccountingDto.type());
        eProcessDeferredAccountingDao.setAccount(vProcessDeferredAccountingDto.account());
        eProcessDeferredAccountingDao.setPostingDate(vProcessDeferredAccountingDto.postingDate());
        eProcessDeferredAccountingDao.setStartDate(vProcessDeferredAccountingDto.startDate());
        eProcessDeferredAccountingDao.setEndDate(vProcessDeferredAccountingDto.endDate());
        eProcessDeferredAccountingDao.setAmendedFrom(vProcessDeferredAccountingDto.amendedFrom());
        eProcessDeferredAccountingDao.setUserTags(vProcessDeferredAccountingDto.userTags());
        eProcessDeferredAccountingDao.setComments(vProcessDeferredAccountingDto.comments());
        eProcessDeferredAccountingDao.setAssign(vProcessDeferredAccountingDto.assign());
        eProcessDeferredAccountingDao.setLikedBy(vProcessDeferredAccountingDto.likedBy());
    }
}