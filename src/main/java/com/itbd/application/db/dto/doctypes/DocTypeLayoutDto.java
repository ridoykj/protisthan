package com.itbd.application.db.dto.doctypes;

import com.itbd.application.db.dao.custom.DocTypeLayoutDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record DocTypeLayoutDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String documentType,
        String route,
        String clientScript,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static DocTypeLayoutDto fromEntity(DocTypeLayoutDao eDocTypeLayoutDao) {
        return new DocTypeLayoutDto(
                eDocTypeLayoutDao.getName(),
                eDocTypeLayoutDao.getCreation(),
                eDocTypeLayoutDao.getModified(),
                eDocTypeLayoutDao.getModifiedBy(),
                eDocTypeLayoutDao.getOwner(),
                eDocTypeLayoutDao.getIsDocStatus(),
                eDocTypeLayoutDao.getIdx(),
                eDocTypeLayoutDao.getDocumentType(),
                eDocTypeLayoutDao.getRoute(),
                eDocTypeLayoutDao.getClientScript(),
                eDocTypeLayoutDao.getUserTags(),
                eDocTypeLayoutDao.getComments(),
                eDocTypeLayoutDao.getAssign(),
                eDocTypeLayoutDao.getLikedBy());
    }

    public static void fromDTO(DocTypeLayoutDto vDocTypeLayoutDto, DocTypeLayoutDao eDocTypeLayoutDao) {
        eDocTypeLayoutDao.setName(vDocTypeLayoutDto.name());
        eDocTypeLayoutDao.setCreation(vDocTypeLayoutDto.creation());
        eDocTypeLayoutDao.setModified(vDocTypeLayoutDto.modified());
        eDocTypeLayoutDao.setModifiedBy(vDocTypeLayoutDto.modifiedBy());
        eDocTypeLayoutDao.setOwner(vDocTypeLayoutDto.owner());
        eDocTypeLayoutDao.setIsDocStatus(vDocTypeLayoutDto.isDocStatus());
        eDocTypeLayoutDao.setIdx(vDocTypeLayoutDto.idx());
        eDocTypeLayoutDao.setDocumentType(vDocTypeLayoutDto.documentType());
        eDocTypeLayoutDao.setRoute(vDocTypeLayoutDto.route());
        eDocTypeLayoutDao.setClientScript(vDocTypeLayoutDto.clientScript());
        eDocTypeLayoutDao.setUserTags(vDocTypeLayoutDto.userTags());
        eDocTypeLayoutDao.setComments(vDocTypeLayoutDto.comments());
        eDocTypeLayoutDao.setAssign(vDocTypeLayoutDto.assign());
        eDocTypeLayoutDao.setLikedBy(vDocTypeLayoutDto.likedBy());
    }
}