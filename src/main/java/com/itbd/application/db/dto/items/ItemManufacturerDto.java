package com.itbd.application.db.dto.items;

import com.itbd.application.db.dao.items.ItemManufacturerDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ItemManufacturerDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String itemCode,
        String manufacturer,
        String manufacturerPartNo,
        String itemName,
        String description,
        Boolean isDefault,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ItemManufacturerDto fromEntity(ItemManufacturerDao eItemManufacturerDao) {
        return new ItemManufacturerDto(
                eItemManufacturerDao.getName(),
                eItemManufacturerDao.getCreation(),
                eItemManufacturerDao.getModified(),
                eItemManufacturerDao.getModifiedBy(),
                eItemManufacturerDao.getOwner(),
                eItemManufacturerDao.getIsDocStatus(),
                eItemManufacturerDao.getIdx(),
                eItemManufacturerDao.getItemCode(),
                eItemManufacturerDao.getManufacturer(),
                eItemManufacturerDao.getManufacturerPartNo(),
                eItemManufacturerDao.getItemName(),
                eItemManufacturerDao.getDescription(),
                eItemManufacturerDao.getIsDefault(),
                eItemManufacturerDao.getUserTags(),
                eItemManufacturerDao.getComments(),
                eItemManufacturerDao.getAssign(),
                eItemManufacturerDao.getLikedBy());
    }

    public static void fromDTO(ItemManufacturerDto vItemManufacturerDto, ItemManufacturerDao eItemManufacturerDao) {
        eItemManufacturerDao.setName(vItemManufacturerDto.name());
        eItemManufacturerDao.setCreation(vItemManufacturerDto.creation());
        eItemManufacturerDao.setModified(vItemManufacturerDto.modified());
        eItemManufacturerDao.setModifiedBy(vItemManufacturerDto.modifiedBy());
        eItemManufacturerDao.setOwner(vItemManufacturerDto.owner());
        eItemManufacturerDao.setIsDocStatus(vItemManufacturerDto.isDocStatus());
        eItemManufacturerDao.setIdx(vItemManufacturerDto.idx());
        eItemManufacturerDao.setItemCode(vItemManufacturerDto.itemCode());
        eItemManufacturerDao.setManufacturer(vItemManufacturerDto.manufacturer());
        eItemManufacturerDao.setManufacturerPartNo(vItemManufacturerDto.manufacturerPartNo());
        eItemManufacturerDao.setItemName(vItemManufacturerDto.itemName());
        eItemManufacturerDao.setDescription(vItemManufacturerDto.description());
        eItemManufacturerDao.setIsDefault(vItemManufacturerDto.isDefault());
        eItemManufacturerDao.setUserTags(vItemManufacturerDto.userTags());
        eItemManufacturerDao.setComments(vItemManufacturerDto.comments());
        eItemManufacturerDao.setAssign(vItemManufacturerDto.assign());
        eItemManufacturerDao.setLikedBy(vItemManufacturerDto.likedBy());
    }
}