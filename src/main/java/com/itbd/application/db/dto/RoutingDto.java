package com.itbd.application.db.dto;

import com.itbd.application.db.dao.RoutingDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record RoutingDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String routingName,
        Boolean disabled,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static RoutingDto fromEntity(RoutingDao eRoutingDao) {
        return new RoutingDto(
                eRoutingDao.getName(),
                eRoutingDao.getCreation(),
                eRoutingDao.getModified(),
                eRoutingDao.getModifiedBy(),
                eRoutingDao.getOwner(),
                eRoutingDao.getIsDocStatus(),
                eRoutingDao.getIdx(),
                eRoutingDao.getRoutingName(),
                eRoutingDao.getDisabled(),
                eRoutingDao.getUserTags(),
                eRoutingDao.getComments(),
                eRoutingDao.getAssign(),
                eRoutingDao.getLikedBy());
    }

    public static void fromDTO(RoutingDto vRoutingDto, RoutingDao eRoutingDao) {
        eRoutingDao.setName(vRoutingDto.name());
        eRoutingDao.setCreation(vRoutingDto.creation());
        eRoutingDao.setModified(vRoutingDto.modified());
        eRoutingDao.setModifiedBy(vRoutingDto.modifiedBy());
        eRoutingDao.setOwner(vRoutingDto.owner());
        eRoutingDao.setIsDocStatus(vRoutingDto.isDocStatus());
        eRoutingDao.setIdx(vRoutingDto.idx());
        eRoutingDao.setRoutingName(vRoutingDto.routingName());
        eRoutingDao.setDisabled(vRoutingDto.disabled());
        eRoutingDao.setUserTags(vRoutingDto.userTags());
        eRoutingDao.setComments(vRoutingDto.comments());
        eRoutingDao.setAssign(vRoutingDto.assign());
        eRoutingDao.setLikedBy(vRoutingDto.likedBy());
    }
}