package com.itbd.application.db.dto;

import com.itbd.application.db.dao.CallLogDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record CallLogDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String id,
        String fromm,
        String to,
        String callReceivedBy,
        String employeeUserId,
        String medium,
        LocalDateTime startTime,
        LocalDateTime endTime,
        String type,
        String customer,
        String status,
        BigDecimal duration,
        String recordingUrl,
        String typeOfCall,
        String summary,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static CallLogDto fromEntity(CallLogDao eCallLogDao) {
        return new CallLogDto(
                eCallLogDao.getName(),
                eCallLogDao.getCreation(),
                eCallLogDao.getModified(),
                eCallLogDao.getModifiedBy(),
                eCallLogDao.getOwner(),
                eCallLogDao.getIsDocStatus(),
                eCallLogDao.getIdx(),
                eCallLogDao.getId(),
                eCallLogDao.getFromm(),
                eCallLogDao.getTo(),
                eCallLogDao.getCallReceivedBy(),
                eCallLogDao.getEmployeeUserId(),
                eCallLogDao.getMedium(),
                eCallLogDao.getStartTime(),
                eCallLogDao.getEndTime(),
                eCallLogDao.getType(),
                eCallLogDao.getCustomer(),
                eCallLogDao.getStatus(),
                eCallLogDao.getDuration(),
                eCallLogDao.getRecordingUrl(),
                eCallLogDao.getTypeOfCall(),
                eCallLogDao.getSummary(),
                eCallLogDao.getUserTags(),
                eCallLogDao.getComments(),
                eCallLogDao.getAssign(),
                eCallLogDao.getLikedBy());
    }

    public static void fromDTO(CallLogDto vCallLogDto, CallLogDao eCallLogDao) {
        eCallLogDao.setName(vCallLogDto.name());
        eCallLogDao.setCreation(vCallLogDto.creation());
        eCallLogDao.setModified(vCallLogDto.modified());
        eCallLogDao.setModifiedBy(vCallLogDto.modifiedBy());
        eCallLogDao.setOwner(vCallLogDto.owner());
        eCallLogDao.setIsDocStatus(vCallLogDto.isDocStatus());
        eCallLogDao.setIdx(vCallLogDto.idx());
        eCallLogDao.setId(vCallLogDto.id());
        eCallLogDao.setFromm(vCallLogDto.fromm());
        eCallLogDao.setTo(vCallLogDto.to());
        eCallLogDao.setCallReceivedBy(vCallLogDto.callReceivedBy());
        eCallLogDao.setEmployeeUserId(vCallLogDto.employeeUserId());
        eCallLogDao.setMedium(vCallLogDto.medium());
        eCallLogDao.setStartTime(vCallLogDto.startTime());
        eCallLogDao.setEndTime(vCallLogDto.endTime());
        eCallLogDao.setType(vCallLogDto.type());
        eCallLogDao.setCustomer(vCallLogDto.customer());
        eCallLogDao.setStatus(vCallLogDto.status());
        eCallLogDao.setDuration(vCallLogDto.duration());
        eCallLogDao.setRecordingUrl(vCallLogDto.recordingUrl());
        eCallLogDao.setTypeOfCall(vCallLogDto.typeOfCall());
        eCallLogDao.setSummary(vCallLogDto.summary());
        eCallLogDao.setUserTags(vCallLogDto.userTags());
        eCallLogDao.setComments(vCallLogDto.comments());
        eCallLogDao.setAssign(vCallLogDto.assign());
        eCallLogDao.setLikedBy(vCallLogDto.likedBy());
    }
}