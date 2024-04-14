package com.itbd.application.db.dto.users;

import com.itbd.application.db.dao.users.UserDao;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record UserDto(
        @Id String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Boolean enabled,

        @Email(message = "Email should be valid")
        @NotNull(message = "Email is required")
        String email,

        @NotNull(message = "First name is required")
        @Size(min = 3, max = 128, message = "First name should be between 3 and 128 characters")
        String firstName,
        String middleName,
        String lastName,
        String fullName,
        String username,
        String language,
        String timeZone,
        Boolean sendWelcomeEmail,
        Boolean unsubscribed,
        String userImage,
        String roleProfileName,
        String moduleProfile,
        String homeSettings,
        String gender,
        LocalDate birthDate,
        String interest,
        String phone,
        String location,
        String bio,
        String mobileNo,
        Boolean muteSounds,
        String deskTheme,
        String bannerImage,
        String newPassword,
        Boolean logoutAllSessions,
        String resetPasswordKey,
        LocalDateTime lastResetPasswordKeyGeneratedOn,
        LocalDate lastPasswordResetDate,
        String redirectUrl,
        Boolean documentFollowNotify,
        String documentFollowFrequency,
        Boolean followCreatedDocuments,
        Boolean followCommentedDocuments,
        Boolean followLikedDocuments,
        Boolean followAssignedDocuments,
        Boolean followSharedDocuments,
        String emailSignature,
        Boolean threadNotify,
        Boolean sendMeACopy,
        Boolean allowedInMentions,
        Integer simultaneousSessions,
        String restrictIp,
        String lastIp,
        Integer loginAfter,
        String userType,
        LocalDateTime lastActive,
        Integer loginBefore,
        Boolean bypassRestrictIpCheckIf2faEnabled,
        String lastLogin,
        String lastKnownVersions,
        String apiKey,
        String apiSecret,
        String onboardingStatus,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static UserDto fromEntity(UserDao eUserDao) {
        return new UserDto(
                eUserDao.getName(),
                eUserDao.getCreation(),
                eUserDao.getModified(),
                eUserDao.getModifiedBy(),
                eUserDao.getOwner(),
                eUserDao.getIsDocStatus(),
                eUserDao.getIdx(),
                eUserDao.getEnabled(),
                eUserDao.getEmail(),
                eUserDao.getFirstName(),
                eUserDao.getMiddleName(),
                eUserDao.getLastName(),
                eUserDao.getFullName(),
                eUserDao.getUsername(),
                eUserDao.getLanguage(),
                eUserDao.getTimeZone(),
                eUserDao.getSendWelcomeEmail(),
                eUserDao.getUnsubscribed(),
                eUserDao.getUserImage(),
                eUserDao.getRoleProfileName(),
                eUserDao.getModuleProfile(),
                eUserDao.getHomeSettings(),
                eUserDao.getGender(),
                eUserDao.getBirthDate(),
                eUserDao.getInterest(),
                eUserDao.getPhone(),
                eUserDao.getLocation(),
                eUserDao.getBio(),
                eUserDao.getMobileNo(),
                eUserDao.getMuteSounds(),
                eUserDao.getDeskTheme(),
                eUserDao.getBannerImage(),
                eUserDao.getNewPassword(),
                eUserDao.getLogoutAllSessions(),
                eUserDao.getResetPasswordKey(),
                eUserDao.getLastResetPasswordKeyGeneratedOn(),
                eUserDao.getLastPasswordResetDate(),
                eUserDao.getRedirectUrl(),
                eUserDao.getDocumentFollowNotify(),
                eUserDao.getDocumentFollowFrequency(),
                eUserDao.getFollowCreatedDocuments(),
                eUserDao.getFollowCommentedDocuments(),
                eUserDao.getFollowLikedDocuments(),
                eUserDao.getFollowAssignedDocuments(),
                eUserDao.getFollowSharedDocuments(),
                eUserDao.getEmailSignature(),
                eUserDao.getThreadNotify(),
                eUserDao.getSendMeACopy(),
                eUserDao.getAllowedInMentions(),
                eUserDao.getSimultaneousSessions(),
                eUserDao.getRestrictIp(),
                eUserDao.getLastIp(),
                eUserDao.getLoginAfter(),
                eUserDao.getUserType(),
                eUserDao.getLastActive(),
                eUserDao.getLoginBefore(),
                eUserDao.getBypassRestrictIpCheckIf2faEnabled(),
                eUserDao.getLastLogin(),
                eUserDao.getLastKnownVersions(),
                eUserDao.getApiKey(),
                eUserDao.getApiSecret(),
                eUserDao.getOnboardingStatus(),
                eUserDao.getUserTags(),
                eUserDao.getComments(),
                eUserDao.getAssign(),
                eUserDao.getLikedBy());
    }

    public static void fromDTO(UserDto vUserDto, UserDao eUserDao) {
        eUserDao.setName(vUserDto.name());
        eUserDao.setCreation(vUserDto.creation());
        eUserDao.setModified(vUserDto.modified());
        eUserDao.setModifiedBy(vUserDto.modifiedBy());
        eUserDao.setOwner(vUserDto.owner());
        eUserDao.setIsDocStatus(vUserDto.isDocStatus());
        eUserDao.setIdx(vUserDto.idx());
        eUserDao.setEnabled(vUserDto.enabled());
        eUserDao.setEmail(vUserDto.email());
        eUserDao.setFirstName(vUserDto.firstName());
        eUserDao.setMiddleName(vUserDto.middleName());
        eUserDao.setLastName(vUserDto.lastName());
        eUserDao.setFullName(vUserDto.fullName());
        eUserDao.setUsername(vUserDto.username());
        eUserDao.setLanguage(vUserDto.language());
        eUserDao.setTimeZone(vUserDto.timeZone());
        eUserDao.setSendWelcomeEmail(vUserDto.sendWelcomeEmail());
        eUserDao.setUnsubscribed(vUserDto.unsubscribed());
        eUserDao.setUserImage(vUserDto.userImage());
        eUserDao.setRoleProfileName(vUserDto.roleProfileName());
        eUserDao.setModuleProfile(vUserDto.moduleProfile());
        eUserDao.setHomeSettings(vUserDto.homeSettings());
        eUserDao.setGender(vUserDto.gender());
        eUserDao.setBirthDate(vUserDto.birthDate());
        eUserDao.setInterest(vUserDto.interest());
        eUserDao.setPhone(vUserDto.phone());
        eUserDao.setLocation(vUserDto.location());
        eUserDao.setBio(vUserDto.bio());
        eUserDao.setMobileNo(vUserDto.mobileNo());
        eUserDao.setMuteSounds(vUserDto.muteSounds());
        eUserDao.setDeskTheme(vUserDto.deskTheme());
        eUserDao.setBannerImage(vUserDto.bannerImage());
        eUserDao.setNewPassword(vUserDto.newPassword());
        eUserDao.setLogoutAllSessions(vUserDto.logoutAllSessions());
        eUserDao.setResetPasswordKey(vUserDto.resetPasswordKey());
        eUserDao.setLastResetPasswordKeyGeneratedOn(vUserDto.lastResetPasswordKeyGeneratedOn());
        eUserDao.setLastPasswordResetDate(vUserDto.lastPasswordResetDate());
        eUserDao.setRedirectUrl(vUserDto.redirectUrl());
        eUserDao.setDocumentFollowNotify(vUserDto.documentFollowNotify());
        eUserDao.setDocumentFollowFrequency(vUserDto.documentFollowFrequency());
        eUserDao.setFollowCreatedDocuments(vUserDto.followCreatedDocuments());
        eUserDao.setFollowCommentedDocuments(vUserDto.followCommentedDocuments());
        eUserDao.setFollowLikedDocuments(vUserDto.followLikedDocuments());
        eUserDao.setFollowAssignedDocuments(vUserDto.followAssignedDocuments());
        eUserDao.setFollowSharedDocuments(vUserDto.followSharedDocuments());
        eUserDao.setEmailSignature(vUserDto.emailSignature());
        eUserDao.setThreadNotify(vUserDto.threadNotify());
        eUserDao.setSendMeACopy(vUserDto.sendMeACopy());
        eUserDao.setAllowedInMentions(vUserDto.allowedInMentions());
        eUserDao.setSimultaneousSessions(vUserDto.simultaneousSessions());
        eUserDao.setRestrictIp(vUserDto.restrictIp());
        eUserDao.setLastIp(vUserDto.lastIp());
        eUserDao.setLoginAfter(vUserDto.loginAfter());
        eUserDao.setUserType(vUserDto.userType());
        eUserDao.setLastActive(vUserDto.lastActive());
        eUserDao.setLoginBefore(vUserDto.loginBefore());
        eUserDao.setBypassRestrictIpCheckIf2faEnabled(vUserDto.bypassRestrictIpCheckIf2faEnabled());
        eUserDao.setLastLogin(vUserDto.lastLogin());
        eUserDao.setLastKnownVersions(vUserDto.lastKnownVersions());
        eUserDao.setApiKey(vUserDto.apiKey());
        eUserDao.setApiSecret(vUserDto.apiSecret());
        eUserDao.setOnboardingStatus(vUserDto.onboardingStatus());
        eUserDao.setUserTags(vUserDto.userTags());
        eUserDao.setComments(vUserDto.comments());
        eUserDao.setAssign(vUserDto.assign());
        eUserDao.setLikedBy(vUserDto.likedBy());
    }
}