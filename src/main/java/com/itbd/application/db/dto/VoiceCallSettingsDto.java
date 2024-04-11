package com.itbd.application.db.dto;

import com.itbd.application.db.dao.VoiceCallSettingsDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record VoiceCallSettingsDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String user,
        String callReceivingDevice,
        String greetingMessage,
        String agentBusyMessage,
        String agentUnavailableMessage,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static VoiceCallSettingsDto fromEntity(VoiceCallSettingsDao eVoiceCallSettingsDao) {
        return new VoiceCallSettingsDto(
                eVoiceCallSettingsDao.getName(),
                eVoiceCallSettingsDao.getCreation(),
                eVoiceCallSettingsDao.getModified(),
                eVoiceCallSettingsDao.getModifiedBy(),
                eVoiceCallSettingsDao.getOwner(),
                eVoiceCallSettingsDao.getIsDocStatus(),
                eVoiceCallSettingsDao.getIdx(),
                eVoiceCallSettingsDao.getUser(),
                eVoiceCallSettingsDao.getCallReceivingDevice(),
                eVoiceCallSettingsDao.getGreetingMessage(),
                eVoiceCallSettingsDao.getAgentBusyMessage(),
                eVoiceCallSettingsDao.getAgentUnavailableMessage(),
                eVoiceCallSettingsDao.getUserTags(),
                eVoiceCallSettingsDao.getComments(),
                eVoiceCallSettingsDao.getAssign(),
                eVoiceCallSettingsDao.getLikedBy());
    }

    public static void fromDTO(VoiceCallSettingsDto vVoiceCallSettingsDto, VoiceCallSettingsDao eVoiceCallSettingsDao) {
        eVoiceCallSettingsDao.setName(vVoiceCallSettingsDto.name());
        eVoiceCallSettingsDao.setCreation(vVoiceCallSettingsDto.creation());
        eVoiceCallSettingsDao.setModified(vVoiceCallSettingsDto.modified());
        eVoiceCallSettingsDao.setModifiedBy(vVoiceCallSettingsDto.modifiedBy());
        eVoiceCallSettingsDao.setOwner(vVoiceCallSettingsDto.owner());
        eVoiceCallSettingsDao.setIsDocStatus(vVoiceCallSettingsDto.isDocStatus());
        eVoiceCallSettingsDao.setIdx(vVoiceCallSettingsDto.idx());
        eVoiceCallSettingsDao.setUser(vVoiceCallSettingsDto.user());
        eVoiceCallSettingsDao.setCallReceivingDevice(vVoiceCallSettingsDto.callReceivingDevice());
        eVoiceCallSettingsDao.setGreetingMessage(vVoiceCallSettingsDto.greetingMessage());
        eVoiceCallSettingsDao.setAgentBusyMessage(vVoiceCallSettingsDto.agentBusyMessage());
        eVoiceCallSettingsDao.setAgentUnavailableMessage(vVoiceCallSettingsDto.agentUnavailableMessage());
        eVoiceCallSettingsDao.setUserTags(vVoiceCallSettingsDto.userTags());
        eVoiceCallSettingsDao.setComments(vVoiceCallSettingsDto.comments());
        eVoiceCallSettingsDao.setAssign(vVoiceCallSettingsDto.assign());
        eVoiceCallSettingsDao.setLikedBy(vVoiceCallSettingsDto.likedBy());
    }
}