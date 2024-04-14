package com.itbd.application.db.dto;

import com.itbd.application.db.dao.LeadSourceDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record LeadSourceDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String sourceName,
        String details,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static LeadSourceDto fromEntity(LeadSourceDao eLeadSourceDao) {
        return new LeadSourceDto(
                eLeadSourceDao.getName(),
                eLeadSourceDao.getCreation(),
                eLeadSourceDao.getModified(),
                eLeadSourceDao.getModifiedBy(),
                eLeadSourceDao.getOwner(),
                eLeadSourceDao.getIsDocStatus(),
                eLeadSourceDao.getIdx(),
                eLeadSourceDao.getSourceName(),
                eLeadSourceDao.getDetails(),
                eLeadSourceDao.getUserTags(),
                eLeadSourceDao.getComments(),
                eLeadSourceDao.getAssign(),
                eLeadSourceDao.getLikedBy());
    }

    public static void fromDTO(LeadSourceDto vLeadSourceDto, LeadSourceDao eLeadSourceDao) {
        eLeadSourceDao.setName(vLeadSourceDto.name());
        eLeadSourceDao.setCreation(vLeadSourceDto.creation());
        eLeadSourceDao.setModified(vLeadSourceDto.modified());
        eLeadSourceDao.setModifiedBy(vLeadSourceDto.modifiedBy());
        eLeadSourceDao.setOwner(vLeadSourceDto.owner());
        eLeadSourceDao.setIsDocStatus(vLeadSourceDto.isDocStatus());
        eLeadSourceDao.setIdx(vLeadSourceDto.idx());
        eLeadSourceDao.setSourceName(vLeadSourceDto.sourceName());
        eLeadSourceDao.setDetails(vLeadSourceDto.details());
        eLeadSourceDao.setUserTags(vLeadSourceDto.userTags());
        eLeadSourceDao.setComments(vLeadSourceDto.comments());
        eLeadSourceDao.setAssign(vLeadSourceDto.assign());
        eLeadSourceDao.setLikedBy(vLeadSourceDto.likedBy());
    }
}