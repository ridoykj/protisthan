package com.itbd.application.db.dto;

import com.itbd.application.db.dao.selling.ProductBundleDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ProductBundleDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String newItemCode,
        String description,
        Boolean disabled,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ProductBundleDto fromEntity(ProductBundleDao eProductBundleDao) {
        return new ProductBundleDto(
                eProductBundleDao.getName(),
                eProductBundleDao.getCreation(),
                eProductBundleDao.getModified(),
                eProductBundleDao.getModifiedBy(),
                eProductBundleDao.getOwner(),
                eProductBundleDao.getIsDocStatus(),
                eProductBundleDao.getIdx(),
                eProductBundleDao.getNewItemCode(),
                eProductBundleDao.getDescription(),
                eProductBundleDao.getDisabled(),
                eProductBundleDao.getUserTags(),
                eProductBundleDao.getComments(),
                eProductBundleDao.getAssign(),
                eProductBundleDao.getLikedBy());
    }

    public static void fromDTO(ProductBundleDto vProductBundleDto, ProductBundleDao eProductBundleDao) {
        eProductBundleDao.setName(vProductBundleDto.name());
        eProductBundleDao.setCreation(vProductBundleDto.creation());
        eProductBundleDao.setModified(vProductBundleDto.modified());
        eProductBundleDao.setModifiedBy(vProductBundleDto.modifiedBy());
        eProductBundleDao.setOwner(vProductBundleDto.owner());
        eProductBundleDao.setIsDocStatus(vProductBundleDto.isDocStatus());
        eProductBundleDao.setIdx(vProductBundleDto.idx());
        eProductBundleDao.setNewItemCode(vProductBundleDto.newItemCode());
        eProductBundleDao.setDescription(vProductBundleDto.description());
        eProductBundleDao.setDisabled(vProductBundleDto.disabled());
        eProductBundleDao.setUserTags(vProductBundleDto.userTags());
        eProductBundleDao.setComments(vProductBundleDto.comments());
        eProductBundleDao.setAssign(vProductBundleDto.assign());
        eProductBundleDao.setLikedBy(vProductBundleDto.likedBy());
    }
}