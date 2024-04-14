package com.itbd.application.db.dto;

import com.itbd.application.db.dao.CustomFieldDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record CustomFieldDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Boolean isSystemGenerated,
        String dt,
        String module,
        String label,
        String fieldName,
        String insertAfter,
        Integer length,
        String fieldType,
        String precision,
        Boolean hideSeconds,
        Boolean hideDays,
        String options,
        Boolean sortOptions,
        String fetchFrom,
        Boolean fetchIfEmpty,
        Boolean collapsible,
        String collapsibleDependsOn,
        String defaults,
        String dependsOn,
        String mandatoryDependsOn,
        String readOnlyDependsOn,
        Boolean nonNegative,
        Boolean reqd,
        Boolean unique,
        Boolean isVirtual,
        Boolean readOnly,
        Boolean ignoreUserPermissions,
        Boolean hidden,
        Boolean printHide,
        Boolean printHideIfNoValue,
        String printWidth,
        Boolean noCopy,
        Boolean allowOnSubmit,
        Boolean inListView,
        Boolean inStandardFilter,
        Boolean inGlobalSearch,
        Boolean inPreview,
        Boolean bold,
        Boolean reportHide,
        Boolean searchIndex,
        Boolean allowInQuickEntry,
        Boolean ignoreXssFilter,
        Boolean translatable,
        Boolean hideBorder,
        Boolean showDashboard,
        String description,
        Integer permLevel,
        String width,
        Integer columns,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static CustomFieldDto fromEntity(CustomFieldDao eCustomFieldDao) {
        return new CustomFieldDto(
                eCustomFieldDao.getName(),
                eCustomFieldDao.getCreation(),
                eCustomFieldDao.getModified(),
                eCustomFieldDao.getModifiedBy(),
                eCustomFieldDao.getOwner(),
                eCustomFieldDao.getIsDocStatus(),
                eCustomFieldDao.getIdx(),
                eCustomFieldDao.getIsSystemGenerated(),
                eCustomFieldDao.getDt(),
                eCustomFieldDao.getModule(),
                eCustomFieldDao.getLabel(),
                eCustomFieldDao.getFieldName(),
                eCustomFieldDao.getInsertAfter(),
                eCustomFieldDao.getLength(),
                eCustomFieldDao.getFieldType(),
                eCustomFieldDao.getPrecision(),
                eCustomFieldDao.getHideSeconds(),
                eCustomFieldDao.getHideDays(),
                eCustomFieldDao.getOptions(),
                eCustomFieldDao.getSortOptions(),
                eCustomFieldDao.getFetchFrom(),
                eCustomFieldDao.getFetchIfEmpty(),
                eCustomFieldDao.getCollapsible(),
                eCustomFieldDao.getCollapsibleDependsOn(),
                eCustomFieldDao.getDefaults(),
                eCustomFieldDao.getDependsOn(),
                eCustomFieldDao.getMandatoryDependsOn(),
                eCustomFieldDao.getReadOnlyDependsOn(),
                eCustomFieldDao.getNonNegative(),
                eCustomFieldDao.getReqd(),
                eCustomFieldDao.getUnique(),
                eCustomFieldDao.getIsVirtual(),
                eCustomFieldDao.getReadOnly(),
                eCustomFieldDao.getIgnoreUserPermissions(),
                eCustomFieldDao.getHidden(),
                eCustomFieldDao.getPrintHide(),
                eCustomFieldDao.getPrintHideIfNoValue(),
                eCustomFieldDao.getPrintWidth(),
                eCustomFieldDao.getNoCopy(),
                eCustomFieldDao.getAllowOnSubmit(),
                eCustomFieldDao.getInListView(),
                eCustomFieldDao.getInStandardFilter(),
                eCustomFieldDao.getInGlobalSearch(),
                eCustomFieldDao.getInPreview(),
                eCustomFieldDao.getBold(),
                eCustomFieldDao.getReportHide(),
                eCustomFieldDao.getSearchIndex(),
                eCustomFieldDao.getAllowInQuickEntry(),
                eCustomFieldDao.getIgnoreXssFilter(),
                eCustomFieldDao.getTranslatable(),
                eCustomFieldDao.getHideBorder(),
                eCustomFieldDao.getShowDashboard(),
                eCustomFieldDao.getDescription(),
                eCustomFieldDao.getPermLevel(),
                eCustomFieldDao.getWidth(),
                eCustomFieldDao.getColumns(),
                eCustomFieldDao.getUserTags(),
                eCustomFieldDao.getComments(),
                eCustomFieldDao.getAssign(),
                eCustomFieldDao.getLikedBy());
    }

    public static void fromDTO(CustomFieldDto vCustomFieldDto, CustomFieldDao eCustomFieldDao) {
        eCustomFieldDao.setName(vCustomFieldDto.name());
        eCustomFieldDao.setCreation(vCustomFieldDto.creation());
        eCustomFieldDao.setModified(vCustomFieldDto.modified());
        eCustomFieldDao.setModifiedBy(vCustomFieldDto.modifiedBy());
        eCustomFieldDao.setOwner(vCustomFieldDto.owner());
        eCustomFieldDao.setIsDocStatus(vCustomFieldDto.isDocStatus());
        eCustomFieldDao.setIdx(vCustomFieldDto.idx());
        eCustomFieldDao.setIsSystemGenerated(vCustomFieldDto.isSystemGenerated());
        eCustomFieldDao.setDt(vCustomFieldDto.dt());
        eCustomFieldDao.setModule(vCustomFieldDto.module());
        eCustomFieldDao.setLabel(vCustomFieldDto.label());
        eCustomFieldDao.setFieldName(vCustomFieldDto.fieldName());
        eCustomFieldDao.setInsertAfter(vCustomFieldDto.insertAfter());
        eCustomFieldDao.setLength(vCustomFieldDto.length());
        eCustomFieldDao.setFieldType(vCustomFieldDto.fieldType());
        eCustomFieldDao.setPrecision(vCustomFieldDto.precision());
        eCustomFieldDao.setHideSeconds(vCustomFieldDto.hideSeconds());
        eCustomFieldDao.setHideDays(vCustomFieldDto.hideDays());
        eCustomFieldDao.setOptions(vCustomFieldDto.options());
        eCustomFieldDao.setSortOptions(vCustomFieldDto.sortOptions());
        eCustomFieldDao.setFetchFrom(vCustomFieldDto.fetchFrom());
        eCustomFieldDao.setFetchIfEmpty(vCustomFieldDto.fetchIfEmpty());
        eCustomFieldDao.setCollapsible(vCustomFieldDto.collapsible());
        eCustomFieldDao.setCollapsibleDependsOn(vCustomFieldDto.collapsibleDependsOn());
        eCustomFieldDao.setDefaults(vCustomFieldDto.defaults());
        eCustomFieldDao.setDependsOn(vCustomFieldDto.dependsOn());
        eCustomFieldDao.setMandatoryDependsOn(vCustomFieldDto.mandatoryDependsOn());
        eCustomFieldDao.setReadOnlyDependsOn(vCustomFieldDto.readOnlyDependsOn());
        eCustomFieldDao.setNonNegative(vCustomFieldDto.nonNegative());
        eCustomFieldDao.setReqd(vCustomFieldDto.reqd());
        eCustomFieldDao.setUnique(vCustomFieldDto.unique());
        eCustomFieldDao.setIsVirtual(vCustomFieldDto.isVirtual());
        eCustomFieldDao.setReadOnly(vCustomFieldDto.readOnly());
        eCustomFieldDao.setIgnoreUserPermissions(vCustomFieldDto.ignoreUserPermissions());
        eCustomFieldDao.setHidden(vCustomFieldDto.hidden());
        eCustomFieldDao.setPrintHide(vCustomFieldDto.printHide());
        eCustomFieldDao.setPrintHideIfNoValue(vCustomFieldDto.printHideIfNoValue());
        eCustomFieldDao.setPrintWidth(vCustomFieldDto.printWidth());
        eCustomFieldDao.setNoCopy(vCustomFieldDto.noCopy());
        eCustomFieldDao.setAllowOnSubmit(vCustomFieldDto.allowOnSubmit());
        eCustomFieldDao.setInListView(vCustomFieldDto.inListView());
        eCustomFieldDao.setInStandardFilter(vCustomFieldDto.inStandardFilter());
        eCustomFieldDao.setInGlobalSearch(vCustomFieldDto.inGlobalSearch());
        eCustomFieldDao.setInPreview(vCustomFieldDto.inPreview());
        eCustomFieldDao.setBold(vCustomFieldDto.bold());
        eCustomFieldDao.setReportHide(vCustomFieldDto.reportHide());
        eCustomFieldDao.setSearchIndex(vCustomFieldDto.searchIndex());
        eCustomFieldDao.setAllowInQuickEntry(vCustomFieldDto.allowInQuickEntry());
        eCustomFieldDao.setIgnoreXssFilter(vCustomFieldDto.ignoreXssFilter());
        eCustomFieldDao.setTranslatable(vCustomFieldDto.translatable());
        eCustomFieldDao.setHideBorder(vCustomFieldDto.hideBorder());
        eCustomFieldDao.setShowDashboard(vCustomFieldDto.showDashboard());
        eCustomFieldDao.setDescription(vCustomFieldDto.description());
        eCustomFieldDao.setPermLevel(vCustomFieldDto.permLevel());
        eCustomFieldDao.setWidth(vCustomFieldDto.width());
        eCustomFieldDao.setColumns(vCustomFieldDto.columns());
        eCustomFieldDao.setUserTags(vCustomFieldDto.userTags());
        eCustomFieldDao.setComments(vCustomFieldDto.comments());
        eCustomFieldDao.setAssign(vCustomFieldDto.assign());
        eCustomFieldDao.setLikedBy(vCustomFieldDto.likedBy());
    }
}