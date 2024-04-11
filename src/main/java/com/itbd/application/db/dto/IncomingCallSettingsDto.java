package com.itbd.application.db.dto;

import com.itbd.application.db.dao.IncomingCallSettingsDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record IncomingCallSettingsDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String callRouting,
        String greetingMessage,
        String agentBusyMessage,
        String agentUnavailableMessage,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static IncomingCallSettingsDto fromEntity(IncomingCallSettingsDao eIncomingCallSettingsDao) {
        return new IncomingCallSettingsDto(
                eIncomingCallSettingsDao.getName(),
                eIncomingCallSettingsDao.getCreation(),
                eIncomingCallSettingsDao.getModified(),
                eIncomingCallSettingsDao.getModifiedBy(),
                eIncomingCallSettingsDao.getOwner(),
                eIncomingCallSettingsDao.getIsDocStatus(),
                eIncomingCallSettingsDao.getIdx(),
                eIncomingCallSettingsDao.getCallRouting(),
                eIncomingCallSettingsDao.getGreetingMessage(),
                eIncomingCallSettingsDao.getAgentBusyMessage(),
                eIncomingCallSettingsDao.getAgentUnavailableMessage(),
                eIncomingCallSettingsDao.getUserTags(),
                eIncomingCallSettingsDao.getComments(),
                eIncomingCallSettingsDao.getAssign(),
                eIncomingCallSettingsDao.getLikedBy());
    }

    public static void fromDTO(IncomingCallSettingsDto vIncomingCallSettingsDto, IncomingCallSettingsDao eIncomingCallSettingsDao) {
        eIncomingCallSettingsDao.setName(vIncomingCallSettingsDto.name());
        eIncomingCallSettingsDao.setCreation(vIncomingCallSettingsDto.creation());
        eIncomingCallSettingsDao.setModified(vIncomingCallSettingsDto.modified());
        eIncomingCallSettingsDao.setModifiedBy(vIncomingCallSettingsDto.modifiedBy());
        eIncomingCallSettingsDao.setOwner(vIncomingCallSettingsDto.owner());
        eIncomingCallSettingsDao.setIsDocStatus(vIncomingCallSettingsDto.isDocStatus());
        eIncomingCallSettingsDao.setIdx(vIncomingCallSettingsDto.idx());
        eIncomingCallSettingsDao.setCallRouting(vIncomingCallSettingsDto.callRouting());
        eIncomingCallSettingsDao.setGreetingMessage(vIncomingCallSettingsDto.greetingMessage());
        eIncomingCallSettingsDao.setAgentBusyMessage(vIncomingCallSettingsDto.agentBusyMessage());
        eIncomingCallSettingsDao.setAgentUnavailableMessage(vIncomingCallSettingsDto.agentUnavailableMessage());
        eIncomingCallSettingsDao.setUserTags(vIncomingCallSettingsDto.userTags());
        eIncomingCallSettingsDao.setComments(vIncomingCallSettingsDto.comments());
        eIncomingCallSettingsDao.setAssign(vIncomingCallSettingsDto.assign());
        eIncomingCallSettingsDao.setLikedBy(vIncomingCallSettingsDto.likedBy());
    }
}