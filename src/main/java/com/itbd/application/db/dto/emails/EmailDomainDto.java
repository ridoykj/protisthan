package com.itbd.application.db.dto.emails;

import com.itbd.application.db.dao.emails.EmailDomainDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record EmailDomainDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String domainName,
        String emailServer,
        Boolean useImap,
        Boolean useSsl,
        Boolean useStarttls,
        String incomingPort,
        Integer attachmentLimit,
        String smtpServer,
        Boolean useTls,
        Boolean useSslForOutgoing,
        String smtpPort,
        Boolean appendEmailsToSentFolder,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static EmailDomainDto fromEntity(EmailDomainDao eEmailDomainDao) {
        return new EmailDomainDto(
                eEmailDomainDao.getName(),
                eEmailDomainDao.getCreation(),
                eEmailDomainDao.getModified(),
                eEmailDomainDao.getModifiedBy(),
                eEmailDomainDao.getOwner(),
                eEmailDomainDao.getIsDocStatus(),
                eEmailDomainDao.getIdx(),
                eEmailDomainDao.getDomainName(),
                eEmailDomainDao.getEmailServer(),
                eEmailDomainDao.getUseImap(),
                eEmailDomainDao.getUseSsl(),
                eEmailDomainDao.getUseStarttls(),
                eEmailDomainDao.getIncomingPort(),
                eEmailDomainDao.getAttachmentLimit(),
                eEmailDomainDao.getSmtpServer(),
                eEmailDomainDao.getUseTls(),
                eEmailDomainDao.getUseSslForOutgoing(),
                eEmailDomainDao.getSmtpPort(),
                eEmailDomainDao.getAppendEmailsToSentFolder(),
                eEmailDomainDao.getUserTags(),
                eEmailDomainDao.getComments(),
                eEmailDomainDao.getAssign(),
                eEmailDomainDao.getLikedBy());
    }

    public static void fromDTO(EmailDomainDto vEmailDomainDto, EmailDomainDao eEmailDomainDao) {
        eEmailDomainDao.setName(vEmailDomainDto.name());
        eEmailDomainDao.setCreation(vEmailDomainDto.creation());
        eEmailDomainDao.setModified(vEmailDomainDto.modified());
        eEmailDomainDao.setModifiedBy(vEmailDomainDto.modifiedBy());
        eEmailDomainDao.setOwner(vEmailDomainDto.owner());
        eEmailDomainDao.setIsDocStatus(vEmailDomainDto.isDocStatus());
        eEmailDomainDao.setIdx(vEmailDomainDto.idx());
        eEmailDomainDao.setDomainName(vEmailDomainDto.domainName());
        eEmailDomainDao.setEmailServer(vEmailDomainDto.emailServer());
        eEmailDomainDao.setUseImap(vEmailDomainDto.useImap());
        eEmailDomainDao.setUseSsl(vEmailDomainDto.useSsl());
        eEmailDomainDao.setUseStarttls(vEmailDomainDto.useStarttls());
        eEmailDomainDao.setIncomingPort(vEmailDomainDto.incomingPort());
        eEmailDomainDao.setAttachmentLimit(vEmailDomainDto.attachmentLimit());
        eEmailDomainDao.setSmtpServer(vEmailDomainDto.smtpServer());
        eEmailDomainDao.setUseTls(vEmailDomainDto.useTls());
        eEmailDomainDao.setUseSslForOutgoing(vEmailDomainDto.useSslForOutgoing());
        eEmailDomainDao.setSmtpPort(vEmailDomainDto.smtpPort());
        eEmailDomainDao.setAppendEmailsToSentFolder(vEmailDomainDto.appendEmailsToSentFolder());
        eEmailDomainDao.setUserTags(vEmailDomainDto.userTags());
        eEmailDomainDao.setComments(vEmailDomainDto.comments());
        eEmailDomainDao.setAssign(vEmailDomainDto.assign());
        eEmailDomainDao.setLikedBy(vEmailDomainDto.likedBy());
    }
}