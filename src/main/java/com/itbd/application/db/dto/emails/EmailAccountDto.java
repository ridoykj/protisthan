package com.itbd.application.db.dto.emails;

import com.itbd.application.db.dao.email.EmailAccountDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record EmailAccountDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String emailId,
        String emailAccountName,
        String domain,
        String service,
        String authMethod,
        String password,
        Boolean awaitingPassword,
        Boolean asciiEncodePassword,
        String connectedApp,
        String connectedUser,
        Boolean loginIdIsDifferent,
        String loginId,
        Boolean enableIncoming,
        Boolean defaultIncoming,
        Boolean useImap,
        Boolean useSsl,
        Boolean useStarttls,
        String emailServer,
        String incomingPort,
        Integer attachmentLimit,
        String emailSyncOption,
        String initialSyncCount,
        Boolean appendEmailsToSentFolder,
        String appendTo,
        Boolean createContact,
        Boolean enableAutomaticLinking,
        Boolean notifyIfUnreplied,
        Integer unrepliedForMins,
        String sendNotificationTo,
        Boolean enableOutgoing,
        Boolean useTls,
        Boolean useSslForOutgoing,
        String smtpServer,
        String smtpPort,
        Boolean defaultOutgoing,
        Boolean alwaysUseAccountEmailIdAsSender,
        Boolean alwaysUseAccountNameAsSenderName,
        Boolean sendUnsubscribeMessage,
        Boolean trackEmailStatus,
        Boolean noSmtpAuthentication,
        Boolean addSignature,
        String signature,
        Boolean enableAutoReply,
        String autoReplyMessage,
        String footer,
        String brandLogo,
        String uidValidity,
        Integer uidNext,
        Integer noFailed,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static EmailAccountDto fromEntity(EmailAccountDao eEmailAccountDao) {
        return new EmailAccountDto(
                eEmailAccountDao.getName(),
                eEmailAccountDao.getCreation(),
                eEmailAccountDao.getModified(),
                eEmailAccountDao.getModifiedBy(),
                eEmailAccountDao.getOwner(),
                eEmailAccountDao.getIsDocStatus(),
                eEmailAccountDao.getIdx(),
                eEmailAccountDao.getEmailId(),
                eEmailAccountDao.getEmailAccountName(),
                eEmailAccountDao.getDomain(),
                eEmailAccountDao.getService(),
                eEmailAccountDao.getAuthMethod(),
                eEmailAccountDao.getPassword(),
                eEmailAccountDao.getAwaitingPassword(),
                eEmailAccountDao.getAsciiEncodePassword(),
                eEmailAccountDao.getConnectedApp(),
                eEmailAccountDao.getConnectedUser(),
                eEmailAccountDao.getLoginIdIsDifferent(),
                eEmailAccountDao.getLoginId(),
                eEmailAccountDao.getEnableIncoming(),
                eEmailAccountDao.getDefaultIncoming(),
                eEmailAccountDao.getUseImap(),
                eEmailAccountDao.getUseSsl(),
                eEmailAccountDao.getUseStarttls(),
                eEmailAccountDao.getEmailServer(),
                eEmailAccountDao.getIncomingPort(),
                eEmailAccountDao.getAttachmentLimit(),
                eEmailAccountDao.getEmailSyncOption(),
                eEmailAccountDao.getInitialSyncCount(),
                eEmailAccountDao.getAppendEmailsToSentFolder(),
                eEmailAccountDao.getAppendTo(),
                eEmailAccountDao.getCreateContact(),
                eEmailAccountDao.getEnableAutomaticLinking(),
                eEmailAccountDao.getNotifyIfUnreplied(),
                eEmailAccountDao.getUnrepliedForMins(),
                eEmailAccountDao.getSendNotificationTo(),
                eEmailAccountDao.getEnableOutgoing(),
                eEmailAccountDao.getUseTls(),
                eEmailAccountDao.getUseSslForOutgoing(),
                eEmailAccountDao.getSmtpServer(),
                eEmailAccountDao.getSmtpPort(),
                eEmailAccountDao.getDefaultOutgoing(),
                eEmailAccountDao.getAlwaysUseAccountEmailIdAsSender(),
                eEmailAccountDao.getAlwaysUseAccountNameAsSenderName(),
                eEmailAccountDao.getSendUnsubscribeMessage(),
                eEmailAccountDao.getTrackEmailStatus(),
                eEmailAccountDao.getNoSmtpAuthentication(),
                eEmailAccountDao.getAddSignature(),
                eEmailAccountDao.getSignature(),
                eEmailAccountDao.getEnableAutoReply(),
                eEmailAccountDao.getAutoReplyMessage(),
                eEmailAccountDao.getFooter(),
                eEmailAccountDao.getBrandLogo(),
                eEmailAccountDao.getUidValidity(),
                eEmailAccountDao.getUidNext(),
                eEmailAccountDao.getNoFailed(),
                eEmailAccountDao.getUserTags(),
                eEmailAccountDao.getComments(),
                eEmailAccountDao.getAssign(),
                eEmailAccountDao.getLikedBy());
    }

    public static void fromDTO(EmailAccountDto vEmailAccountDto, EmailAccountDao eEmailAccountDao) {
        eEmailAccountDao.setName(vEmailAccountDto.name());
        eEmailAccountDao.setCreation(vEmailAccountDto.creation());
        eEmailAccountDao.setModified(vEmailAccountDto.modified());
        eEmailAccountDao.setModifiedBy(vEmailAccountDto.modifiedBy());
        eEmailAccountDao.setOwner(vEmailAccountDto.owner());
        eEmailAccountDao.setIsDocStatus(vEmailAccountDto.isDocStatus());
        eEmailAccountDao.setIdx(vEmailAccountDto.idx());
        eEmailAccountDao.setEmailId(vEmailAccountDto.emailId());
        eEmailAccountDao.setEmailAccountName(vEmailAccountDto.emailAccountName());
        eEmailAccountDao.setDomain(vEmailAccountDto.domain());
        eEmailAccountDao.setService(vEmailAccountDto.service());
        eEmailAccountDao.setAuthMethod(vEmailAccountDto.authMethod());
        eEmailAccountDao.setPassword(vEmailAccountDto.password());
        eEmailAccountDao.setAwaitingPassword(vEmailAccountDto.awaitingPassword());
        eEmailAccountDao.setAsciiEncodePassword(vEmailAccountDto.asciiEncodePassword());
        eEmailAccountDao.setConnectedApp(vEmailAccountDto.connectedApp());
        eEmailAccountDao.setConnectedUser(vEmailAccountDto.connectedUser());
        eEmailAccountDao.setLoginIdIsDifferent(vEmailAccountDto.loginIdIsDifferent());
        eEmailAccountDao.setLoginId(vEmailAccountDto.loginId());
        eEmailAccountDao.setEnableIncoming(vEmailAccountDto.enableIncoming());
        eEmailAccountDao.setDefaultIncoming(vEmailAccountDto.defaultIncoming());
        eEmailAccountDao.setUseImap(vEmailAccountDto.useImap());
        eEmailAccountDao.setUseSsl(vEmailAccountDto.useSsl());
        eEmailAccountDao.setUseStarttls(vEmailAccountDto.useStarttls());
        eEmailAccountDao.setEmailServer(vEmailAccountDto.emailServer());
        eEmailAccountDao.setIncomingPort(vEmailAccountDto.incomingPort());
        eEmailAccountDao.setAttachmentLimit(vEmailAccountDto.attachmentLimit());
        eEmailAccountDao.setEmailSyncOption(vEmailAccountDto.emailSyncOption());
        eEmailAccountDao.setInitialSyncCount(vEmailAccountDto.initialSyncCount());
        eEmailAccountDao.setAppendEmailsToSentFolder(vEmailAccountDto.appendEmailsToSentFolder());
        eEmailAccountDao.setAppendTo(vEmailAccountDto.appendTo());
        eEmailAccountDao.setCreateContact(vEmailAccountDto.createContact());
        eEmailAccountDao.setEnableAutomaticLinking(vEmailAccountDto.enableAutomaticLinking());
        eEmailAccountDao.setNotifyIfUnreplied(vEmailAccountDto.notifyIfUnreplied());
        eEmailAccountDao.setUnrepliedForMins(vEmailAccountDto.unrepliedForMins());
        eEmailAccountDao.setSendNotificationTo(vEmailAccountDto.sendNotificationTo());
        eEmailAccountDao.setEnableOutgoing(vEmailAccountDto.enableOutgoing());
        eEmailAccountDao.setUseTls(vEmailAccountDto.useTls());
        eEmailAccountDao.setUseSslForOutgoing(vEmailAccountDto.useSslForOutgoing());
        eEmailAccountDao.setSmtpServer(vEmailAccountDto.smtpServer());
        eEmailAccountDao.setSmtpPort(vEmailAccountDto.smtpPort());
        eEmailAccountDao.setDefaultOutgoing(vEmailAccountDto.defaultOutgoing());
        eEmailAccountDao.setAlwaysUseAccountEmailIdAsSender(vEmailAccountDto.alwaysUseAccountEmailIdAsSender());
        eEmailAccountDao.setAlwaysUseAccountNameAsSenderName(vEmailAccountDto.alwaysUseAccountNameAsSenderName());
        eEmailAccountDao.setSendUnsubscribeMessage(vEmailAccountDto.sendUnsubscribeMessage());
        eEmailAccountDao.setTrackEmailStatus(vEmailAccountDto.trackEmailStatus());
        eEmailAccountDao.setNoSmtpAuthentication(vEmailAccountDto.noSmtpAuthentication());
        eEmailAccountDao.setAddSignature(vEmailAccountDto.addSignature());
        eEmailAccountDao.setSignature(vEmailAccountDto.signature());
        eEmailAccountDao.setEnableAutoReply(vEmailAccountDto.enableAutoReply());
        eEmailAccountDao.setAutoReplyMessage(vEmailAccountDto.autoReplyMessage());
        eEmailAccountDao.setFooter(vEmailAccountDto.footer());
        eEmailAccountDao.setBrandLogo(vEmailAccountDto.brandLogo());
        eEmailAccountDao.setUidValidity(vEmailAccountDto.uidValidity());
        eEmailAccountDao.setUidNext(vEmailAccountDto.uidNext());
        eEmailAccountDao.setNoFailed(vEmailAccountDto.noFailed());
        eEmailAccountDao.setUserTags(vEmailAccountDto.userTags());
        eEmailAccountDao.setComments(vEmailAccountDto.comments());
        eEmailAccountDao.setAssign(vEmailAccountDto.assign());
        eEmailAccountDao.setLikedBy(vEmailAccountDto.likedBy());
    }
}