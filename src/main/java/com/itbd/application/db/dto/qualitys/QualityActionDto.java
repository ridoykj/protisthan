package com.itbd.application.db.dto.qualitys;

import com.itbd.application.db.dao.qualitys.QualityActionDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record QualityActionDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String correctivePreventive,
        String review,
        String feedback,
        String status,
        LocalDate date,
        String goal,
        String procedure,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static QualityActionDto fromEntity(QualityActionDao eQualityActionDao) {
        return new QualityActionDto(
                eQualityActionDao.getName(),
                eQualityActionDao.getCreation(),
                eQualityActionDao.getModified(),
                eQualityActionDao.getModifiedBy(),
                eQualityActionDao.getOwner(),
                eQualityActionDao.getIsDocStatus(),
                eQualityActionDao.getIdx(),
                eQualityActionDao.getCorrectivePreventive(),
                eQualityActionDao.getReview(),
                eQualityActionDao.getFeedback(),
                eQualityActionDao.getStatus(),
                eQualityActionDao.getDate(),
                eQualityActionDao.getGoal(),
                eQualityActionDao.getProcedure(),
                eQualityActionDao.getUserTags(),
                eQualityActionDao.getComments(),
                eQualityActionDao.getAssign(),
                eQualityActionDao.getLikedBy());
    }

    public static void fromDTO(QualityActionDto vQualityActionDto, QualityActionDao eQualityActionDao) {
        eQualityActionDao.setName(vQualityActionDto.name());
        eQualityActionDao.setCreation(vQualityActionDto.creation());
        eQualityActionDao.setModified(vQualityActionDto.modified());
        eQualityActionDao.setModifiedBy(vQualityActionDto.modifiedBy());
        eQualityActionDao.setOwner(vQualityActionDto.owner());
        eQualityActionDao.setIsDocStatus(vQualityActionDto.isDocStatus());
        eQualityActionDao.setIdx(vQualityActionDto.idx());
        eQualityActionDao.setCorrectivePreventive(vQualityActionDto.correctivePreventive());
        eQualityActionDao.setReview(vQualityActionDto.review());
        eQualityActionDao.setFeedback(vQualityActionDto.feedback());
        eQualityActionDao.setStatus(vQualityActionDto.status());
        eQualityActionDao.setDate(vQualityActionDto.date());
        eQualityActionDao.setGoal(vQualityActionDto.goal());
        eQualityActionDao.setProcedure(vQualityActionDto.procedure());
        eQualityActionDao.setUserTags(vQualityActionDto.userTags());
        eQualityActionDao.setComments(vQualityActionDto.comments());
        eQualityActionDao.setAssign(vQualityActionDto.assign());
        eQualityActionDao.setLikedBy(vQualityActionDto.likedBy());
    }
}