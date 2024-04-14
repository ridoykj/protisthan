package com.itbd.application.db.dto;

import com.itbd.application.db.dao.IncotermDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record IncotermDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String code,
        String title,
        String description,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static IncotermDto fromEntity(IncotermDao eIncotermDao) {
        return new IncotermDto(
                eIncotermDao.getName(),
                eIncotermDao.getCreation(),
                eIncotermDao.getModified(),
                eIncotermDao.getModifiedBy(),
                eIncotermDao.getOwner(),
                eIncotermDao.getIsDocStatus(),
                eIncotermDao.getIdx(),
                eIncotermDao.getCode(),
                eIncotermDao.getTitle(),
                eIncotermDao.getDescription(),
                eIncotermDao.getUserTags(),
                eIncotermDao.getComments(),
                eIncotermDao.getAssign(),
                eIncotermDao.getLikedBy());
    }

    public static void fromDTO(IncotermDto vIncotermDto, IncotermDao eIncotermDao) {
        eIncotermDao.setName(vIncotermDto.name());
        eIncotermDao.setCreation(vIncotermDto.creation());
        eIncotermDao.setModified(vIncotermDto.modified());
        eIncotermDao.setModifiedBy(vIncotermDto.modifiedBy());
        eIncotermDao.setOwner(vIncotermDto.owner());
        eIncotermDao.setIsDocStatus(vIncotermDto.isDocStatus());
        eIncotermDao.setIdx(vIncotermDto.idx());
        eIncotermDao.setCode(vIncotermDto.code());
        eIncotermDao.setTitle(vIncotermDto.title());
        eIncotermDao.setDescription(vIncotermDto.description());
        eIncotermDao.setUserTags(vIncotermDto.userTags());
        eIncotermDao.setComments(vIncotermDto.comments());
        eIncotermDao.setAssign(vIncotermDto.assign());
        eIncotermDao.setLikedBy(vIncotermDto.likedBy());
    }
}