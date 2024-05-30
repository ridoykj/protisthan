package com.itbd.application.db.dto;

import com.itbd.application.db.dao.crm.MarketSegmentDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record MarketSegmentDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String marketSegment,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static MarketSegmentDto fromEntity(MarketSegmentDao eMarketSegmentDao) {
        return new MarketSegmentDto(
                eMarketSegmentDao.getName(),
                eMarketSegmentDao.getCreation(),
                eMarketSegmentDao.getModified(),
                eMarketSegmentDao.getModifiedBy(),
                eMarketSegmentDao.getOwner(),
                eMarketSegmentDao.getIsDocStatus(),
                eMarketSegmentDao.getIdx(),
                eMarketSegmentDao.getMarketSegment(),
                eMarketSegmentDao.getUserTags(),
                eMarketSegmentDao.getComments(),
                eMarketSegmentDao.getAssign(),
                eMarketSegmentDao.getLikedBy());
    }

    public static void fromDTO(MarketSegmentDto vMarketSegmentDto, MarketSegmentDao eMarketSegmentDao) {
        eMarketSegmentDao.setName(vMarketSegmentDto.name());
        eMarketSegmentDao.setCreation(vMarketSegmentDto.creation());
        eMarketSegmentDao.setModified(vMarketSegmentDto.modified());
        eMarketSegmentDao.setModifiedBy(vMarketSegmentDto.modifiedBy());
        eMarketSegmentDao.setOwner(vMarketSegmentDto.owner());
        eMarketSegmentDao.setIsDocStatus(vMarketSegmentDto.isDocStatus());
        eMarketSegmentDao.setIdx(vMarketSegmentDto.idx());
        eMarketSegmentDao.setMarketSegment(vMarketSegmentDto.marketSegment());
        eMarketSegmentDao.setUserTags(vMarketSegmentDto.userTags());
        eMarketSegmentDao.setComments(vMarketSegmentDto.comments());
        eMarketSegmentDao.setAssign(vMarketSegmentDto.assign());
        eMarketSegmentDao.setLikedBy(vMarketSegmentDto.likedBy());
    }
}