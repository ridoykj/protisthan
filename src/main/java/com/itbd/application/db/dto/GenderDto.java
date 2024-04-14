package com.itbd.application.db.dto;

import com.itbd.application.db.dao.GenderDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record GenderDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String gender,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static GenderDto fromEntity(GenderDao eGenderDao) {
        return new GenderDto(
                eGenderDao.getName(),
                eGenderDao.getCreation(),
                eGenderDao.getModified(),
                eGenderDao.getModifiedBy(),
                eGenderDao.getOwner(),
                eGenderDao.getIsDocStatus(),
                eGenderDao.getIdx(),
                eGenderDao.getGender(),
                eGenderDao.getUserTags(),
                eGenderDao.getComments(),
                eGenderDao.getAssign(),
                eGenderDao.getLikedBy());
    }

    public static void fromDTO(GenderDto vGenderDto, GenderDao eGenderDao) {
        eGenderDao.setName(vGenderDto.name());
        eGenderDao.setCreation(vGenderDto.creation());
        eGenderDao.setModified(vGenderDto.modified());
        eGenderDao.setModifiedBy(vGenderDto.modifiedBy());
        eGenderDao.setOwner(vGenderDto.owner());
        eGenderDao.setIsDocStatus(vGenderDto.isDocStatus());
        eGenderDao.setIdx(vGenderDto.idx());
        eGenderDao.setGender(vGenderDto.gender());
        eGenderDao.setUserTags(vGenderDto.userTags());
        eGenderDao.setComments(vGenderDto.comments());
        eGenderDao.setAssign(vGenderDto.assign());
        eGenderDao.setLikedBy(vGenderDto.likedBy());
    }
}