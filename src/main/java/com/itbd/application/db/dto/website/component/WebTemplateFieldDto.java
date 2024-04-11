package com.itbd.application.db.dto.website.component;

import com.itbd.application.db.dao.website.component.WebTemplateFieldDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record WebTemplateFieldDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String label,
        String fieldName,
        String fieldType,
        Boolean reqd,
        String options,
        String defaults,
        String parent,
        String parentField,
        String parentType
) {
    public static WebTemplateFieldDto fromEntity(WebTemplateFieldDao eWebTemplateFieldDao) {
        return new WebTemplateFieldDto(
                eWebTemplateFieldDao.getName(),
                eWebTemplateFieldDao.getCreation(),
                eWebTemplateFieldDao.getModified(),
                eWebTemplateFieldDao.getModifiedBy(),
                eWebTemplateFieldDao.getOwner(),
                eWebTemplateFieldDao.getIsDocStatus(),
                eWebTemplateFieldDao.getIdx(),
                eWebTemplateFieldDao.getLabel(),
                eWebTemplateFieldDao.getFieldName(),
                eWebTemplateFieldDao.getFieldType(),
                eWebTemplateFieldDao.getReqd(),
                eWebTemplateFieldDao.getOptions(),
                eWebTemplateFieldDao.getDefaults(),
                eWebTemplateFieldDao.getParent(),
                eWebTemplateFieldDao.getParentField(),
                eWebTemplateFieldDao.getParentType());
    }

    public static void fromDTO(WebTemplateFieldDto vWebTemplateFieldDto, WebTemplateFieldDao eWebTemplateFieldDao) {
        eWebTemplateFieldDao.setName(vWebTemplateFieldDto.name());
        eWebTemplateFieldDao.setCreation(vWebTemplateFieldDto.creation());
        eWebTemplateFieldDao.setModified(vWebTemplateFieldDto.modified());
        eWebTemplateFieldDao.setModifiedBy(vWebTemplateFieldDto.modifiedBy());
        eWebTemplateFieldDao.setOwner(vWebTemplateFieldDto.owner());
        eWebTemplateFieldDao.setIsDocStatus(vWebTemplateFieldDto.isDocStatus());
        eWebTemplateFieldDao.setIdx(vWebTemplateFieldDto.idx());
        eWebTemplateFieldDao.setLabel(vWebTemplateFieldDto.label());
        eWebTemplateFieldDao.setFieldName(vWebTemplateFieldDto.fieldName());
        eWebTemplateFieldDao.setFieldType(vWebTemplateFieldDto.fieldType());
        eWebTemplateFieldDao.setReqd(vWebTemplateFieldDto.reqd());
        eWebTemplateFieldDao.setOptions(vWebTemplateFieldDto.options());
        eWebTemplateFieldDao.setDefaults(vWebTemplateFieldDto.defaults());
        eWebTemplateFieldDao.setParent(vWebTemplateFieldDto.parent());
        eWebTemplateFieldDao.setParentField(vWebTemplateFieldDto.parentField());
        eWebTemplateFieldDao.setParentType(vWebTemplateFieldDto.parentType());
    }
}