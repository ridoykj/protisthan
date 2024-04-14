package com.itbd.application.db.dto;

import com.itbd.application.db.dao.VideoDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record VideoDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String title,
        String provider,
        String url,
        String youtubeVideoId,
        LocalDate publishDate,
        BigDecimal duration,
        BigDecimal likeCount,
        BigDecimal viewCount,
        BigDecimal dislikeCount,
        BigDecimal commentCount,
        String description,
        String image,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static VideoDto fromEntity(VideoDao eVideoDao) {
        return new VideoDto(
                eVideoDao.getName(),
                eVideoDao.getCreation(),
                eVideoDao.getModified(),
                eVideoDao.getModifiedBy(),
                eVideoDao.getOwner(),
                eVideoDao.getIsDocStatus(),
                eVideoDao.getIdx(),
                eVideoDao.getTitle(),
                eVideoDao.getProvider(),
                eVideoDao.getUrl(),
                eVideoDao.getYoutubeVideoId(),
                eVideoDao.getPublishDate(),
                eVideoDao.getDuration(),
                eVideoDao.getLikeCount(),
                eVideoDao.getViewCount(),
                eVideoDao.getDislikeCount(),
                eVideoDao.getCommentCount(),
                eVideoDao.getDescription(),
                eVideoDao.getImage(),
                eVideoDao.getUserTags(),
                eVideoDao.getComments(),
                eVideoDao.getAssign(),
                eVideoDao.getLikedBy());
    }

    public static void fromDTO(VideoDto vVideoDto, VideoDao eVideoDao) {
        eVideoDao.setName(vVideoDto.name());
        eVideoDao.setCreation(vVideoDto.creation());
        eVideoDao.setModified(vVideoDto.modified());
        eVideoDao.setModifiedBy(vVideoDto.modifiedBy());
        eVideoDao.setOwner(vVideoDto.owner());
        eVideoDao.setIsDocStatus(vVideoDto.isDocStatus());
        eVideoDao.setIdx(vVideoDto.idx());
        eVideoDao.setTitle(vVideoDto.title());
        eVideoDao.setProvider(vVideoDto.provider());
        eVideoDao.setUrl(vVideoDto.url());
        eVideoDao.setYoutubeVideoId(vVideoDto.youtubeVideoId());
        eVideoDao.setPublishDate(vVideoDto.publishDate());
        eVideoDao.setDuration(vVideoDto.duration());
        eVideoDao.setLikeCount(vVideoDto.likeCount());
        eVideoDao.setViewCount(vVideoDto.viewCount());
        eVideoDao.setDislikeCount(vVideoDto.dislikeCount());
        eVideoDao.setCommentCount(vVideoDto.commentCount());
        eVideoDao.setDescription(vVideoDto.description());
        eVideoDao.setImage(vVideoDto.image());
        eVideoDao.setUserTags(vVideoDto.userTags());
        eVideoDao.setComments(vVideoDto.comments());
        eVideoDao.setAssign(vVideoDto.assign());
        eVideoDao.setLikedBy(vVideoDto.likedBy());
    }
}