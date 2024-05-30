package com.itbd.application.db.dto;

import com.itbd.application.db.dao.integrations.QueryParametersDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record QueryParametersDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String key,
        String value,
        String parent,
        String parentField,
        String parentType
) {
    public static QueryParametersDto fromEntity(QueryParametersDao eQueryParametersDao) {
        return new QueryParametersDto(
                eQueryParametersDao.getName(),
                eQueryParametersDao.getCreation(),
                eQueryParametersDao.getModified(),
                eQueryParametersDao.getModifiedBy(),
                eQueryParametersDao.getOwner(),
                eQueryParametersDao.getIsDocStatus(),
                eQueryParametersDao.getIdx(),
                eQueryParametersDao.getKey(),
                eQueryParametersDao.getValue(),
                eQueryParametersDao.getParent(),
                eQueryParametersDao.getParentField(),
                eQueryParametersDao.getParentType());
    }

    public static void fromDTO(QueryParametersDto vQueryParametersDto, QueryParametersDao eQueryParametersDao) {
        eQueryParametersDao.setName(vQueryParametersDto.name());
        eQueryParametersDao.setCreation(vQueryParametersDto.creation());
        eQueryParametersDao.setModified(vQueryParametersDto.modified());
        eQueryParametersDao.setModifiedBy(vQueryParametersDto.modifiedBy());
        eQueryParametersDao.setOwner(vQueryParametersDto.owner());
        eQueryParametersDao.setIsDocStatus(vQueryParametersDto.isDocStatus());
        eQueryParametersDao.setIdx(vQueryParametersDto.idx());
        eQueryParametersDao.setKey(vQueryParametersDto.key());
        eQueryParametersDao.setValue(vQueryParametersDto.value());
        eQueryParametersDao.setParent(vQueryParametersDto.parent());
        eQueryParametersDao.setParentField(vQueryParametersDto.parentField());
        eQueryParametersDao.setParentType(vQueryParametersDto.parentType());
    }
}