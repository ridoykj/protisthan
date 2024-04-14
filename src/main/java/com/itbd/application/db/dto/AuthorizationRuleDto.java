package com.itbd.application.db.dto;

import com.itbd.application.db.dao.AuthorizationRuleDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record AuthorizationRuleDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String transaction,
        String basedOn,
        String customerOrItem,
        String masterName,
        String company,
        BigDecimal value,
        String systemRole,
        String toEmp,
        String systemUser,
        String toDesignation,
        String approvingRole,
        String approvingUser,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static AuthorizationRuleDto fromEntity(AuthorizationRuleDao eAuthorizationRuleDao) {
        return new AuthorizationRuleDto(
                eAuthorizationRuleDao.getName(),
                eAuthorizationRuleDao.getCreation(),
                eAuthorizationRuleDao.getModified(),
                eAuthorizationRuleDao.getModifiedBy(),
                eAuthorizationRuleDao.getOwner(),
                eAuthorizationRuleDao.getIsDocStatus(),
                eAuthorizationRuleDao.getIdx(),
                eAuthorizationRuleDao.getTransaction(),
                eAuthorizationRuleDao.getBasedOn(),
                eAuthorizationRuleDao.getCustomerOrItem(),
                eAuthorizationRuleDao.getMasterName(),
                eAuthorizationRuleDao.getCompany(),
                eAuthorizationRuleDao.getValue(),
                eAuthorizationRuleDao.getSystemRole(),
                eAuthorizationRuleDao.getToEmp(),
                eAuthorizationRuleDao.getSystemUser(),
                eAuthorizationRuleDao.getToDesignation(),
                eAuthorizationRuleDao.getApprovingRole(),
                eAuthorizationRuleDao.getApprovingUser(),
                eAuthorizationRuleDao.getUserTags(),
                eAuthorizationRuleDao.getComments(),
                eAuthorizationRuleDao.getAssign(),
                eAuthorizationRuleDao.getLikedBy());
    }

    public static void fromDTO(AuthorizationRuleDto vAuthorizationRuleDto, AuthorizationRuleDao eAuthorizationRuleDao) {
        eAuthorizationRuleDao.setName(vAuthorizationRuleDto.name());
        eAuthorizationRuleDao.setCreation(vAuthorizationRuleDto.creation());
        eAuthorizationRuleDao.setModified(vAuthorizationRuleDto.modified());
        eAuthorizationRuleDao.setModifiedBy(vAuthorizationRuleDto.modifiedBy());
        eAuthorizationRuleDao.setOwner(vAuthorizationRuleDto.owner());
        eAuthorizationRuleDao.setIsDocStatus(vAuthorizationRuleDto.isDocStatus());
        eAuthorizationRuleDao.setIdx(vAuthorizationRuleDto.idx());
        eAuthorizationRuleDao.setTransaction(vAuthorizationRuleDto.transaction());
        eAuthorizationRuleDao.setBasedOn(vAuthorizationRuleDto.basedOn());
        eAuthorizationRuleDao.setCustomerOrItem(vAuthorizationRuleDto.customerOrItem());
        eAuthorizationRuleDao.setMasterName(vAuthorizationRuleDto.masterName());
        eAuthorizationRuleDao.setCompany(vAuthorizationRuleDto.company());
        eAuthorizationRuleDao.setValue(vAuthorizationRuleDto.value());
        eAuthorizationRuleDao.setSystemRole(vAuthorizationRuleDto.systemRole());
        eAuthorizationRuleDao.setToEmp(vAuthorizationRuleDto.toEmp());
        eAuthorizationRuleDao.setSystemUser(vAuthorizationRuleDto.systemUser());
        eAuthorizationRuleDao.setToDesignation(vAuthorizationRuleDto.toDesignation());
        eAuthorizationRuleDao.setApprovingRole(vAuthorizationRuleDto.approvingRole());
        eAuthorizationRuleDao.setApprovingUser(vAuthorizationRuleDto.approvingUser());
        eAuthorizationRuleDao.setUserTags(vAuthorizationRuleDto.userTags());
        eAuthorizationRuleDao.setComments(vAuthorizationRuleDto.comments());
        eAuthorizationRuleDao.setAssign(vAuthorizationRuleDto.assign());
        eAuthorizationRuleDao.setLikedBy(vAuthorizationRuleDto.likedBy());
    }
}