package com.itbd.application.db.dto;

import com.itbd.application.db.dao.DesignationDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record DesignationDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String designationName,
        String description,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static DesignationDto fromEntity(DesignationDao eDesignationDao) {
        return new DesignationDto(
                eDesignationDao.getName(),
                eDesignationDao.getCreation(),
                eDesignationDao.getModified(),
                eDesignationDao.getModifiedBy(),
                eDesignationDao.getOwner(),
                eDesignationDao.getIsDocStatus(),
                eDesignationDao.getIdx(),
                eDesignationDao.getDesignationName(),
                eDesignationDao.getDescription(),
                eDesignationDao.getUserTags(),
                eDesignationDao.getComments(),
                eDesignationDao.getAssign(),
                eDesignationDao.getLikedBy());
    }

    public static void fromDTO(DesignationDto vDesignationDto, DesignationDao eDesignationDao) {
        eDesignationDao.setName(vDesignationDto.name());
        eDesignationDao.setCreation(vDesignationDto.creation());
        eDesignationDao.setModified(vDesignationDto.modified());
        eDesignationDao.setModifiedBy(vDesignationDto.modifiedBy());
        eDesignationDao.setOwner(vDesignationDto.owner());
        eDesignationDao.setIsDocStatus(vDesignationDto.isDocStatus());
        eDesignationDao.setIdx(vDesignationDto.idx());
        eDesignationDao.setDesignationName(vDesignationDto.designationName());
        eDesignationDao.setDescription(vDesignationDto.description());
        eDesignationDao.setUserTags(vDesignationDto.userTags());
        eDesignationDao.setComments(vDesignationDto.comments());
        eDesignationDao.setAssign(vDesignationDto.assign());
        eDesignationDao.setLikedBy(vDesignationDto.likedBy());
    }
}