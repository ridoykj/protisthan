package com.itbd.application.db.dto.qualitys;

import com.itbd.application.db.dao.quality_management.QualityMeetingDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record QualityMeetingDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String status,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static QualityMeetingDto fromEntity(QualityMeetingDao eQualityMeetingDao) {
        return new QualityMeetingDto(
                eQualityMeetingDao.getName(),
                eQualityMeetingDao.getCreation(),
                eQualityMeetingDao.getModified(),
                eQualityMeetingDao.getModifiedBy(),
                eQualityMeetingDao.getOwner(),
                eQualityMeetingDao.getIsDocStatus(),
                eQualityMeetingDao.getIdx(),
                eQualityMeetingDao.getStatus(),
                eQualityMeetingDao.getUserTags(),
                eQualityMeetingDao.getComments(),
                eQualityMeetingDao.getAssign(),
                eQualityMeetingDao.getLikedBy());
    }

    public static void fromDTO(QualityMeetingDto vQualityMeetingDto, QualityMeetingDao eQualityMeetingDao) {
        eQualityMeetingDao.setName(vQualityMeetingDto.name());
        eQualityMeetingDao.setCreation(vQualityMeetingDto.creation());
        eQualityMeetingDao.setModified(vQualityMeetingDto.modified());
        eQualityMeetingDao.setModifiedBy(vQualityMeetingDto.modifiedBy());
        eQualityMeetingDao.setOwner(vQualityMeetingDto.owner());
        eQualityMeetingDao.setIsDocStatus(vQualityMeetingDto.isDocStatus());
        eQualityMeetingDao.setIdx(vQualityMeetingDto.idx());
        eQualityMeetingDao.setStatus(vQualityMeetingDto.status());
        eQualityMeetingDao.setUserTags(vQualityMeetingDto.userTags());
        eQualityMeetingDao.setComments(vQualityMeetingDto.comments());
        eQualityMeetingDao.setAssign(vQualityMeetingDto.assign());
        eQualityMeetingDao.setLikedBy(vQualityMeetingDto.likedBy());
    }
}