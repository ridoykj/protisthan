package com.itbd.application.db.dto;

import com.itbd.application.db.dao.EnergyPointRuleDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record EnergyPointRuleDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Boolean enabled,
        String ruleName,
        String referenceDocType,
        String forDocEvent,
        String fieldToCheck,
        Integer points,
        Boolean forAssignedUsers,
        String userField,
        String multiplierField,
        Integer maxPoints,
        Boolean applyOnlyOnce,
        String condition,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static EnergyPointRuleDto fromEntity(EnergyPointRuleDao eEnergyPointRuleDao) {
        return new EnergyPointRuleDto(
                eEnergyPointRuleDao.getName(),
                eEnergyPointRuleDao.getCreation(),
                eEnergyPointRuleDao.getModified(),
                eEnergyPointRuleDao.getModifiedBy(),
                eEnergyPointRuleDao.getOwner(),
                eEnergyPointRuleDao.getIsDocStatus(),
                eEnergyPointRuleDao.getIdx(),
                eEnergyPointRuleDao.getEnabled(),
                eEnergyPointRuleDao.getRuleName(),
                eEnergyPointRuleDao.getReferenceDocType(),
                eEnergyPointRuleDao.getForDocEvent(),
                eEnergyPointRuleDao.getFieldToCheck(),
                eEnergyPointRuleDao.getPoints(),
                eEnergyPointRuleDao.getForAssignedUsers(),
                eEnergyPointRuleDao.getUserField(),
                eEnergyPointRuleDao.getMultiplierField(),
                eEnergyPointRuleDao.getMaxPoints(),
                eEnergyPointRuleDao.getApplyOnlyOnce(),
                eEnergyPointRuleDao.getCondition(),
                eEnergyPointRuleDao.getUserTags(),
                eEnergyPointRuleDao.getComments(),
                eEnergyPointRuleDao.getAssign(),
                eEnergyPointRuleDao.getLikedBy());
    }

    public static void fromDTO(EnergyPointRuleDto vEnergyPointRuleDto, EnergyPointRuleDao eEnergyPointRuleDao) {
        eEnergyPointRuleDao.setName(vEnergyPointRuleDto.name());
        eEnergyPointRuleDao.setCreation(vEnergyPointRuleDto.creation());
        eEnergyPointRuleDao.setModified(vEnergyPointRuleDto.modified());
        eEnergyPointRuleDao.setModifiedBy(vEnergyPointRuleDto.modifiedBy());
        eEnergyPointRuleDao.setOwner(vEnergyPointRuleDto.owner());
        eEnergyPointRuleDao.setIsDocStatus(vEnergyPointRuleDto.isDocStatus());
        eEnergyPointRuleDao.setIdx(vEnergyPointRuleDto.idx());
        eEnergyPointRuleDao.setEnabled(vEnergyPointRuleDto.enabled());
        eEnergyPointRuleDao.setRuleName(vEnergyPointRuleDto.ruleName());
        eEnergyPointRuleDao.setReferenceDocType(vEnergyPointRuleDto.referenceDocType());
        eEnergyPointRuleDao.setForDocEvent(vEnergyPointRuleDto.forDocEvent());
        eEnergyPointRuleDao.setFieldToCheck(vEnergyPointRuleDto.fieldToCheck());
        eEnergyPointRuleDao.setPoints(vEnergyPointRuleDto.points());
        eEnergyPointRuleDao.setForAssignedUsers(vEnergyPointRuleDto.forAssignedUsers());
        eEnergyPointRuleDao.setUserField(vEnergyPointRuleDto.userField());
        eEnergyPointRuleDao.setMultiplierField(vEnergyPointRuleDto.multiplierField());
        eEnergyPointRuleDao.setMaxPoints(vEnergyPointRuleDto.maxPoints());
        eEnergyPointRuleDao.setApplyOnlyOnce(vEnergyPointRuleDto.applyOnlyOnce());
        eEnergyPointRuleDao.setCondition(vEnergyPointRuleDto.condition());
        eEnergyPointRuleDao.setUserTags(vEnergyPointRuleDto.userTags());
        eEnergyPointRuleDao.setComments(vEnergyPointRuleDto.comments());
        eEnergyPointRuleDao.setAssign(vEnergyPointRuleDto.assign());
        eEnergyPointRuleDao.setLikedBy(vEnergyPointRuleDto.likedBy());
    }
}