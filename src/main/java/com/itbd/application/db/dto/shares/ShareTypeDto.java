package com.itbd.application.db.dto.shares;

import com.itbd.application.db.dao.shares.ShareTypeDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ShareTypeDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String title,
        String description,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ShareTypeDto fromEntity(ShareTypeDao eShareTypeDao) {
        return new ShareTypeDto(
                eShareTypeDao.getName(),
                eShareTypeDao.getCreation(),
                eShareTypeDao.getModified(),
                eShareTypeDao.getModifiedBy(),
                eShareTypeDao.getOwner(),
                eShareTypeDao.getIsDocStatus(),
                eShareTypeDao.getIdx(),
                eShareTypeDao.getTitle(),
                eShareTypeDao.getDescription(),
                eShareTypeDao.getUserTags(),
                eShareTypeDao.getComments(),
                eShareTypeDao.getAssign(),
                eShareTypeDao.getLikedBy());
    }

    public static void fromDTO(ShareTypeDto vShareTypeDto, ShareTypeDao eShareTypeDao) {
        eShareTypeDao.setName(vShareTypeDto.name());
        eShareTypeDao.setCreation(vShareTypeDto.creation());
        eShareTypeDao.setModified(vShareTypeDto.modified());
        eShareTypeDao.setModifiedBy(vShareTypeDto.modifiedBy());
        eShareTypeDao.setOwner(vShareTypeDto.owner());
        eShareTypeDao.setIsDocStatus(vShareTypeDto.isDocStatus());
        eShareTypeDao.setIdx(vShareTypeDto.idx());
        eShareTypeDao.setTitle(vShareTypeDto.title());
        eShareTypeDao.setDescription(vShareTypeDto.description());
        eShareTypeDao.setUserTags(vShareTypeDto.userTags());
        eShareTypeDao.setComments(vShareTypeDto.comments());
        eShareTypeDao.setAssign(vShareTypeDto.assign());
        eShareTypeDao.setLikedBy(vShareTypeDto.likedBy());
    }
}