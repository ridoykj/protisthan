package com.itbd.application.db.dto;

import com.itbd.application.db.dao.desk.FormTourDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record FormTourDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String title,
        String viewName,
        String workspaceName,
        String listName,
        String reportName,
        String dashboardName,
        Boolean newDocumentForm,
        String pageName,
        String referenceDocType,
        String module,
        Boolean uiTour,
        Boolean trackSteps,
        Boolean isStandard,
        Boolean saveOnComplete,
        Boolean firstDocument,
        Boolean includeNameField,
        String pageRoute,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static FormTourDto fromEntity(FormTourDao eFormTourDao) {
        return new FormTourDto(
                eFormTourDao.getName(),
                eFormTourDao.getCreation(),
                eFormTourDao.getModified(),
                eFormTourDao.getModifiedBy(),
                eFormTourDao.getOwner(),
                eFormTourDao.getIsDocStatus(),
                eFormTourDao.getIdx(),
                eFormTourDao.getTitle(),
                eFormTourDao.getViewName(),
                eFormTourDao.getWorkspaceName(),
                eFormTourDao.getListName(),
                eFormTourDao.getReportName(),
                eFormTourDao.getDashboardName(),
                eFormTourDao.getNewDocumentForm(),
                eFormTourDao.getPageName(),
                eFormTourDao.getReferenceDocType(),
                eFormTourDao.getModule(),
                eFormTourDao.getUiTour(),
                eFormTourDao.getTrackSteps(),
                eFormTourDao.getIsStandard(),
                eFormTourDao.getSaveOnComplete(),
                eFormTourDao.getFirstDocument(),
                eFormTourDao.getIncludeNameField(),
                eFormTourDao.getPageRoute(),
                eFormTourDao.getUserTags(),
                eFormTourDao.getComments(),
                eFormTourDao.getAssign(),
                eFormTourDao.getLikedBy());
    }

    public static void fromDTO(FormTourDto vFormTourDto, FormTourDao eFormTourDao) {
        eFormTourDao.setName(vFormTourDto.name());
        eFormTourDao.setCreation(vFormTourDto.creation());
        eFormTourDao.setModified(vFormTourDto.modified());
        eFormTourDao.setModifiedBy(vFormTourDto.modifiedBy());
        eFormTourDao.setOwner(vFormTourDto.owner());
        eFormTourDao.setIsDocStatus(vFormTourDto.isDocStatus());
        eFormTourDao.setIdx(vFormTourDto.idx());
        eFormTourDao.setTitle(vFormTourDto.title());
        eFormTourDao.setViewName(vFormTourDto.viewName());
        eFormTourDao.setWorkspaceName(vFormTourDto.workspaceName());
        eFormTourDao.setListName(vFormTourDto.listName());
        eFormTourDao.setReportName(vFormTourDto.reportName());
        eFormTourDao.setDashboardName(vFormTourDto.dashboardName());
        eFormTourDao.setNewDocumentForm(vFormTourDto.newDocumentForm());
        eFormTourDao.setPageName(vFormTourDto.pageName());
        eFormTourDao.setReferenceDocType(vFormTourDto.referenceDocType());
        eFormTourDao.setModule(vFormTourDto.module());
        eFormTourDao.setUiTour(vFormTourDto.uiTour());
        eFormTourDao.setTrackSteps(vFormTourDto.trackSteps());
        eFormTourDao.setIsStandard(vFormTourDto.isStandard());
        eFormTourDao.setSaveOnComplete(vFormTourDto.saveOnComplete());
        eFormTourDao.setFirstDocument(vFormTourDto.firstDocument());
        eFormTourDao.setIncludeNameField(vFormTourDto.includeNameField());
        eFormTourDao.setPageRoute(vFormTourDto.pageRoute());
        eFormTourDao.setUserTags(vFormTourDto.userTags());
        eFormTourDao.setComments(vFormTourDto.comments());
        eFormTourDao.setAssign(vFormTourDto.assign());
        eFormTourDao.setLikedBy(vFormTourDto.likedBy());
    }
}