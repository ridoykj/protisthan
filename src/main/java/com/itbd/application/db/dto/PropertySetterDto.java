package com.itbd.application.db.dto;

import com.itbd.application.db.dao.PropertySetterDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record PropertySetterDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Boolean isSystemGenerated,
        String docTypeOrField,
        String docType,
        String fieldName,
        String rowName,
        String module,
        String property,
        String propertyType,
        String value,
        String defaultValue,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static PropertySetterDto fromEntity(PropertySetterDao ePropertySetterDao) {
        return new PropertySetterDto(
                ePropertySetterDao.getName(),
                ePropertySetterDao.getCreation(),
                ePropertySetterDao.getModified(),
                ePropertySetterDao.getModifiedBy(),
                ePropertySetterDao.getOwner(),
                ePropertySetterDao.getIsDocStatus(),
                ePropertySetterDao.getIdx(),
                ePropertySetterDao.getIsSystemGenerated(),
                ePropertySetterDao.getDocTypeOrField(),
                ePropertySetterDao.getDocType(),
                ePropertySetterDao.getFieldName(),
                ePropertySetterDao.getRowName(),
                ePropertySetterDao.getModule(),
                ePropertySetterDao.getProperty(),
                ePropertySetterDao.getPropertyType(),
                ePropertySetterDao.getValue(),
                ePropertySetterDao.getDefaultValue(),
                ePropertySetterDao.getUserTags(),
                ePropertySetterDao.getComments(),
                ePropertySetterDao.getAssign(),
                ePropertySetterDao.getLikedBy());
    }

    public static void fromDTO(PropertySetterDto vPropertySetterDto, PropertySetterDao ePropertySetterDao) {
        ePropertySetterDao.setName(vPropertySetterDto.name());
        ePropertySetterDao.setCreation(vPropertySetterDto.creation());
        ePropertySetterDao.setModified(vPropertySetterDto.modified());
        ePropertySetterDao.setModifiedBy(vPropertySetterDto.modifiedBy());
        ePropertySetterDao.setOwner(vPropertySetterDto.owner());
        ePropertySetterDao.setIsDocStatus(vPropertySetterDto.isDocStatus());
        ePropertySetterDao.setIdx(vPropertySetterDto.idx());
        ePropertySetterDao.setIsSystemGenerated(vPropertySetterDto.isSystemGenerated());
        ePropertySetterDao.setDocTypeOrField(vPropertySetterDto.docTypeOrField());
        ePropertySetterDao.setDocType(vPropertySetterDto.docType());
        ePropertySetterDao.setFieldName(vPropertySetterDto.fieldName());
        ePropertySetterDao.setRowName(vPropertySetterDto.rowName());
        ePropertySetterDao.setModule(vPropertySetterDto.module());
        ePropertySetterDao.setProperty(vPropertySetterDto.property());
        ePropertySetterDao.setPropertyType(vPropertySetterDto.propertyType());
        ePropertySetterDao.setValue(vPropertySetterDto.value());
        ePropertySetterDao.setDefaultValue(vPropertySetterDto.defaultValue());
        ePropertySetterDao.setUserTags(vPropertySetterDto.userTags());
        ePropertySetterDao.setComments(vPropertySetterDto.comments());
        ePropertySetterDao.setAssign(vPropertySetterDto.assign());
        ePropertySetterDao.setLikedBy(vPropertySetterDto.likedBy());
    }
}