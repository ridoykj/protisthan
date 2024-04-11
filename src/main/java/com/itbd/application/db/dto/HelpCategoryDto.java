package com.itbd.application.db.dto;

import com.itbd.application.db.dao.HelpCategoryDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record HelpCategoryDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String categoryName,
        String categoryDescription,
        Boolean published,
        Integer helpArticles,
        String route,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static HelpCategoryDto fromEntity(HelpCategoryDao eHelpCategoryDao) {
        return new HelpCategoryDto(
                eHelpCategoryDao.getName(),
                eHelpCategoryDao.getCreation(),
                eHelpCategoryDao.getModified(),
                eHelpCategoryDao.getModifiedBy(),
                eHelpCategoryDao.getOwner(),
                eHelpCategoryDao.getIsDocStatus(),
                eHelpCategoryDao.getIdx(),
                eHelpCategoryDao.getCategoryName(),
                eHelpCategoryDao.getCategoryDescription(),
                eHelpCategoryDao.getPublished(),
                eHelpCategoryDao.getHelpArticles(),
                eHelpCategoryDao.getRoute(),
                eHelpCategoryDao.getUserTags(),
                eHelpCategoryDao.getComments(),
                eHelpCategoryDao.getAssign(),
                eHelpCategoryDao.getLikedBy());
    }

    public static void fromDTO(HelpCategoryDto vHelpCategoryDto, HelpCategoryDao eHelpCategoryDao) {
        eHelpCategoryDao.setName(vHelpCategoryDto.name());
        eHelpCategoryDao.setCreation(vHelpCategoryDto.creation());
        eHelpCategoryDao.setModified(vHelpCategoryDto.modified());
        eHelpCategoryDao.setModifiedBy(vHelpCategoryDto.modifiedBy());
        eHelpCategoryDao.setOwner(vHelpCategoryDto.owner());
        eHelpCategoryDao.setIsDocStatus(vHelpCategoryDto.isDocStatus());
        eHelpCategoryDao.setIdx(vHelpCategoryDto.idx());
        eHelpCategoryDao.setCategoryName(vHelpCategoryDto.categoryName());
        eHelpCategoryDao.setCategoryDescription(vHelpCategoryDto.categoryDescription());
        eHelpCategoryDao.setPublished(vHelpCategoryDto.published());
        eHelpCategoryDao.setHelpArticles(vHelpCategoryDto.helpArticles());
        eHelpCategoryDao.setRoute(vHelpCategoryDto.route());
        eHelpCategoryDao.setUserTags(vHelpCategoryDto.userTags());
        eHelpCategoryDao.setComments(vHelpCategoryDto.comments());
        eHelpCategoryDao.setAssign(vHelpCategoryDto.assign());
        eHelpCategoryDao.setLikedBy(vHelpCategoryDto.likedBy());
    }
}