package com.itbd.application.db.dto;

import com.itbd.application.db.dao.stock.CustomsTariffNumberDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record CustomsTariffNumberDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String tariffNumber,
        String description,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static CustomsTariffNumberDto fromEntity(CustomsTariffNumberDao eCustomsTariffNumberDao) {
        return new CustomsTariffNumberDto(
                eCustomsTariffNumberDao.getName(),
                eCustomsTariffNumberDao.getCreation(),
                eCustomsTariffNumberDao.getModified(),
                eCustomsTariffNumberDao.getModifiedBy(),
                eCustomsTariffNumberDao.getOwner(),
                eCustomsTariffNumberDao.getIsDocStatus(),
                eCustomsTariffNumberDao.getIdx(),
                eCustomsTariffNumberDao.getTariffNumber(),
                eCustomsTariffNumberDao.getDescription(),
                eCustomsTariffNumberDao.getUserTags(),
                eCustomsTariffNumberDao.getComments(),
                eCustomsTariffNumberDao.getAssign(),
                eCustomsTariffNumberDao.getLikedBy());
    }

    public static void fromDTO(CustomsTariffNumberDto vCustomsTariffNumberDto, CustomsTariffNumberDao eCustomsTariffNumberDao) {
        eCustomsTariffNumberDao.setName(vCustomsTariffNumberDto.name());
        eCustomsTariffNumberDao.setCreation(vCustomsTariffNumberDto.creation());
        eCustomsTariffNumberDao.setModified(vCustomsTariffNumberDto.modified());
        eCustomsTariffNumberDao.setModifiedBy(vCustomsTariffNumberDto.modifiedBy());
        eCustomsTariffNumberDao.setOwner(vCustomsTariffNumberDto.owner());
        eCustomsTariffNumberDao.setIsDocStatus(vCustomsTariffNumberDto.isDocStatus());
        eCustomsTariffNumberDao.setIdx(vCustomsTariffNumberDto.idx());
        eCustomsTariffNumberDao.setTariffNumber(vCustomsTariffNumberDto.tariffNumber());
        eCustomsTariffNumberDao.setDescription(vCustomsTariffNumberDto.description());
        eCustomsTariffNumberDao.setUserTags(vCustomsTariffNumberDto.userTags());
        eCustomsTariffNumberDao.setComments(vCustomsTariffNumberDto.comments());
        eCustomsTariffNumberDao.setAssign(vCustomsTariffNumberDto.assign());
        eCustomsTariffNumberDao.setLikedBy(vCustomsTariffNumberDto.likedBy());
    }
}