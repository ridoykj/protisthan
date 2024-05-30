package com.itbd.application.db.dto.journals;

import com.itbd.application.db.dao.accounts.journal.JournalEntryTemplateDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record JournalEntryTemplateDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String templateTitle,
        String voucherType,
        String namingSeries,
        String company,
        String isOpening,
        Boolean multiCurrency,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static JournalEntryTemplateDto fromEntity(JournalEntryTemplateDao eJournalEntryTemplateDao) {
        return new JournalEntryTemplateDto(
                eJournalEntryTemplateDao.getName(),
                eJournalEntryTemplateDao.getCreation(),
                eJournalEntryTemplateDao.getModified(),
                eJournalEntryTemplateDao.getModifiedBy(),
                eJournalEntryTemplateDao.getOwner(),
                eJournalEntryTemplateDao.getIsDocStatus(),
                eJournalEntryTemplateDao.getIdx(),
                eJournalEntryTemplateDao.getTemplateTitle(),
                eJournalEntryTemplateDao.getVoucherType(),
                eJournalEntryTemplateDao.getNamingSeries(),
                eJournalEntryTemplateDao.getCompany(),
                eJournalEntryTemplateDao.getIsOpening(),
                eJournalEntryTemplateDao.getMultiCurrency(),
                eJournalEntryTemplateDao.getUserTags(),
                eJournalEntryTemplateDao.getComments(),
                eJournalEntryTemplateDao.getAssign(),
                eJournalEntryTemplateDao.getLikedBy());
    }

    public static void fromDTO(JournalEntryTemplateDto vJournalEntryTemplateDto, JournalEntryTemplateDao eJournalEntryTemplateDao) {
        eJournalEntryTemplateDao.setName(vJournalEntryTemplateDto.name());
        eJournalEntryTemplateDao.setCreation(vJournalEntryTemplateDto.creation());
        eJournalEntryTemplateDao.setModified(vJournalEntryTemplateDto.modified());
        eJournalEntryTemplateDao.setModifiedBy(vJournalEntryTemplateDto.modifiedBy());
        eJournalEntryTemplateDao.setOwner(vJournalEntryTemplateDto.owner());
        eJournalEntryTemplateDao.setIsDocStatus(vJournalEntryTemplateDto.isDocStatus());
        eJournalEntryTemplateDao.setIdx(vJournalEntryTemplateDto.idx());
        eJournalEntryTemplateDao.setTemplateTitle(vJournalEntryTemplateDto.templateTitle());
        eJournalEntryTemplateDao.setVoucherType(vJournalEntryTemplateDto.voucherType());
        eJournalEntryTemplateDao.setNamingSeries(vJournalEntryTemplateDto.namingSeries());
        eJournalEntryTemplateDao.setCompany(vJournalEntryTemplateDto.company());
        eJournalEntryTemplateDao.setIsOpening(vJournalEntryTemplateDto.isOpening());
        eJournalEntryTemplateDao.setMultiCurrency(vJournalEntryTemplateDto.multiCurrency());
        eJournalEntryTemplateDao.setUserTags(vJournalEntryTemplateDto.userTags());
        eJournalEntryTemplateDao.setComments(vJournalEntryTemplateDto.comments());
        eJournalEntryTemplateDao.setAssign(vJournalEntryTemplateDto.assign());
        eJournalEntryTemplateDao.setLikedBy(vJournalEntryTemplateDto.likedBy());
    }
}