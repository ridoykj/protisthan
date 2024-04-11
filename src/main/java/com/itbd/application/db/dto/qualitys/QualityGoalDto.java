package com.itbd.application.db.dto.qualitys;

import com.itbd.application.db.dao.qualitys.QualityGoalDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record QualityGoalDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String goal,
        String frequency,
        String procedure,
        String weekday,
        String date,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static QualityGoalDto fromEntity(QualityGoalDao eQualityGoalDao) {
        return new QualityGoalDto(
                eQualityGoalDao.getName(),
                eQualityGoalDao.getCreation(),
                eQualityGoalDao.getModified(),
                eQualityGoalDao.getModifiedBy(),
                eQualityGoalDao.getOwner(),
                eQualityGoalDao.getIsDocStatus(),
                eQualityGoalDao.getIdx(),
                eQualityGoalDao.getGoal(),
                eQualityGoalDao.getFrequency(),
                eQualityGoalDao.getProcedure(),
                eQualityGoalDao.getWeekday(),
                eQualityGoalDao.getDate(),
                eQualityGoalDao.getUserTags(),
                eQualityGoalDao.getComments(),
                eQualityGoalDao.getAssign(),
                eQualityGoalDao.getLikedBy());
    }

    public static void fromDTO(QualityGoalDto vQualityGoalDto, QualityGoalDao eQualityGoalDao) {
        eQualityGoalDao.setName(vQualityGoalDto.name());
        eQualityGoalDao.setCreation(vQualityGoalDto.creation());
        eQualityGoalDao.setModified(vQualityGoalDto.modified());
        eQualityGoalDao.setModifiedBy(vQualityGoalDto.modifiedBy());
        eQualityGoalDao.setOwner(vQualityGoalDto.owner());
        eQualityGoalDao.setIsDocStatus(vQualityGoalDto.isDocStatus());
        eQualityGoalDao.setIdx(vQualityGoalDto.idx());
        eQualityGoalDao.setGoal(vQualityGoalDto.goal());
        eQualityGoalDao.setFrequency(vQualityGoalDto.frequency());
        eQualityGoalDao.setProcedure(vQualityGoalDto.procedure());
        eQualityGoalDao.setWeekday(vQualityGoalDto.weekday());
        eQualityGoalDao.setDate(vQualityGoalDto.date());
        eQualityGoalDao.setUserTags(vQualityGoalDto.userTags());
        eQualityGoalDao.setComments(vQualityGoalDto.comments());
        eQualityGoalDao.setAssign(vQualityGoalDto.assign());
        eQualityGoalDao.setLikedBy(vQualityGoalDto.likedBy());
    }
}