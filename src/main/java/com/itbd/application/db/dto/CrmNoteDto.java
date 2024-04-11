package com.itbd.application.db.dto;

import com.itbd.application.db.dao.CrmNoteDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record CrmNoteDto(
        @Id

        Long name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String note,
        String addedBy,
        LocalDateTime addedOn,
        String parent,
        String parentField,
        String parentType
) {
    public static CrmNoteDto fromEntity(CrmNoteDao eCrmNoteDao) {
        return new CrmNoteDto(
                eCrmNoteDao.getName(),
                eCrmNoteDao.getCreation(),
                eCrmNoteDao.getModified(),
                eCrmNoteDao.getModifiedBy(),
                eCrmNoteDao.getOwner(),
                eCrmNoteDao.getIsDocStatus(),
                eCrmNoteDao.getIdx(),
                eCrmNoteDao.getNote(),
                eCrmNoteDao.getAddedBy(),
                eCrmNoteDao.getAddedOn(),
                eCrmNoteDao.getParent(),
                eCrmNoteDao.getParentField(),
                eCrmNoteDao.getParentType());
    }

    public static void fromDTO(CrmNoteDto vCrmNoteDto, CrmNoteDao eCrmNoteDao) {
        eCrmNoteDao.setName(vCrmNoteDto.name());
        eCrmNoteDao.setCreation(vCrmNoteDto.creation());
        eCrmNoteDao.setModified(vCrmNoteDto.modified());
        eCrmNoteDao.setModifiedBy(vCrmNoteDto.modifiedBy());
        eCrmNoteDao.setOwner(vCrmNoteDto.owner());
        eCrmNoteDao.setIsDocStatus(vCrmNoteDto.isDocStatus());
        eCrmNoteDao.setIdx(vCrmNoteDto.idx());
        eCrmNoteDao.setNote(vCrmNoteDto.note());
        eCrmNoteDao.setAddedBy(vCrmNoteDto.addedBy());
        eCrmNoteDao.setAddedOn(vCrmNoteDto.addedOn());
        eCrmNoteDao.setParent(vCrmNoteDto.parent());
        eCrmNoteDao.setParentField(vCrmNoteDto.parentField());
        eCrmNoteDao.setParentType(vCrmNoteDto.parentType());
    }
}