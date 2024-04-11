package com.itbd.application.db.dto;

import com.itbd.application.db.dao.ProcessSubscriptionDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record ProcessSubscriptionDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        LocalDate postingDate,
        String subscription,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ProcessSubscriptionDto fromEntity(ProcessSubscriptionDao eProcessSubscriptionDao) {
        return new ProcessSubscriptionDto(
                eProcessSubscriptionDao.getName(),
                eProcessSubscriptionDao.getCreation(),
                eProcessSubscriptionDao.getModified(),
                eProcessSubscriptionDao.getModifiedBy(),
                eProcessSubscriptionDao.getOwner(),
                eProcessSubscriptionDao.getIsDocStatus(),
                eProcessSubscriptionDao.getIdx(),
                eProcessSubscriptionDao.getPostingDate(),
                eProcessSubscriptionDao.getSubscription(),
                eProcessSubscriptionDao.getAmendedFrom(),
                eProcessSubscriptionDao.getUserTags(),
                eProcessSubscriptionDao.getComments(),
                eProcessSubscriptionDao.getAssign(),
                eProcessSubscriptionDao.getLikedBy());
    }

    public static void fromDTO(ProcessSubscriptionDto vProcessSubscriptionDto, ProcessSubscriptionDao eProcessSubscriptionDao) {
        eProcessSubscriptionDao.setName(vProcessSubscriptionDto.name());
        eProcessSubscriptionDao.setCreation(vProcessSubscriptionDto.creation());
        eProcessSubscriptionDao.setModified(vProcessSubscriptionDto.modified());
        eProcessSubscriptionDao.setModifiedBy(vProcessSubscriptionDto.modifiedBy());
        eProcessSubscriptionDao.setOwner(vProcessSubscriptionDto.owner());
        eProcessSubscriptionDao.setIsDocStatus(vProcessSubscriptionDto.isDocStatus());
        eProcessSubscriptionDao.setIdx(vProcessSubscriptionDto.idx());
        eProcessSubscriptionDao.setPostingDate(vProcessSubscriptionDto.postingDate());
        eProcessSubscriptionDao.setSubscription(vProcessSubscriptionDto.subscription());
        eProcessSubscriptionDao.setAmendedFrom(vProcessSubscriptionDto.amendedFrom());
        eProcessSubscriptionDao.setUserTags(vProcessSubscriptionDto.userTags());
        eProcessSubscriptionDao.setComments(vProcessSubscriptionDto.comments());
        eProcessSubscriptionDao.setAssign(vProcessSubscriptionDto.assign());
        eProcessSubscriptionDao.setLikedBy(vProcessSubscriptionDto.likedBy());
    }
}