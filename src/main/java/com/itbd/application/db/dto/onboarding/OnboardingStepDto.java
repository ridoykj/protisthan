package com.itbd.application.db.dto.onboarding;

import com.itbd.application.db.dao.desk.onboarding.OnboardingStepDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record OnboardingStepDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String title,
        Boolean isComplete,
        Boolean isSkipped,
        String description,
        String introVideoUrl,
        String action,
        String actionLabel,
        String referenceDocument,
        Boolean showFullForm,
        Boolean showFormTour,
        String formTour,
        Boolean isSingle,
        String referenceReport,
        String reportReferenceDocType,
        String reportType,
        String reportDescription,
        String path,
        String callbackTitle,
        String callbackMessage,
        Boolean validateAction,
        String field,
        String valueToValidate,
        String videoUrl,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static OnboardingStepDto fromEntity(OnboardingStepDao eOnboardingStepDao) {
        return new OnboardingStepDto(
                eOnboardingStepDao.getName(),
                eOnboardingStepDao.getCreation(),
                eOnboardingStepDao.getModified(),
                eOnboardingStepDao.getModifiedBy(),
                eOnboardingStepDao.getOwner(),
                eOnboardingStepDao.getIsDocStatus(),
                eOnboardingStepDao.getIdx(),
                eOnboardingStepDao.getTitle(),
                eOnboardingStepDao.getIsComplete(),
                eOnboardingStepDao.getIsSkipped(),
                eOnboardingStepDao.getDescription(),
                eOnboardingStepDao.getIntroVideoUrl(),
                eOnboardingStepDao.getAction(),
                eOnboardingStepDao.getActionLabel(),
                eOnboardingStepDao.getReferenceDocument(),
                eOnboardingStepDao.getShowFullForm(),
                eOnboardingStepDao.getShowFormTour(),
                eOnboardingStepDao.getFormTour(),
                eOnboardingStepDao.getIsSingle(),
                eOnboardingStepDao.getReferenceReport(),
                eOnboardingStepDao.getReportReferenceDocType(),
                eOnboardingStepDao.getReportType(),
                eOnboardingStepDao.getReportDescription(),
                eOnboardingStepDao.getPath(),
                eOnboardingStepDao.getCallbackTitle(),
                eOnboardingStepDao.getCallbackMessage(),
                eOnboardingStepDao.getValidateAction(),
                eOnboardingStepDao.getField(),
                eOnboardingStepDao.getValueToValidate(),
                eOnboardingStepDao.getVideoUrl(),
                eOnboardingStepDao.getUserTags(),
                eOnboardingStepDao.getComments(),
                eOnboardingStepDao.getAssign(),
                eOnboardingStepDao.getLikedBy());
    }

    public static void fromDTO(OnboardingStepDto vOnboardingStepDto, OnboardingStepDao eOnboardingStepDao) {
        eOnboardingStepDao.setName(vOnboardingStepDto.name());
        eOnboardingStepDao.setCreation(vOnboardingStepDto.creation());
        eOnboardingStepDao.setModified(vOnboardingStepDto.modified());
        eOnboardingStepDao.setModifiedBy(vOnboardingStepDto.modifiedBy());
        eOnboardingStepDao.setOwner(vOnboardingStepDto.owner());
        eOnboardingStepDao.setIsDocStatus(vOnboardingStepDto.isDocStatus());
        eOnboardingStepDao.setIdx(vOnboardingStepDto.idx());
        eOnboardingStepDao.setTitle(vOnboardingStepDto.title());
        eOnboardingStepDao.setIsComplete(vOnboardingStepDto.isComplete());
        eOnboardingStepDao.setIsSkipped(vOnboardingStepDto.isSkipped());
        eOnboardingStepDao.setDescription(vOnboardingStepDto.description());
        eOnboardingStepDao.setIntroVideoUrl(vOnboardingStepDto.introVideoUrl());
        eOnboardingStepDao.setAction(vOnboardingStepDto.action());
        eOnboardingStepDao.setActionLabel(vOnboardingStepDto.actionLabel());
        eOnboardingStepDao.setReferenceDocument(vOnboardingStepDto.referenceDocument());
        eOnboardingStepDao.setShowFullForm(vOnboardingStepDto.showFullForm());
        eOnboardingStepDao.setShowFormTour(vOnboardingStepDto.showFormTour());
        eOnboardingStepDao.setFormTour(vOnboardingStepDto.formTour());
        eOnboardingStepDao.setIsSingle(vOnboardingStepDto.isSingle());
        eOnboardingStepDao.setReferenceReport(vOnboardingStepDto.referenceReport());
        eOnboardingStepDao.setReportReferenceDocType(vOnboardingStepDto.reportReferenceDocType());
        eOnboardingStepDao.setReportType(vOnboardingStepDto.reportType());
        eOnboardingStepDao.setReportDescription(vOnboardingStepDto.reportDescription());
        eOnboardingStepDao.setPath(vOnboardingStepDto.path());
        eOnboardingStepDao.setCallbackTitle(vOnboardingStepDto.callbackTitle());
        eOnboardingStepDao.setCallbackMessage(vOnboardingStepDto.callbackMessage());
        eOnboardingStepDao.setValidateAction(vOnboardingStepDto.validateAction());
        eOnboardingStepDao.setField(vOnboardingStepDto.field());
        eOnboardingStepDao.setValueToValidate(vOnboardingStepDto.valueToValidate());
        eOnboardingStepDao.setVideoUrl(vOnboardingStepDto.videoUrl());
        eOnboardingStepDao.setUserTags(vOnboardingStepDto.userTags());
        eOnboardingStepDao.setComments(vOnboardingStepDto.comments());
        eOnboardingStepDao.setAssign(vOnboardingStepDto.assign());
        eOnboardingStepDao.setLikedBy(vOnboardingStepDto.likedBy());
    }
}