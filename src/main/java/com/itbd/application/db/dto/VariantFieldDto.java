package com.itbd.application.db.dto;

import com.itbd.application.db.dao.VariantFieldDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record VariantFieldDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String fieldName,
        String parent,
        String parentField,
        String parentType
) {
    public static VariantFieldDto fromEntity(VariantFieldDao eVariantFieldDao) {
        return new VariantFieldDto(
                eVariantFieldDao.getName(),
                eVariantFieldDao.getCreation(),
                eVariantFieldDao.getModified(),
                eVariantFieldDao.getModifiedBy(),
                eVariantFieldDao.getOwner(),
                eVariantFieldDao.getIsDocStatus(),
                eVariantFieldDao.getIdx(),
                eVariantFieldDao.getFieldName(),
                eVariantFieldDao.getParent(),
                eVariantFieldDao.getParentField(),
                eVariantFieldDao.getParentType());
    }

    public static void fromDTO(VariantFieldDto vVariantFieldDto, VariantFieldDao eVariantFieldDao) {
        eVariantFieldDao.setName(vVariantFieldDto.name());
        eVariantFieldDao.setCreation(vVariantFieldDto.creation());
        eVariantFieldDao.setModified(vVariantFieldDto.modified());
        eVariantFieldDao.setModifiedBy(vVariantFieldDto.modifiedBy());
        eVariantFieldDao.setOwner(vVariantFieldDto.owner());
        eVariantFieldDao.setIsDocStatus(vVariantFieldDto.isDocStatus());
        eVariantFieldDao.setIdx(vVariantFieldDto.idx());
        eVariantFieldDao.setFieldName(vVariantFieldDto.fieldName());
        eVariantFieldDao.setParent(vVariantFieldDto.parent());
        eVariantFieldDao.setParentField(vVariantFieldDto.parentField());
        eVariantFieldDao.setParentType(vVariantFieldDto.parentType());
    }
}