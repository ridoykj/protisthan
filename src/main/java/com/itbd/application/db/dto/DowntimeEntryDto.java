package com.itbd.application.db.dto;

import com.itbd.application.db.dao.DowntimeEntryDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record DowntimeEntryDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String namingSeries,
        String workstation,
        String operator,
        LocalDateTime fromTime,
        LocalDateTime toTime,
        BigDecimal downtime,
        String stopReason,
        String remarks,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static DowntimeEntryDto fromEntity(DowntimeEntryDao eDowntimeEntryDao) {
        return new DowntimeEntryDto(
                eDowntimeEntryDao.getName(),
                eDowntimeEntryDao.getCreation(),
                eDowntimeEntryDao.getModified(),
                eDowntimeEntryDao.getModifiedBy(),
                eDowntimeEntryDao.getOwner(),
                eDowntimeEntryDao.getIsDocStatus(),
                eDowntimeEntryDao.getIdx(),
                eDowntimeEntryDao.getNamingSeries(),
                eDowntimeEntryDao.getWorkstation(),
                eDowntimeEntryDao.getOperator(),
                eDowntimeEntryDao.getFromTime(),
                eDowntimeEntryDao.getToTime(),
                eDowntimeEntryDao.getDowntime(),
                eDowntimeEntryDao.getStopReason(),
                eDowntimeEntryDao.getRemarks(),
                eDowntimeEntryDao.getUserTags(),
                eDowntimeEntryDao.getComments(),
                eDowntimeEntryDao.getAssign(),
                eDowntimeEntryDao.getLikedBy());
    }

    public static void fromDTO(DowntimeEntryDto vDowntimeEntryDto, DowntimeEntryDao eDowntimeEntryDao) {
        eDowntimeEntryDao.setName(vDowntimeEntryDto.name());
        eDowntimeEntryDao.setCreation(vDowntimeEntryDto.creation());
        eDowntimeEntryDao.setModified(vDowntimeEntryDto.modified());
        eDowntimeEntryDao.setModifiedBy(vDowntimeEntryDto.modifiedBy());
        eDowntimeEntryDao.setOwner(vDowntimeEntryDto.owner());
        eDowntimeEntryDao.setIsDocStatus(vDowntimeEntryDto.isDocStatus());
        eDowntimeEntryDao.setIdx(vDowntimeEntryDto.idx());
        eDowntimeEntryDao.setNamingSeries(vDowntimeEntryDto.namingSeries());
        eDowntimeEntryDao.setWorkstation(vDowntimeEntryDto.workstation());
        eDowntimeEntryDao.setOperator(vDowntimeEntryDto.operator());
        eDowntimeEntryDao.setFromTime(vDowntimeEntryDto.fromTime());
        eDowntimeEntryDao.setToTime(vDowntimeEntryDto.toTime());
        eDowntimeEntryDao.setDowntime(vDowntimeEntryDto.downtime());
        eDowntimeEntryDao.setStopReason(vDowntimeEntryDto.stopReason());
        eDowntimeEntryDao.setRemarks(vDowntimeEntryDto.remarks());
        eDowntimeEntryDao.setUserTags(vDowntimeEntryDto.userTags());
        eDowntimeEntryDao.setComments(vDowntimeEntryDto.comments());
        eDowntimeEntryDao.setAssign(vDowntimeEntryDto.assign());
        eDowntimeEntryDao.setLikedBy(vDowntimeEntryDto.likedBy());
    }
}