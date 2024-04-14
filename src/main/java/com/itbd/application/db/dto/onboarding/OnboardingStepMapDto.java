package com.itbd.application.db.dto.onboarding;

import com.itbd.application.db.dao.onboarding.OnboardingStepMapDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record OnboardingStepMapDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String step,
        String parent,
        String parentField,
        String parentType
) {
    public static OnboardingStepMapDto fromEntity(OnboardingStepMapDao eOnboardingStepMapDao) {
        return new OnboardingStepMapDto(
                eOnboardingStepMapDao.getName(),
                eOnboardingStepMapDao.getCreation(),
                eOnboardingStepMapDao.getModified(),
                eOnboardingStepMapDao.getModifiedBy(),
                eOnboardingStepMapDao.getOwner(),
                eOnboardingStepMapDao.getIsDocStatus(),
                eOnboardingStepMapDao.getIdx(),
                eOnboardingStepMapDao.getStep(),
                eOnboardingStepMapDao.getParent(),
                eOnboardingStepMapDao.getParentField(),
                eOnboardingStepMapDao.getParentType());
    }

    public static void fromDTO(OnboardingStepMapDto vOnboardingStepMapDto, OnboardingStepMapDao eOnboardingStepMapDao) {
        eOnboardingStepMapDao.setName(vOnboardingStepMapDto.name());
        eOnboardingStepMapDao.setCreation(vOnboardingStepMapDto.creation());
        eOnboardingStepMapDao.setModified(vOnboardingStepMapDto.modified());
        eOnboardingStepMapDao.setModifiedBy(vOnboardingStepMapDto.modifiedBy());
        eOnboardingStepMapDao.setOwner(vOnboardingStepMapDto.owner());
        eOnboardingStepMapDao.setIsDocStatus(vOnboardingStepMapDto.isDocStatus());
        eOnboardingStepMapDao.setIdx(vOnboardingStepMapDto.idx());
        eOnboardingStepMapDao.setStep(vOnboardingStepMapDto.step());
        eOnboardingStepMapDao.setParent(vOnboardingStepMapDto.parent());
        eOnboardingStepMapDao.setParentField(vOnboardingStepMapDto.parentField());
        eOnboardingStepMapDao.setParentType(vOnboardingStepMapDto.parentType());
    }
}