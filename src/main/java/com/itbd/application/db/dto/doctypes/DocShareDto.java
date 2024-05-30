package com.itbd.application.db.dto.doctypes;

import com.itbd.application.db.dao.core.doc.DocShareDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record DocShareDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String user,
        String shareDocType,
        String shareName,
        Boolean read,
        Boolean write,
        Integer share,
        Boolean submit,
        Integer everyone,
        Boolean notifyByEmail,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static DocShareDto fromEntity(DocShareDao eDocShareDao) {
        return new DocShareDto(
                eDocShareDao.getName(),
                eDocShareDao.getCreation(),
                eDocShareDao.getModified(),
                eDocShareDao.getModifiedBy(),
                eDocShareDao.getOwner(),
                eDocShareDao.getIsDocStatus(),
                eDocShareDao.getIdx(),
                eDocShareDao.getUser(),
                eDocShareDao.getShareDocType(),
                eDocShareDao.getShareName(),
                eDocShareDao.getRead(),
                eDocShareDao.getWrite(),
                eDocShareDao.getShare(),
                eDocShareDao.getSubmit(),
                eDocShareDao.getEveryone(),
                eDocShareDao.getNotifyByEmail(),
                eDocShareDao.getUserTags(),
                eDocShareDao.getComments(),
                eDocShareDao.getAssign(),
                eDocShareDao.getLikedBy());
    }

    public static void fromDTO(DocShareDto vDocShareDto, DocShareDao eDocShareDao) {
        eDocShareDao.setName(vDocShareDto.name());
        eDocShareDao.setCreation(vDocShareDto.creation());
        eDocShareDao.setModified(vDocShareDto.modified());
        eDocShareDao.setModifiedBy(vDocShareDto.modifiedBy());
        eDocShareDao.setOwner(vDocShareDto.owner());
        eDocShareDao.setIsDocStatus(vDocShareDto.isDocStatus());
        eDocShareDao.setIdx(vDocShareDto.idx());
        eDocShareDao.setUser(vDocShareDto.user());
        eDocShareDao.setShareDocType(vDocShareDto.shareDocType());
        eDocShareDao.setShareName(vDocShareDto.shareName());
        eDocShareDao.setRead(vDocShareDto.read());
        eDocShareDao.setWrite(vDocShareDto.write());
        eDocShareDao.setShare(vDocShareDto.share());
        eDocShareDao.setSubmit(vDocShareDto.submit());
        eDocShareDao.setEveryone(vDocShareDto.everyone());
        eDocShareDao.setNotifyByEmail(vDocShareDto.notifyByEmail());
        eDocShareDao.setUserTags(vDocShareDto.userTags());
        eDocShareDao.setComments(vDocShareDto.comments());
        eDocShareDao.setAssign(vDocShareDto.assign());
        eDocShareDao.setLikedBy(vDocShareDto.likedBy());
    }
}