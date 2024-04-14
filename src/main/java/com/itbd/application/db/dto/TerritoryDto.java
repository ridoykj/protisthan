package com.itbd.application.db.dto;

import com.itbd.application.db.dao.TerritoryDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record TerritoryDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String territoryName,
        String parentTerritory,
        Boolean isGroup,
        String territoryManager,
        Integer lft,
        Integer rgt,
        String oldParent,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static TerritoryDto fromEntity(TerritoryDao eTerritoryDao) {
        return new TerritoryDto(
                eTerritoryDao.getName(),
                eTerritoryDao.getCreation(),
                eTerritoryDao.getModified(),
                eTerritoryDao.getModifiedBy(),
                eTerritoryDao.getOwner(),
                eTerritoryDao.getIsDocStatus(),
                eTerritoryDao.getIdx(),
                eTerritoryDao.getTerritoryName(),
                eTerritoryDao.getParentTerritory(),
                eTerritoryDao.getIsGroup(),
                eTerritoryDao.getTerritoryManager(),
                eTerritoryDao.getLft(),
                eTerritoryDao.getRgt(),
                eTerritoryDao.getOldParent(),
                eTerritoryDao.getUserTags(),
                eTerritoryDao.getComments(),
                eTerritoryDao.getAssign(),
                eTerritoryDao.getLikedBy());
    }

    public static void fromDTO(TerritoryDto vTerritoryDto, TerritoryDao eTerritoryDao) {
        eTerritoryDao.setName(vTerritoryDto.name());
        eTerritoryDao.setCreation(vTerritoryDto.creation());
        eTerritoryDao.setModified(vTerritoryDto.modified());
        eTerritoryDao.setModifiedBy(vTerritoryDto.modifiedBy());
        eTerritoryDao.setOwner(vTerritoryDto.owner());
        eTerritoryDao.setIsDocStatus(vTerritoryDto.isDocStatus());
        eTerritoryDao.setIdx(vTerritoryDto.idx());
        eTerritoryDao.setTerritoryName(vTerritoryDto.territoryName());
        eTerritoryDao.setParentTerritory(vTerritoryDto.parentTerritory());
        eTerritoryDao.setIsGroup(vTerritoryDto.isGroup());
        eTerritoryDao.setTerritoryManager(vTerritoryDto.territoryManager());
        eTerritoryDao.setLft(vTerritoryDto.lft());
        eTerritoryDao.setRgt(vTerritoryDto.rgt());
        eTerritoryDao.setOldParent(vTerritoryDto.oldParent());
        eTerritoryDao.setUserTags(vTerritoryDto.userTags());
        eTerritoryDao.setComments(vTerritoryDto.comments());
        eTerritoryDao.setAssign(vTerritoryDto.assign());
        eTerritoryDao.setLikedBy(vTerritoryDto.likedBy());
    }
}