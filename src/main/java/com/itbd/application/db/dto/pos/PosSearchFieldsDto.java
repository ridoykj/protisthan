package com.itbd.application.db.dto.pos;

import com.itbd.application.db.dao.pos.PosSearchFieldsDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record PosSearchFieldsDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String field,
        String fieldName,
        String parent,
        String parentField,
        String parentType
) {
    public static PosSearchFieldsDto fromEntity(PosSearchFieldsDao ePosSearchFieldsDao) {
        return new PosSearchFieldsDto(
                ePosSearchFieldsDao.getName(),
                ePosSearchFieldsDao.getCreation(),
                ePosSearchFieldsDao.getModified(),
                ePosSearchFieldsDao.getModifiedBy(),
                ePosSearchFieldsDao.getOwner(),
                ePosSearchFieldsDao.getIsDocStatus(),
                ePosSearchFieldsDao.getIdx(),
                ePosSearchFieldsDao.getField(),
                ePosSearchFieldsDao.getFieldName(),
                ePosSearchFieldsDao.getParent(),
                ePosSearchFieldsDao.getParentField(),
                ePosSearchFieldsDao.getParentType());
    }

    public static void fromDTO(PosSearchFieldsDto vPosSearchFieldsDto, PosSearchFieldsDao ePosSearchFieldsDao) {
        ePosSearchFieldsDao.setName(vPosSearchFieldsDto.name());
        ePosSearchFieldsDao.setCreation(vPosSearchFieldsDto.creation());
        ePosSearchFieldsDao.setModified(vPosSearchFieldsDto.modified());
        ePosSearchFieldsDao.setModifiedBy(vPosSearchFieldsDto.modifiedBy());
        ePosSearchFieldsDao.setOwner(vPosSearchFieldsDto.owner());
        ePosSearchFieldsDao.setIsDocStatus(vPosSearchFieldsDto.isDocStatus());
        ePosSearchFieldsDao.setIdx(vPosSearchFieldsDto.idx());
        ePosSearchFieldsDao.setField(vPosSearchFieldsDto.field());
        ePosSearchFieldsDao.setFieldName(vPosSearchFieldsDto.fieldName());
        ePosSearchFieldsDao.setParent(vPosSearchFieldsDto.parent());
        ePosSearchFieldsDao.setParentField(vPosSearchFieldsDto.parentField());
        ePosSearchFieldsDao.setParentType(vPosSearchFieldsDto.parentType());
    }
}