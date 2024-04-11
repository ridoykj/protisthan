package com.itbd.application.db.dto.pos;

import com.itbd.application.db.dao.pos.PosFieldDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record PosFieldDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String fieldName,
        String label,
        String fieldType,
        String options,
        String defaultValue,
        Boolean reqd,
        Boolean readOnly,
        String parent,
        String parentField,
        String parentType
) {
    public static PosFieldDto fromEntity(PosFieldDao ePosFieldDao) {
        return new PosFieldDto(
                ePosFieldDao.getName(),
                ePosFieldDao.getCreation(),
                ePosFieldDao.getModified(),
                ePosFieldDao.getModifiedBy(),
                ePosFieldDao.getOwner(),
                ePosFieldDao.getIsDocStatus(),
                ePosFieldDao.getIdx(),
                ePosFieldDao.getFieldName(),
                ePosFieldDao.getLabel(),
                ePosFieldDao.getFieldType(),
                ePosFieldDao.getOptions(),
                ePosFieldDao.getDefaultValue(),
                ePosFieldDao.getReqd(),
                ePosFieldDao.getReadOnly(),
                ePosFieldDao.getParent(),
                ePosFieldDao.getParentField(),
                ePosFieldDao.getParentType());
    }

    public static void fromDTO(PosFieldDto vPosFieldDto, PosFieldDao ePosFieldDao) {
        ePosFieldDao.setName(vPosFieldDto.name());
        ePosFieldDao.setCreation(vPosFieldDto.creation());
        ePosFieldDao.setModified(vPosFieldDto.modified());
        ePosFieldDao.setModifiedBy(vPosFieldDto.modifiedBy());
        ePosFieldDao.setOwner(vPosFieldDto.owner());
        ePosFieldDao.setIsDocStatus(vPosFieldDto.isDocStatus());
        ePosFieldDao.setIdx(vPosFieldDto.idx());
        ePosFieldDao.setFieldName(vPosFieldDto.fieldName());
        ePosFieldDao.setLabel(vPosFieldDto.label());
        ePosFieldDao.setFieldType(vPosFieldDto.fieldType());
        ePosFieldDao.setOptions(vPosFieldDto.options());
        ePosFieldDao.setDefaultValue(vPosFieldDto.defaultValue());
        ePosFieldDao.setReqd(vPosFieldDto.reqd());
        ePosFieldDao.setReadOnly(vPosFieldDto.readOnly());
        ePosFieldDao.setParent(vPosFieldDto.parent());
        ePosFieldDao.setParentField(vPosFieldDto.parentField());
        ePosFieldDao.setParentType(vPosFieldDto.parentType());
    }
}