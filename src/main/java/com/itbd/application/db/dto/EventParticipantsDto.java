package com.itbd.application.db.dto;

import com.itbd.application.db.dao.EventParticipantsDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record EventParticipantsDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String referenceDocType,
        String referenceDocName,
        String email,
        String parent,
        String parentField,
        String parentType
) {
    public static EventParticipantsDto fromEntity(EventParticipantsDao eEventParticipantsDao) {
        return new EventParticipantsDto(
                eEventParticipantsDao.getName(),
                eEventParticipantsDao.getCreation(),
                eEventParticipantsDao.getModified(),
                eEventParticipantsDao.getModifiedBy(),
                eEventParticipantsDao.getOwner(),
                eEventParticipantsDao.getIsDocStatus(),
                eEventParticipantsDao.getIdx(),
                eEventParticipantsDao.getReferenceDocType(),
                eEventParticipantsDao.getReferenceDocName(),
                eEventParticipantsDao.getEmail(),
                eEventParticipantsDao.getParent(),
                eEventParticipantsDao.getParentField(),
                eEventParticipantsDao.getParentType());
    }

    public static void fromDTO(EventParticipantsDto vEventParticipantsDto, EventParticipantsDao eEventParticipantsDao) {
        eEventParticipantsDao.setName(vEventParticipantsDto.name());
        eEventParticipantsDao.setCreation(vEventParticipantsDto.creation());
        eEventParticipantsDao.setModified(vEventParticipantsDto.modified());
        eEventParticipantsDao.setModifiedBy(vEventParticipantsDto.modifiedBy());
        eEventParticipantsDao.setOwner(vEventParticipantsDto.owner());
        eEventParticipantsDao.setIsDocStatus(vEventParticipantsDto.isDocStatus());
        eEventParticipantsDao.setIdx(vEventParticipantsDto.idx());
        eEventParticipantsDao.setReferenceDocType(vEventParticipantsDto.referenceDocType());
        eEventParticipantsDao.setReferenceDocName(vEventParticipantsDto.referenceDocName());
        eEventParticipantsDao.setEmail(vEventParticipantsDto.email());
        eEventParticipantsDao.setParent(vEventParticipantsDto.parent());
        eEventParticipantsDao.setParentField(vEventParticipantsDto.parentField());
        eEventParticipantsDao.setParentType(vEventParticipantsDto.parentType());
    }
}