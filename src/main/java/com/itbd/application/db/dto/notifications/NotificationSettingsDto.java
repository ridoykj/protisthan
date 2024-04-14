package com.itbd.application.db.dto.notifications;

import com.itbd.application.db.dao.notifications.NotificationSettingsDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record NotificationSettingsDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Boolean enabled,
        Boolean enableEmailNotifications,
        Boolean enableEmailMention,
        Boolean enableEmailAssignment,
        Boolean enableEmailThreadsOnAssignedDocument,
        Boolean enableEmailEnergyPoint,
        Boolean enableEmailShare,
        Boolean enableEmailEventReminders,
        String user,
        Boolean seen,
        Boolean energyPointsSystemNotifications,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static NotificationSettingsDto fromEntity(NotificationSettingsDao eNotificationSettingsDao) {
        return new NotificationSettingsDto(
                eNotificationSettingsDao.getName(),
                eNotificationSettingsDao.getCreation(),
                eNotificationSettingsDao.getModified(),
                eNotificationSettingsDao.getModifiedBy(),
                eNotificationSettingsDao.getOwner(),
                eNotificationSettingsDao.getIsDocStatus(),
                eNotificationSettingsDao.getIdx(),
                eNotificationSettingsDao.getEnabled(),
                eNotificationSettingsDao.getEnableEmailNotifications(),
                eNotificationSettingsDao.getEnableEmailMention(),
                eNotificationSettingsDao.getEnableEmailAssignment(),
                eNotificationSettingsDao.getEnableEmailThreadsOnAssignedDocument(),
                eNotificationSettingsDao.getEnableEmailEnergyPoint(),
                eNotificationSettingsDao.getEnableEmailShare(),
                eNotificationSettingsDao.getEnableEmailEventReminders(),
                eNotificationSettingsDao.getUser(),
                eNotificationSettingsDao.getSeen(),
                eNotificationSettingsDao.getEnergyPointsSystemNotifications(),
                eNotificationSettingsDao.getUserTags(),
                eNotificationSettingsDao.getComments(),
                eNotificationSettingsDao.getAssign(),
                eNotificationSettingsDao.getLikedBy());
    }

    public static void fromDTO(NotificationSettingsDto vNotificationSettingsDto, NotificationSettingsDao eNotificationSettingsDao) {
        eNotificationSettingsDao.setName(vNotificationSettingsDto.name());
        eNotificationSettingsDao.setCreation(vNotificationSettingsDto.creation());
        eNotificationSettingsDao.setModified(vNotificationSettingsDto.modified());
        eNotificationSettingsDao.setModifiedBy(vNotificationSettingsDto.modifiedBy());
        eNotificationSettingsDao.setOwner(vNotificationSettingsDto.owner());
        eNotificationSettingsDao.setIsDocStatus(vNotificationSettingsDto.isDocStatus());
        eNotificationSettingsDao.setIdx(vNotificationSettingsDto.idx());
        eNotificationSettingsDao.setEnabled(vNotificationSettingsDto.enabled());
        eNotificationSettingsDao.setEnableEmailNotifications(vNotificationSettingsDto.enableEmailNotifications());
        eNotificationSettingsDao.setEnableEmailMention(vNotificationSettingsDto.enableEmailMention());
        eNotificationSettingsDao.setEnableEmailAssignment(vNotificationSettingsDto.enableEmailAssignment());
        eNotificationSettingsDao.setEnableEmailThreadsOnAssignedDocument(vNotificationSettingsDto.enableEmailThreadsOnAssignedDocument());
        eNotificationSettingsDao.setEnableEmailEnergyPoint(vNotificationSettingsDto.enableEmailEnergyPoint());
        eNotificationSettingsDao.setEnableEmailShare(vNotificationSettingsDto.enableEmailShare());
        eNotificationSettingsDao.setEnableEmailEventReminders(vNotificationSettingsDto.enableEmailEventReminders());
        eNotificationSettingsDao.setUser(vNotificationSettingsDto.user());
        eNotificationSettingsDao.setSeen(vNotificationSettingsDto.seen());
        eNotificationSettingsDao.setEnergyPointsSystemNotifications(vNotificationSettingsDto.energyPointsSystemNotifications());
        eNotificationSettingsDao.setUserTags(vNotificationSettingsDto.userTags());
        eNotificationSettingsDao.setComments(vNotificationSettingsDto.comments());
        eNotificationSettingsDao.setAssign(vNotificationSettingsDto.assign());
        eNotificationSettingsDao.setLikedBy(vNotificationSettingsDto.likedBy());
    }
}