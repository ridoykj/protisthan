package com.itbd.application.db.dto.tags;

import com.itbd.application.db.dao.tags.TagLinkDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record TagLinkDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String documentType,
        String documentName,
        String tag,
        String title,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static TagLinkDto fromEntity(TagLinkDao eTagLinkDao) {
        return new TagLinkDto(
                eTagLinkDao.getName(),
                eTagLinkDao.getCreation(),
                eTagLinkDao.getModified(),
                eTagLinkDao.getModifiedBy(),
                eTagLinkDao.getOwner(),
                eTagLinkDao.getIsDocStatus(),
                eTagLinkDao.getIdx(),
                eTagLinkDao.getDocumentType(),
                eTagLinkDao.getDocumentName(),
                eTagLinkDao.getTag(),
                eTagLinkDao.getTitle(),
                eTagLinkDao.getUserTags(),
                eTagLinkDao.getComments(),
                eTagLinkDao.getAssign(),
                eTagLinkDao.getLikedBy());
    }

    public static void fromDTO(TagLinkDto vTagLinkDto, TagLinkDao eTagLinkDao) {
        eTagLinkDao.setName(vTagLinkDto.name());
        eTagLinkDao.setCreation(vTagLinkDto.creation());
        eTagLinkDao.setModified(vTagLinkDto.modified());
        eTagLinkDao.setModifiedBy(vTagLinkDto.modifiedBy());
        eTagLinkDao.setOwner(vTagLinkDto.owner());
        eTagLinkDao.setIsDocStatus(vTagLinkDto.isDocStatus());
        eTagLinkDao.setIdx(vTagLinkDto.idx());
        eTagLinkDao.setDocumentType(vTagLinkDto.documentType());
        eTagLinkDao.setDocumentName(vTagLinkDto.documentName());
        eTagLinkDao.setTag(vTagLinkDto.tag());
        eTagLinkDao.setTitle(vTagLinkDto.title());
        eTagLinkDao.setUserTags(vTagLinkDto.userTags());
        eTagLinkDao.setComments(vTagLinkDto.comments());
        eTagLinkDao.setAssign(vTagLinkDto.assign());
        eTagLinkDao.setLikedBy(vTagLinkDto.likedBy());
    }
}