package com.itbd.application.db.dto.cummunication;

import com.itbd.application.db.dao.cummunication.CommentDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record CommentDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String commentType,
        String commentEmail,
        String subject,
        String commentBy,
        Boolean published,
        Boolean seen,
        String referenceDocType,
        String referenceName,
        String referenceOwner,
        String content,
        String ipAddress,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static CommentDto fromEntity(CommentDao eCommentDao) {
        return new CommentDto(
                eCommentDao.getName(),
                eCommentDao.getCreation(),
                eCommentDao.getModified(),
                eCommentDao.getModifiedBy(),
                eCommentDao.getOwner(),
                eCommentDao.getIsDocStatus(),
                eCommentDao.getIdx(),
                eCommentDao.getCommentType(),
                eCommentDao.getCommentEmail(),
                eCommentDao.getSubject(),
                eCommentDao.getCommentBy(),
                eCommentDao.getPublished(),
                eCommentDao.getSeen(),
                eCommentDao.getReferenceDocType(),
                eCommentDao.getReferenceName(),
                eCommentDao.getReferenceOwner(),
                eCommentDao.getContent(),
                eCommentDao.getIpAddress(),
                eCommentDao.getUserTags(),
                eCommentDao.getComments(),
                eCommentDao.getAssign(),
                eCommentDao.getLikedBy());
    }

    public static void fromDTO(CommentDto vCommentDto, CommentDao eCommentDao) {
        eCommentDao.setName(vCommentDto.name());
        eCommentDao.setCreation(vCommentDto.creation());
        eCommentDao.setModified(vCommentDto.modified());
        eCommentDao.setModifiedBy(vCommentDto.modifiedBy());
        eCommentDao.setOwner(vCommentDto.owner());
        eCommentDao.setIsDocStatus(vCommentDto.isDocStatus());
        eCommentDao.setIdx(vCommentDto.idx());
        eCommentDao.setCommentType(vCommentDto.commentType());
        eCommentDao.setCommentEmail(vCommentDto.commentEmail());
        eCommentDao.setSubject(vCommentDto.subject());
        eCommentDao.setCommentBy(vCommentDto.commentBy());
        eCommentDao.setPublished(vCommentDto.published());
        eCommentDao.setSeen(vCommentDto.seen());
        eCommentDao.setReferenceDocType(vCommentDto.referenceDocType());
        eCommentDao.setReferenceName(vCommentDto.referenceName());
        eCommentDao.setReferenceOwner(vCommentDto.referenceOwner());
        eCommentDao.setContent(vCommentDto.content());
        eCommentDao.setIpAddress(vCommentDto.ipAddress());
        eCommentDao.setUserTags(vCommentDto.userTags());
        eCommentDao.setComments(vCommentDto.comments());
        eCommentDao.setAssign(vCommentDto.assign());
        eCommentDao.setLikedBy(vCommentDto.likedBy());
    }
}