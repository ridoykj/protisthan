package com.itbd.application.db.dto;

import com.itbd.application.db.dao.accounts.dunning.DunningLetterTextDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record DunningLetterTextDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String language,
        Boolean isDefaultLanguage,
        String bodyText,
        String closingText,
        String parent,
        String parentField,
        String parentType
) {
    public static DunningLetterTextDto fromEntity(DunningLetterTextDao eDunningLetterTextDao) {
        return new DunningLetterTextDto(
                eDunningLetterTextDao.getName(),
                eDunningLetterTextDao.getCreation(),
                eDunningLetterTextDao.getModified(),
                eDunningLetterTextDao.getModifiedBy(),
                eDunningLetterTextDao.getOwner(),
                eDunningLetterTextDao.getIsDocStatus(),
                eDunningLetterTextDao.getIdx(),
                eDunningLetterTextDao.getLanguage(),
                eDunningLetterTextDao.getIsDefaultLanguage(),
                eDunningLetterTextDao.getBodyText(),
                eDunningLetterTextDao.getClosingText(),
                eDunningLetterTextDao.getParent(),
                eDunningLetterTextDao.getParentField(),
                eDunningLetterTextDao.getParentType());
    }

    public static void fromDTO(DunningLetterTextDto vDunningLetterTextDto, DunningLetterTextDao eDunningLetterTextDao) {
        eDunningLetterTextDao.setName(vDunningLetterTextDto.name());
        eDunningLetterTextDao.setCreation(vDunningLetterTextDto.creation());
        eDunningLetterTextDao.setModified(vDunningLetterTextDto.modified());
        eDunningLetterTextDao.setModifiedBy(vDunningLetterTextDto.modifiedBy());
        eDunningLetterTextDao.setOwner(vDunningLetterTextDto.owner());
        eDunningLetterTextDao.setIsDocStatus(vDunningLetterTextDto.isDocStatus());
        eDunningLetterTextDao.setIdx(vDunningLetterTextDto.idx());
        eDunningLetterTextDao.setLanguage(vDunningLetterTextDto.language());
        eDunningLetterTextDao.setIsDefaultLanguage(vDunningLetterTextDto.isDefaultLanguage());
        eDunningLetterTextDao.setBodyText(vDunningLetterTextDto.bodyText());
        eDunningLetterTextDao.setClosingText(vDunningLetterTextDto.closingText());
        eDunningLetterTextDao.setParent(vDunningLetterTextDto.parent());
        eDunningLetterTextDao.setParentField(vDunningLetterTextDto.parentField());
        eDunningLetterTextDao.setParentType(vDunningLetterTextDto.parentType());
    }
}