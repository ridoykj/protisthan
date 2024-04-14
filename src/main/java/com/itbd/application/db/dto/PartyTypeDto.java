package com.itbd.application.db.dto;

import com.itbd.application.db.dao.PartyTypeDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record PartyTypeDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String partyType,
        String accountType,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static PartyTypeDto fromEntity(PartyTypeDao ePartyTypeDao) {
        return new PartyTypeDto(
                ePartyTypeDao.getName(),
                ePartyTypeDao.getCreation(),
                ePartyTypeDao.getModified(),
                ePartyTypeDao.getModifiedBy(),
                ePartyTypeDao.getOwner(),
                ePartyTypeDao.getIsDocStatus(),
                ePartyTypeDao.getIdx(),
                ePartyTypeDao.getPartyType(),
                ePartyTypeDao.getAccountType(),
                ePartyTypeDao.getUserTags(),
                ePartyTypeDao.getComments(),
                ePartyTypeDao.getAssign(),
                ePartyTypeDao.getLikedBy());
    }

    public static void fromDTO(PartyTypeDto vPartyTypeDto, PartyTypeDao ePartyTypeDao) {
        ePartyTypeDao.setName(vPartyTypeDto.name());
        ePartyTypeDao.setCreation(vPartyTypeDto.creation());
        ePartyTypeDao.setModified(vPartyTypeDto.modified());
        ePartyTypeDao.setModifiedBy(vPartyTypeDto.modifiedBy());
        ePartyTypeDao.setOwner(vPartyTypeDto.owner());
        ePartyTypeDao.setIsDocStatus(vPartyTypeDto.isDocStatus());
        ePartyTypeDao.setIdx(vPartyTypeDto.idx());
        ePartyTypeDao.setPartyType(vPartyTypeDto.partyType());
        ePartyTypeDao.setAccountType(vPartyTypeDto.accountType());
        ePartyTypeDao.setUserTags(vPartyTypeDto.userTags());
        ePartyTypeDao.setComments(vPartyTypeDto.comments());
        ePartyTypeDao.setAssign(vPartyTypeDto.assign());
        ePartyTypeDao.setLikedBy(vPartyTypeDto.likedBy());
    }
}