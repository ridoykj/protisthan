package com.itbd.application.db.dto.qualitys;

import com.itbd.application.db.dao.qualitys.QualityReviewDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record QualityReviewDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String goal,
        LocalDate date,
        String procedure,
        String status,
        String additionalInformation,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static QualityReviewDto fromEntity(QualityReviewDao eQualityReviewDao) {
        return new QualityReviewDto(
                eQualityReviewDao.getName(),
                eQualityReviewDao.getCreation(),
                eQualityReviewDao.getModified(),
                eQualityReviewDao.getModifiedBy(),
                eQualityReviewDao.getOwner(),
                eQualityReviewDao.getIsDocStatus(),
                eQualityReviewDao.getIdx(),
                eQualityReviewDao.getGoal(),
                eQualityReviewDao.getDate(),
                eQualityReviewDao.getProcedure(),
                eQualityReviewDao.getStatus(),
                eQualityReviewDao.getAdditionalInformation(),
                eQualityReviewDao.getUserTags(),
                eQualityReviewDao.getComments(),
                eQualityReviewDao.getAssign(),
                eQualityReviewDao.getLikedBy());
    }

    public static void fromDTO(QualityReviewDto vQualityReviewDto, QualityReviewDao eQualityReviewDao) {
        eQualityReviewDao.setName(vQualityReviewDto.name());
        eQualityReviewDao.setCreation(vQualityReviewDto.creation());
        eQualityReviewDao.setModified(vQualityReviewDto.modified());
        eQualityReviewDao.setModifiedBy(vQualityReviewDto.modifiedBy());
        eQualityReviewDao.setOwner(vQualityReviewDto.owner());
        eQualityReviewDao.setIsDocStatus(vQualityReviewDto.isDocStatus());
        eQualityReviewDao.setIdx(vQualityReviewDto.idx());
        eQualityReviewDao.setGoal(vQualityReviewDto.goal());
        eQualityReviewDao.setDate(vQualityReviewDto.date());
        eQualityReviewDao.setProcedure(vQualityReviewDto.procedure());
        eQualityReviewDao.setStatus(vQualityReviewDto.status());
        eQualityReviewDao.setAdditionalInformation(vQualityReviewDto.additionalInformation());
        eQualityReviewDao.setUserTags(vQualityReviewDto.userTags());
        eQualityReviewDao.setComments(vQualityReviewDto.comments());
        eQualityReviewDao.setAssign(vQualityReviewDto.assign());
        eQualityReviewDao.setLikedBy(vQualityReviewDto.likedBy());
    }
}