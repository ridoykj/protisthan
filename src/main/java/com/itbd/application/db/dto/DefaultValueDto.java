package com.itbd.application.db.dto;

import com.itbd.application.db.dao.DefaultValueDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record DefaultValueDto(
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
        String defValue,
        String defKey
) {
    public static DefaultValueDto fromEntity(DefaultValueDao eDefaultValueDao) {
        return new DefaultValueDto(
                eDefaultValueDao.getName(),
                eDefaultValueDao.getCreation(),
                eDefaultValueDao.getModified(),
                eDefaultValueDao.getModifiedBy(),
                eDefaultValueDao.getOwner(),
                eDefaultValueDao.getIsDocStatus(),
                eDefaultValueDao.getParent(),
                eDefaultValueDao.getParentField(),
                eDefaultValueDao.getParentType(),
                eDefaultValueDao.getIdx(),
                eDefaultValueDao.getDefValue(),
                eDefaultValueDao.getDefKey());
    }

    public static void fromDTO(DefaultValueDto vDefaultValueDto, DefaultValueDao eDefaultValueDao) {
        eDefaultValueDao.setName(vDefaultValueDto.name());
        eDefaultValueDao.setCreation(vDefaultValueDto.creation());
        eDefaultValueDao.setModified(vDefaultValueDto.modified());
        eDefaultValueDao.setModifiedBy(vDefaultValueDto.modifiedBy());
        eDefaultValueDao.setOwner(vDefaultValueDto.owner());
        eDefaultValueDao.setIsDocStatus(vDefaultValueDto.isDocStatus());
        eDefaultValueDao.setParent(vDefaultValueDto.parent());
        eDefaultValueDao.setParentField(vDefaultValueDto.parentField());
        eDefaultValueDao.setParentType(vDefaultValueDto.parentType());
        eDefaultValueDao.setIdx(vDefaultValueDto.idx());
        eDefaultValueDao.setDefValue(vDefaultValueDto.defValue());
        eDefaultValueDao.setDefKey(vDefaultValueDto.defKey());
    }
}