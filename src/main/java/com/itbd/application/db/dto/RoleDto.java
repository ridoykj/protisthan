package com.itbd.application.db.dto;

import com.itbd.application.db.dao.RoleDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record RoleDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String roleName,
        String homePage,
        String restrictToDomain,
        Boolean disabled,
        Boolean isCustom,
        Boolean deskAccess,
        Boolean twoFactorAuth,
        Boolean searchBar,
        Boolean notifications,
        Boolean listSidebar,
        Boolean bulkActions,
        Boolean viewSwitcher,
        Boolean formSidebar,
        Boolean timeline,
        Boolean dashboard,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static RoleDto fromEntity(RoleDao eRoleDao) {
        return new RoleDto(
                eRoleDao.getName(),
                eRoleDao.getCreation(),
                eRoleDao.getModified(),
                eRoleDao.getModifiedBy(),
                eRoleDao.getOwner(),
                eRoleDao.getIsDocStatus(),
                eRoleDao.getIdx(),
                eRoleDao.getRoleName(),
                eRoleDao.getHomePage(),
                eRoleDao.getRestrictToDomain(),
                eRoleDao.getDisabled(),
                eRoleDao.getIsCustom(),
                eRoleDao.getDeskAccess(),
                eRoleDao.getTwoFactorAuth(),
                eRoleDao.getSearchBar(),
                eRoleDao.getNotifications(),
                eRoleDao.getListSidebar(),
                eRoleDao.getBulkActions(),
                eRoleDao.getViewSwitcher(),
                eRoleDao.getFormSidebar(),
                eRoleDao.getTimeline(),
                eRoleDao.getDashboard(),
                eRoleDao.getUserTags(),
                eRoleDao.getComments(),
                eRoleDao.getAssign(),
                eRoleDao.getLikedBy());
    }

    public static void fromDTO(RoleDto vRoleDto, RoleDao eRoleDao) {
        eRoleDao.setName(vRoleDto.name());
        eRoleDao.setCreation(vRoleDto.creation());
        eRoleDao.setModified(vRoleDto.modified());
        eRoleDao.setModifiedBy(vRoleDto.modifiedBy());
        eRoleDao.setOwner(vRoleDto.owner());
        eRoleDao.setIsDocStatus(vRoleDto.isDocStatus());
        eRoleDao.setIdx(vRoleDto.idx());
        eRoleDao.setRoleName(vRoleDto.roleName());
        eRoleDao.setHomePage(vRoleDto.homePage());
        eRoleDao.setRestrictToDomain(vRoleDto.restrictToDomain());
        eRoleDao.setDisabled(vRoleDto.disabled());
        eRoleDao.setIsCustom(vRoleDto.isCustom());
        eRoleDao.setDeskAccess(vRoleDto.deskAccess());
        eRoleDao.setTwoFactorAuth(vRoleDto.twoFactorAuth());
        eRoleDao.setSearchBar(vRoleDto.searchBar());
        eRoleDao.setNotifications(vRoleDto.notifications());
        eRoleDao.setListSidebar(vRoleDto.listSidebar());
        eRoleDao.setBulkActions(vRoleDto.bulkActions());
        eRoleDao.setViewSwitcher(vRoleDto.viewSwitcher());
        eRoleDao.setFormSidebar(vRoleDto.formSidebar());
        eRoleDao.setTimeline(vRoleDto.timeline());
        eRoleDao.setDashboard(vRoleDto.dashboard());
        eRoleDao.setUserTags(vRoleDto.userTags());
        eRoleDao.setComments(vRoleDto.comments());
        eRoleDao.setAssign(vRoleDto.assign());
        eRoleDao.setLikedBy(vRoleDto.likedBy());
    }
}