package com.itbd.application.db.dto.emails;

import com.itbd.application.db.dao.email.EmailTemplateDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record EmailTemplateDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String subject,
        Boolean useHtml,
        String responseHtml,
        String response,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static EmailTemplateDto fromEntity(EmailTemplateDao eEmailTemplateDao) {
        return new EmailTemplateDto(
                eEmailTemplateDao.getName(),
                eEmailTemplateDao.getCreation(),
                eEmailTemplateDao.getModified(),
                eEmailTemplateDao.getModifiedBy(),
                eEmailTemplateDao.getOwner(),
                eEmailTemplateDao.getIsDocStatus(),
                eEmailTemplateDao.getIdx(),
                eEmailTemplateDao.getSubject(),
                eEmailTemplateDao.getUseHtml(),
                eEmailTemplateDao.getResponseHtml(),
                eEmailTemplateDao.getResponse(),
                eEmailTemplateDao.getUserTags(),
                eEmailTemplateDao.getComments(),
                eEmailTemplateDao.getAssign(),
                eEmailTemplateDao.getLikedBy());
    }

    public static void fromDTO(EmailTemplateDto vEmailTemplateDto, EmailTemplateDao eEmailTemplateDao) {
        eEmailTemplateDao.setName(vEmailTemplateDto.name());
        eEmailTemplateDao.setCreation(vEmailTemplateDto.creation());
        eEmailTemplateDao.setModified(vEmailTemplateDto.modified());
        eEmailTemplateDao.setModifiedBy(vEmailTemplateDto.modifiedBy());
        eEmailTemplateDao.setOwner(vEmailTemplateDto.owner());
        eEmailTemplateDao.setIsDocStatus(vEmailTemplateDto.isDocStatus());
        eEmailTemplateDao.setIdx(vEmailTemplateDto.idx());
        eEmailTemplateDao.setSubject(vEmailTemplateDto.subject());
        eEmailTemplateDao.setUseHtml(vEmailTemplateDto.useHtml());
        eEmailTemplateDao.setResponseHtml(vEmailTemplateDto.responseHtml());
        eEmailTemplateDao.setResponse(vEmailTemplateDto.response());
        eEmailTemplateDao.setUserTags(vEmailTemplateDto.userTags());
        eEmailTemplateDao.setComments(vEmailTemplateDto.comments());
        eEmailTemplateDao.setAssign(vEmailTemplateDto.assign());
        eEmailTemplateDao.setLikedBy(vEmailTemplateDto.likedBy());
    }
}