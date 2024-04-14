package com.itbd.application.db.dto;

import com.itbd.application.db.dao.FileDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record FileDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        String parent,
        String parentField,
        String parentType,
        Integer idx,
        String fileName,
        String fileUrl,
        String module,
        String attachedToName,
        Long fileSize,
        String attachedToDocType,
        Boolean isPrivate,
        String fileType,
        Boolean isHomeFolder,
        Boolean isAttachmentsFolder,
        String thumbnailUrl,
        String folder,
        Boolean isFolder,
        String attachedToField,
        String oldParent,
        String contentHash,
        Boolean uploadedToDropbox,
        Boolean uploadedToGoogleDrive,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static FileDto fromEntity(FileDao eFileDao) {
        return new FileDto(
                eFileDao.getName(),
                eFileDao.getCreation(),
                eFileDao.getModified(),
                eFileDao.getModifiedBy(),
                eFileDao.getOwner(),
                eFileDao.getIsDocStatus(),
                eFileDao.getParent(),
                eFileDao.getParentField(),
                eFileDao.getParentType(),
                eFileDao.getIdx(),
                eFileDao.getFileName(),
                eFileDao.getFileUrl(),
                eFileDao.getModule(),
                eFileDao.getAttachedToName(),
                eFileDao.getFileSize(),
                eFileDao.getAttachedToDocType(),
                eFileDao.getIsPrivate(),
                eFileDao.getFileType(),
                eFileDao.getIsHomeFolder(),
                eFileDao.getIsAttachmentsFolder(),
                eFileDao.getThumbnailUrl(),
                eFileDao.getFolder(),
                eFileDao.getIsFolder(),
                eFileDao.getAttachedToField(),
                eFileDao.getOldParent(),
                eFileDao.getContentHash(),
                eFileDao.getUploadedToDropbox(),
                eFileDao.getUploadedToGoogleDrive(),
                eFileDao.getUserTags(),
                eFileDao.getComments(),
                eFileDao.getAssign(),
                eFileDao.getLikedBy());
    }

    public static void fromDTO(FileDto vFileDto, FileDao eFileDao) {
        eFileDao.setName(vFileDto.name());
        eFileDao.setCreation(vFileDto.creation());
        eFileDao.setModified(vFileDto.modified());
        eFileDao.setModifiedBy(vFileDto.modifiedBy());
        eFileDao.setOwner(vFileDto.owner());
        eFileDao.setIsDocStatus(vFileDto.isDocStatus());
        eFileDao.setParent(vFileDto.parent());
        eFileDao.setParentField(vFileDto.parentField());
        eFileDao.setParentType(vFileDto.parentType());
        eFileDao.setIdx(vFileDto.idx());
        eFileDao.setFileName(vFileDto.fileName());
        eFileDao.setFileUrl(vFileDto.fileUrl());
        eFileDao.setModule(vFileDto.module());
        eFileDao.setAttachedToName(vFileDto.attachedToName());
        eFileDao.setFileSize(vFileDto.fileSize());
        eFileDao.setAttachedToDocType(vFileDto.attachedToDocType());
        eFileDao.setIsPrivate(vFileDto.isPrivate());
        eFileDao.setFileType(vFileDto.fileType());
        eFileDao.setIsHomeFolder(vFileDto.isHomeFolder());
        eFileDao.setIsAttachmentsFolder(vFileDto.isAttachmentsFolder());
        eFileDao.setThumbnailUrl(vFileDto.thumbnailUrl());
        eFileDao.setFolder(vFileDto.folder());
        eFileDao.setIsFolder(vFileDto.isFolder());
        eFileDao.setAttachedToField(vFileDto.attachedToField());
        eFileDao.setOldParent(vFileDto.oldParent());
        eFileDao.setContentHash(vFileDto.contentHash());
        eFileDao.setUploadedToDropbox(vFileDto.uploadedToDropbox());
        eFileDao.setUploadedToGoogleDrive(vFileDto.uploadedToGoogleDrive());
        eFileDao.setUserTags(vFileDto.userTags());
        eFileDao.setComments(vFileDto.comments());
        eFileDao.setAssign(vFileDto.assign());
        eFileDao.setLikedBy(vFileDto.likedBy());
    }
}