package com.itbd.application.db.dto;

import com.itbd.application.db.dao.RouteHistoryDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record RouteHistoryDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String route,
        String user,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static RouteHistoryDto fromEntity(RouteHistoryDao eRouteHistoryDao) {
        return new RouteHistoryDto(
                eRouteHistoryDao.getName(),
                eRouteHistoryDao.getCreation(),
                eRouteHistoryDao.getModified(),
                eRouteHistoryDao.getModifiedBy(),
                eRouteHistoryDao.getOwner(),
                eRouteHistoryDao.getIsDocStatus(),
                eRouteHistoryDao.getIdx(),
                eRouteHistoryDao.getRoute(),
                eRouteHistoryDao.getUser(),
                eRouteHistoryDao.getUserTags(),
                eRouteHistoryDao.getComments(),
                eRouteHistoryDao.getAssign(),
                eRouteHistoryDao.getLikedBy());
    }

    public static void fromDTO(RouteHistoryDto vRouteHistoryDto, RouteHistoryDao eRouteHistoryDao) {
        eRouteHistoryDao.setName(vRouteHistoryDto.name());
        eRouteHistoryDao.setCreation(vRouteHistoryDto.creation());
        eRouteHistoryDao.setModified(vRouteHistoryDto.modified());
        eRouteHistoryDao.setModifiedBy(vRouteHistoryDto.modifiedBy());
        eRouteHistoryDao.setOwner(vRouteHistoryDto.owner());
        eRouteHistoryDao.setIsDocStatus(vRouteHistoryDto.isDocStatus());
        eRouteHistoryDao.setIdx(vRouteHistoryDto.idx());
        eRouteHistoryDao.setRoute(vRouteHistoryDto.route());
        eRouteHistoryDao.setUser(vRouteHistoryDto.user());
        eRouteHistoryDao.setUserTags(vRouteHistoryDto.userTags());
        eRouteHistoryDao.setComments(vRouteHistoryDto.comments());
        eRouteHistoryDao.setAssign(vRouteHistoryDto.assign());
        eRouteHistoryDao.setLikedBy(vRouteHistoryDto.likedBy());
    }
}