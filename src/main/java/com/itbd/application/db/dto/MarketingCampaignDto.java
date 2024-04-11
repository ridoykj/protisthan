package com.itbd.application.db.dto;

import com.itbd.application.db.dao.MarketingCampaignDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record MarketingCampaignDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String campaignDescription,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static MarketingCampaignDto fromEntity(MarketingCampaignDao eMarketingCampaignDao) {
        return new MarketingCampaignDto(
                eMarketingCampaignDao.getName(),
                eMarketingCampaignDao.getCreation(),
                eMarketingCampaignDao.getModified(),
                eMarketingCampaignDao.getModifiedBy(),
                eMarketingCampaignDao.getOwner(),
                eMarketingCampaignDao.getIsDocStatus(),
                eMarketingCampaignDao.getIdx(),
                eMarketingCampaignDao.getCampaignDescription(),
                eMarketingCampaignDao.getUserTags(),
                eMarketingCampaignDao.getComments(),
                eMarketingCampaignDao.getAssign(),
                eMarketingCampaignDao.getLikedBy());
    }

    public static void fromDTO(MarketingCampaignDto vMarketingCampaignDto, MarketingCampaignDao eMarketingCampaignDao) {
        eMarketingCampaignDao.setName(vMarketingCampaignDto.name());
        eMarketingCampaignDao.setCreation(vMarketingCampaignDto.creation());
        eMarketingCampaignDao.setModified(vMarketingCampaignDto.modified());
        eMarketingCampaignDao.setModifiedBy(vMarketingCampaignDto.modifiedBy());
        eMarketingCampaignDao.setOwner(vMarketingCampaignDto.owner());
        eMarketingCampaignDao.setIsDocStatus(vMarketingCampaignDto.isDocStatus());
        eMarketingCampaignDao.setIdx(vMarketingCampaignDto.idx());
        eMarketingCampaignDao.setCampaignDescription(vMarketingCampaignDto.campaignDescription());
        eMarketingCampaignDao.setUserTags(vMarketingCampaignDto.userTags());
        eMarketingCampaignDao.setComments(vMarketingCampaignDto.comments());
        eMarketingCampaignDao.setAssign(vMarketingCampaignDto.assign());
        eMarketingCampaignDao.setLikedBy(vMarketingCampaignDto.likedBy());
    }
}