package com.itbd.application.db.dto;

import com.itbd.application.db.dao.ConnectedAppDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ConnectedAppDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String providerName,
        String openidConfiguration,
        String clientId,
        String redirectUri,
        String clientSecret,
        String authorizationUri,
        String tokenUri,
        String revocationUri,
        String userinfoUri,
        String introspectionUri,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ConnectedAppDto fromEntity(ConnectedAppDao eConnectedAppDao) {
        return new ConnectedAppDto(
                eConnectedAppDao.getName(),
                eConnectedAppDao.getCreation(),
                eConnectedAppDao.getModified(),
                eConnectedAppDao.getModifiedBy(),
                eConnectedAppDao.getOwner(),
                eConnectedAppDao.getIsDocStatus(),
                eConnectedAppDao.getIdx(),
                eConnectedAppDao.getProviderName(),
                eConnectedAppDao.getOpenidConfiguration(),
                eConnectedAppDao.getClientId(),
                eConnectedAppDao.getRedirectUri(),
                eConnectedAppDao.getClientSecret(),
                eConnectedAppDao.getAuthorizationUri(),
                eConnectedAppDao.getTokenUri(),
                eConnectedAppDao.getRevocationUri(),
                eConnectedAppDao.getUserinfoUri(),
                eConnectedAppDao.getIntrospectionUri(),
                eConnectedAppDao.getUserTags(),
                eConnectedAppDao.getComments(),
                eConnectedAppDao.getAssign(),
                eConnectedAppDao.getLikedBy());
    }

    public static void fromDTO(ConnectedAppDto vConnectedAppDto, ConnectedAppDao eConnectedAppDao) {
        eConnectedAppDao.setName(vConnectedAppDto.name());
        eConnectedAppDao.setCreation(vConnectedAppDto.creation());
        eConnectedAppDao.setModified(vConnectedAppDto.modified());
        eConnectedAppDao.setModifiedBy(vConnectedAppDto.modifiedBy());
        eConnectedAppDao.setOwner(vConnectedAppDto.owner());
        eConnectedAppDao.setIsDocStatus(vConnectedAppDto.isDocStatus());
        eConnectedAppDao.setIdx(vConnectedAppDto.idx());
        eConnectedAppDao.setProviderName(vConnectedAppDto.providerName());
        eConnectedAppDao.setOpenidConfiguration(vConnectedAppDto.openidConfiguration());
        eConnectedAppDao.setClientId(vConnectedAppDto.clientId());
        eConnectedAppDao.setRedirectUri(vConnectedAppDto.redirectUri());
        eConnectedAppDao.setClientSecret(vConnectedAppDto.clientSecret());
        eConnectedAppDao.setAuthorizationUri(vConnectedAppDto.authorizationUri());
        eConnectedAppDao.setTokenUri(vConnectedAppDto.tokenUri());
        eConnectedAppDao.setRevocationUri(vConnectedAppDto.revocationUri());
        eConnectedAppDao.setUserinfoUri(vConnectedAppDto.userinfoUri());
        eConnectedAppDao.setIntrospectionUri(vConnectedAppDto.introspectionUri());
        eConnectedAppDao.setUserTags(vConnectedAppDto.userTags());
        eConnectedAppDao.setComments(vConnectedAppDto.comments());
        eConnectedAppDao.setAssign(vConnectedAppDto.assign());
        eConnectedAppDao.setLikedBy(vConnectedAppDto.likedBy());
    }
}