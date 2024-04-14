package com.itbd.application.db.dto;

import com.itbd.application.db.dao.FinanceBookDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record FinanceBookDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String financeBookName,
        String userTags,
        String comments,
        String assign,
        String likedBy,
        String seen
) {
    public static FinanceBookDto fromEntity(FinanceBookDao eFinanceBookDao) {
        return new FinanceBookDto(
                eFinanceBookDao.getName(),
                eFinanceBookDao.getCreation(),
                eFinanceBookDao.getModified(),
                eFinanceBookDao.getModifiedBy(),
                eFinanceBookDao.getOwner(),
                eFinanceBookDao.getIsDocStatus(),
                eFinanceBookDao.getIdx(),
                eFinanceBookDao.getFinanceBookName(),
                eFinanceBookDao.getUserTags(),
                eFinanceBookDao.getComments(),
                eFinanceBookDao.getAssign(),
                eFinanceBookDao.getLikedBy(),
                eFinanceBookDao.getSeen());
    }

    public static void fromDTO(FinanceBookDto vFinanceBookDto, FinanceBookDao eFinanceBookDao) {
        eFinanceBookDao.setName(vFinanceBookDto.name());
        eFinanceBookDao.setCreation(vFinanceBookDto.creation());
        eFinanceBookDao.setModified(vFinanceBookDto.modified());
        eFinanceBookDao.setModifiedBy(vFinanceBookDto.modifiedBy());
        eFinanceBookDao.setOwner(vFinanceBookDto.owner());
        eFinanceBookDao.setIsDocStatus(vFinanceBookDto.isDocStatus());
        eFinanceBookDao.setIdx(vFinanceBookDto.idx());
        eFinanceBookDao.setFinanceBookName(vFinanceBookDto.financeBookName());
        eFinanceBookDao.setUserTags(vFinanceBookDto.userTags());
        eFinanceBookDao.setComments(vFinanceBookDto.comments());
        eFinanceBookDao.setAssign(vFinanceBookDto.assign());
        eFinanceBookDao.setLikedBy(vFinanceBookDto.likedBy());
        eFinanceBookDao.setSeen(vFinanceBookDto.seen());
    }
}