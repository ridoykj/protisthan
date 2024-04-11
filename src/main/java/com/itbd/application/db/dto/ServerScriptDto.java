package com.itbd.application.db.dto;

import com.itbd.application.db.dao.ServerScriptDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ServerScriptDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String scriptType,
        String referenceDocType,
        String eventFrequency,
        String cronFormat,
        String docTypeEvent,
        String apiMethod,
        Boolean allowGuest,
        String module,
        Boolean disabled,
        String script,
        Boolean enableRateLimit,
        Integer rateLimitCount,
        Integer rateLimitSeconds,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ServerScriptDto fromEntity(ServerScriptDao eServerScriptDao) {
        return new ServerScriptDto(
                eServerScriptDao.getName(),
                eServerScriptDao.getCreation(),
                eServerScriptDao.getModified(),
                eServerScriptDao.getModifiedBy(),
                eServerScriptDao.getOwner(),
                eServerScriptDao.getIsDocStatus(),
                eServerScriptDao.getIdx(),
                eServerScriptDao.getScriptType(),
                eServerScriptDao.getReferenceDocType(),
                eServerScriptDao.getEventFrequency(),
                eServerScriptDao.getCronFormat(),
                eServerScriptDao.getDocTypeEvent(),
                eServerScriptDao.getApiMethod(),
                eServerScriptDao.getAllowGuest(),
                eServerScriptDao.getModule(),
                eServerScriptDao.getDisabled(),
                eServerScriptDao.getScript(),
                eServerScriptDao.getEnableRateLimit(),
                eServerScriptDao.getRateLimitCount(),
                eServerScriptDao.getRateLimitSeconds(),
                eServerScriptDao.getUserTags(),
                eServerScriptDao.getComments(),
                eServerScriptDao.getAssign(),
                eServerScriptDao.getLikedBy());
    }

    public static void fromDTO(ServerScriptDto vServerScriptDto, ServerScriptDao eServerScriptDao) {
        eServerScriptDao.setName(vServerScriptDto.name());
        eServerScriptDao.setCreation(vServerScriptDto.creation());
        eServerScriptDao.setModified(vServerScriptDto.modified());
        eServerScriptDao.setModifiedBy(vServerScriptDto.modifiedBy());
        eServerScriptDao.setOwner(vServerScriptDto.owner());
        eServerScriptDao.setIsDocStatus(vServerScriptDto.isDocStatus());
        eServerScriptDao.setIdx(vServerScriptDto.idx());
        eServerScriptDao.setScriptType(vServerScriptDto.scriptType());
        eServerScriptDao.setReferenceDocType(vServerScriptDto.referenceDocType());
        eServerScriptDao.setEventFrequency(vServerScriptDto.eventFrequency());
        eServerScriptDao.setCronFormat(vServerScriptDto.cronFormat());
        eServerScriptDao.setDocTypeEvent(vServerScriptDto.docTypeEvent());
        eServerScriptDao.setApiMethod(vServerScriptDto.apiMethod());
        eServerScriptDao.setAllowGuest(vServerScriptDto.allowGuest());
        eServerScriptDao.setModule(vServerScriptDto.module());
        eServerScriptDao.setDisabled(vServerScriptDto.disabled());
        eServerScriptDao.setScript(vServerScriptDto.script());
        eServerScriptDao.setEnableRateLimit(vServerScriptDto.enableRateLimit());
        eServerScriptDao.setRateLimitCount(vServerScriptDto.rateLimitCount());
        eServerScriptDao.setRateLimitSeconds(vServerScriptDto.rateLimitSeconds());
        eServerScriptDao.setUserTags(vServerScriptDto.userTags());
        eServerScriptDao.setComments(vServerScriptDto.comments());
        eServerScriptDao.setAssign(vServerScriptDto.assign());
        eServerScriptDao.setLikedBy(vServerScriptDto.likedBy());
    }
}