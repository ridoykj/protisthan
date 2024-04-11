package com.itbd.application.db.dto;

import com.itbd.application.db.dao.PartyLinkDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record PartyLinkDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String primaryRole,
        String secondaryRole,
        String primaryParty,
        String secondaryParty,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static PartyLinkDto fromEntity(PartyLinkDao ePartyLinkDao) {
        return new PartyLinkDto(
                ePartyLinkDao.getName(),
                ePartyLinkDao.getCreation(),
                ePartyLinkDao.getModified(),
                ePartyLinkDao.getModifiedBy(),
                ePartyLinkDao.getOwner(),
                ePartyLinkDao.getIsDocStatus(),
                ePartyLinkDao.getIdx(),
                ePartyLinkDao.getPrimaryRole(),
                ePartyLinkDao.getSecondaryRole(),
                ePartyLinkDao.getPrimaryParty(),
                ePartyLinkDao.getSecondaryParty(),
                ePartyLinkDao.getUserTags(),
                ePartyLinkDao.getComments(),
                ePartyLinkDao.getAssign(),
                ePartyLinkDao.getLikedBy());
    }

    public static void fromDTO(PartyLinkDto vPartyLinkDto, PartyLinkDao ePartyLinkDao) {
        ePartyLinkDao.setName(vPartyLinkDto.name());
        ePartyLinkDao.setCreation(vPartyLinkDto.creation());
        ePartyLinkDao.setModified(vPartyLinkDto.modified());
        ePartyLinkDao.setModifiedBy(vPartyLinkDto.modifiedBy());
        ePartyLinkDao.setOwner(vPartyLinkDto.owner());
        ePartyLinkDao.setIsDocStatus(vPartyLinkDto.isDocStatus());
        ePartyLinkDao.setIdx(vPartyLinkDto.idx());
        ePartyLinkDao.setPrimaryRole(vPartyLinkDto.primaryRole());
        ePartyLinkDao.setSecondaryRole(vPartyLinkDto.secondaryRole());
        ePartyLinkDao.setPrimaryParty(vPartyLinkDto.primaryParty());
        ePartyLinkDao.setSecondaryParty(vPartyLinkDto.secondaryParty());
        ePartyLinkDao.setUserTags(vPartyLinkDto.userTags());
        ePartyLinkDao.setComments(vPartyLinkDto.comments());
        ePartyLinkDao.setAssign(vPartyLinkDto.assign());
        ePartyLinkDao.setLikedBy(vPartyLinkDto.likedBy());
    }
}