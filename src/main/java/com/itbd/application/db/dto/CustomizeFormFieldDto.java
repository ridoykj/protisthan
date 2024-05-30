package com.itbd.application.db.dto;

import com.itbd.application.db.dao.custom.CustomizeFormFieldDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record CustomizeFormFieldDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Boolean isSystemGenerated,
        String label,
        String fieldType,
        String fieldName,
        Boolean nonNegative,
        Boolean reqd,
        Boolean unique,
        Boolean isVirtual,
        Boolean inListView,
        Boolean inStandardFilter,
        Boolean inGlobalSearch,
        Boolean inPreview,
        Boolean bold,
        Boolean noCopy,
        Boolean allowInQuickEntry,
        Boolean translatable,
        String defaults,
        String precision,
        Integer length,
        String options,
        Boolean sortOptions,
        String fetchFrom,
        Boolean fetchIfEmpty,
        Boolean showDashboard,
        String dependsOn,
        Integer permLevel,
        Boolean hidden,
        Boolean readOnly,
        Boolean collapsible,
        Boolean allowBulkEdit,
        String collapsibleDependsOn,
        Boolean ignoreUserPermissions,
        Boolean allowOnSubmit,
        Boolean reportHide,
        Boolean rememberLastSelectedValue,
        Boolean hideBorder,
        Boolean ignoreXssFilter,
        String mandatoryDependsOn,
        String readOnlyDependsOn,
        Boolean inFilter,
        Boolean hideSeconds,
        Boolean hideDays,
        String description,
        Boolean printHide,
        Boolean printHideIfNoValue,
        String printWidth,
        Integer columns,
        String width,
        Integer isCustomField,
        String parent,
        String parentField,
        String parentType
) {
    public static CustomizeFormFieldDto fromEntity(CustomizeFormFieldDao eCustomizeFormFieldDao) {
        return new CustomizeFormFieldDto(
                eCustomizeFormFieldDao.getName(),
                eCustomizeFormFieldDao.getCreation(),
                eCustomizeFormFieldDao.getModified(),
                eCustomizeFormFieldDao.getModifiedBy(),
                eCustomizeFormFieldDao.getOwner(),
                eCustomizeFormFieldDao.getIsDocStatus(),
                eCustomizeFormFieldDao.getIdx(),
                eCustomizeFormFieldDao.getIsSystemGenerated(),
                eCustomizeFormFieldDao.getLabel(),
                eCustomizeFormFieldDao.getFieldType(),
                eCustomizeFormFieldDao.getFieldName(),
                eCustomizeFormFieldDao.getNonNegative(),
                eCustomizeFormFieldDao.getReqd(),
                eCustomizeFormFieldDao.getUnique(),
                eCustomizeFormFieldDao.getIsVirtual(),
                eCustomizeFormFieldDao.getInListView(),
                eCustomizeFormFieldDao.getInStandardFilter(),
                eCustomizeFormFieldDao.getInGlobalSearch(),
                eCustomizeFormFieldDao.getInPreview(),
                eCustomizeFormFieldDao.getBold(),
                eCustomizeFormFieldDao.getNoCopy(),
                eCustomizeFormFieldDao.getAllowInQuickEntry(),
                eCustomizeFormFieldDao.getTranslatable(),
                eCustomizeFormFieldDao.getDefaults(),
                eCustomizeFormFieldDao.getPrecision(),
                eCustomizeFormFieldDao.getLength(),
                eCustomizeFormFieldDao.getOptions(),
                eCustomizeFormFieldDao.getSortOptions(),
                eCustomizeFormFieldDao.getFetchFrom(),
                eCustomizeFormFieldDao.getFetchIfEmpty(),
                eCustomizeFormFieldDao.getShowDashboard(),
                eCustomizeFormFieldDao.getDependsOn(),
                eCustomizeFormFieldDao.getPermLevel(),
                eCustomizeFormFieldDao.getHidden(),
                eCustomizeFormFieldDao.getReadOnly(),
                eCustomizeFormFieldDao.getCollapsible(),
                eCustomizeFormFieldDao.getAllowBulkEdit(),
                eCustomizeFormFieldDao.getCollapsibleDependsOn(),
                eCustomizeFormFieldDao.getIgnoreUserPermissions(),
                eCustomizeFormFieldDao.getAllowOnSubmit(),
                eCustomizeFormFieldDao.getReportHide(),
                eCustomizeFormFieldDao.getRememberLastSelectedValue(),
                eCustomizeFormFieldDao.getHideBorder(),
                eCustomizeFormFieldDao.getIgnoreXssFilter(),
                eCustomizeFormFieldDao.getMandatoryDependsOn(),
                eCustomizeFormFieldDao.getReadOnlyDependsOn(),
                eCustomizeFormFieldDao.getInFilter(),
                eCustomizeFormFieldDao.getHideSeconds(),
                eCustomizeFormFieldDao.getHideDays(),
                eCustomizeFormFieldDao.getDescription(),
                eCustomizeFormFieldDao.getPrintHide(),
                eCustomizeFormFieldDao.getPrintHideIfNoValue(),
                eCustomizeFormFieldDao.getPrintWidth(),
                eCustomizeFormFieldDao.getColumns(),
                eCustomizeFormFieldDao.getWidth(),
                eCustomizeFormFieldDao.getIsCustomField(),
                eCustomizeFormFieldDao.getParent(),
                eCustomizeFormFieldDao.getParentField(),
                eCustomizeFormFieldDao.getParentType());
    }

    public static void fromDTO(CustomizeFormFieldDto vCustomizeFormFieldDto, CustomizeFormFieldDao eCustomizeFormFieldDao) {
        eCustomizeFormFieldDao.setName(vCustomizeFormFieldDto.name());
        eCustomizeFormFieldDao.setCreation(vCustomizeFormFieldDto.creation());
        eCustomizeFormFieldDao.setModified(vCustomizeFormFieldDto.modified());
        eCustomizeFormFieldDao.setModifiedBy(vCustomizeFormFieldDto.modifiedBy());
        eCustomizeFormFieldDao.setOwner(vCustomizeFormFieldDto.owner());
        eCustomizeFormFieldDao.setIsDocStatus(vCustomizeFormFieldDto.isDocStatus());
        eCustomizeFormFieldDao.setIdx(vCustomizeFormFieldDto.idx());
        eCustomizeFormFieldDao.setIsSystemGenerated(vCustomizeFormFieldDto.isSystemGenerated());
        eCustomizeFormFieldDao.setLabel(vCustomizeFormFieldDto.label());
        eCustomizeFormFieldDao.setFieldType(vCustomizeFormFieldDto.fieldType());
        eCustomizeFormFieldDao.setFieldName(vCustomizeFormFieldDto.fieldName());
        eCustomizeFormFieldDao.setNonNegative(vCustomizeFormFieldDto.nonNegative());
        eCustomizeFormFieldDao.setReqd(vCustomizeFormFieldDto.reqd());
        eCustomizeFormFieldDao.setUnique(vCustomizeFormFieldDto.unique());
        eCustomizeFormFieldDao.setIsVirtual(vCustomizeFormFieldDto.isVirtual());
        eCustomizeFormFieldDao.setInListView(vCustomizeFormFieldDto.inListView());
        eCustomizeFormFieldDao.setInStandardFilter(vCustomizeFormFieldDto.inStandardFilter());
        eCustomizeFormFieldDao.setInGlobalSearch(vCustomizeFormFieldDto.inGlobalSearch());
        eCustomizeFormFieldDao.setInPreview(vCustomizeFormFieldDto.inPreview());
        eCustomizeFormFieldDao.setBold(vCustomizeFormFieldDto.bold());
        eCustomizeFormFieldDao.setNoCopy(vCustomizeFormFieldDto.noCopy());
        eCustomizeFormFieldDao.setAllowInQuickEntry(vCustomizeFormFieldDto.allowInQuickEntry());
        eCustomizeFormFieldDao.setTranslatable(vCustomizeFormFieldDto.translatable());
        eCustomizeFormFieldDao.setDefaults(vCustomizeFormFieldDto.defaults());
        eCustomizeFormFieldDao.setPrecision(vCustomizeFormFieldDto.precision());
        eCustomizeFormFieldDao.setLength(vCustomizeFormFieldDto.length());
        eCustomizeFormFieldDao.setOptions(vCustomizeFormFieldDto.options());
        eCustomizeFormFieldDao.setSortOptions(vCustomizeFormFieldDto.sortOptions());
        eCustomizeFormFieldDao.setFetchFrom(vCustomizeFormFieldDto.fetchFrom());
        eCustomizeFormFieldDao.setFetchIfEmpty(vCustomizeFormFieldDto.fetchIfEmpty());
        eCustomizeFormFieldDao.setShowDashboard(vCustomizeFormFieldDto.showDashboard());
        eCustomizeFormFieldDao.setDependsOn(vCustomizeFormFieldDto.dependsOn());
        eCustomizeFormFieldDao.setPermLevel(vCustomizeFormFieldDto.permLevel());
        eCustomizeFormFieldDao.setHidden(vCustomizeFormFieldDto.hidden());
        eCustomizeFormFieldDao.setReadOnly(vCustomizeFormFieldDto.readOnly());
        eCustomizeFormFieldDao.setCollapsible(vCustomizeFormFieldDto.collapsible());
        eCustomizeFormFieldDao.setAllowBulkEdit(vCustomizeFormFieldDto.allowBulkEdit());
        eCustomizeFormFieldDao.setCollapsibleDependsOn(vCustomizeFormFieldDto.collapsibleDependsOn());
        eCustomizeFormFieldDao.setIgnoreUserPermissions(vCustomizeFormFieldDto.ignoreUserPermissions());
        eCustomizeFormFieldDao.setAllowOnSubmit(vCustomizeFormFieldDto.allowOnSubmit());
        eCustomizeFormFieldDao.setReportHide(vCustomizeFormFieldDto.reportHide());
        eCustomizeFormFieldDao.setRememberLastSelectedValue(vCustomizeFormFieldDto.rememberLastSelectedValue());
        eCustomizeFormFieldDao.setHideBorder(vCustomizeFormFieldDto.hideBorder());
        eCustomizeFormFieldDao.setIgnoreXssFilter(vCustomizeFormFieldDto.ignoreXssFilter());
        eCustomizeFormFieldDao.setMandatoryDependsOn(vCustomizeFormFieldDto.mandatoryDependsOn());
        eCustomizeFormFieldDao.setReadOnlyDependsOn(vCustomizeFormFieldDto.readOnlyDependsOn());
        eCustomizeFormFieldDao.setInFilter(vCustomizeFormFieldDto.inFilter());
        eCustomizeFormFieldDao.setHideSeconds(vCustomizeFormFieldDto.hideSeconds());
        eCustomizeFormFieldDao.setHideDays(vCustomizeFormFieldDto.hideDays());
        eCustomizeFormFieldDao.setDescription(vCustomizeFormFieldDto.description());
        eCustomizeFormFieldDao.setPrintHide(vCustomizeFormFieldDto.printHide());
        eCustomizeFormFieldDao.setPrintHideIfNoValue(vCustomizeFormFieldDto.printHideIfNoValue());
        eCustomizeFormFieldDao.setPrintWidth(vCustomizeFormFieldDto.printWidth());
        eCustomizeFormFieldDao.setColumns(vCustomizeFormFieldDto.columns());
        eCustomizeFormFieldDao.setWidth(vCustomizeFormFieldDto.width());
        eCustomizeFormFieldDao.setIsCustomField(vCustomizeFormFieldDto.isCustomField());
        eCustomizeFormFieldDao.setParent(vCustomizeFormFieldDto.parent());
        eCustomizeFormFieldDao.setParentField(vCustomizeFormFieldDto.parentField());
        eCustomizeFormFieldDao.setParentType(vCustomizeFormFieldDto.parentType());
    }
}