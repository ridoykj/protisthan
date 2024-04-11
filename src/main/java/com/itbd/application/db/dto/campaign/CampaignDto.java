package com.itbd.application.db.dto.campaign;

import com.itbd.application.db.dao.campaign.CampaignDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record CampaignDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String campaignName,
        String namingSeries,
        String description,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static CampaignDto fromEntity(CampaignDao eCampaignDao) {
        return new CampaignDto(
                eCampaignDao.getName(),
                eCampaignDao.getCreation(),
                eCampaignDao.getModified(),
                eCampaignDao.getModifiedBy(),
                eCampaignDao.getOwner(),
                eCampaignDao.getIsDocStatus(),
                eCampaignDao.getIdx(),
                eCampaignDao.getCampaignName(),
                eCampaignDao.getNamingSeries(),
                eCampaignDao.getDescription(),
                eCampaignDao.getUserTags(),
                eCampaignDao.getComments(),
                eCampaignDao.getAssign(),
                eCampaignDao.getLikedBy());
    }

    public static void fromDTO(CampaignDto vCampaignDto, CampaignDao eCampaignDao) {
        eCampaignDao.setName(vCampaignDto.name());
        eCampaignDao.setCreation(vCampaignDto.creation());
        eCampaignDao.setModified(vCampaignDto.modified());
        eCampaignDao.setModifiedBy(vCampaignDto.modifiedBy());
        eCampaignDao.setOwner(vCampaignDto.owner());
        eCampaignDao.setIsDocStatus(vCampaignDto.isDocStatus());
        eCampaignDao.setIdx(vCampaignDto.idx());
        eCampaignDao.setCampaignName(vCampaignDto.campaignName());
        eCampaignDao.setNamingSeries(vCampaignDto.namingSeries());
        eCampaignDao.setDescription(vCampaignDto.description());
        eCampaignDao.setUserTags(vCampaignDto.userTags());
        eCampaignDao.setComments(vCampaignDto.comments());
        eCampaignDao.setAssign(vCampaignDto.assign());
        eCampaignDao.setLikedBy(vCampaignDto.likedBy());
    }
}