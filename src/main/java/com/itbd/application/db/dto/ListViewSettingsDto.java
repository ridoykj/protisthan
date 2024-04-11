package com.itbd.application.db.dto;

import com.itbd.application.db.dao.ListViewSettingsDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ListViewSettingsDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Boolean disableCount,
        Boolean disableCommentCount,
        Boolean disableSidebarStats,
        Boolean disableAutoRefresh,
        String totalFields,
        String fields,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ListViewSettingsDto fromEntity(ListViewSettingsDao eListViewSettingsDao) {
        return new ListViewSettingsDto(
                eListViewSettingsDao.getName(),
                eListViewSettingsDao.getCreation(),
                eListViewSettingsDao.getModified(),
                eListViewSettingsDao.getModifiedBy(),
                eListViewSettingsDao.getOwner(),
                eListViewSettingsDao.getIsDocStatus(),
                eListViewSettingsDao.getIdx(),
                eListViewSettingsDao.getDisableCount(),
                eListViewSettingsDao.getDisableCommentCount(),
                eListViewSettingsDao.getDisableSidebarStats(),
                eListViewSettingsDao.getDisableAutoRefresh(),
                eListViewSettingsDao.getTotalFields(),
                eListViewSettingsDao.getFields(),
                eListViewSettingsDao.getUserTags(),
                eListViewSettingsDao.getComments(),
                eListViewSettingsDao.getAssign(),
                eListViewSettingsDao.getLikedBy());
    }

    public static void fromDTO(ListViewSettingsDto vListViewSettingsDto, ListViewSettingsDao eListViewSettingsDao) {
        eListViewSettingsDao.setName(vListViewSettingsDto.name());
        eListViewSettingsDao.setCreation(vListViewSettingsDto.creation());
        eListViewSettingsDao.setModified(vListViewSettingsDto.modified());
        eListViewSettingsDao.setModifiedBy(vListViewSettingsDto.modifiedBy());
        eListViewSettingsDao.setOwner(vListViewSettingsDto.owner());
        eListViewSettingsDao.setIsDocStatus(vListViewSettingsDto.isDocStatus());
        eListViewSettingsDao.setIdx(vListViewSettingsDto.idx());
        eListViewSettingsDao.setDisableCount(vListViewSettingsDto.disableCount());
        eListViewSettingsDao.setDisableCommentCount(vListViewSettingsDto.disableCommentCount());
        eListViewSettingsDao.setDisableSidebarStats(vListViewSettingsDto.disableSidebarStats());
        eListViewSettingsDao.setDisableAutoRefresh(vListViewSettingsDto.disableAutoRefresh());
        eListViewSettingsDao.setTotalFields(vListViewSettingsDto.totalFields());
        eListViewSettingsDao.setFields(vListViewSettingsDto.fields());
        eListViewSettingsDao.setUserTags(vListViewSettingsDto.userTags());
        eListViewSettingsDao.setComments(vListViewSettingsDto.comments());
        eListViewSettingsDao.setAssign(vListViewSettingsDto.assign());
        eListViewSettingsDao.setLikedBy(vListViewSettingsDto.likedBy());
    }
}