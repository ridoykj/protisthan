package com.itbd.application.db.dto;

import com.itbd.application.db.dao.MilestoneTrackerDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record MilestoneTrackerDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String documentType,
        String trackField,
        Boolean disabled,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static MilestoneTrackerDto fromEntity(MilestoneTrackerDao eMilestoneTrackerDao) {
        return new MilestoneTrackerDto(
                eMilestoneTrackerDao.getName(),
                eMilestoneTrackerDao.getCreation(),
                eMilestoneTrackerDao.getModified(),
                eMilestoneTrackerDao.getModifiedBy(),
                eMilestoneTrackerDao.getOwner(),
                eMilestoneTrackerDao.getIsDocStatus(),
                eMilestoneTrackerDao.getIdx(),
                eMilestoneTrackerDao.getDocumentType(),
                eMilestoneTrackerDao.getTrackField(),
                eMilestoneTrackerDao.getDisabled(),
                eMilestoneTrackerDao.getUserTags(),
                eMilestoneTrackerDao.getComments(),
                eMilestoneTrackerDao.getAssign(),
                eMilestoneTrackerDao.getLikedBy());
    }

    public static void fromDTO(MilestoneTrackerDto vMilestoneTrackerDto, MilestoneTrackerDao eMilestoneTrackerDao) {
        eMilestoneTrackerDao.setName(vMilestoneTrackerDto.name());
        eMilestoneTrackerDao.setCreation(vMilestoneTrackerDto.creation());
        eMilestoneTrackerDao.setModified(vMilestoneTrackerDto.modified());
        eMilestoneTrackerDao.setModifiedBy(vMilestoneTrackerDto.modifiedBy());
        eMilestoneTrackerDao.setOwner(vMilestoneTrackerDto.owner());
        eMilestoneTrackerDao.setIsDocStatus(vMilestoneTrackerDto.isDocStatus());
        eMilestoneTrackerDao.setIdx(vMilestoneTrackerDto.idx());
        eMilestoneTrackerDao.setDocumentType(vMilestoneTrackerDto.documentType());
        eMilestoneTrackerDao.setTrackField(vMilestoneTrackerDto.trackField());
        eMilestoneTrackerDao.setDisabled(vMilestoneTrackerDto.disabled());
        eMilestoneTrackerDao.setUserTags(vMilestoneTrackerDto.userTags());
        eMilestoneTrackerDao.setComments(vMilestoneTrackerDto.comments());
        eMilestoneTrackerDao.setAssign(vMilestoneTrackerDto.assign());
        eMilestoneTrackerDao.setLikedBy(vMilestoneTrackerDto.likedBy());
    }
}