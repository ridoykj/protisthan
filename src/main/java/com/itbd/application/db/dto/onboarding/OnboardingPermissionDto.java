package com.itbd.application.db.dto.onboarding;

import com.itbd.application.db.dao.onboarding.OnboardingPermissionDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record OnboardingPermissionDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String role,
        String parent,
        String parentField,
        String parentType
) {
    public static OnboardingPermissionDto fromEntity(OnboardingPermissionDao eOnboardingPermissionDao) {
        return new OnboardingPermissionDto(
                eOnboardingPermissionDao.getName(),
                eOnboardingPermissionDao.getCreation(),
                eOnboardingPermissionDao.getModified(),
                eOnboardingPermissionDao.getModifiedBy(),
                eOnboardingPermissionDao.getOwner(),
                eOnboardingPermissionDao.getIsDocStatus(),
                eOnboardingPermissionDao.getIdx(),
                eOnboardingPermissionDao.getRole(),
                eOnboardingPermissionDao.getParent(),
                eOnboardingPermissionDao.getParentField(),
                eOnboardingPermissionDao.getParentType());
    }

    public static void fromDTO(OnboardingPermissionDto vOnboardingPermissionDto, OnboardingPermissionDao eOnboardingPermissionDao) {
        eOnboardingPermissionDao.setName(vOnboardingPermissionDto.name());
        eOnboardingPermissionDao.setCreation(vOnboardingPermissionDto.creation());
        eOnboardingPermissionDao.setModified(vOnboardingPermissionDto.modified());
        eOnboardingPermissionDao.setModifiedBy(vOnboardingPermissionDto.modifiedBy());
        eOnboardingPermissionDao.setOwner(vOnboardingPermissionDto.owner());
        eOnboardingPermissionDao.setIsDocStatus(vOnboardingPermissionDto.isDocStatus());
        eOnboardingPermissionDao.setIdx(vOnboardingPermissionDto.idx());
        eOnboardingPermissionDao.setRole(vOnboardingPermissionDto.role());
        eOnboardingPermissionDao.setParent(vOnboardingPermissionDto.parent());
        eOnboardingPermissionDao.setParentField(vOnboardingPermissionDto.parentField());
        eOnboardingPermissionDao.setParentType(vOnboardingPermissionDto.parentType());
    }
}