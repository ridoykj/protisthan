package com.itbd.application.db.dto;

import com.itbd.application.db.dao.website.CompanyHistoryDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record CompanyHistoryDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String year,
        String highlight,
        String parent,
        String parentField,
        String parentType
) {
    public static CompanyHistoryDto fromEntity(CompanyHistoryDao eCompanyHistoryDao) {
        return new CompanyHistoryDto(
                eCompanyHistoryDao.getName(),
                eCompanyHistoryDao.getCreation(),
                eCompanyHistoryDao.getModified(),
                eCompanyHistoryDao.getModifiedBy(),
                eCompanyHistoryDao.getOwner(),
                eCompanyHistoryDao.getIsDocStatus(),
                eCompanyHistoryDao.getIdx(),
                eCompanyHistoryDao.getYear(),
                eCompanyHistoryDao.getHighlight(),
                eCompanyHistoryDao.getParent(),
                eCompanyHistoryDao.getParentField(),
                eCompanyHistoryDao.getParentType());
    }

    public static void fromDTO(CompanyHistoryDto vCompanyHistoryDto, CompanyHistoryDao eCompanyHistoryDao) {
        eCompanyHistoryDao.setName(vCompanyHistoryDto.name());
        eCompanyHistoryDao.setCreation(vCompanyHistoryDto.creation());
        eCompanyHistoryDao.setModified(vCompanyHistoryDto.modified());
        eCompanyHistoryDao.setModifiedBy(vCompanyHistoryDto.modifiedBy());
        eCompanyHistoryDao.setOwner(vCompanyHistoryDto.owner());
        eCompanyHistoryDao.setIsDocStatus(vCompanyHistoryDto.isDocStatus());
        eCompanyHistoryDao.setIdx(vCompanyHistoryDto.idx());
        eCompanyHistoryDao.setYear(vCompanyHistoryDto.year());
        eCompanyHistoryDao.setHighlight(vCompanyHistoryDto.highlight());
        eCompanyHistoryDao.setParent(vCompanyHistoryDto.parent());
        eCompanyHistoryDao.setParentField(vCompanyHistoryDto.parentField());
        eCompanyHistoryDao.setParentType(vCompanyHistoryDto.parentType());
    }
}