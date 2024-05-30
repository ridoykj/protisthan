package com.itbd.application.db.dto;

import com.itbd.application.db.dao.integrations.SocialLoginKeyDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record SocialLoginKeyDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Boolean enableSocialLogin,
        String socialLoginProvider,
        String clientId,
        String providerName,
        String clientSecret,
        String icon,
        String baseUrl,
        String signUps,
        String authorizeUrl,
        String accessTokenUrl,
        String redirectUrl,
        String apiEndpoint,
        Boolean customBaseUrl,
        String apiEndpointArgs,
        String authUrlData,
        String userIdProperty,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static SocialLoginKeyDto fromEntity(SocialLoginKeyDao eSocialLoginKeyDao) {
        return new SocialLoginKeyDto(
                eSocialLoginKeyDao.getName(),
                eSocialLoginKeyDao.getCreation(),
                eSocialLoginKeyDao.getModified(),
                eSocialLoginKeyDao.getModifiedBy(),
                eSocialLoginKeyDao.getOwner(),
                eSocialLoginKeyDao.getIsDocStatus(),
                eSocialLoginKeyDao.getIdx(),
                eSocialLoginKeyDao.getEnableSocialLogin(),
                eSocialLoginKeyDao.getSocialLoginProvider(),
                eSocialLoginKeyDao.getClientId(),
                eSocialLoginKeyDao.getProviderName(),
                eSocialLoginKeyDao.getClientSecret(),
                eSocialLoginKeyDao.getIcon(),
                eSocialLoginKeyDao.getBaseUrl(),
                eSocialLoginKeyDao.getSignUps(),
                eSocialLoginKeyDao.getAuthorizeUrl(),
                eSocialLoginKeyDao.getAccessTokenUrl(),
                eSocialLoginKeyDao.getRedirectUrl(),
                eSocialLoginKeyDao.getApiEndpoint(),
                eSocialLoginKeyDao.getCustomBaseUrl(),
                eSocialLoginKeyDao.getApiEndpointArgs(),
                eSocialLoginKeyDao.getAuthUrlData(),
                eSocialLoginKeyDao.getUserIdProperty(),
                eSocialLoginKeyDao.getUserTags(),
                eSocialLoginKeyDao.getComments(),
                eSocialLoginKeyDao.getAssign(),
                eSocialLoginKeyDao.getLikedBy());
    }

    public static void fromDTO(SocialLoginKeyDto vSocialLoginKeyDto, SocialLoginKeyDao eSocialLoginKeyDao) {
        eSocialLoginKeyDao.setName(vSocialLoginKeyDto.name());
        eSocialLoginKeyDao.setCreation(vSocialLoginKeyDto.creation());
        eSocialLoginKeyDao.setModified(vSocialLoginKeyDto.modified());
        eSocialLoginKeyDao.setModifiedBy(vSocialLoginKeyDto.modifiedBy());
        eSocialLoginKeyDao.setOwner(vSocialLoginKeyDto.owner());
        eSocialLoginKeyDao.setIsDocStatus(vSocialLoginKeyDto.isDocStatus());
        eSocialLoginKeyDao.setIdx(vSocialLoginKeyDto.idx());
        eSocialLoginKeyDao.setEnableSocialLogin(vSocialLoginKeyDto.enableSocialLogin());
        eSocialLoginKeyDao.setSocialLoginProvider(vSocialLoginKeyDto.socialLoginProvider());
        eSocialLoginKeyDao.setClientId(vSocialLoginKeyDto.clientId());
        eSocialLoginKeyDao.setProviderName(vSocialLoginKeyDto.providerName());
        eSocialLoginKeyDao.setClientSecret(vSocialLoginKeyDto.clientSecret());
        eSocialLoginKeyDao.setIcon(vSocialLoginKeyDto.icon());
        eSocialLoginKeyDao.setBaseUrl(vSocialLoginKeyDto.baseUrl());
        eSocialLoginKeyDao.setSignUps(vSocialLoginKeyDto.signUps());
        eSocialLoginKeyDao.setAuthorizeUrl(vSocialLoginKeyDto.authorizeUrl());
        eSocialLoginKeyDao.setAccessTokenUrl(vSocialLoginKeyDto.accessTokenUrl());
        eSocialLoginKeyDao.setRedirectUrl(vSocialLoginKeyDto.redirectUrl());
        eSocialLoginKeyDao.setApiEndpoint(vSocialLoginKeyDto.apiEndpoint());
        eSocialLoginKeyDao.setCustomBaseUrl(vSocialLoginKeyDto.customBaseUrl());
        eSocialLoginKeyDao.setApiEndpointArgs(vSocialLoginKeyDto.apiEndpointArgs());
        eSocialLoginKeyDao.setAuthUrlData(vSocialLoginKeyDto.authUrlData());
        eSocialLoginKeyDao.setUserIdProperty(vSocialLoginKeyDto.userIdProperty());
        eSocialLoginKeyDao.setUserTags(vSocialLoginKeyDto.userTags());
        eSocialLoginKeyDao.setComments(vSocialLoginKeyDto.comments());
        eSocialLoginKeyDao.setAssign(vSocialLoginKeyDto.assign());
        eSocialLoginKeyDao.setLikedBy(vSocialLoginKeyDto.likedBy());
    }
}