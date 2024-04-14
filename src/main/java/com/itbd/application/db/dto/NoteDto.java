package com.itbd.application.db.dto;

import com.itbd.application.db.dao.NoteDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record NoteDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String title,
        Boolean publics,
        Boolean notifyOnLogin,
        Boolean notifyOnEveryLogin,
        LocalDate expireNotificationOn,
        String content,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static NoteDto fromEntity(NoteDao eNoteDao) {
        return new NoteDto(
                eNoteDao.getName(),
                eNoteDao.getCreation(),
                eNoteDao.getModified(),
                eNoteDao.getModifiedBy(),
                eNoteDao.getOwner(),
                eNoteDao.getIsDocStatus(),
                eNoteDao.getIdx(),
                eNoteDao.getTitle(),
                eNoteDao.getPublics(),
                eNoteDao.getNotifyOnLogin(),
                eNoteDao.getNotifyOnEveryLogin(),
                eNoteDao.getExpireNotificationOn(),
                eNoteDao.getContent(),
                eNoteDao.getUserTags(),
                eNoteDao.getComments(),
                eNoteDao.getAssign(),
                eNoteDao.getLikedBy());
    }

    public static void fromDTO(NoteDto vNoteDto, NoteDao eNoteDao) {
        eNoteDao.setName(vNoteDto.name());
        eNoteDao.setCreation(vNoteDto.creation());
        eNoteDao.setModified(vNoteDto.modified());
        eNoteDao.setModifiedBy(vNoteDto.modifiedBy());
        eNoteDao.setOwner(vNoteDto.owner());
        eNoteDao.setIsDocStatus(vNoteDto.isDocStatus());
        eNoteDao.setIdx(vNoteDto.idx());
        eNoteDao.setTitle(vNoteDto.title());
        eNoteDao.setPublics(vNoteDto.publics());
        eNoteDao.setNotifyOnLogin(vNoteDto.notifyOnLogin());
        eNoteDao.setNotifyOnEveryLogin(vNoteDto.notifyOnEveryLogin());
        eNoteDao.setExpireNotificationOn(vNoteDto.expireNotificationOn());
        eNoteDao.setContent(vNoteDto.content());
        eNoteDao.setUserTags(vNoteDto.userTags());
        eNoteDao.setComments(vNoteDto.comments());
        eNoteDao.setAssign(vNoteDto.assign());
        eNoteDao.setLikedBy(vNoteDto.likedBy());
    }
}