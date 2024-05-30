package com.itbd.application.db.dto.oauths;

import com.itbd.application.db.dao.integrations.oauth.OauthBearerTokenDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record OauthBearerTokenDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String client,
        String user,
        String scopes,
        String accessToken,
        String refreshToken,
        LocalDateTime expirationTime,
        Integer expiresIn,
        String status,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static OauthBearerTokenDto fromEntity(OauthBearerTokenDao eOauthBearerTokenDao) {
        return new OauthBearerTokenDto(
                eOauthBearerTokenDao.getName(),
                eOauthBearerTokenDao.getCreation(),
                eOauthBearerTokenDao.getModified(),
                eOauthBearerTokenDao.getModifiedBy(),
                eOauthBearerTokenDao.getOwner(),
                eOauthBearerTokenDao.getIsDocStatus(),
                eOauthBearerTokenDao.getIdx(),
                eOauthBearerTokenDao.getClient(),
                eOauthBearerTokenDao.getUser(),
                eOauthBearerTokenDao.getScopes(),
                eOauthBearerTokenDao.getAccessToken(),
                eOauthBearerTokenDao.getRefreshToken(),
                eOauthBearerTokenDao.getExpirationTime(),
                eOauthBearerTokenDao.getExpiresIn(),
                eOauthBearerTokenDao.getStatus(),
                eOauthBearerTokenDao.getUserTags(),
                eOauthBearerTokenDao.getComments(),
                eOauthBearerTokenDao.getAssign(),
                eOauthBearerTokenDao.getLikedBy());
    }

    public static void fromDTO(OauthBearerTokenDto vOauthBearerTokenDto, OauthBearerTokenDao eOauthBearerTokenDao) {
        eOauthBearerTokenDao.setName(vOauthBearerTokenDto.name());
        eOauthBearerTokenDao.setCreation(vOauthBearerTokenDto.creation());
        eOauthBearerTokenDao.setModified(vOauthBearerTokenDto.modified());
        eOauthBearerTokenDao.setModifiedBy(vOauthBearerTokenDto.modifiedBy());
        eOauthBearerTokenDao.setOwner(vOauthBearerTokenDto.owner());
        eOauthBearerTokenDao.setIsDocStatus(vOauthBearerTokenDto.isDocStatus());
        eOauthBearerTokenDao.setIdx(vOauthBearerTokenDto.idx());
        eOauthBearerTokenDao.setClient(vOauthBearerTokenDto.client());
        eOauthBearerTokenDao.setUser(vOauthBearerTokenDto.user());
        eOauthBearerTokenDao.setScopes(vOauthBearerTokenDto.scopes());
        eOauthBearerTokenDao.setAccessToken(vOauthBearerTokenDto.accessToken());
        eOauthBearerTokenDao.setRefreshToken(vOauthBearerTokenDto.refreshToken());
        eOauthBearerTokenDao.setExpirationTime(vOauthBearerTokenDto.expirationTime());
        eOauthBearerTokenDao.setExpiresIn(vOauthBearerTokenDto.expiresIn());
        eOauthBearerTokenDao.setStatus(vOauthBearerTokenDto.status());
        eOauthBearerTokenDao.setUserTags(vOauthBearerTokenDto.userTags());
        eOauthBearerTokenDao.setComments(vOauthBearerTokenDto.comments());
        eOauthBearerTokenDao.setAssign(vOauthBearerTokenDto.assign());
        eOauthBearerTokenDao.setLikedBy(vOauthBearerTokenDto.likedBy());
    }
}