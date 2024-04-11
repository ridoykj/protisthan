package com.itbd.application.db.dto;

import com.itbd.application.db.dao.CompetitorDetailDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record CompetitorDetailDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String competitor,
        String parent,
        String parentField,
        String parentType
) {
    public static CompetitorDetailDto fromEntity(CompetitorDetailDao eCompetitorDetailDao) {
        return new CompetitorDetailDto(
                eCompetitorDetailDao.getName(),
                eCompetitorDetailDao.getCreation(),
                eCompetitorDetailDao.getModified(),
                eCompetitorDetailDao.getModifiedBy(),
                eCompetitorDetailDao.getOwner(),
                eCompetitorDetailDao.getIsDocStatus(),
                eCompetitorDetailDao.getIdx(),
                eCompetitorDetailDao.getCompetitor(),
                eCompetitorDetailDao.getParent(),
                eCompetitorDetailDao.getParentField(),
                eCompetitorDetailDao.getParentType());
    }

    public static void fromDTO(CompetitorDetailDto vCompetitorDetailDto, CompetitorDetailDao eCompetitorDetailDao) {
        eCompetitorDetailDao.setName(vCompetitorDetailDto.name());
        eCompetitorDetailDao.setCreation(vCompetitorDetailDto.creation());
        eCompetitorDetailDao.setModified(vCompetitorDetailDto.modified());
        eCompetitorDetailDao.setModifiedBy(vCompetitorDetailDto.modifiedBy());
        eCompetitorDetailDao.setOwner(vCompetitorDetailDto.owner());
        eCompetitorDetailDao.setIsDocStatus(vCompetitorDetailDto.isDocStatus());
        eCompetitorDetailDao.setIdx(vCompetitorDetailDto.idx());
        eCompetitorDetailDao.setCompetitor(vCompetitorDetailDto.competitor());
        eCompetitorDetailDao.setParent(vCompetitorDetailDto.parent());
        eCompetitorDetailDao.setParentField(vCompetitorDetailDto.parentField());
        eCompetitorDetailDao.setParentType(vCompetitorDetailDto.parentType());
    }
}