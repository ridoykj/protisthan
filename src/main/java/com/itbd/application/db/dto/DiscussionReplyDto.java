package com.itbd.application.db.dto;

import com.itbd.application.db.dao.DiscussionReplyDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record DiscussionReplyDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String topic,
        String reply,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static DiscussionReplyDto fromEntity(DiscussionReplyDao eDiscussionReplyDao) {
        return new DiscussionReplyDto(
                eDiscussionReplyDao.getName(),
                eDiscussionReplyDao.getCreation(),
                eDiscussionReplyDao.getModified(),
                eDiscussionReplyDao.getModifiedBy(),
                eDiscussionReplyDao.getOwner(),
                eDiscussionReplyDao.getIsDocStatus(),
                eDiscussionReplyDao.getIdx(),
                eDiscussionReplyDao.getTopic(),
                eDiscussionReplyDao.getReply(),
                eDiscussionReplyDao.getUserTags(),
                eDiscussionReplyDao.getComments(),
                eDiscussionReplyDao.getAssign(),
                eDiscussionReplyDao.getLikedBy());
    }

    public static void fromDTO(DiscussionReplyDto vDiscussionReplyDto, DiscussionReplyDao eDiscussionReplyDao) {
        eDiscussionReplyDao.setName(vDiscussionReplyDto.name());
        eDiscussionReplyDao.setCreation(vDiscussionReplyDto.creation());
        eDiscussionReplyDao.setModified(vDiscussionReplyDto.modified());
        eDiscussionReplyDao.setModifiedBy(vDiscussionReplyDto.modifiedBy());
        eDiscussionReplyDao.setOwner(vDiscussionReplyDto.owner());
        eDiscussionReplyDao.setIsDocStatus(vDiscussionReplyDto.isDocStatus());
        eDiscussionReplyDao.setIdx(vDiscussionReplyDto.idx());
        eDiscussionReplyDao.setTopic(vDiscussionReplyDto.topic());
        eDiscussionReplyDao.setReply(vDiscussionReplyDto.reply());
        eDiscussionReplyDao.setUserTags(vDiscussionReplyDto.userTags());
        eDiscussionReplyDao.setComments(vDiscussionReplyDto.comments());
        eDiscussionReplyDao.setAssign(vDiscussionReplyDto.assign());
        eDiscussionReplyDao.setLikedBy(vDiscussionReplyDto.likedBy());
    }
}