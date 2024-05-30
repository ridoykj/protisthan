package com.itbd.application.db.dto;

import com.itbd.application.db.dao.desk.CustomHtmlBlockDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record CustomHtmlBlockDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Boolean privates,
        String html,
        String script,
        String style,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static CustomHtmlBlockDto fromEntity(CustomHtmlBlockDao eCustomHtmlBlockDao) {
        return new CustomHtmlBlockDto(
                eCustomHtmlBlockDao.getName(),
                eCustomHtmlBlockDao.getCreation(),
                eCustomHtmlBlockDao.getModified(),
                eCustomHtmlBlockDao.getModifiedBy(),
                eCustomHtmlBlockDao.getOwner(),
                eCustomHtmlBlockDao.getIsDocStatus(),
                eCustomHtmlBlockDao.getIdx(),
                eCustomHtmlBlockDao.getPrivates(),
                eCustomHtmlBlockDao.getHtml(),
                eCustomHtmlBlockDao.getScript(),
                eCustomHtmlBlockDao.getStyle(),
                eCustomHtmlBlockDao.getUserTags(),
                eCustomHtmlBlockDao.getComments(),
                eCustomHtmlBlockDao.getAssign(),
                eCustomHtmlBlockDao.getLikedBy());
    }

    public static void fromDTO(CustomHtmlBlockDto vCustomHtmlBlockDto, CustomHtmlBlockDao eCustomHtmlBlockDao) {
        eCustomHtmlBlockDao.setName(vCustomHtmlBlockDto.name());
        eCustomHtmlBlockDao.setCreation(vCustomHtmlBlockDto.creation());
        eCustomHtmlBlockDao.setModified(vCustomHtmlBlockDto.modified());
        eCustomHtmlBlockDao.setModifiedBy(vCustomHtmlBlockDto.modifiedBy());
        eCustomHtmlBlockDao.setOwner(vCustomHtmlBlockDto.owner());
        eCustomHtmlBlockDao.setIsDocStatus(vCustomHtmlBlockDto.isDocStatus());
        eCustomHtmlBlockDao.setIdx(vCustomHtmlBlockDto.idx());
        eCustomHtmlBlockDao.setPrivates(vCustomHtmlBlockDto.privates());
        eCustomHtmlBlockDao.setHtml(vCustomHtmlBlockDto.html());
        eCustomHtmlBlockDao.setScript(vCustomHtmlBlockDto.script());
        eCustomHtmlBlockDao.setStyle(vCustomHtmlBlockDto.style());
        eCustomHtmlBlockDao.setUserTags(vCustomHtmlBlockDto.userTags());
        eCustomHtmlBlockDao.setComments(vCustomHtmlBlockDto.comments());
        eCustomHtmlBlockDao.setAssign(vCustomHtmlBlockDto.assign());
        eCustomHtmlBlockDao.setLikedBy(vCustomHtmlBlockDto.likedBy());
    }
}