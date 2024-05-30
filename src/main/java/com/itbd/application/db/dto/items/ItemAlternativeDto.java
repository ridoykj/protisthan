package com.itbd.application.db.dto.items;

import com.itbd.application.db.dao.stock.item.ItemAlternativeDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ItemAlternativeDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String itemCode,
        String alternativeItemCode,
        Boolean twoWay,
        String itemName,
        String alternativeItemName,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ItemAlternativeDto fromEntity(ItemAlternativeDao eItemAlternativeDao) {
        return new ItemAlternativeDto(
                eItemAlternativeDao.getName(),
                eItemAlternativeDao.getCreation(),
                eItemAlternativeDao.getModified(),
                eItemAlternativeDao.getModifiedBy(),
                eItemAlternativeDao.getOwner(),
                eItemAlternativeDao.getIsDocStatus(),
                eItemAlternativeDao.getIdx(),
                eItemAlternativeDao.getItemCode(),
                eItemAlternativeDao.getAlternativeItemCode(),
                eItemAlternativeDao.getTwoWay(),
                eItemAlternativeDao.getItemName(),
                eItemAlternativeDao.getAlternativeItemName(),
                eItemAlternativeDao.getUserTags(),
                eItemAlternativeDao.getComments(),
                eItemAlternativeDao.getAssign(),
                eItemAlternativeDao.getLikedBy());
    }

    public static void fromDTO(ItemAlternativeDto vItemAlternativeDto, ItemAlternativeDao eItemAlternativeDao) {
        eItemAlternativeDao.setName(vItemAlternativeDto.name());
        eItemAlternativeDao.setCreation(vItemAlternativeDto.creation());
        eItemAlternativeDao.setModified(vItemAlternativeDto.modified());
        eItemAlternativeDao.setModifiedBy(vItemAlternativeDto.modifiedBy());
        eItemAlternativeDao.setOwner(vItemAlternativeDto.owner());
        eItemAlternativeDao.setIsDocStatus(vItemAlternativeDto.isDocStatus());
        eItemAlternativeDao.setIdx(vItemAlternativeDto.idx());
        eItemAlternativeDao.setItemCode(vItemAlternativeDto.itemCode());
        eItemAlternativeDao.setAlternativeItemCode(vItemAlternativeDto.alternativeItemCode());
        eItemAlternativeDao.setTwoWay(vItemAlternativeDto.twoWay());
        eItemAlternativeDao.setItemName(vItemAlternativeDto.itemName());
        eItemAlternativeDao.setAlternativeItemName(vItemAlternativeDto.alternativeItemName());
        eItemAlternativeDao.setUserTags(vItemAlternativeDto.userTags());
        eItemAlternativeDao.setComments(vItemAlternativeDto.comments());
        eItemAlternativeDao.setAssign(vItemAlternativeDto.assign());
        eItemAlternativeDao.setLikedBy(vItemAlternativeDto.likedBy());
    }
}