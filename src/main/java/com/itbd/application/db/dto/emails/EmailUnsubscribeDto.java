package com.itbd.application.db.dto.emails;

import com.itbd.application.db.dao.emails.EmailUnsubscribeDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record EmailUnsubscribeDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String email,
        String referenceDocType,
        String referenceName,
        Boolean globalUnsubscribe,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static EmailUnsubscribeDto fromEntity(EmailUnsubscribeDao eEmailUnsubscribeDao) {
        return new EmailUnsubscribeDto(
                eEmailUnsubscribeDao.getName(),
                eEmailUnsubscribeDao.getCreation(),
                eEmailUnsubscribeDao.getModified(),
                eEmailUnsubscribeDao.getModifiedBy(),
                eEmailUnsubscribeDao.getOwner(),
                eEmailUnsubscribeDao.getIsDocStatus(),
                eEmailUnsubscribeDao.getIdx(),
                eEmailUnsubscribeDao.getEmail(),
                eEmailUnsubscribeDao.getReferenceDocType(),
                eEmailUnsubscribeDao.getReferenceName(),
                eEmailUnsubscribeDao.getGlobalUnsubscribe(),
                eEmailUnsubscribeDao.getUserTags(),
                eEmailUnsubscribeDao.getComments(),
                eEmailUnsubscribeDao.getAssign(),
                eEmailUnsubscribeDao.getLikedBy());
    }

    public static void fromDTO(EmailUnsubscribeDto vEmailUnsubscribeDto, EmailUnsubscribeDao eEmailUnsubscribeDao) {
        eEmailUnsubscribeDao.setName(vEmailUnsubscribeDto.name());
        eEmailUnsubscribeDao.setCreation(vEmailUnsubscribeDto.creation());
        eEmailUnsubscribeDao.setModified(vEmailUnsubscribeDto.modified());
        eEmailUnsubscribeDao.setModifiedBy(vEmailUnsubscribeDto.modifiedBy());
        eEmailUnsubscribeDao.setOwner(vEmailUnsubscribeDto.owner());
        eEmailUnsubscribeDao.setIsDocStatus(vEmailUnsubscribeDto.isDocStatus());
        eEmailUnsubscribeDao.setIdx(vEmailUnsubscribeDto.idx());
        eEmailUnsubscribeDao.setEmail(vEmailUnsubscribeDto.email());
        eEmailUnsubscribeDao.setReferenceDocType(vEmailUnsubscribeDto.referenceDocType());
        eEmailUnsubscribeDao.setReferenceName(vEmailUnsubscribeDto.referenceName());
        eEmailUnsubscribeDao.setGlobalUnsubscribe(vEmailUnsubscribeDto.globalUnsubscribe());
        eEmailUnsubscribeDao.setUserTags(vEmailUnsubscribeDto.userTags());
        eEmailUnsubscribeDao.setComments(vEmailUnsubscribeDto.comments());
        eEmailUnsubscribeDao.setAssign(vEmailUnsubscribeDto.assign());
        eEmailUnsubscribeDao.setLikedBy(vEmailUnsubscribeDto.likedBy());
    }
}