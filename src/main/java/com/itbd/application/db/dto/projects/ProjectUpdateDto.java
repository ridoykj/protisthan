package com.itbd.application.db.dto.projects;

import com.itbd.application.db.dao.projects.ProjectUpdateDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public record ProjectUpdateDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String namingSeries,
        String project,
        Boolean sent,
        LocalDate date,
        LocalTime time,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ProjectUpdateDto fromEntity(ProjectUpdateDao eProjectUpdateDao) {
        return new ProjectUpdateDto(
                eProjectUpdateDao.getName(),
                eProjectUpdateDao.getCreation(),
                eProjectUpdateDao.getModified(),
                eProjectUpdateDao.getModifiedBy(),
                eProjectUpdateDao.getOwner(),
                eProjectUpdateDao.getIsDocStatus(),
                eProjectUpdateDao.getIdx(),
                eProjectUpdateDao.getNamingSeries(),
                eProjectUpdateDao.getProject(),
                eProjectUpdateDao.getSent(),
                eProjectUpdateDao.getDate(),
                eProjectUpdateDao.getTime(),
                eProjectUpdateDao.getAmendedFrom(),
                eProjectUpdateDao.getUserTags(),
                eProjectUpdateDao.getComments(),
                eProjectUpdateDao.getAssign(),
                eProjectUpdateDao.getLikedBy());
    }

    public static void fromDTO(ProjectUpdateDto vProjectUpdateDto, ProjectUpdateDao eProjectUpdateDao) {
        eProjectUpdateDao.setName(vProjectUpdateDto.name());
        eProjectUpdateDao.setCreation(vProjectUpdateDto.creation());
        eProjectUpdateDao.setModified(vProjectUpdateDto.modified());
        eProjectUpdateDao.setModifiedBy(vProjectUpdateDto.modifiedBy());
        eProjectUpdateDao.setOwner(vProjectUpdateDto.owner());
        eProjectUpdateDao.setIsDocStatus(vProjectUpdateDto.isDocStatus());
        eProjectUpdateDao.setIdx(vProjectUpdateDto.idx());
        eProjectUpdateDao.setNamingSeries(vProjectUpdateDto.namingSeries());
        eProjectUpdateDao.setProject(vProjectUpdateDto.project());
        eProjectUpdateDao.setSent(vProjectUpdateDto.sent());
        eProjectUpdateDao.setDate(vProjectUpdateDto.date());
        eProjectUpdateDao.setTime(vProjectUpdateDto.time());
        eProjectUpdateDao.setAmendedFrom(vProjectUpdateDto.amendedFrom());
        eProjectUpdateDao.setUserTags(vProjectUpdateDto.userTags());
        eProjectUpdateDao.setComments(vProjectUpdateDto.comments());
        eProjectUpdateDao.setAssign(vProjectUpdateDto.assign());
        eProjectUpdateDao.setLikedBy(vProjectUpdateDto.likedBy());
    }
}