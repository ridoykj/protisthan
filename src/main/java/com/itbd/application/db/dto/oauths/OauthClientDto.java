package com.itbd.application.db.dto.oauths;

import com.itbd.application.db.dao.integrations.oauth.OauthClientDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record OauthClientDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String clientId,
        String appName,
        String user,
        String clientSecret,
        Boolean skipAuthorization,
        String scopes,
        String redirectUris,
        String defaultRedirectUri,
        String grantType,
        String responseType,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static OauthClientDto fromEntity(OauthClientDao eOauthClientDao) {
        return new OauthClientDto(
                eOauthClientDao.getName(),
                eOauthClientDao.getCreation(),
                eOauthClientDao.getModified(),
                eOauthClientDao.getModifiedBy(),
                eOauthClientDao.getOwner(),
                eOauthClientDao.getIsDocStatus(),
                eOauthClientDao.getIdx(),
                eOauthClientDao.getClientId(),
                eOauthClientDao.getAppName(),
                eOauthClientDao.getUser(),
                eOauthClientDao.getClientSecret(),
                eOauthClientDao.getSkipAuthorization(),
                eOauthClientDao.getScopes(),
                eOauthClientDao.getRedirectUris(),
                eOauthClientDao.getDefaultRedirectUri(),
                eOauthClientDao.getGrantType(),
                eOauthClientDao.getResponseType(),
                eOauthClientDao.getUserTags(),
                eOauthClientDao.getComments(),
                eOauthClientDao.getAssign(),
                eOauthClientDao.getLikedBy());
    }

    public static void fromDTO(OauthClientDto vOauthClientDto, OauthClientDao eOauthClientDao) {
        eOauthClientDao.setName(vOauthClientDto.name());
        eOauthClientDao.setCreation(vOauthClientDto.creation());
        eOauthClientDao.setModified(vOauthClientDto.modified());
        eOauthClientDao.setModifiedBy(vOauthClientDto.modifiedBy());
        eOauthClientDao.setOwner(vOauthClientDto.owner());
        eOauthClientDao.setIsDocStatus(vOauthClientDto.isDocStatus());
        eOauthClientDao.setIdx(vOauthClientDto.idx());
        eOauthClientDao.setClientId(vOauthClientDto.clientId());
        eOauthClientDao.setAppName(vOauthClientDto.appName());
        eOauthClientDao.setUser(vOauthClientDto.user());
        eOauthClientDao.setClientSecret(vOauthClientDto.clientSecret());
        eOauthClientDao.setSkipAuthorization(vOauthClientDto.skipAuthorization());
        eOauthClientDao.setScopes(vOauthClientDto.scopes());
        eOauthClientDao.setRedirectUris(vOauthClientDto.redirectUris());
        eOauthClientDao.setDefaultRedirectUri(vOauthClientDto.defaultRedirectUri());
        eOauthClientDao.setGrantType(vOauthClientDto.grantType());
        eOauthClientDao.setResponseType(vOauthClientDto.responseType());
        eOauthClientDao.setUserTags(vOauthClientDto.userTags());
        eOauthClientDao.setComments(vOauthClientDto.comments());
        eOauthClientDao.setAssign(vOauthClientDto.assign());
        eOauthClientDao.setLikedBy(vOauthClientDto.likedBy());
    }
}