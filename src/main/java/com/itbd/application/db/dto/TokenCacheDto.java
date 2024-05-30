package com.itbd.application.db.dto;

import com.itbd.application.db.dao.integrations.TokenCacheDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record TokenCacheDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String user,
        String connectedApp,
        String providerName,
        String accessToken,
        String refreshToken,
        Integer expiresIn,
        String state,
        String successUri,
        String tokenType,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static TokenCacheDto fromEntity(TokenCacheDao eTokenCacheDao) {
        return new TokenCacheDto(
                eTokenCacheDao.getName(),
                eTokenCacheDao.getCreation(),
                eTokenCacheDao.getModified(),
                eTokenCacheDao.getModifiedBy(),
                eTokenCacheDao.getOwner(),
                eTokenCacheDao.getIsDocStatus(),
                eTokenCacheDao.getIdx(),
                eTokenCacheDao.getUser(),
                eTokenCacheDao.getConnectedApp(),
                eTokenCacheDao.getProviderName(),
                eTokenCacheDao.getAccessToken(),
                eTokenCacheDao.getRefreshToken(),
                eTokenCacheDao.getExpiresIn(),
                eTokenCacheDao.getState(),
                eTokenCacheDao.getSuccessUri(),
                eTokenCacheDao.getTokenType(),
                eTokenCacheDao.getUserTags(),
                eTokenCacheDao.getComments(),
                eTokenCacheDao.getAssign(),
                eTokenCacheDao.getLikedBy());
    }

    public static void fromDTO(TokenCacheDto vTokenCacheDto, TokenCacheDao eTokenCacheDao) {
        eTokenCacheDao.setName(vTokenCacheDto.name());
        eTokenCacheDao.setCreation(vTokenCacheDto.creation());
        eTokenCacheDao.setModified(vTokenCacheDto.modified());
        eTokenCacheDao.setModifiedBy(vTokenCacheDto.modifiedBy());
        eTokenCacheDao.setOwner(vTokenCacheDto.owner());
        eTokenCacheDao.setIsDocStatus(vTokenCacheDto.isDocStatus());
        eTokenCacheDao.setIdx(vTokenCacheDto.idx());
        eTokenCacheDao.setUser(vTokenCacheDto.user());
        eTokenCacheDao.setConnectedApp(vTokenCacheDto.connectedApp());
        eTokenCacheDao.setProviderName(vTokenCacheDto.providerName());
        eTokenCacheDao.setAccessToken(vTokenCacheDto.accessToken());
        eTokenCacheDao.setRefreshToken(vTokenCacheDto.refreshToken());
        eTokenCacheDao.setExpiresIn(vTokenCacheDto.expiresIn());
        eTokenCacheDao.setState(vTokenCacheDto.state());
        eTokenCacheDao.setSuccessUri(vTokenCacheDto.successUri());
        eTokenCacheDao.setTokenType(vTokenCacheDto.tokenType());
        eTokenCacheDao.setUserTags(vTokenCacheDto.userTags());
        eTokenCacheDao.setComments(vTokenCacheDto.comments());
        eTokenCacheDao.setAssign(vTokenCacheDto.assign());
        eTokenCacheDao.setLikedBy(vTokenCacheDto.likedBy());
    }
}