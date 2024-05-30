package com.itbd.application.db.dto;

import com.itbd.application.db.dao.crm.CompetitorDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record CompetitorDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String competitorName,
        String website,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static CompetitorDto fromEntity(CompetitorDao eCompetitorDao) {
        return new CompetitorDto(
                eCompetitorDao.getName(),
                eCompetitorDao.getCreation(),
                eCompetitorDao.getModified(),
                eCompetitorDao.getModifiedBy(),
                eCompetitorDao.getOwner(),
                eCompetitorDao.getIsDocStatus(),
                eCompetitorDao.getIdx(),
                eCompetitorDao.getCompetitorName(),
                eCompetitorDao.getWebsite(),
                eCompetitorDao.getUserTags(),
                eCompetitorDao.getComments(),
                eCompetitorDao.getAssign(),
                eCompetitorDao.getLikedBy());
    }

    public static void fromDTO(CompetitorDto vCompetitorDto, CompetitorDao eCompetitorDao) {
        eCompetitorDao.setName(vCompetitorDto.name());
        eCompetitorDao.setCreation(vCompetitorDto.creation());
        eCompetitorDao.setModified(vCompetitorDto.modified());
        eCompetitorDao.setModifiedBy(vCompetitorDto.modifiedBy());
        eCompetitorDao.setOwner(vCompetitorDto.owner());
        eCompetitorDao.setIsDocStatus(vCompetitorDto.isDocStatus());
        eCompetitorDao.setIdx(vCompetitorDto.idx());
        eCompetitorDao.setCompetitorName(vCompetitorDto.competitorName());
        eCompetitorDao.setWebsite(vCompetitorDto.website());
        eCompetitorDao.setUserTags(vCompetitorDto.userTags());
        eCompetitorDao.setComments(vCompetitorDto.comments());
        eCompetitorDao.setAssign(vCompetitorDto.assign());
        eCompetitorDao.setLikedBy(vCompetitorDto.likedBy());
    }
}