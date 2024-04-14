package com.itbd.application.db.dto.emails;

import com.itbd.application.db.dao.emails.EmailRuleDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record EmailRuleDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String emailId,
        Boolean isSpam,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static EmailRuleDto fromEntity(EmailRuleDao eEmailRuleDao) {
        return new EmailRuleDto(
                eEmailRuleDao.getName(),
                eEmailRuleDao.getCreation(),
                eEmailRuleDao.getModified(),
                eEmailRuleDao.getModifiedBy(),
                eEmailRuleDao.getOwner(),
                eEmailRuleDao.getIsDocStatus(),
                eEmailRuleDao.getIdx(),
                eEmailRuleDao.getEmailId(),
                eEmailRuleDao.getIsSpam(),
                eEmailRuleDao.getUserTags(),
                eEmailRuleDao.getComments(),
                eEmailRuleDao.getAssign(),
                eEmailRuleDao.getLikedBy());
    }

    public static void fromDTO(EmailRuleDto vEmailRuleDto, EmailRuleDao eEmailRuleDao) {
        eEmailRuleDao.setName(vEmailRuleDto.name());
        eEmailRuleDao.setCreation(vEmailRuleDto.creation());
        eEmailRuleDao.setModified(vEmailRuleDto.modified());
        eEmailRuleDao.setModifiedBy(vEmailRuleDto.modifiedBy());
        eEmailRuleDao.setOwner(vEmailRuleDto.owner());
        eEmailRuleDao.setIsDocStatus(vEmailRuleDto.isDocStatus());
        eEmailRuleDao.setIdx(vEmailRuleDto.idx());
        eEmailRuleDao.setEmailId(vEmailRuleDto.emailId());
        eEmailRuleDao.setIsSpam(vEmailRuleDto.isSpam());
        eEmailRuleDao.setUserTags(vEmailRuleDto.userTags());
        eEmailRuleDao.setComments(vEmailRuleDto.comments());
        eEmailRuleDao.setAssign(vEmailRuleDto.assign());
        eEmailRuleDao.setLikedBy(vEmailRuleDto.likedBy());
    }
}