package com.itbd.application.db.dto.emails;

import com.itbd.application.db.dao.emails.EmailGroupMemberDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record EmailGroupMemberDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String emailGroup,
        String email,
        Boolean unsubscribed,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static EmailGroupMemberDto fromEntity(EmailGroupMemberDao eEmailGroupMemberDao) {
        return new EmailGroupMemberDto(
                eEmailGroupMemberDao.getName(),
                eEmailGroupMemberDao.getCreation(),
                eEmailGroupMemberDao.getModified(),
                eEmailGroupMemberDao.getModifiedBy(),
                eEmailGroupMemberDao.getOwner(),
                eEmailGroupMemberDao.getIsDocStatus(),
                eEmailGroupMemberDao.getIdx(),
                eEmailGroupMemberDao.getEmailGroup(),
                eEmailGroupMemberDao.getEmail(),
                eEmailGroupMemberDao.getUnsubscribed(),
                eEmailGroupMemberDao.getUserTags(),
                eEmailGroupMemberDao.getComments(),
                eEmailGroupMemberDao.getAssign(),
                eEmailGroupMemberDao.getLikedBy());
    }

    public static void fromDTO(EmailGroupMemberDto vEmailGroupMemberDto, EmailGroupMemberDao eEmailGroupMemberDao) {
        eEmailGroupMemberDao.setName(vEmailGroupMemberDto.name());
        eEmailGroupMemberDao.setCreation(vEmailGroupMemberDto.creation());
        eEmailGroupMemberDao.setModified(vEmailGroupMemberDto.modified());
        eEmailGroupMemberDao.setModifiedBy(vEmailGroupMemberDto.modifiedBy());
        eEmailGroupMemberDao.setOwner(vEmailGroupMemberDto.owner());
        eEmailGroupMemberDao.setIsDocStatus(vEmailGroupMemberDto.isDocStatus());
        eEmailGroupMemberDao.setIdx(vEmailGroupMemberDto.idx());
        eEmailGroupMemberDao.setEmailGroup(vEmailGroupMemberDto.emailGroup());
        eEmailGroupMemberDao.setEmail(vEmailGroupMemberDto.email());
        eEmailGroupMemberDao.setUnsubscribed(vEmailGroupMemberDto.unsubscribed());
        eEmailGroupMemberDao.setUserTags(vEmailGroupMemberDto.userTags());
        eEmailGroupMemberDao.setComments(vEmailGroupMemberDto.comments());
        eEmailGroupMemberDao.setAssign(vEmailGroupMemberDto.assign());
        eEmailGroupMemberDao.setLikedBy(vEmailGroupMemberDto.likedBy());
    }
}