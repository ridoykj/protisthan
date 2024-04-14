package com.itbd.application.db.dto.doctypes;

import com.itbd.application.db.dao.doctypes.DocFieldDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record DocFieldDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        String parent,
        String parentField,
        String parentType,
        Integer idx,
        String fieldName,
        String label,
        String oldFieldName,
        String fieldType,
        String oldFieldType,
        String options,
        Boolean searchIndex,
        Boolean showDashboard,
        Boolean hidden,
        Integer setOnlyOnce,
        Boolean allowInQuickEntry,
        Boolean printHide,
        Boolean reportHide,
        Boolean reqd,
        Boolean bold,
        Boolean inGlobalSearch,
        Boolean collapsible,
        Boolean unique,
        Boolean noCopy,
        Boolean allowOnSubmit,
        Boolean showPreviewPopup,
        String trigger,
        String collapsibleDependsOn,
        String mandatoryDependsOn,
        String readOnlyDependsOn,
        String dependsOn,
        Integer permLevel,
        Boolean ignoreUserPermissions,
        String width,
        String printWidth,
        Integer columns,
        String defaults,
        String description,
        Boolean inListView,
        Boolean fetchIfEmpty,
        Boolean inFilter,
        Boolean rememberLastSelectedValue,
        Boolean ignoreXssFilter,
        Boolean printHideIfNoValue,
        Boolean allowBulkEdit,
        Boolean inStandardFilter,
        Boolean inPreview,
        Boolean readOnly,
        String precision,
        String maxHeight,
        Integer length,
        Boolean translatable,
        Boolean hideBorder,
        Boolean hideDays,
        Boolean hideSeconds,
        Boolean nonNegative,
        Boolean isVirtual,
        Boolean sortOptions,
        String fetchFrom,
        String documentationUrl
) {
    public static DocFieldDto fromEntity(DocFieldDao eDocFieldDao) {
        return new DocFieldDto(
                eDocFieldDao.getName(),
                eDocFieldDao.getCreation(),
                eDocFieldDao.getModified(),
                eDocFieldDao.getModifiedBy(),
                eDocFieldDao.getOwner(),
                eDocFieldDao.getIsDocStatus(),
                eDocFieldDao.getParent(),
                eDocFieldDao.getParentField(),
                eDocFieldDao.getParentType(),
                eDocFieldDao.getIdx(),
                eDocFieldDao.getFieldName(),
                eDocFieldDao.getLabel(),
                eDocFieldDao.getOldFieldName(),
                eDocFieldDao.getFieldType(),
                eDocFieldDao.getOldFieldType(),
                eDocFieldDao.getOptions(),
                eDocFieldDao.getSearchIndex(),
                eDocFieldDao.getShowDashboard(),
                eDocFieldDao.getHidden(),
                eDocFieldDao.getSetOnlyOnce(),
                eDocFieldDao.getAllowInQuickEntry(),
                eDocFieldDao.getPrintHide(),
                eDocFieldDao.getReportHide(),
                eDocFieldDao.getReqd(),
                eDocFieldDao.getBold(),
                eDocFieldDao.getInGlobalSearch(),
                eDocFieldDao.getCollapsible(),
                eDocFieldDao.getUnique(),
                eDocFieldDao.getNoCopy(),
                eDocFieldDao.getAllowOnSubmit(),
                eDocFieldDao.getShowPreviewPopup(),
                eDocFieldDao.getTrigger(),
                eDocFieldDao.getCollapsibleDependsOn(),
                eDocFieldDao.getMandatoryDependsOn(),
                eDocFieldDao.getReadOnlyDependsOn(),
                eDocFieldDao.getDependsOn(),
                eDocFieldDao.getPermLevel(),
                eDocFieldDao.getIgnoreUserPermissions(),
                eDocFieldDao.getWidth(),
                eDocFieldDao.getPrintWidth(),
                eDocFieldDao.getColumns(),
                eDocFieldDao.getDefaults(),
                eDocFieldDao.getDescription(),
                eDocFieldDao.getInListView(),
                eDocFieldDao.getFetchIfEmpty(),
                eDocFieldDao.getInFilter(),
                eDocFieldDao.getRememberLastSelectedValue(),
                eDocFieldDao.getIgnoreXssFilter(),
                eDocFieldDao.getPrintHideIfNoValue(),
                eDocFieldDao.getAllowBulkEdit(),
                eDocFieldDao.getInStandardFilter(),
                eDocFieldDao.getInPreview(),
                eDocFieldDao.getReadOnly(),
                eDocFieldDao.getPrecision(),
                eDocFieldDao.getMaxHeight(),
                eDocFieldDao.getLength(),
                eDocFieldDao.getTranslatable(),
                eDocFieldDao.getHideBorder(),
                eDocFieldDao.getHideDays(),
                eDocFieldDao.getHideSeconds(),
                eDocFieldDao.getNonNegative(),
                eDocFieldDao.getIsVirtual(),
                eDocFieldDao.getSortOptions(),
                eDocFieldDao.getFetchFrom(),
                eDocFieldDao.getDocumentationUrl());
    }

    public static void fromDTO(DocFieldDto vDocFieldDto, DocFieldDao eDocFieldDao) {
        eDocFieldDao.setName(vDocFieldDto.name());
        eDocFieldDao.setCreation(vDocFieldDto.creation());
        eDocFieldDao.setModified(vDocFieldDto.modified());
        eDocFieldDao.setModifiedBy(vDocFieldDto.modifiedBy());
        eDocFieldDao.setOwner(vDocFieldDto.owner());
        eDocFieldDao.setIsDocStatus(vDocFieldDto.isDocStatus());
        eDocFieldDao.setParent(vDocFieldDto.parent());
        eDocFieldDao.setParentField(vDocFieldDto.parentField());
        eDocFieldDao.setParentType(vDocFieldDto.parentType());
        eDocFieldDao.setIdx(vDocFieldDto.idx());
        eDocFieldDao.setFieldName(vDocFieldDto.fieldName());
        eDocFieldDao.setLabel(vDocFieldDto.label());
        eDocFieldDao.setOldFieldName(vDocFieldDto.oldFieldName());
        eDocFieldDao.setFieldType(vDocFieldDto.fieldType());
        eDocFieldDao.setOldFieldType(vDocFieldDto.oldFieldType());
        eDocFieldDao.setOptions(vDocFieldDto.options());
        eDocFieldDao.setSearchIndex(vDocFieldDto.searchIndex());
        eDocFieldDao.setShowDashboard(vDocFieldDto.showDashboard());
        eDocFieldDao.setHidden(vDocFieldDto.hidden());
        eDocFieldDao.setSetOnlyOnce(vDocFieldDto.setOnlyOnce());
        eDocFieldDao.setAllowInQuickEntry(vDocFieldDto.allowInQuickEntry());
        eDocFieldDao.setPrintHide(vDocFieldDto.printHide());
        eDocFieldDao.setReportHide(vDocFieldDto.reportHide());
        eDocFieldDao.setReqd(vDocFieldDto.reqd());
        eDocFieldDao.setBold(vDocFieldDto.bold());
        eDocFieldDao.setInGlobalSearch(vDocFieldDto.inGlobalSearch());
        eDocFieldDao.setCollapsible(vDocFieldDto.collapsible());
        eDocFieldDao.setUnique(vDocFieldDto.unique());
        eDocFieldDao.setNoCopy(vDocFieldDto.noCopy());
        eDocFieldDao.setAllowOnSubmit(vDocFieldDto.allowOnSubmit());
        eDocFieldDao.setShowPreviewPopup(vDocFieldDto.showPreviewPopup());
        eDocFieldDao.setTrigger(vDocFieldDto.trigger());
        eDocFieldDao.setCollapsibleDependsOn(vDocFieldDto.collapsibleDependsOn());
        eDocFieldDao.setMandatoryDependsOn(vDocFieldDto.mandatoryDependsOn());
        eDocFieldDao.setReadOnlyDependsOn(vDocFieldDto.readOnlyDependsOn());
        eDocFieldDao.setDependsOn(vDocFieldDto.dependsOn());
        eDocFieldDao.setPermLevel(vDocFieldDto.permLevel());
        eDocFieldDao.setIgnoreUserPermissions(vDocFieldDto.ignoreUserPermissions());
        eDocFieldDao.setWidth(vDocFieldDto.width());
        eDocFieldDao.setPrintWidth(vDocFieldDto.printWidth());
        eDocFieldDao.setColumns(vDocFieldDto.columns());
        eDocFieldDao.setDefaults(vDocFieldDto.defaults());
        eDocFieldDao.setDescription(vDocFieldDto.description());
        eDocFieldDao.setInListView(vDocFieldDto.inListView());
        eDocFieldDao.setFetchIfEmpty(vDocFieldDto.fetchIfEmpty());
        eDocFieldDao.setInFilter(vDocFieldDto.inFilter());
        eDocFieldDao.setRememberLastSelectedValue(vDocFieldDto.rememberLastSelectedValue());
        eDocFieldDao.setIgnoreXssFilter(vDocFieldDto.ignoreXssFilter());
        eDocFieldDao.setPrintHideIfNoValue(vDocFieldDto.printHideIfNoValue());
        eDocFieldDao.setAllowBulkEdit(vDocFieldDto.allowBulkEdit());
        eDocFieldDao.setInStandardFilter(vDocFieldDto.inStandardFilter());
        eDocFieldDao.setInPreview(vDocFieldDto.inPreview());
        eDocFieldDao.setReadOnly(vDocFieldDto.readOnly());
        eDocFieldDao.setPrecision(vDocFieldDto.precision());
        eDocFieldDao.setMaxHeight(vDocFieldDto.maxHeight());
        eDocFieldDao.setLength(vDocFieldDto.length());
        eDocFieldDao.setTranslatable(vDocFieldDto.translatable());
        eDocFieldDao.setHideBorder(vDocFieldDto.hideBorder());
        eDocFieldDao.setHideDays(vDocFieldDto.hideDays());
        eDocFieldDao.setHideSeconds(vDocFieldDto.hideSeconds());
        eDocFieldDao.setNonNegative(vDocFieldDto.nonNegative());
        eDocFieldDao.setIsVirtual(vDocFieldDto.isVirtual());
        eDocFieldDao.setSortOptions(vDocFieldDto.sortOptions());
        eDocFieldDao.setFetchFrom(vDocFieldDto.fetchFrom());
        eDocFieldDao.setDocumentationUrl(vDocFieldDto.documentationUrl());
    }
}