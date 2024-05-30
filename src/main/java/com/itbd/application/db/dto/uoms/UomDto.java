package com.itbd.application.db.dto.uoms;

import com.itbd.application.db.dao.setup.UomDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record UomDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Boolean enabled,
        String uomName,
        Boolean mustBeWholeNumber,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static UomDto fromEntity(UomDao eUomDao) {
        return new UomDto(
                eUomDao.getName(),
                eUomDao.getCreation(),
                eUomDao.getModified(),
                eUomDao.getModifiedBy(),
                eUomDao.getOwner(),
                eUomDao.getIsDocStatus(),
                eUomDao.getIdx(),
                eUomDao.getEnabled(),
                eUomDao.getUomName(),
                eUomDao.getMustBeWholeNumber(),
                eUomDao.getUserTags(),
                eUomDao.getComments(),
                eUomDao.getAssign(),
                eUomDao.getLikedBy());
    }

    public static void fromDTO(UomDto vUomDto, UomDao eUomDao) {
        eUomDao.setName(vUomDto.name());
        eUomDao.setCreation(vUomDto.creation());
        eUomDao.setModified(vUomDto.modified());
        eUomDao.setModifiedBy(vUomDto.modifiedBy());
        eUomDao.setOwner(vUomDto.owner());
        eUomDao.setIsDocStatus(vUomDto.isDocStatus());
        eUomDao.setIdx(vUomDto.idx());
        eUomDao.setEnabled(vUomDto.enabled());
        eUomDao.setUomName(vUomDto.uomName());
        eUomDao.setMustBeWholeNumber(vUomDto.mustBeWholeNumber());
        eUomDao.setUserTags(vUomDto.userTags());
        eUomDao.setComments(vUomDto.comments());
        eUomDao.setAssign(vUomDto.assign());
        eUomDao.setLikedBy(vUomDto.likedBy());
    }
}