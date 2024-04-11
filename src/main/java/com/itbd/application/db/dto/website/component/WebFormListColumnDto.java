package com.itbd.application.db.dto.website.component;

import com.itbd.application.db.dao.website.component.WebFormListColumnDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record WebFormListColumnDto(
        @Id

        Long name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String fieldName,
        String fieldType,
        String label,
        String parent,
        String parentField,
        String parentType
) {
    public static WebFormListColumnDto fromEntity(WebFormListColumnDao eWebFormListColumnDao) {
        return new WebFormListColumnDto(
                eWebFormListColumnDao.getName(),
                eWebFormListColumnDao.getCreation(),
                eWebFormListColumnDao.getModified(),
                eWebFormListColumnDao.getModifiedBy(),
                eWebFormListColumnDao.getOwner(),
                eWebFormListColumnDao.getIsDocStatus(),
                eWebFormListColumnDao.getIdx(),
                eWebFormListColumnDao.getFieldName(),
                eWebFormListColumnDao.getFieldType(),
                eWebFormListColumnDao.getLabel(),
                eWebFormListColumnDao.getParent(),
                eWebFormListColumnDao.getParentField(),
                eWebFormListColumnDao.getParentType());
    }

    public static void fromDTO(WebFormListColumnDto vWebFormListColumnDto, WebFormListColumnDao eWebFormListColumnDao) {
        eWebFormListColumnDao.setName(vWebFormListColumnDto.name());
        eWebFormListColumnDao.setCreation(vWebFormListColumnDto.creation());
        eWebFormListColumnDao.setModified(vWebFormListColumnDto.modified());
        eWebFormListColumnDao.setModifiedBy(vWebFormListColumnDto.modifiedBy());
        eWebFormListColumnDao.setOwner(vWebFormListColumnDto.owner());
        eWebFormListColumnDao.setIsDocStatus(vWebFormListColumnDto.isDocStatus());
        eWebFormListColumnDao.setIdx(vWebFormListColumnDto.idx());
        eWebFormListColumnDao.setFieldName(vWebFormListColumnDto.fieldName());
        eWebFormListColumnDao.setFieldType(vWebFormListColumnDto.fieldType());
        eWebFormListColumnDao.setLabel(vWebFormListColumnDto.label());
        eWebFormListColumnDao.setParent(vWebFormListColumnDto.parent());
        eWebFormListColumnDao.setParentField(vWebFormListColumnDto.parentField());
        eWebFormListColumnDao.setParentType(vWebFormListColumnDto.parentType());
    }
}