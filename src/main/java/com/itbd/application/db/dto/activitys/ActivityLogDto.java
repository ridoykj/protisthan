package com.itbd.application.db.dto.activitys;

import com.itbd.application.db.dao.core.ActivityLogDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ActivityLogDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String subject,
        String content,
        LocalDateTime communicationDate,
        String ipAddress,
        String operation,
        String status,
        String referenceDocType,
        String referenceName,
        String referenceOwner,
        String timelineDocType,
        String timelineName,
        String linkDocType,
        String linkName,
        String user,
        String fullName,
        String userTags,
        String comments,
        String assign,
        String likedBy,
        String seen
) {
    public static ActivityLogDto fromEntity(ActivityLogDao eActivityLogDao) {
        return new ActivityLogDto(
                eActivityLogDao.getName(),
                eActivityLogDao.getCreation(),
                eActivityLogDao.getModified(),
                eActivityLogDao.getModifiedBy(),
                eActivityLogDao.getOwner(),
                eActivityLogDao.getIsDocStatus(),
                eActivityLogDao.getIdx(),
                eActivityLogDao.getSubject(),
                eActivityLogDao.getContent(),
                eActivityLogDao.getCommunicationDate(),
                eActivityLogDao.getIpAddress(),
                eActivityLogDao.getOperation(),
                eActivityLogDao.getStatus(),
                eActivityLogDao.getReferenceDocType(),
                eActivityLogDao.getReferenceName(),
                eActivityLogDao.getReferenceOwner(),
                eActivityLogDao.getTimelineDocType(),
                eActivityLogDao.getTimelineName(),
                eActivityLogDao.getLinkDocType(),
                eActivityLogDao.getLinkName(),
                eActivityLogDao.getUser(),
                eActivityLogDao.getFullName(),
                eActivityLogDao.getUserTags(),
                eActivityLogDao.getComments(),
                eActivityLogDao.getAssign(),
                eActivityLogDao.getLikedBy(),
                eActivityLogDao.getSeen());
    }

    public static void fromDTO(ActivityLogDto vActivityLogDto, ActivityLogDao eActivityLogDao) {
        eActivityLogDao.setName(vActivityLogDto.name());
        eActivityLogDao.setCreation(vActivityLogDto.creation());
        eActivityLogDao.setModified(vActivityLogDto.modified());
        eActivityLogDao.setModifiedBy(vActivityLogDto.modifiedBy());
        eActivityLogDao.setOwner(vActivityLogDto.owner());
        eActivityLogDao.setIsDocStatus(vActivityLogDto.isDocStatus());
        eActivityLogDao.setIdx(vActivityLogDto.idx());
        eActivityLogDao.setSubject(vActivityLogDto.subject());
        eActivityLogDao.setContent(vActivityLogDto.content());
        eActivityLogDao.setCommunicationDate(vActivityLogDto.communicationDate());
        eActivityLogDao.setIpAddress(vActivityLogDto.ipAddress());
        eActivityLogDao.setOperation(vActivityLogDto.operation());
        eActivityLogDao.setStatus(vActivityLogDto.status());
        eActivityLogDao.setReferenceDocType(vActivityLogDto.referenceDocType());
        eActivityLogDao.setReferenceName(vActivityLogDto.referenceName());
        eActivityLogDao.setReferenceOwner(vActivityLogDto.referenceOwner());
        eActivityLogDao.setTimelineDocType(vActivityLogDto.timelineDocType());
        eActivityLogDao.setTimelineName(vActivityLogDto.timelineName());
        eActivityLogDao.setLinkDocType(vActivityLogDto.linkDocType());
        eActivityLogDao.setLinkName(vActivityLogDto.linkName());
        eActivityLogDao.setUser(vActivityLogDto.user());
        eActivityLogDao.setFullName(vActivityLogDto.fullName());
        eActivityLogDao.setUserTags(vActivityLogDto.userTags());
        eActivityLogDao.setComments(vActivityLogDto.comments());
        eActivityLogDao.setAssign(vActivityLogDto.assign());
        eActivityLogDao.setLikedBy(vActivityLogDto.likedBy());
        eActivityLogDao.setSeen(vActivityLogDto.seen());
    }
}