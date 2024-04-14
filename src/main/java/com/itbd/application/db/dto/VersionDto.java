package com.itbd.application.db.dto;

import com.itbd.application.db.dao.VersionDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record VersionDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String refDocType,
        String docName,
        String data,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static VersionDto fromEntity(VersionDao eVersionDao) {
        return new VersionDto(
                eVersionDao.getName(),
                eVersionDao.getCreation(),
                eVersionDao.getModified(),
                eVersionDao.getModifiedBy(),
                eVersionDao.getOwner(),
                eVersionDao.getIsDocStatus(),
                eVersionDao.getIdx(),
                eVersionDao.getRefDocType(),
                eVersionDao.getDocName(),
                eVersionDao.getData(),
                eVersionDao.getUserTags(),
                eVersionDao.getComments(),
                eVersionDao.getAssign(),
                eVersionDao.getLikedBy());
    }

    public static void fromDTO(VersionDto vVersionDto, VersionDao eVersionDao) {
        eVersionDao.setName(vVersionDto.name());
        eVersionDao.setCreation(vVersionDto.creation());
        eVersionDao.setModified(vVersionDto.modified());
        eVersionDao.setModifiedBy(vVersionDto.modifiedBy());
        eVersionDao.setOwner(vVersionDto.owner());
        eVersionDao.setIsDocStatus(vVersionDto.isDocStatus());
        eVersionDao.setIdx(vVersionDto.idx());
        eVersionDao.setRefDocType(vVersionDto.refDocType());
        eVersionDao.setDocName(vVersionDto.docName());
        eVersionDao.setData(vVersionDto.data());
        eVersionDao.setUserTags(vVersionDto.userTags());
        eVersionDao.setComments(vVersionDto.comments());
        eVersionDao.setAssign(vVersionDto.assign());
        eVersionDao.setLikedBy(vVersionDto.likedBy());
    }
}