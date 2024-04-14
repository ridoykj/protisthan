package com.itbd.application.db.dto.oauths;

import com.itbd.application.db.dao.oauths.OauthAuthorizationCodeDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record OauthAuthorizationCodeDto(
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
        String authorizationCode,
        LocalDateTime expirationTime,
        String redirectUriBoundToAuthorizationCode,
        String validity,
        String nonce,
        String codeChallenge,
        String codeChallengeMethod,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static OauthAuthorizationCodeDto fromEntity(OauthAuthorizationCodeDao eOauthAuthorizationCodeDao) {
        return new OauthAuthorizationCodeDto(
                eOauthAuthorizationCodeDao.getName(),
                eOauthAuthorizationCodeDao.getCreation(),
                eOauthAuthorizationCodeDao.getModified(),
                eOauthAuthorizationCodeDao.getModifiedBy(),
                eOauthAuthorizationCodeDao.getOwner(),
                eOauthAuthorizationCodeDao.getIsDocStatus(),
                eOauthAuthorizationCodeDao.getIdx(),
                eOauthAuthorizationCodeDao.getClient(),
                eOauthAuthorizationCodeDao.getUser(),
                eOauthAuthorizationCodeDao.getScopes(),
                eOauthAuthorizationCodeDao.getAuthorizationCode(),
                eOauthAuthorizationCodeDao.getExpirationTime(),
                eOauthAuthorizationCodeDao.getRedirectUriBoundToAuthorizationCode(),
                eOauthAuthorizationCodeDao.getValidity(),
                eOauthAuthorizationCodeDao.getNonce(),
                eOauthAuthorizationCodeDao.getCodeChallenge(),
                eOauthAuthorizationCodeDao.getCodeChallengeMethod(),
                eOauthAuthorizationCodeDao.getUserTags(),
                eOauthAuthorizationCodeDao.getComments(),
                eOauthAuthorizationCodeDao.getAssign(),
                eOauthAuthorizationCodeDao.getLikedBy());
    }

    public static void fromDTO(OauthAuthorizationCodeDto vOauthAuthorizationCodeDto, OauthAuthorizationCodeDao eOauthAuthorizationCodeDao) {
        eOauthAuthorizationCodeDao.setName(vOauthAuthorizationCodeDto.name());
        eOauthAuthorizationCodeDao.setCreation(vOauthAuthorizationCodeDto.creation());
        eOauthAuthorizationCodeDao.setModified(vOauthAuthorizationCodeDto.modified());
        eOauthAuthorizationCodeDao.setModifiedBy(vOauthAuthorizationCodeDto.modifiedBy());
        eOauthAuthorizationCodeDao.setOwner(vOauthAuthorizationCodeDto.owner());
        eOauthAuthorizationCodeDao.setIsDocStatus(vOauthAuthorizationCodeDto.isDocStatus());
        eOauthAuthorizationCodeDao.setIdx(vOauthAuthorizationCodeDto.idx());
        eOauthAuthorizationCodeDao.setClient(vOauthAuthorizationCodeDto.client());
        eOauthAuthorizationCodeDao.setUser(vOauthAuthorizationCodeDto.user());
        eOauthAuthorizationCodeDao.setScopes(vOauthAuthorizationCodeDto.scopes());
        eOauthAuthorizationCodeDao.setAuthorizationCode(vOauthAuthorizationCodeDto.authorizationCode());
        eOauthAuthorizationCodeDao.setExpirationTime(vOauthAuthorizationCodeDto.expirationTime());
        eOauthAuthorizationCodeDao.setRedirectUriBoundToAuthorizationCode(vOauthAuthorizationCodeDto.redirectUriBoundToAuthorizationCode());
        eOauthAuthorizationCodeDao.setValidity(vOauthAuthorizationCodeDto.validity());
        eOauthAuthorizationCodeDao.setNonce(vOauthAuthorizationCodeDto.nonce());
        eOauthAuthorizationCodeDao.setCodeChallenge(vOauthAuthorizationCodeDto.codeChallenge());
        eOauthAuthorizationCodeDao.setCodeChallengeMethod(vOauthAuthorizationCodeDto.codeChallengeMethod());
        eOauthAuthorizationCodeDao.setUserTags(vOauthAuthorizationCodeDto.userTags());
        eOauthAuthorizationCodeDao.setComments(vOauthAuthorizationCodeDto.comments());
        eOauthAuthorizationCodeDao.setAssign(vOauthAuthorizationCodeDto.assign());
        eOauthAuthorizationCodeDao.setLikedBy(vOauthAuthorizationCodeDto.likedBy());
    }
}