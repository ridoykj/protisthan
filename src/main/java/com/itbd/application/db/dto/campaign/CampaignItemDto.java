package com.itbd.application.db.dto.campaign;

import com.itbd.application.db.dao.campaign.CampaignItemDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record CampaignItemDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String campaign,
        String parent,
        String parentField,
        String parentType
) {
    public static CampaignItemDto fromEntity(CampaignItemDao eCampaignItemDao) {
        return new CampaignItemDto(
                eCampaignItemDao.getName(),
                eCampaignItemDao.getCreation(),
                eCampaignItemDao.getModified(),
                eCampaignItemDao.getModifiedBy(),
                eCampaignItemDao.getOwner(),
                eCampaignItemDao.getIsDocStatus(),
                eCampaignItemDao.getIdx(),
                eCampaignItemDao.getCampaign(),
                eCampaignItemDao.getParent(),
                eCampaignItemDao.getParentField(),
                eCampaignItemDao.getParentType());
    }

    public static void fromDTO(CampaignItemDto vCampaignItemDto, CampaignItemDao eCampaignItemDao) {
        eCampaignItemDao.setName(vCampaignItemDto.name());
        eCampaignItemDao.setCreation(vCampaignItemDto.creation());
        eCampaignItemDao.setModified(vCampaignItemDto.modified());
        eCampaignItemDao.setModifiedBy(vCampaignItemDto.modifiedBy());
        eCampaignItemDao.setOwner(vCampaignItemDto.owner());
        eCampaignItemDao.setIsDocStatus(vCampaignItemDto.isDocStatus());
        eCampaignItemDao.setIdx(vCampaignItemDto.idx());
        eCampaignItemDao.setCampaign(vCampaignItemDto.campaign());
        eCampaignItemDao.setParent(vCampaignItemDto.parent());
        eCampaignItemDao.setParentField(vCampaignItemDto.parentField());
        eCampaignItemDao.setParentType(vCampaignItemDto.parentType());
    }
}