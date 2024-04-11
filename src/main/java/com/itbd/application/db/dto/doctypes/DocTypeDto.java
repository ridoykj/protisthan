package com.itbd.application.db.dto.doctypes;

import com.itbd.application.db.dao.doctypes.DocTypeDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record DocTypeDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String searchFields,
        Boolean isSingle,
        Boolean isVirtual,
        Boolean isTree,
        Boolean isTable,
        Boolean editableGrid,
        Boolean trackChanges,
        String module,
        String restrictToDomain,
        String app,
        String autoName,
        String namingRule,
        String titleField,
        String imageField,
        String timelineField,
        String sortField,
        String sortOrder,
        String description,
        String colour,
        Boolean readOnly,
        Boolean inCreate,
        Integer menuIndex,
        String parentNode,
        String smallIcon,
        Boolean allowCopy,
        Boolean allowRename,
        Boolean allowImport,
        Boolean hideToolbar,
        Boolean trackSeen,
        Integer maxAttachments,
        String printOutline,
        String documentType,
        String icon,
        String color,
        String tagFields,
        String subject,
        String lastUpdate,
        String engine,
        String defaultPrintFormat,
        Boolean isSubmittable,
        Boolean showNameInGlobalSearch,
        String userTags,
        Boolean custom,
        Boolean beta,
        Boolean hasWebView,
        Boolean allowGuestToView,
        String route,
        String isPublishedField,
        String websiteSearchField,
        Boolean emailAppendTo,
        String subjectField,
        String senderField,
        Boolean showTitleFieldInLink,
        String migrationHash,
        Boolean translatedDocType,
        Boolean isCalendarAndGantt,
        Boolean quickEntry,
        Boolean trackViews,
        Boolean queueInBackground,
        String documentation,
        String nsmParentField,
        Boolean allowEventsInTimeline,
        Boolean allowAutoRepeat,
        Boolean makeAttachmentsPublic,
        String defaultView,
        Boolean forceReRouteToDefaultView,
        Boolean showPreviewPopup,
        String defaultEmailTemplate,
        String senderNameField,
        Boolean indexWebPagesForSearch,
        String comments,
        String assign,
        String likedBy
) {
    public static DocTypeDto fromEntity(DocTypeDao eDocTypeDao) {
        return new DocTypeDto(
                eDocTypeDao.getName(),
                eDocTypeDao.getCreation(),
                eDocTypeDao.getModified(),
                eDocTypeDao.getModifiedBy(),
                eDocTypeDao.getOwner(),
                eDocTypeDao.getIsDocStatus(),
                eDocTypeDao.getIdx(),
                eDocTypeDao.getSearchFields(),
                eDocTypeDao.getIsSingle(),
                eDocTypeDao.getIsVirtual(),
                eDocTypeDao.getIsTree(),
                eDocTypeDao.getIsTable(),
                eDocTypeDao.getEditableGrid(),
                eDocTypeDao.getTrackChanges(),
                eDocTypeDao.getModule(),
                eDocTypeDao.getRestrictToDomain(),
                eDocTypeDao.getApp(),
                eDocTypeDao.getAutoName(),
                eDocTypeDao.getNamingRule(),
                eDocTypeDao.getTitleField(),
                eDocTypeDao.getImageField(),
                eDocTypeDao.getTimelineField(),
                eDocTypeDao.getSortField(),
                eDocTypeDao.getSortOrder(),
                eDocTypeDao.getDescription(),
                eDocTypeDao.getColour(),
                eDocTypeDao.getReadOnly(),
                eDocTypeDao.getInCreate(),
                eDocTypeDao.getMenuIndex(),
                eDocTypeDao.getParentNode(),
                eDocTypeDao.getSmallIcon(),
                eDocTypeDao.getAllowCopy(),
                eDocTypeDao.getAllowRename(),
                eDocTypeDao.getAllowImport(),
                eDocTypeDao.getHideToolbar(),
                eDocTypeDao.getTrackSeen(),
                eDocTypeDao.getMaxAttachments(),
                eDocTypeDao.getPrintOutline(),
                eDocTypeDao.getDocumentType(),
                eDocTypeDao.getIcon(),
                eDocTypeDao.getColor(),
                eDocTypeDao.getTagFields(),
                eDocTypeDao.getSubject(),
                eDocTypeDao.getLastUpdate(),
                eDocTypeDao.getEngine(),
                eDocTypeDao.getDefaultPrintFormat(),
                eDocTypeDao.getIsSubmittable(),
                eDocTypeDao.getShowNameInGlobalSearch(),
                eDocTypeDao.getUserTags(),
                eDocTypeDao.getCustom(),
                eDocTypeDao.getBeta(),
                eDocTypeDao.getHasWebView(),
                eDocTypeDao.getAllowGuestToView(),
                eDocTypeDao.getRoute(),
                eDocTypeDao.getIsPublishedField(),
                eDocTypeDao.getWebsiteSearchField(),
                eDocTypeDao.getEmailAppendTo(),
                eDocTypeDao.getSubjectField(),
                eDocTypeDao.getSenderField(),
                eDocTypeDao.getShowTitleFieldInLink(),
                eDocTypeDao.getMigrationHash(),
                eDocTypeDao.getTranslatedDocType(),
                eDocTypeDao.getIsCalendarAndGantt(),
                eDocTypeDao.getQuickEntry(),
                eDocTypeDao.getTrackViews(),
                eDocTypeDao.getQueueInBackground(),
                eDocTypeDao.getDocumentation(),
                eDocTypeDao.getNsmParentField(),
                eDocTypeDao.getAllowEventsInTimeline(),
                eDocTypeDao.getAllowAutoRepeat(),
                eDocTypeDao.getMakeAttachmentsPublic(),
                eDocTypeDao.getDefaultView(),
                eDocTypeDao.getForceReRouteToDefaultView(),
                eDocTypeDao.getShowPreviewPopup(),
                eDocTypeDao.getDefaultEmailTemplate(),
                eDocTypeDao.getSenderNameField(),
                eDocTypeDao.getIndexWebPagesForSearch(),
                eDocTypeDao.getComments(),
                eDocTypeDao.getAssign(),
                eDocTypeDao.getLikedBy());
    }

    public static void fromDTO(DocTypeDto vDocTypeDto, DocTypeDao eDocTypeDao) {
        eDocTypeDao.setName(vDocTypeDto.name());
        eDocTypeDao.setCreation(vDocTypeDto.creation());
        eDocTypeDao.setModified(vDocTypeDto.modified());
        eDocTypeDao.setModifiedBy(vDocTypeDto.modifiedBy());
        eDocTypeDao.setOwner(vDocTypeDto.owner());
        eDocTypeDao.setIsDocStatus(vDocTypeDto.isDocStatus());
        eDocTypeDao.setIdx(vDocTypeDto.idx());
        eDocTypeDao.setSearchFields(vDocTypeDto.searchFields());
        eDocTypeDao.setIsSingle(vDocTypeDto.isSingle());
        eDocTypeDao.setIsVirtual(vDocTypeDto.isVirtual());
        eDocTypeDao.setIsTree(vDocTypeDto.isTree());
        eDocTypeDao.setIsTable(vDocTypeDto.isTable());
        eDocTypeDao.setEditableGrid(vDocTypeDto.editableGrid());
        eDocTypeDao.setTrackChanges(vDocTypeDto.trackChanges());
        eDocTypeDao.setModule(vDocTypeDto.module());
        eDocTypeDao.setRestrictToDomain(vDocTypeDto.restrictToDomain());
        eDocTypeDao.setApp(vDocTypeDto.app());
        eDocTypeDao.setAutoName(vDocTypeDto.autoName());
        eDocTypeDao.setNamingRule(vDocTypeDto.namingRule());
        eDocTypeDao.setTitleField(vDocTypeDto.titleField());
        eDocTypeDao.setImageField(vDocTypeDto.imageField());
        eDocTypeDao.setTimelineField(vDocTypeDto.timelineField());
        eDocTypeDao.setSortField(vDocTypeDto.sortField());
        eDocTypeDao.setSortOrder(vDocTypeDto.sortOrder());
        eDocTypeDao.setDescription(vDocTypeDto.description());
        eDocTypeDao.setColour(vDocTypeDto.colour());
        eDocTypeDao.setReadOnly(vDocTypeDto.readOnly());
        eDocTypeDao.setInCreate(vDocTypeDto.inCreate());
        eDocTypeDao.setMenuIndex(vDocTypeDto.menuIndex());
        eDocTypeDao.setParentNode(vDocTypeDto.parentNode());
        eDocTypeDao.setSmallIcon(vDocTypeDto.smallIcon());
        eDocTypeDao.setAllowCopy(vDocTypeDto.allowCopy());
        eDocTypeDao.setAllowRename(vDocTypeDto.allowRename());
        eDocTypeDao.setAllowImport(vDocTypeDto.allowImport());
        eDocTypeDao.setHideToolbar(vDocTypeDto.hideToolbar());
        eDocTypeDao.setTrackSeen(vDocTypeDto.trackSeen());
        eDocTypeDao.setMaxAttachments(vDocTypeDto.maxAttachments());
        eDocTypeDao.setPrintOutline(vDocTypeDto.printOutline());
        eDocTypeDao.setDocumentType(vDocTypeDto.documentType());
        eDocTypeDao.setIcon(vDocTypeDto.icon());
        eDocTypeDao.setColor(vDocTypeDto.color());
        eDocTypeDao.setTagFields(vDocTypeDto.tagFields());
        eDocTypeDao.setSubject(vDocTypeDto.subject());
        eDocTypeDao.setLastUpdate(vDocTypeDto.lastUpdate());
        eDocTypeDao.setEngine(vDocTypeDto.engine());
        eDocTypeDao.setDefaultPrintFormat(vDocTypeDto.defaultPrintFormat());
        eDocTypeDao.setIsSubmittable(vDocTypeDto.isSubmittable());
        eDocTypeDao.setShowNameInGlobalSearch(vDocTypeDto.showNameInGlobalSearch());
        eDocTypeDao.setUserTags(vDocTypeDto.userTags());
        eDocTypeDao.setCustom(vDocTypeDto.custom());
        eDocTypeDao.setBeta(vDocTypeDto.beta());
        eDocTypeDao.setHasWebView(vDocTypeDto.hasWebView());
        eDocTypeDao.setAllowGuestToView(vDocTypeDto.allowGuestToView());
        eDocTypeDao.setRoute(vDocTypeDto.route());
        eDocTypeDao.setIsPublishedField(vDocTypeDto.isPublishedField());
        eDocTypeDao.setWebsiteSearchField(vDocTypeDto.websiteSearchField());
        eDocTypeDao.setEmailAppendTo(vDocTypeDto.emailAppendTo());
        eDocTypeDao.setSubjectField(vDocTypeDto.subjectField());
        eDocTypeDao.setSenderField(vDocTypeDto.senderField());
        eDocTypeDao.setShowTitleFieldInLink(vDocTypeDto.showTitleFieldInLink());
        eDocTypeDao.setMigrationHash(vDocTypeDto.migrationHash());
        eDocTypeDao.setTranslatedDocType(vDocTypeDto.translatedDocType());
        eDocTypeDao.setIsCalendarAndGantt(vDocTypeDto.isCalendarAndGantt());
        eDocTypeDao.setQuickEntry(vDocTypeDto.quickEntry());
        eDocTypeDao.setTrackViews(vDocTypeDto.trackViews());
        eDocTypeDao.setQueueInBackground(vDocTypeDto.queueInBackground());
        eDocTypeDao.setDocumentation(vDocTypeDto.documentation());
        eDocTypeDao.setNsmParentField(vDocTypeDto.nsmParentField());
        eDocTypeDao.setAllowEventsInTimeline(vDocTypeDto.allowEventsInTimeline());
        eDocTypeDao.setAllowAutoRepeat(vDocTypeDto.allowAutoRepeat());
        eDocTypeDao.setMakeAttachmentsPublic(vDocTypeDto.makeAttachmentsPublic());
        eDocTypeDao.setDefaultView(vDocTypeDto.defaultView());
        eDocTypeDao.setForceReRouteToDefaultView(vDocTypeDto.forceReRouteToDefaultView());
        eDocTypeDao.setShowPreviewPopup(vDocTypeDto.showPreviewPopup());
        eDocTypeDao.setDefaultEmailTemplate(vDocTypeDto.defaultEmailTemplate());
        eDocTypeDao.setSenderNameField(vDocTypeDto.senderNameField());
        eDocTypeDao.setIndexWebPagesForSearch(vDocTypeDto.indexWebPagesForSearch());
        eDocTypeDao.setComments(vDocTypeDto.comments());
        eDocTypeDao.setAssign(vDocTypeDto.assign());
        eDocTypeDao.setLikedBy(vDocTypeDto.likedBy());
    }
}