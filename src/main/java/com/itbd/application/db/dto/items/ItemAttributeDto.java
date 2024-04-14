package com.itbd.application.db.dto.items;

import com.itbd.application.db.dao.items.ItemAttributeDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ItemAttributeDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String attributeName,
        Boolean numericValues,
        BigDecimal fromRange,
        BigDecimal increment,
        BigDecimal toRange,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ItemAttributeDto fromEntity(ItemAttributeDao eItemAttributeDao) {
        return new ItemAttributeDto(
                eItemAttributeDao.getName(),
                eItemAttributeDao.getCreation(),
                eItemAttributeDao.getModified(),
                eItemAttributeDao.getModifiedBy(),
                eItemAttributeDao.getOwner(),
                eItemAttributeDao.getIsDocStatus(),
                eItemAttributeDao.getIdx(),
                eItemAttributeDao.getAttributeName(),
                eItemAttributeDao.getNumericValues(),
                eItemAttributeDao.getFromRange(),
                eItemAttributeDao.getIncrement(),
                eItemAttributeDao.getToRange(),
                eItemAttributeDao.getUserTags(),
                eItemAttributeDao.getComments(),
                eItemAttributeDao.getAssign(),
                eItemAttributeDao.getLikedBy());
    }

    public static void fromDTO(ItemAttributeDto vItemAttributeDto, ItemAttributeDao eItemAttributeDao) {
        eItemAttributeDao.setName(vItemAttributeDto.name());
        eItemAttributeDao.setCreation(vItemAttributeDto.creation());
        eItemAttributeDao.setModified(vItemAttributeDto.modified());
        eItemAttributeDao.setModifiedBy(vItemAttributeDto.modifiedBy());
        eItemAttributeDao.setOwner(vItemAttributeDto.owner());
        eItemAttributeDao.setIsDocStatus(vItemAttributeDto.isDocStatus());
        eItemAttributeDao.setIdx(vItemAttributeDto.idx());
        eItemAttributeDao.setAttributeName(vItemAttributeDto.attributeName());
        eItemAttributeDao.setNumericValues(vItemAttributeDto.numericValues());
        eItemAttributeDao.setFromRange(vItemAttributeDto.fromRange());
        eItemAttributeDao.setIncrement(vItemAttributeDto.increment());
        eItemAttributeDao.setToRange(vItemAttributeDto.toRange());
        eItemAttributeDao.setUserTags(vItemAttributeDto.userTags());
        eItemAttributeDao.setComments(vItemAttributeDto.comments());
        eItemAttributeDao.setAssign(vItemAttributeDto.assign());
        eItemAttributeDao.setLikedBy(vItemAttributeDto.likedBy());
    }
}