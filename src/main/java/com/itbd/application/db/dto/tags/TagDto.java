package com.itbd.application.db.dto.tags;

import com.itbd.application.db.dao.tags.TagDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record TagDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String description,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static TagDto fromEntity(TagDao eTagDao) {
        return new TagDto(
                eTagDao.getName(),
                eTagDao.getCreation(),
                eTagDao.getModified(),
                eTagDao.getModifiedBy(),
                eTagDao.getOwner(),
                eTagDao.getIsDocStatus(),
                eTagDao.getIdx(),
                eTagDao.getDescription(),
                eTagDao.getUserTags(),
                eTagDao.getComments(),
                eTagDao.getAssign(),
                eTagDao.getLikedBy());
    }

    public static void fromDTO(TagDto vTagDto, TagDao eTagDao) {
        eTagDao.setName(vTagDto.name());
        eTagDao.setCreation(vTagDto.creation());
        eTagDao.setModified(vTagDto.modified());
        eTagDao.setModifiedBy(vTagDto.modifiedBy());
        eTagDao.setOwner(vTagDto.owner());
        eTagDao.setIsDocStatus(vTagDto.isDocStatus());
        eTagDao.setIdx(vTagDto.idx());
        eTagDao.setDescription(vTagDto.description());
        eTagDao.setUserTags(vTagDto.userTags());
        eTagDao.setComments(vTagDto.comments());
        eTagDao.setAssign(vTagDto.assign());
        eTagDao.setLikedBy(vTagDto.likedBy());
    }
}