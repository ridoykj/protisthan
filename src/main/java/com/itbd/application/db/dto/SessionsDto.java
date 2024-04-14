package com.itbd.application.db.dto;

import com.itbd.application.db.dao.SessionsDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record SessionsDto(
        @Id
        String user,
        String sid,
        String sessionData,
        String ipAddress,
        LocalDateTime lastUpdate,
        String status
) {
    public static SessionsDto fromEntity(SessionsDao eSessionsDao) {
        return new SessionsDto(
                eSessionsDao.getUser(),
                eSessionsDao.getSid(),
                eSessionsDao.getSessionData(),
                eSessionsDao.getIpAddress(),
                eSessionsDao.getLastUpdate(),
                eSessionsDao.getStatus());
    }

    public static void fromDTO(SessionsDto vSessionsDto, SessionsDao eSessionsDao) {
        eSessionsDao.setUser(vSessionsDto.user());
        eSessionsDao.setSid(vSessionsDto.sid());
        eSessionsDao.setSessionData(vSessionsDto.sessionData());
        eSessionsDao.setIpAddress(vSessionsDto.ipAddress());
        eSessionsDao.setLastUpdate(vSessionsDto.lastUpdate());
        eSessionsDao.setStatus(vSessionsDto.status());
    }
}