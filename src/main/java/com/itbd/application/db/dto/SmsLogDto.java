package com.itbd.application.db.dto;

import com.itbd.application.db.dao.SmsLogDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record SmsLogDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String senderName,
        LocalDate sentOn,
        String message,
        Integer noOfRequestedSms,
        String requestedNumbers,
        Integer noOfSentSms,
        String sentTo,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static SmsLogDto fromEntity(SmsLogDao eSmsLogDao) {
        return new SmsLogDto(
                eSmsLogDao.getName(),
                eSmsLogDao.getCreation(),
                eSmsLogDao.getModified(),
                eSmsLogDao.getModifiedBy(),
                eSmsLogDao.getOwner(),
                eSmsLogDao.getIsDocStatus(),
                eSmsLogDao.getIdx(),
                eSmsLogDao.getSenderName(),
                eSmsLogDao.getSentOn(),
                eSmsLogDao.getMessage(),
                eSmsLogDao.getNoOfRequestedSms(),
                eSmsLogDao.getRequestedNumbers(),
                eSmsLogDao.getNoOfSentSms(),
                eSmsLogDao.getSentTo(),
                eSmsLogDao.getUserTags(),
                eSmsLogDao.getComments(),
                eSmsLogDao.getAssign(),
                eSmsLogDao.getLikedBy());
    }

    public static void fromDTO(SmsLogDto vSmsLogDto, SmsLogDao eSmsLogDao) {
        eSmsLogDao.setName(vSmsLogDto.name());
        eSmsLogDao.setCreation(vSmsLogDto.creation());
        eSmsLogDao.setModified(vSmsLogDto.modified());
        eSmsLogDao.setModifiedBy(vSmsLogDto.modifiedBy());
        eSmsLogDao.setOwner(vSmsLogDto.owner());
        eSmsLogDao.setIsDocStatus(vSmsLogDto.isDocStatus());
        eSmsLogDao.setIdx(vSmsLogDto.idx());
        eSmsLogDao.setSenderName(vSmsLogDto.senderName());
        eSmsLogDao.setSentOn(vSmsLogDto.sentOn());
        eSmsLogDao.setMessage(vSmsLogDto.message());
        eSmsLogDao.setNoOfRequestedSms(vSmsLogDto.noOfRequestedSms());
        eSmsLogDao.setRequestedNumbers(vSmsLogDto.requestedNumbers());
        eSmsLogDao.setNoOfSentSms(vSmsLogDto.noOfSentSms());
        eSmsLogDao.setSentTo(vSmsLogDto.sentTo());
        eSmsLogDao.setUserTags(vSmsLogDto.userTags());
        eSmsLogDao.setComments(vSmsLogDto.comments());
        eSmsLogDao.setAssign(vSmsLogDto.assign());
        eSmsLogDao.setLikedBy(vSmsLogDto.likedBy());
    }
}