package com.itbd.application.db.dto.warehouse;

import com.itbd.application.db.dao.warehouse.WarehouseTypeDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record WarehouseTypeDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String description,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static WarehouseTypeDto fromEntity(WarehouseTypeDao eWarehouseTypeDao) {
        return new WarehouseTypeDto(
                eWarehouseTypeDao.getName(),
                eWarehouseTypeDao.getCreation(),
                eWarehouseTypeDao.getModified(),
                eWarehouseTypeDao.getModifiedBy(),
                eWarehouseTypeDao.getOwner(),
                eWarehouseTypeDao.getIsDocStatus(),
                eWarehouseTypeDao.getIdx(),
                eWarehouseTypeDao.getDescription(),
                eWarehouseTypeDao.getUserTags(),
                eWarehouseTypeDao.getComments(),
                eWarehouseTypeDao.getAssign(),
                eWarehouseTypeDao.getLikedBy());
    }

    public static void fromDTO(WarehouseTypeDto vWarehouseTypeDto, WarehouseTypeDao eWarehouseTypeDao) {
        eWarehouseTypeDao.setName(vWarehouseTypeDto.name());
        eWarehouseTypeDao.setCreation(vWarehouseTypeDto.creation());
        eWarehouseTypeDao.setModified(vWarehouseTypeDto.modified());
        eWarehouseTypeDao.setModifiedBy(vWarehouseTypeDto.modifiedBy());
        eWarehouseTypeDao.setOwner(vWarehouseTypeDto.owner());
        eWarehouseTypeDao.setIsDocStatus(vWarehouseTypeDto.isDocStatus());
        eWarehouseTypeDao.setIdx(vWarehouseTypeDto.idx());
        eWarehouseTypeDao.setDescription(vWarehouseTypeDto.description());
        eWarehouseTypeDao.setUserTags(vWarehouseTypeDto.userTags());
        eWarehouseTypeDao.setComments(vWarehouseTypeDto.comments());
        eWarehouseTypeDao.setAssign(vWarehouseTypeDto.assign());
        eWarehouseTypeDao.setLikedBy(vWarehouseTypeDto.likedBy());
    }
}