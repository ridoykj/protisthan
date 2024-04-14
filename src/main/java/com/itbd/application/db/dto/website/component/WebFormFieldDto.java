package com.itbd.application.db.dto.website.component;

import com.itbd.application.db.dao.website.component.WebFormFieldDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record WebFormFieldDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String fieldName,
        String fieldType,
        String label,
        Boolean allowReadOnAllLinkOptions,
        Boolean reqd,
        Boolean readOnly,
        Boolean showInFilter,
        Boolean hidden,
        String options,
        Integer maxLength,
        Integer maxValue,
        String precision,
        String dependsOn,
        String mandatoryDependsOn,
        String readOnlyDependsOn,
        String description,
        String defaults,
        String parent,
        String parentField,
        String parentType
) {
    public static WebFormFieldDto fromEntity(WebFormFieldDao eWebFormFieldDao) {
        return new WebFormFieldDto(
                eWebFormFieldDao.getName(),
                eWebFormFieldDao.getCreation(),
                eWebFormFieldDao.getModified(),
                eWebFormFieldDao.getModifiedBy(),
                eWebFormFieldDao.getOwner(),
                eWebFormFieldDao.getIsDocStatus(),
                eWebFormFieldDao.getIdx(),
                eWebFormFieldDao.getFieldName(),
                eWebFormFieldDao.getFieldType(),
                eWebFormFieldDao.getLabel(),
                eWebFormFieldDao.getAllowReadOnAllLinkOptions(),
                eWebFormFieldDao.getReqd(),
                eWebFormFieldDao.getReadOnly(),
                eWebFormFieldDao.getShowInFilter(),
                eWebFormFieldDao.getHidden(),
                eWebFormFieldDao.getOptions(),
                eWebFormFieldDao.getMaxLength(),
                eWebFormFieldDao.getMaxValue(),
                eWebFormFieldDao.getPrecision(),
                eWebFormFieldDao.getDependsOn(),
                eWebFormFieldDao.getMandatoryDependsOn(),
                eWebFormFieldDao.getReadOnlyDependsOn(),
                eWebFormFieldDao.getDescription(),
                eWebFormFieldDao.getDefaults(),
                eWebFormFieldDao.getParent(),
                eWebFormFieldDao.getParentField(),
                eWebFormFieldDao.getParentType());
    }

    public static void fromDTO(WebFormFieldDto vWebFormFieldDto, WebFormFieldDao eWebFormFieldDao) {
        eWebFormFieldDao.setName(vWebFormFieldDto.name());
        eWebFormFieldDao.setCreation(vWebFormFieldDto.creation());
        eWebFormFieldDao.setModified(vWebFormFieldDto.modified());
        eWebFormFieldDao.setModifiedBy(vWebFormFieldDto.modifiedBy());
        eWebFormFieldDao.setOwner(vWebFormFieldDto.owner());
        eWebFormFieldDao.setIsDocStatus(vWebFormFieldDto.isDocStatus());
        eWebFormFieldDao.setIdx(vWebFormFieldDto.idx());
        eWebFormFieldDao.setFieldName(vWebFormFieldDto.fieldName());
        eWebFormFieldDao.setFieldType(vWebFormFieldDto.fieldType());
        eWebFormFieldDao.setLabel(vWebFormFieldDto.label());
        eWebFormFieldDao.setAllowReadOnAllLinkOptions(vWebFormFieldDto.allowReadOnAllLinkOptions());
        eWebFormFieldDao.setReqd(vWebFormFieldDto.reqd());
        eWebFormFieldDao.setReadOnly(vWebFormFieldDto.readOnly());
        eWebFormFieldDao.setShowInFilter(vWebFormFieldDto.showInFilter());
        eWebFormFieldDao.setHidden(vWebFormFieldDto.hidden());
        eWebFormFieldDao.setOptions(vWebFormFieldDto.options());
        eWebFormFieldDao.setMaxLength(vWebFormFieldDto.maxLength());
        eWebFormFieldDao.setMaxValue(vWebFormFieldDto.maxValue());
        eWebFormFieldDao.setPrecision(vWebFormFieldDto.precision());
        eWebFormFieldDao.setDependsOn(vWebFormFieldDto.dependsOn());
        eWebFormFieldDao.setMandatoryDependsOn(vWebFormFieldDto.mandatoryDependsOn());
        eWebFormFieldDao.setReadOnlyDependsOn(vWebFormFieldDto.readOnlyDependsOn());
        eWebFormFieldDao.setDescription(vWebFormFieldDto.description());
        eWebFormFieldDao.setDefaults(vWebFormFieldDto.defaults());
        eWebFormFieldDao.setParent(vWebFormFieldDto.parent());
        eWebFormFieldDao.setParentField(vWebFormFieldDto.parentField());
        eWebFormFieldDao.setParentType(vWebFormFieldDto.parentType());
    }
}