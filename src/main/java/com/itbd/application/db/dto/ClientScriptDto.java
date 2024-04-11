package com.itbd.application.db.dto;

import com.itbd.application.db.dao.ClientScriptDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ClientScriptDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String dt,
        String view,
        String module,
        Boolean enabled,
        String script,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ClientScriptDto fromEntity(ClientScriptDao eClientScriptDao) {
        return new ClientScriptDto(
                eClientScriptDao.getName(),
                eClientScriptDao.getCreation(),
                eClientScriptDao.getModified(),
                eClientScriptDao.getModifiedBy(),
                eClientScriptDao.getOwner(),
                eClientScriptDao.getIsDocStatus(),
                eClientScriptDao.getIdx(),
                eClientScriptDao.getDt(),
                eClientScriptDao.getView(),
                eClientScriptDao.getModule(),
                eClientScriptDao.getEnabled(),
                eClientScriptDao.getScript(),
                eClientScriptDao.getUserTags(),
                eClientScriptDao.getComments(),
                eClientScriptDao.getAssign(),
                eClientScriptDao.getLikedBy());
    }

    public static void fromDTO(ClientScriptDto vClientScriptDto, ClientScriptDao eClientScriptDao) {
        eClientScriptDao.setName(vClientScriptDto.name());
        eClientScriptDao.setCreation(vClientScriptDto.creation());
        eClientScriptDao.setModified(vClientScriptDto.modified());
        eClientScriptDao.setModifiedBy(vClientScriptDto.modifiedBy());
        eClientScriptDao.setOwner(vClientScriptDto.owner());
        eClientScriptDao.setIsDocStatus(vClientScriptDto.isDocStatus());
        eClientScriptDao.setIdx(vClientScriptDto.idx());
        eClientScriptDao.setDt(vClientScriptDto.dt());
        eClientScriptDao.setView(vClientScriptDto.view());
        eClientScriptDao.setModule(vClientScriptDto.module());
        eClientScriptDao.setEnabled(vClientScriptDto.enabled());
        eClientScriptDao.setScript(vClientScriptDto.script());
        eClientScriptDao.setUserTags(vClientScriptDto.userTags());
        eClientScriptDao.setComments(vClientScriptDto.comments());
        eClientScriptDao.setAssign(vClientScriptDto.assign());
        eClientScriptDao.setLikedBy(vClientScriptDto.likedBy());
    }
}