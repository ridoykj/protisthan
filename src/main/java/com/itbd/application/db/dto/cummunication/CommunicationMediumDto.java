package com.itbd.application.db.dto.cummunication;

import com.itbd.application.db.dao.communication.CommunicationMediumDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record CommunicationMediumDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String communicationChannel,
        String communicationMediumType,
        String catchAll,
        String provider,
        Boolean disabled,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static CommunicationMediumDto fromEntity(CommunicationMediumDao eCommunicationMediumDao) {
        return new CommunicationMediumDto(
                eCommunicationMediumDao.getName(),
                eCommunicationMediumDao.getCreation(),
                eCommunicationMediumDao.getModified(),
                eCommunicationMediumDao.getModifiedBy(),
                eCommunicationMediumDao.getOwner(),
                eCommunicationMediumDao.getIsDocStatus(),
                eCommunicationMediumDao.getIdx(),
                eCommunicationMediumDao.getCommunicationChannel(),
                eCommunicationMediumDao.getCommunicationMediumType(),
                eCommunicationMediumDao.getCatchAll(),
                eCommunicationMediumDao.getProvider(),
                eCommunicationMediumDao.getDisabled(),
                eCommunicationMediumDao.getUserTags(),
                eCommunicationMediumDao.getComments(),
                eCommunicationMediumDao.getAssign(),
                eCommunicationMediumDao.getLikedBy());
    }

    public static void fromDTO(CommunicationMediumDto vCommunicationMediumDto, CommunicationMediumDao eCommunicationMediumDao) {
        eCommunicationMediumDao.setName(vCommunicationMediumDto.name());
        eCommunicationMediumDao.setCreation(vCommunicationMediumDto.creation());
        eCommunicationMediumDao.setModified(vCommunicationMediumDto.modified());
        eCommunicationMediumDao.setModifiedBy(vCommunicationMediumDto.modifiedBy());
        eCommunicationMediumDao.setOwner(vCommunicationMediumDto.owner());
        eCommunicationMediumDao.setIsDocStatus(vCommunicationMediumDto.isDocStatus());
        eCommunicationMediumDao.setIdx(vCommunicationMediumDto.idx());
        eCommunicationMediumDao.setCommunicationChannel(vCommunicationMediumDto.communicationChannel());
        eCommunicationMediumDao.setCommunicationMediumType(vCommunicationMediumDto.communicationMediumType());
        eCommunicationMediumDao.setCatchAll(vCommunicationMediumDto.catchAll());
        eCommunicationMediumDao.setProvider(vCommunicationMediumDto.provider());
        eCommunicationMediumDao.setDisabled(vCommunicationMediumDto.disabled());
        eCommunicationMediumDao.setUserTags(vCommunicationMediumDto.userTags());
        eCommunicationMediumDao.setComments(vCommunicationMediumDto.comments());
        eCommunicationMediumDao.setAssign(vCommunicationMediumDto.assign());
        eCommunicationMediumDao.setLikedBy(vCommunicationMediumDto.likedBy());
    }
}