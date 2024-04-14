package com.itbd.application.db.dto;

import com.itbd.application.db.dao.BlogPostDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record BlogPostDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String title,
        String blogCategory,
        String blogger,
        String route,
        Integer readTime,
        LocalDate publishedOn,
        Boolean published,
        Boolean featured,
        Boolean hideCta,
        Boolean enableEmailNotification,
        Boolean disableComments,
        Boolean disableLikes,
        String blogIntro,
        String contentType,
        String content,
        String contentMd,
        String contentHtml,
        Boolean emailSent,
        String metaTitle,
        String metaDescription,
        String metaImage,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static BlogPostDto fromEntity(BlogPostDao eBlogPostDao) {
        return new BlogPostDto(
                eBlogPostDao.getName(),
                eBlogPostDao.getCreation(),
                eBlogPostDao.getModified(),
                eBlogPostDao.getModifiedBy(),
                eBlogPostDao.getOwner(),
                eBlogPostDao.getIsDocStatus(),
                eBlogPostDao.getIdx(),
                eBlogPostDao.getTitle(),
                eBlogPostDao.getBlogCategory(),
                eBlogPostDao.getBlogger(),
                eBlogPostDao.getRoute(),
                eBlogPostDao.getReadTime(),
                eBlogPostDao.getPublishedOn(),
                eBlogPostDao.getPublished(),
                eBlogPostDao.getFeatured(),
                eBlogPostDao.getHideCta(),
                eBlogPostDao.getEnableEmailNotification(),
                eBlogPostDao.getDisableComments(),
                eBlogPostDao.getDisableLikes(),
                eBlogPostDao.getBlogIntro(),
                eBlogPostDao.getContentType(),
                eBlogPostDao.getContent(),
                eBlogPostDao.getContentMd(),
                eBlogPostDao.getContentHtml(),
                eBlogPostDao.getEmailSent(),
                eBlogPostDao.getMetaTitle(),
                eBlogPostDao.getMetaDescription(),
                eBlogPostDao.getMetaImage(),
                eBlogPostDao.getUserTags(),
                eBlogPostDao.getComments(),
                eBlogPostDao.getAssign(),
                eBlogPostDao.getLikedBy());
    }

    public static void fromDTO(BlogPostDto vBlogPostDto, BlogPostDao eBlogPostDao) {
        eBlogPostDao.setName(vBlogPostDto.name());
        eBlogPostDao.setCreation(vBlogPostDto.creation());
        eBlogPostDao.setModified(vBlogPostDto.modified());
        eBlogPostDao.setModifiedBy(vBlogPostDto.modifiedBy());
        eBlogPostDao.setOwner(vBlogPostDto.owner());
        eBlogPostDao.setIsDocStatus(vBlogPostDto.isDocStatus());
        eBlogPostDao.setIdx(vBlogPostDto.idx());
        eBlogPostDao.setTitle(vBlogPostDto.title());
        eBlogPostDao.setBlogCategory(vBlogPostDto.blogCategory());
        eBlogPostDao.setBlogger(vBlogPostDto.blogger());
        eBlogPostDao.setRoute(vBlogPostDto.route());
        eBlogPostDao.setReadTime(vBlogPostDto.readTime());
        eBlogPostDao.setPublishedOn(vBlogPostDto.publishedOn());
        eBlogPostDao.setPublished(vBlogPostDto.published());
        eBlogPostDao.setFeatured(vBlogPostDto.featured());
        eBlogPostDao.setHideCta(vBlogPostDto.hideCta());
        eBlogPostDao.setEnableEmailNotification(vBlogPostDto.enableEmailNotification());
        eBlogPostDao.setDisableComments(vBlogPostDto.disableComments());
        eBlogPostDao.setDisableLikes(vBlogPostDto.disableLikes());
        eBlogPostDao.setBlogIntro(vBlogPostDto.blogIntro());
        eBlogPostDao.setContentType(vBlogPostDto.contentType());
        eBlogPostDao.setContent(vBlogPostDto.content());
        eBlogPostDao.setContentMd(vBlogPostDto.contentMd());
        eBlogPostDao.setContentHtml(vBlogPostDto.contentHtml());
        eBlogPostDao.setEmailSent(vBlogPostDto.emailSent());
        eBlogPostDao.setMetaTitle(vBlogPostDto.metaTitle());
        eBlogPostDao.setMetaDescription(vBlogPostDto.metaDescription());
        eBlogPostDao.setMetaImage(vBlogPostDto.metaImage());
        eBlogPostDao.setUserTags(vBlogPostDto.userTags());
        eBlogPostDao.setComments(vBlogPostDto.comments());
        eBlogPostDao.setAssign(vBlogPostDto.assign());
        eBlogPostDao.setLikedBy(vBlogPostDto.likedBy());
    }
}