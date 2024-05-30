package com.itbd.application.db.dto;

import com.itbd.application.db.dao.desk.NumberCardLinkDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record NumberCardLinkDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String card,
        String parent,
        String parentField,
        String parentType
) {
    public static NumberCardLinkDto fromEntity(NumberCardLinkDao eNumberCardLinkDao) {
        return new NumberCardLinkDto(
                eNumberCardLinkDao.getName(),
                eNumberCardLinkDao.getCreation(),
                eNumberCardLinkDao.getModified(),
                eNumberCardLinkDao.getModifiedBy(),
                eNumberCardLinkDao.getOwner(),
                eNumberCardLinkDao.getIsDocStatus(),
                eNumberCardLinkDao.getIdx(),
                eNumberCardLinkDao.getCard(),
                eNumberCardLinkDao.getParent(),
                eNumberCardLinkDao.getParentField(),
                eNumberCardLinkDao.getParentType());
    }

    public static void fromDTO(NumberCardLinkDto vNumberCardLinkDto, NumberCardLinkDao eNumberCardLinkDao) {
        eNumberCardLinkDao.setName(vNumberCardLinkDto.name());
        eNumberCardLinkDao.setCreation(vNumberCardLinkDto.creation());
        eNumberCardLinkDao.setModified(vNumberCardLinkDto.modified());
        eNumberCardLinkDao.setModifiedBy(vNumberCardLinkDto.modifiedBy());
        eNumberCardLinkDao.setOwner(vNumberCardLinkDto.owner());
        eNumberCardLinkDao.setIsDocStatus(vNumberCardLinkDto.isDocStatus());
        eNumberCardLinkDao.setIdx(vNumberCardLinkDto.idx());
        eNumberCardLinkDao.setCard(vNumberCardLinkDto.card());
        eNumberCardLinkDao.setParent(vNumberCardLinkDto.parent());
        eNumberCardLinkDao.setParentField(vNumberCardLinkDto.parentField());
        eNumberCardLinkDao.setParentType(vNumberCardLinkDto.parentType());
    }
}