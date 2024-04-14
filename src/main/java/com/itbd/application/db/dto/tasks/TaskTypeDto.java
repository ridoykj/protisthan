package com.itbd.application.db.dto.tasks;

import com.itbd.application.db.dao.tasks.TaskTypeDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record TaskTypeDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        BigDecimal weight,
        String description,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static TaskTypeDto fromEntity(TaskTypeDao eTaskTypeDao) {
        return new TaskTypeDto(
                eTaskTypeDao.getName(),
                eTaskTypeDao.getCreation(),
                eTaskTypeDao.getModified(),
                eTaskTypeDao.getModifiedBy(),
                eTaskTypeDao.getOwner(),
                eTaskTypeDao.getIsDocStatus(),
                eTaskTypeDao.getIdx(),
                eTaskTypeDao.getWeight(),
                eTaskTypeDao.getDescription(),
                eTaskTypeDao.getUserTags(),
                eTaskTypeDao.getComments(),
                eTaskTypeDao.getAssign(),
                eTaskTypeDao.getLikedBy());
    }

    public static void fromDTO(TaskTypeDto vTaskTypeDto, TaskTypeDao eTaskTypeDao) {
        eTaskTypeDao.setName(vTaskTypeDto.name());
        eTaskTypeDao.setCreation(vTaskTypeDto.creation());
        eTaskTypeDao.setModified(vTaskTypeDto.modified());
        eTaskTypeDao.setModifiedBy(vTaskTypeDto.modifiedBy());
        eTaskTypeDao.setOwner(vTaskTypeDto.owner());
        eTaskTypeDao.setIsDocStatus(vTaskTypeDto.isDocStatus());
        eTaskTypeDao.setIdx(vTaskTypeDto.idx());
        eTaskTypeDao.setWeight(vTaskTypeDto.weight());
        eTaskTypeDao.setDescription(vTaskTypeDto.description());
        eTaskTypeDao.setUserTags(vTaskTypeDto.userTags());
        eTaskTypeDao.setComments(vTaskTypeDto.comments());
        eTaskTypeDao.setAssign(vTaskTypeDto.assign());
        eTaskTypeDao.setLikedBy(vTaskTypeDto.likedBy());
    }
}