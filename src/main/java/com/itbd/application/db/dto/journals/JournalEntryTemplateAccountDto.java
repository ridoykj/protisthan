package com.itbd.application.db.dto.journals;

import com.itbd.application.db.dao.journals.JournalEntryTemplateAccountDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record JournalEntryTemplateAccountDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String account,
        String parent,
        String parentField,
        String parentType
) {
    public static JournalEntryTemplateAccountDto fromEntity(JournalEntryTemplateAccountDao eJournalEntryTemplateAccountDao) {
        return new JournalEntryTemplateAccountDto(
                eJournalEntryTemplateAccountDao.getName(),
                eJournalEntryTemplateAccountDao.getCreation(),
                eJournalEntryTemplateAccountDao.getModified(),
                eJournalEntryTemplateAccountDao.getModifiedBy(),
                eJournalEntryTemplateAccountDao.getOwner(),
                eJournalEntryTemplateAccountDao.getIsDocStatus(),
                eJournalEntryTemplateAccountDao.getIdx(),
                eJournalEntryTemplateAccountDao.getAccount(),
                eJournalEntryTemplateAccountDao.getParent(),
                eJournalEntryTemplateAccountDao.getParentField(),
                eJournalEntryTemplateAccountDao.getParentType());
    }

    public static void fromDTO(JournalEntryTemplateAccountDto vJournalEntryTemplateAccountDto, JournalEntryTemplateAccountDao eJournalEntryTemplateAccountDao) {
        eJournalEntryTemplateAccountDao.setName(vJournalEntryTemplateAccountDto.name());
        eJournalEntryTemplateAccountDao.setCreation(vJournalEntryTemplateAccountDto.creation());
        eJournalEntryTemplateAccountDao.setModified(vJournalEntryTemplateAccountDto.modified());
        eJournalEntryTemplateAccountDao.setModifiedBy(vJournalEntryTemplateAccountDto.modifiedBy());
        eJournalEntryTemplateAccountDao.setOwner(vJournalEntryTemplateAccountDto.owner());
        eJournalEntryTemplateAccountDao.setIsDocStatus(vJournalEntryTemplateAccountDto.isDocStatus());
        eJournalEntryTemplateAccountDao.setIdx(vJournalEntryTemplateAccountDto.idx());
        eJournalEntryTemplateAccountDao.setAccount(vJournalEntryTemplateAccountDto.account());
        eJournalEntryTemplateAccountDao.setParent(vJournalEntryTemplateAccountDto.parent());
        eJournalEntryTemplateAccountDao.setParentField(vJournalEntryTemplateAccountDto.parentField());
        eJournalEntryTemplateAccountDao.setParentType(vJournalEntryTemplateAccountDto.parentType());
    }
}