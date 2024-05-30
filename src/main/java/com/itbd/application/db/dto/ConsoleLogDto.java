package com.itbd.application.db.dto;

import com.itbd.application.db.dao.desk.ConsoleLogDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ConsoleLogDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String script,
        String type,
        Boolean committed,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ConsoleLogDto fromEntity(ConsoleLogDao eConsoleLogDao) {
        return new ConsoleLogDto(
                eConsoleLogDao.getName(),
                eConsoleLogDao.getCreation(),
                eConsoleLogDao.getModified(),
                eConsoleLogDao.getModifiedBy(),
                eConsoleLogDao.getOwner(),
                eConsoleLogDao.getIsDocStatus(),
                eConsoleLogDao.getIdx(),
                eConsoleLogDao.getScript(),
                eConsoleLogDao.getType(),
                eConsoleLogDao.getCommitted(),
                eConsoleLogDao.getUserTags(),
                eConsoleLogDao.getComments(),
                eConsoleLogDao.getAssign(),
                eConsoleLogDao.getLikedBy());
    }

    public static void fromDTO(ConsoleLogDto vConsoleLogDto, ConsoleLogDao eConsoleLogDao) {
        eConsoleLogDao.setName(vConsoleLogDto.name());
        eConsoleLogDao.setCreation(vConsoleLogDto.creation());
        eConsoleLogDao.setModified(vConsoleLogDto.modified());
        eConsoleLogDao.setModifiedBy(vConsoleLogDto.modifiedBy());
        eConsoleLogDao.setOwner(vConsoleLogDto.owner());
        eConsoleLogDao.setIsDocStatus(vConsoleLogDto.isDocStatus());
        eConsoleLogDao.setIdx(vConsoleLogDto.idx());
        eConsoleLogDao.setScript(vConsoleLogDto.script());
        eConsoleLogDao.setType(vConsoleLogDto.type());
        eConsoleLogDao.setCommitted(vConsoleLogDto.committed());
        eConsoleLogDao.setUserTags(vConsoleLogDto.userTags());
        eConsoleLogDao.setComments(vConsoleLogDto.comments());
        eConsoleLogDao.setAssign(vConsoleLogDto.assign());
        eConsoleLogDao.setLikedBy(vConsoleLogDto.likedBy());
    }
}