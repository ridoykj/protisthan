package com.itbd.application.db.dto;

import com.itbd.application.db.dao.PlantFloorDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record PlantFloorDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String floorName,
        String company,
        String warehouse,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static PlantFloorDto fromEntity(PlantFloorDao ePlantFloorDao) {
        return new PlantFloorDto(
                ePlantFloorDao.getName(),
                ePlantFloorDao.getCreation(),
                ePlantFloorDao.getModified(),
                ePlantFloorDao.getModifiedBy(),
                ePlantFloorDao.getOwner(),
                ePlantFloorDao.getIsDocStatus(),
                ePlantFloorDao.getIdx(),
                ePlantFloorDao.getFloorName(),
                ePlantFloorDao.getCompany(),
                ePlantFloorDao.getWarehouse(),
                ePlantFloorDao.getUserTags(),
                ePlantFloorDao.getComments(),
                ePlantFloorDao.getAssign(),
                ePlantFloorDao.getLikedBy());
    }

    public static void fromDTO(PlantFloorDto vPlantFloorDto, PlantFloorDao ePlantFloorDao) {
        ePlantFloorDao.setName(vPlantFloorDto.name());
        ePlantFloorDao.setCreation(vPlantFloorDto.creation());
        ePlantFloorDao.setModified(vPlantFloorDto.modified());
        ePlantFloorDao.setModifiedBy(vPlantFloorDto.modifiedBy());
        ePlantFloorDao.setOwner(vPlantFloorDto.owner());
        ePlantFloorDao.setIsDocStatus(vPlantFloorDto.isDocStatus());
        ePlantFloorDao.setIdx(vPlantFloorDto.idx());
        ePlantFloorDao.setFloorName(vPlantFloorDto.floorName());
        ePlantFloorDao.setCompany(vPlantFloorDto.company());
        ePlantFloorDao.setWarehouse(vPlantFloorDto.warehouse());
        ePlantFloorDao.setUserTags(vPlantFloorDto.userTags());
        ePlantFloorDao.setComments(vPlantFloorDto.comments());
        ePlantFloorDao.setAssign(vPlantFloorDto.assign());
        ePlantFloorDao.setLikedBy(vPlantFloorDto.likedBy());
    }
}