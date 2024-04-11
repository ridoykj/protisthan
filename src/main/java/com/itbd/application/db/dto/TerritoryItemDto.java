package com.itbd.application.db.dto;

import com.itbd.application.db.dao.TerritoryItemDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record TerritoryItemDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String territory,
        String parent,
        String parentField,
        String parentType
) {
    public static TerritoryItemDto fromEntity(TerritoryItemDao eTerritoryItemDao) {
        return new TerritoryItemDto(
                eTerritoryItemDao.getName(),
                eTerritoryItemDao.getCreation(),
                eTerritoryItemDao.getModified(),
                eTerritoryItemDao.getModifiedBy(),
                eTerritoryItemDao.getOwner(),
                eTerritoryItemDao.getIsDocStatus(),
                eTerritoryItemDao.getIdx(),
                eTerritoryItemDao.getTerritory(),
                eTerritoryItemDao.getParent(),
                eTerritoryItemDao.getParentField(),
                eTerritoryItemDao.getParentType());
    }

    public static void fromDTO(TerritoryItemDto vTerritoryItemDto, TerritoryItemDao eTerritoryItemDao) {
        eTerritoryItemDao.setName(vTerritoryItemDto.name());
        eTerritoryItemDao.setCreation(vTerritoryItemDto.creation());
        eTerritoryItemDao.setModified(vTerritoryItemDto.modified());
        eTerritoryItemDao.setModifiedBy(vTerritoryItemDto.modifiedBy());
        eTerritoryItemDao.setOwner(vTerritoryItemDto.owner());
        eTerritoryItemDao.setIsDocStatus(vTerritoryItemDto.isDocStatus());
        eTerritoryItemDao.setIdx(vTerritoryItemDto.idx());
        eTerritoryItemDao.setTerritory(vTerritoryItemDto.territory());
        eTerritoryItemDao.setParent(vTerritoryItemDto.parent());
        eTerritoryItemDao.setParentField(vTerritoryItemDto.parentField());
        eTerritoryItemDao.setParentType(vTerritoryItemDto.parentType());
    }
}