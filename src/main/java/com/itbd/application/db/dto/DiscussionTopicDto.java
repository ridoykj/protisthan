package com.itbd.application.db.dto;

import com.itbd.application.db.dao.DiscussionTopicDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record DiscussionTopicDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String title,
        String referenceDocType,
        String referenceDocName,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static DiscussionTopicDto fromEntity(DiscussionTopicDao eDiscussionTopicDao) {
        return new DiscussionTopicDto(
                eDiscussionTopicDao.getName(),
                eDiscussionTopicDao.getCreation(),
                eDiscussionTopicDao.getModified(),
                eDiscussionTopicDao.getModifiedBy(),
                eDiscussionTopicDao.getOwner(),
                eDiscussionTopicDao.getIsDocStatus(),
                eDiscussionTopicDao.getIdx(),
                eDiscussionTopicDao.getTitle(),
                eDiscussionTopicDao.getReferenceDocType(),
                eDiscussionTopicDao.getReferenceDocName(),
                eDiscussionTopicDao.getUserTags(),
                eDiscussionTopicDao.getComments(),
                eDiscussionTopicDao.getAssign(),
                eDiscussionTopicDao.getLikedBy());
    }

    public static void fromDTO(DiscussionTopicDto vDiscussionTopicDto, DiscussionTopicDao eDiscussionTopicDao) {
        eDiscussionTopicDao.setName(vDiscussionTopicDto.name());
        eDiscussionTopicDao.setCreation(vDiscussionTopicDto.creation());
        eDiscussionTopicDao.setModified(vDiscussionTopicDto.modified());
        eDiscussionTopicDao.setModifiedBy(vDiscussionTopicDto.modifiedBy());
        eDiscussionTopicDao.setOwner(vDiscussionTopicDto.owner());
        eDiscussionTopicDao.setIsDocStatus(vDiscussionTopicDto.isDocStatus());
        eDiscussionTopicDao.setIdx(vDiscussionTopicDto.idx());
        eDiscussionTopicDao.setTitle(vDiscussionTopicDto.title());
        eDiscussionTopicDao.setReferenceDocType(vDiscussionTopicDto.referenceDocType());
        eDiscussionTopicDao.setReferenceDocName(vDiscussionTopicDto.referenceDocName());
        eDiscussionTopicDao.setUserTags(vDiscussionTopicDto.userTags());
        eDiscussionTopicDao.setComments(vDiscussionTopicDto.comments());
        eDiscussionTopicDao.setAssign(vDiscussionTopicDto.assign());
        eDiscussionTopicDao.setLikedBy(vDiscussionTopicDto.likedBy());
    }
}