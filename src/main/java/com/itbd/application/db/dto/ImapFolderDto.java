package com.itbd.application.db.dto;

import com.itbd.application.db.dao.ImapFolderDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ImapFolderDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String folderName,
        String appendTo,
        String uidValidity,
        String uidNext,
        String parent,
        String parentField,
        String parentType
) {
    public static ImapFolderDto fromEntity(ImapFolderDao eImapFolderDao) {
        return new ImapFolderDto(
                eImapFolderDao.getName(),
                eImapFolderDao.getCreation(),
                eImapFolderDao.getModified(),
                eImapFolderDao.getModifiedBy(),
                eImapFolderDao.getOwner(),
                eImapFolderDao.getIsDocStatus(),
                eImapFolderDao.getIdx(),
                eImapFolderDao.getFolderName(),
                eImapFolderDao.getAppendTo(),
                eImapFolderDao.getUidValidity(),
                eImapFolderDao.getUidNext(),
                eImapFolderDao.getParent(),
                eImapFolderDao.getParentField(),
                eImapFolderDao.getParentType());
    }

    public static void fromDTO(ImapFolderDto vImapFolderDto, ImapFolderDao eImapFolderDao) {
        eImapFolderDao.setName(vImapFolderDto.name());
        eImapFolderDao.setCreation(vImapFolderDto.creation());
        eImapFolderDao.setModified(vImapFolderDto.modified());
        eImapFolderDao.setModifiedBy(vImapFolderDto.modifiedBy());
        eImapFolderDao.setOwner(vImapFolderDto.owner());
        eImapFolderDao.setIsDocStatus(vImapFolderDto.isDocStatus());
        eImapFolderDao.setIdx(vImapFolderDto.idx());
        eImapFolderDao.setFolderName(vImapFolderDto.folderName());
        eImapFolderDao.setAppendTo(vImapFolderDto.appendTo());
        eImapFolderDao.setUidValidity(vImapFolderDto.uidValidity());
        eImapFolderDao.setUidNext(vImapFolderDto.uidNext());
        eImapFolderDao.setParent(vImapFolderDto.parent());
        eImapFolderDao.setParentField(vImapFolderDto.parentField());
        eImapFolderDao.setParentType(vImapFolderDto.parentType());
    }
}