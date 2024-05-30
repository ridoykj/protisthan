package com.itbd.application.db.dto;

import com.itbd.application.db.dao.integrations.GoogleContactsDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record GoogleContactsDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Boolean enable,
        String emailId,
        LocalDateTime lastSyncOn,
        String authorizationCode,
        String refreshToken,
        String nextSyncToken,
        Boolean pullFromGoogleContacts,
        Boolean pushToGoogleContacts,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static GoogleContactsDto fromEntity(GoogleContactsDao eGoogleContactsDao) {
        return new GoogleContactsDto(
                eGoogleContactsDao.getName(),
                eGoogleContactsDao.getCreation(),
                eGoogleContactsDao.getModified(),
                eGoogleContactsDao.getModifiedBy(),
                eGoogleContactsDao.getOwner(),
                eGoogleContactsDao.getIsDocStatus(),
                eGoogleContactsDao.getIdx(),
                eGoogleContactsDao.getEnable(),
                eGoogleContactsDao.getEmailId(),
                eGoogleContactsDao.getLastSyncOn(),
                eGoogleContactsDao.getAuthorizationCode(),
                eGoogleContactsDao.getRefreshToken(),
                eGoogleContactsDao.getNextSyncToken(),
                eGoogleContactsDao.getPullFromGoogleContacts(),
                eGoogleContactsDao.getPushToGoogleContacts(),
                eGoogleContactsDao.getUserTags(),
                eGoogleContactsDao.getComments(),
                eGoogleContactsDao.getAssign(),
                eGoogleContactsDao.getLikedBy());
    }

    public static void fromDTO(GoogleContactsDto vGoogleContactsDto, GoogleContactsDao eGoogleContactsDao) {
        eGoogleContactsDao.setName(vGoogleContactsDto.name());
        eGoogleContactsDao.setCreation(vGoogleContactsDto.creation());
        eGoogleContactsDao.setModified(vGoogleContactsDto.modified());
        eGoogleContactsDao.setModifiedBy(vGoogleContactsDto.modifiedBy());
        eGoogleContactsDao.setOwner(vGoogleContactsDto.owner());
        eGoogleContactsDao.setIsDocStatus(vGoogleContactsDto.isDocStatus());
        eGoogleContactsDao.setIdx(vGoogleContactsDto.idx());
        eGoogleContactsDao.setEnable(vGoogleContactsDto.enable());
        eGoogleContactsDao.setEmailId(vGoogleContactsDto.emailId());
        eGoogleContactsDao.setLastSyncOn(vGoogleContactsDto.lastSyncOn());
        eGoogleContactsDao.setAuthorizationCode(vGoogleContactsDto.authorizationCode());
        eGoogleContactsDao.setRefreshToken(vGoogleContactsDto.refreshToken());
        eGoogleContactsDao.setNextSyncToken(vGoogleContactsDto.nextSyncToken());
        eGoogleContactsDao.setPullFromGoogleContacts(vGoogleContactsDto.pullFromGoogleContacts());
        eGoogleContactsDao.setPushToGoogleContacts(vGoogleContactsDto.pushToGoogleContacts());
        eGoogleContactsDao.setUserTags(vGoogleContactsDto.userTags());
        eGoogleContactsDao.setComments(vGoogleContactsDto.comments());
        eGoogleContactsDao.setAssign(vGoogleContactsDto.assign());
        eGoogleContactsDao.setLikedBy(vGoogleContactsDto.likedBy());
    }
}