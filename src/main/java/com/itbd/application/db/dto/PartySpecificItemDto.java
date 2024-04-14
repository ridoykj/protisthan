package com.itbd.application.db.dto;

import com.itbd.application.db.dao.PartySpecificItemDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record PartySpecificItemDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String partyType,
        String party,
        String restrictBasedOn,
        String basedOnValue,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static PartySpecificItemDto fromEntity(PartySpecificItemDao ePartySpecificItemDao) {
        return new PartySpecificItemDto(
                ePartySpecificItemDao.getName(),
                ePartySpecificItemDao.getCreation(),
                ePartySpecificItemDao.getModified(),
                ePartySpecificItemDao.getModifiedBy(),
                ePartySpecificItemDao.getOwner(),
                ePartySpecificItemDao.getIsDocStatus(),
                ePartySpecificItemDao.getIdx(),
                ePartySpecificItemDao.getPartyType(),
                ePartySpecificItemDao.getParty(),
                ePartySpecificItemDao.getRestrictBasedOn(),
                ePartySpecificItemDao.getBasedOnValue(),
                ePartySpecificItemDao.getUserTags(),
                ePartySpecificItemDao.getComments(),
                ePartySpecificItemDao.getAssign(),
                ePartySpecificItemDao.getLikedBy());
    }

    public static void fromDTO(PartySpecificItemDto vPartySpecificItemDto, PartySpecificItemDao ePartySpecificItemDao) {
        ePartySpecificItemDao.setName(vPartySpecificItemDto.name());
        ePartySpecificItemDao.setCreation(vPartySpecificItemDto.creation());
        ePartySpecificItemDao.setModified(vPartySpecificItemDto.modified());
        ePartySpecificItemDao.setModifiedBy(vPartySpecificItemDto.modifiedBy());
        ePartySpecificItemDao.setOwner(vPartySpecificItemDto.owner());
        ePartySpecificItemDao.setIsDocStatus(vPartySpecificItemDto.isDocStatus());
        ePartySpecificItemDao.setIdx(vPartySpecificItemDto.idx());
        ePartySpecificItemDao.setPartyType(vPartySpecificItemDto.partyType());
        ePartySpecificItemDao.setParty(vPartySpecificItemDto.party());
        ePartySpecificItemDao.setRestrictBasedOn(vPartySpecificItemDto.restrictBasedOn());
        ePartySpecificItemDao.setBasedOnValue(vPartySpecificItemDto.basedOnValue());
        ePartySpecificItemDao.setUserTags(vPartySpecificItemDto.userTags());
        ePartySpecificItemDao.setComments(vPartySpecificItemDto.comments());
        ePartySpecificItemDao.setAssign(vPartySpecificItemDto.assign());
        ePartySpecificItemDao.setLikedBy(vPartySpecificItemDto.likedBy());
    }
}