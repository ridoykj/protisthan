package com.itbd.application.db.dto;

import com.itbd.application.db.dao.automation.ReminderDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ReminderDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String user,
        LocalDateTime remindAt,
        String description,
        String reminderDocType,
        String reminderDocName,
        Boolean notified,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ReminderDto fromEntity(ReminderDao eReminderDao) {
        return new ReminderDto(
                eReminderDao.getName(),
                eReminderDao.getCreation(),
                eReminderDao.getModified(),
                eReminderDao.getModifiedBy(),
                eReminderDao.getOwner(),
                eReminderDao.getIsDocStatus(),
                eReminderDao.getIdx(),
                eReminderDao.getUser(),
                eReminderDao.getRemindAt(),
                eReminderDao.getDescription(),
                eReminderDao.getReminderDocType(),
                eReminderDao.getReminderDocName(),
                eReminderDao.getNotified(),
                eReminderDao.getUserTags(),
                eReminderDao.getComments(),
                eReminderDao.getAssign(),
                eReminderDao.getLikedBy());
    }

    public static void fromDTO(ReminderDto vReminderDto, ReminderDao eReminderDao) {
        eReminderDao.setName(vReminderDto.name());
        eReminderDao.setCreation(vReminderDto.creation());
        eReminderDao.setModified(vReminderDto.modified());
        eReminderDao.setModifiedBy(vReminderDto.modifiedBy());
        eReminderDao.setOwner(vReminderDto.owner());
        eReminderDao.setIsDocStatus(vReminderDto.isDocStatus());
        eReminderDao.setIdx(vReminderDto.idx());
        eReminderDao.setUser(vReminderDto.user());
        eReminderDao.setRemindAt(vReminderDto.remindAt());
        eReminderDao.setDescription(vReminderDto.description());
        eReminderDao.setReminderDocType(vReminderDto.reminderDocType());
        eReminderDao.setReminderDocName(vReminderDto.reminderDocName());
        eReminderDao.setNotified(vReminderDto.notified());
        eReminderDao.setUserTags(vReminderDto.userTags());
        eReminderDao.setComments(vReminderDto.comments());
        eReminderDao.setAssign(vReminderDto.assign());
        eReminderDao.setLikedBy(vReminderDto.likedBy());
    }
}