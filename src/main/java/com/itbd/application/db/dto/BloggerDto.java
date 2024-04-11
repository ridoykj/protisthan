package com.itbd.application.db.dto;

import com.itbd.application.db.dao.BloggerDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record BloggerDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Boolean disabled,
        String shortName,
        String fullName,
        String user,
        String bio,
        String avatar,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static BloggerDto fromEntity(BloggerDao eBloggerDao) {
        return new BloggerDto(
                eBloggerDao.getName(),
                eBloggerDao.getCreation(),
                eBloggerDao.getModified(),
                eBloggerDao.getModifiedBy(),
                eBloggerDao.getOwner(),
                eBloggerDao.getIsDocStatus(),
                eBloggerDao.getIdx(),
                eBloggerDao.getDisabled(),
                eBloggerDao.getShortName(),
                eBloggerDao.getFullName(),
                eBloggerDao.getUser(),
                eBloggerDao.getBio(),
                eBloggerDao.getAvatar(),
                eBloggerDao.getUserTags(),
                eBloggerDao.getComments(),
                eBloggerDao.getAssign(),
                eBloggerDao.getLikedBy());
    }

    public static void fromDTO(BloggerDto vBloggerDto, BloggerDao eBloggerDao) {
        eBloggerDao.setName(vBloggerDto.name());
        eBloggerDao.setCreation(vBloggerDto.creation());
        eBloggerDao.setModified(vBloggerDto.modified());
        eBloggerDao.setModifiedBy(vBloggerDto.modifiedBy());
        eBloggerDao.setOwner(vBloggerDto.owner());
        eBloggerDao.setIsDocStatus(vBloggerDto.isDocStatus());
        eBloggerDao.setIdx(vBloggerDto.idx());
        eBloggerDao.setDisabled(vBloggerDto.disabled());
        eBloggerDao.setShortName(vBloggerDto.shortName());
        eBloggerDao.setFullName(vBloggerDto.fullName());
        eBloggerDao.setUser(vBloggerDto.user());
        eBloggerDao.setBio(vBloggerDto.bio());
        eBloggerDao.setAvatar(vBloggerDto.avatar());
        eBloggerDao.setUserTags(vBloggerDto.userTags());
        eBloggerDao.setComments(vBloggerDto.comments());
        eBloggerDao.setAssign(vBloggerDto.assign());
        eBloggerDao.setLikedBy(vBloggerDto.likedBy());
    }
}