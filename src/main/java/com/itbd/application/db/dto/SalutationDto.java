package com.itbd.application.db.dto;

import com.itbd.application.db.dao.SalutationDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record SalutationDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String salutation,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static SalutationDto fromEntity(SalutationDao eSalutationDao) {
        return new SalutationDto(
                eSalutationDao.getName(),
                eSalutationDao.getCreation(),
                eSalutationDao.getModified(),
                eSalutationDao.getModifiedBy(),
                eSalutationDao.getOwner(),
                eSalutationDao.getIsDocStatus(),
                eSalutationDao.getIdx(),
                eSalutationDao.getSalutation(),
                eSalutationDao.getUserTags(),
                eSalutationDao.getComments(),
                eSalutationDao.getAssign(),
                eSalutationDao.getLikedBy());
    }

    public static void fromDTO(SalutationDto vSalutationDto, SalutationDao eSalutationDao) {
        eSalutationDao.setName(vSalutationDto.name());
        eSalutationDao.setCreation(vSalutationDto.creation());
        eSalutationDao.setModified(vSalutationDto.modified());
        eSalutationDao.setModifiedBy(vSalutationDto.modifiedBy());
        eSalutationDao.setOwner(vSalutationDto.owner());
        eSalutationDao.setIsDocStatus(vSalutationDto.isDocStatus());
        eSalutationDao.setIdx(vSalutationDto.idx());
        eSalutationDao.setSalutation(vSalutationDto.salutation());
        eSalutationDao.setUserTags(vSalutationDto.userTags());
        eSalutationDao.setComments(vSalutationDto.comments());
        eSalutationDao.setAssign(vSalutationDto.assign());
        eSalutationDao.setLikedBy(vSalutationDto.likedBy());
    }
}