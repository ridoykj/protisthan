package com.itbd.application.db.dto;

import com.itbd.application.db.dao.NoteSeenByDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record NoteSeenByDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String user,
        String parent,
        String parentField,
        String parentType
) {
    public static NoteSeenByDto fromEntity(NoteSeenByDao eNoteSeenByDao) {
        return new NoteSeenByDto(
                eNoteSeenByDao.getName(),
                eNoteSeenByDao.getCreation(),
                eNoteSeenByDao.getModified(),
                eNoteSeenByDao.getModifiedBy(),
                eNoteSeenByDao.getOwner(),
                eNoteSeenByDao.getIsDocStatus(),
                eNoteSeenByDao.getIdx(),
                eNoteSeenByDao.getUser(),
                eNoteSeenByDao.getParent(),
                eNoteSeenByDao.getParentField(),
                eNoteSeenByDao.getParentType());
    }

    public static void fromDTO(NoteSeenByDto vNoteSeenByDto, NoteSeenByDao eNoteSeenByDao) {
        eNoteSeenByDao.setName(vNoteSeenByDto.name());
        eNoteSeenByDao.setCreation(vNoteSeenByDto.creation());
        eNoteSeenByDao.setModified(vNoteSeenByDto.modified());
        eNoteSeenByDao.setModifiedBy(vNoteSeenByDto.modifiedBy());
        eNoteSeenByDao.setOwner(vNoteSeenByDto.owner());
        eNoteSeenByDao.setIsDocStatus(vNoteSeenByDto.isDocStatus());
        eNoteSeenByDao.setIdx(vNoteSeenByDto.idx());
        eNoteSeenByDao.setUser(vNoteSeenByDto.user());
        eNoteSeenByDao.setParent(vNoteSeenByDto.parent());
        eNoteSeenByDao.setParentField(vNoteSeenByDto.parentField());
        eNoteSeenByDao.setParentType(vNoteSeenByDto.parentType());
    }
}