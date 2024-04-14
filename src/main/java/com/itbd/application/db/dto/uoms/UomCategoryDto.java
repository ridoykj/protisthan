package com.itbd.application.db.dto.uoms;

import com.itbd.application.db.dao.uoms.UomCategoryDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record UomCategoryDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String categoryName,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static UomCategoryDto fromEntity(UomCategoryDao eUomCategoryDao) {
        return new UomCategoryDto(
                eUomCategoryDao.getName(),
                eUomCategoryDao.getCreation(),
                eUomCategoryDao.getModified(),
                eUomCategoryDao.getModifiedBy(),
                eUomCategoryDao.getOwner(),
                eUomCategoryDao.getIsDocStatus(),
                eUomCategoryDao.getIdx(),
                eUomCategoryDao.getCategoryName(),
                eUomCategoryDao.getUserTags(),
                eUomCategoryDao.getComments(),
                eUomCategoryDao.getAssign(),
                eUomCategoryDao.getLikedBy());
    }

    public static void fromDTO(UomCategoryDto vUomCategoryDto, UomCategoryDao eUomCategoryDao) {
        eUomCategoryDao.setName(vUomCategoryDto.name());
        eUomCategoryDao.setCreation(vUomCategoryDto.creation());
        eUomCategoryDao.setModified(vUomCategoryDto.modified());
        eUomCategoryDao.setModifiedBy(vUomCategoryDto.modifiedBy());
        eUomCategoryDao.setOwner(vUomCategoryDto.owner());
        eUomCategoryDao.setIsDocStatus(vUomCategoryDto.isDocStatus());
        eUomCategoryDao.setIdx(vUomCategoryDto.idx());
        eUomCategoryDao.setCategoryName(vUomCategoryDto.categoryName());
        eUomCategoryDao.setUserTags(vUomCategoryDto.userTags());
        eUomCategoryDao.setComments(vUomCategoryDto.comments());
        eUomCategoryDao.setAssign(vUomCategoryDto.assign());
        eUomCategoryDao.setLikedBy(vUomCategoryDto.likedBy());
    }
}