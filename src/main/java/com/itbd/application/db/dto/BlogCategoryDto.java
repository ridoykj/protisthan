package com.itbd.application.db.dto;

import com.itbd.application.db.dao.BlogCategoryDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record BlogCategoryDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Boolean published,
        String title,
        String description,
        String route,
        String previewImage,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static BlogCategoryDto fromEntity(BlogCategoryDao eBlogCategoryDao) {
        return new BlogCategoryDto(
                eBlogCategoryDao.getName(),
                eBlogCategoryDao.getCreation(),
                eBlogCategoryDao.getModified(),
                eBlogCategoryDao.getModifiedBy(),
                eBlogCategoryDao.getOwner(),
                eBlogCategoryDao.getIsDocStatus(),
                eBlogCategoryDao.getIdx(),
                eBlogCategoryDao.getPublished(),
                eBlogCategoryDao.getTitle(),
                eBlogCategoryDao.getDescription(),
                eBlogCategoryDao.getRoute(),
                eBlogCategoryDao.getPreviewImage(),
                eBlogCategoryDao.getUserTags(),
                eBlogCategoryDao.getComments(),
                eBlogCategoryDao.getAssign(),
                eBlogCategoryDao.getLikedBy());
    }

    public static void fromDTO(BlogCategoryDto vBlogCategoryDto, BlogCategoryDao eBlogCategoryDao) {
        eBlogCategoryDao.setName(vBlogCategoryDto.name());
        eBlogCategoryDao.setCreation(vBlogCategoryDto.creation());
        eBlogCategoryDao.setModified(vBlogCategoryDto.modified());
        eBlogCategoryDao.setModifiedBy(vBlogCategoryDto.modifiedBy());
        eBlogCategoryDao.setOwner(vBlogCategoryDto.owner());
        eBlogCategoryDao.setIsDocStatus(vBlogCategoryDto.isDocStatus());
        eBlogCategoryDao.setIdx(vBlogCategoryDto.idx());
        eBlogCategoryDao.setPublished(vBlogCategoryDto.published());
        eBlogCategoryDao.setTitle(vBlogCategoryDto.title());
        eBlogCategoryDao.setDescription(vBlogCategoryDto.description());
        eBlogCategoryDao.setRoute(vBlogCategoryDto.route());
        eBlogCategoryDao.setPreviewImage(vBlogCategoryDto.previewImage());
        eBlogCategoryDao.setUserTags(vBlogCategoryDto.userTags());
        eBlogCategoryDao.setComments(vBlogCategoryDto.comments());
        eBlogCategoryDao.setAssign(vBlogCategoryDto.assign());
        eBlogCategoryDao.setLikedBy(vBlogCategoryDto.likedBy());
    }
}