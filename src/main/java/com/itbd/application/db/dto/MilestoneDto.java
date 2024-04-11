package com.itbd.application.db.dto;

import com.itbd.application.db.dao.MilestoneDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record MilestoneDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String referenceType,
        String referenceName,
        String trackField,
        String value,
        String milestoneTracker,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static MilestoneDto fromEntity(MilestoneDao eMilestoneDao) {
        return new MilestoneDto(
                eMilestoneDao.getName(),
                eMilestoneDao.getCreation(),
                eMilestoneDao.getModified(),
                eMilestoneDao.getModifiedBy(),
                eMilestoneDao.getOwner(),
                eMilestoneDao.getIsDocStatus(),
                eMilestoneDao.getIdx(),
                eMilestoneDao.getReferenceType(),
                eMilestoneDao.getReferenceName(),
                eMilestoneDao.getTrackField(),
                eMilestoneDao.getValue(),
                eMilestoneDao.getMilestoneTracker(),
                eMilestoneDao.getUserTags(),
                eMilestoneDao.getComments(),
                eMilestoneDao.getAssign(),
                eMilestoneDao.getLikedBy());
    }

    public static void fromDTO(MilestoneDto vMilestoneDto, MilestoneDao eMilestoneDao) {
        eMilestoneDao.setName(vMilestoneDto.name());
        eMilestoneDao.setCreation(vMilestoneDto.creation());
        eMilestoneDao.setModified(vMilestoneDto.modified());
        eMilestoneDao.setModifiedBy(vMilestoneDto.modifiedBy());
        eMilestoneDao.setOwner(vMilestoneDto.owner());
        eMilestoneDao.setIsDocStatus(vMilestoneDto.isDocStatus());
        eMilestoneDao.setIdx(vMilestoneDto.idx());
        eMilestoneDao.setReferenceType(vMilestoneDto.referenceType());
        eMilestoneDao.setReferenceName(vMilestoneDto.referenceName());
        eMilestoneDao.setTrackField(vMilestoneDto.trackField());
        eMilestoneDao.setValue(vMilestoneDto.value());
        eMilestoneDao.setMilestoneTracker(vMilestoneDto.milestoneTracker());
        eMilestoneDao.setUserTags(vMilestoneDto.userTags());
        eMilestoneDao.setComments(vMilestoneDto.comments());
        eMilestoneDao.setAssign(vMilestoneDto.assign());
        eMilestoneDao.setLikedBy(vMilestoneDto.likedBy());
    }
}