package com.itbd.application.db.dto;

import com.itbd.application.db.dao.core.CustomRoleDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record CustomRoleDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String page,
        String report,
        String refDocType,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static CustomRoleDto fromEntity(CustomRoleDao eCustomRoleDao) {
        return new CustomRoleDto(
                eCustomRoleDao.getName(),
                eCustomRoleDao.getCreation(),
                eCustomRoleDao.getModified(),
                eCustomRoleDao.getModifiedBy(),
                eCustomRoleDao.getOwner(),
                eCustomRoleDao.getIsDocStatus(),
                eCustomRoleDao.getIdx(),
                eCustomRoleDao.getPage(),
                eCustomRoleDao.getReport(),
                eCustomRoleDao.getRefDocType(),
                eCustomRoleDao.getUserTags(),
                eCustomRoleDao.getComments(),
                eCustomRoleDao.getAssign(),
                eCustomRoleDao.getLikedBy());
    }

    public static void fromDTO(CustomRoleDto vCustomRoleDto, CustomRoleDao eCustomRoleDao) {
        eCustomRoleDao.setName(vCustomRoleDto.name());
        eCustomRoleDao.setCreation(vCustomRoleDto.creation());
        eCustomRoleDao.setModified(vCustomRoleDto.modified());
        eCustomRoleDao.setModifiedBy(vCustomRoleDto.modifiedBy());
        eCustomRoleDao.setOwner(vCustomRoleDto.owner());
        eCustomRoleDao.setIsDocStatus(vCustomRoleDto.isDocStatus());
        eCustomRoleDao.setIdx(vCustomRoleDto.idx());
        eCustomRoleDao.setPage(vCustomRoleDto.page());
        eCustomRoleDao.setReport(vCustomRoleDto.report());
        eCustomRoleDao.setRefDocType(vCustomRoleDto.refDocType());
        eCustomRoleDao.setUserTags(vCustomRoleDto.userTags());
        eCustomRoleDao.setComments(vCustomRoleDto.comments());
        eCustomRoleDao.setAssign(vCustomRoleDto.assign());
        eCustomRoleDao.setLikedBy(vCustomRoleDto.likedBy());
    }
}