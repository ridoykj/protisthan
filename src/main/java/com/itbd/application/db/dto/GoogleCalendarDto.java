package com.itbd.application.db.dto;

import com.itbd.application.db.dao.GoogleCalendarDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record GoogleCalendarDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Boolean enable,
        String calendarName,
        String user,
        Boolean pullFromGoogleCalendar,
        Boolean pushToGoogleCalendar,
        String googleCalendarId,
        String refreshToken,
        String authorizationCode,
        String nextSyncToken,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static GoogleCalendarDto fromEntity(GoogleCalendarDao eGoogleCalendarDao) {
        return new GoogleCalendarDto(
                eGoogleCalendarDao.getName(),
                eGoogleCalendarDao.getCreation(),
                eGoogleCalendarDao.getModified(),
                eGoogleCalendarDao.getModifiedBy(),
                eGoogleCalendarDao.getOwner(),
                eGoogleCalendarDao.getIsDocStatus(),
                eGoogleCalendarDao.getIdx(),
                eGoogleCalendarDao.getEnable(),
                eGoogleCalendarDao.getCalendarName(),
                eGoogleCalendarDao.getUser(),
                eGoogleCalendarDao.getPullFromGoogleCalendar(),
                eGoogleCalendarDao.getPushToGoogleCalendar(),
                eGoogleCalendarDao.getGoogleCalendarId(),
                eGoogleCalendarDao.getRefreshToken(),
                eGoogleCalendarDao.getAuthorizationCode(),
                eGoogleCalendarDao.getNextSyncToken(),
                eGoogleCalendarDao.getUserTags(),
                eGoogleCalendarDao.getComments(),
                eGoogleCalendarDao.getAssign(),
                eGoogleCalendarDao.getLikedBy());
    }

    public static void fromDTO(GoogleCalendarDto vGoogleCalendarDto, GoogleCalendarDao eGoogleCalendarDao) {
        eGoogleCalendarDao.setName(vGoogleCalendarDto.name());
        eGoogleCalendarDao.setCreation(vGoogleCalendarDto.creation());
        eGoogleCalendarDao.setModified(vGoogleCalendarDto.modified());
        eGoogleCalendarDao.setModifiedBy(vGoogleCalendarDto.modifiedBy());
        eGoogleCalendarDao.setOwner(vGoogleCalendarDto.owner());
        eGoogleCalendarDao.setIsDocStatus(vGoogleCalendarDto.isDocStatus());
        eGoogleCalendarDao.setIdx(vGoogleCalendarDto.idx());
        eGoogleCalendarDao.setEnable(vGoogleCalendarDto.enable());
        eGoogleCalendarDao.setCalendarName(vGoogleCalendarDto.calendarName());
        eGoogleCalendarDao.setUser(vGoogleCalendarDto.user());
        eGoogleCalendarDao.setPullFromGoogleCalendar(vGoogleCalendarDto.pullFromGoogleCalendar());
        eGoogleCalendarDao.setPushToGoogleCalendar(vGoogleCalendarDto.pushToGoogleCalendar());
        eGoogleCalendarDao.setGoogleCalendarId(vGoogleCalendarDto.googleCalendarId());
        eGoogleCalendarDao.setRefreshToken(vGoogleCalendarDto.refreshToken());
        eGoogleCalendarDao.setAuthorizationCode(vGoogleCalendarDto.authorizationCode());
        eGoogleCalendarDao.setNextSyncToken(vGoogleCalendarDto.nextSyncToken());
        eGoogleCalendarDao.setUserTags(vGoogleCalendarDto.userTags());
        eGoogleCalendarDao.setComments(vGoogleCalendarDto.comments());
        eGoogleCalendarDao.setAssign(vGoogleCalendarDto.assign());
        eGoogleCalendarDao.setLikedBy(vGoogleCalendarDto.likedBy());
    }
}