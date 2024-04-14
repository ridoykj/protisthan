package com.itbd.application.db.dto.campaign;

import com.itbd.application.db.dao.campaign.CampaignEmailScheduleDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record CampaignEmailScheduleDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String emailTemplate,
        Integer sendAfterDays,
        String parent,
        String parentField,
        String parentType
) {
    public static CampaignEmailScheduleDto fromEntity(CampaignEmailScheduleDao eCampaignEmailScheduleDao) {
        return new CampaignEmailScheduleDto(
                eCampaignEmailScheduleDao.getName(),
                eCampaignEmailScheduleDao.getCreation(),
                eCampaignEmailScheduleDao.getModified(),
                eCampaignEmailScheduleDao.getModifiedBy(),
                eCampaignEmailScheduleDao.getOwner(),
                eCampaignEmailScheduleDao.getIsDocStatus(),
                eCampaignEmailScheduleDao.getIdx(),
                eCampaignEmailScheduleDao.getEmailTemplate(),
                eCampaignEmailScheduleDao.getSendAfterDays(),
                eCampaignEmailScheduleDao.getParent(),
                eCampaignEmailScheduleDao.getParentField(),
                eCampaignEmailScheduleDao.getParentType());
    }

    public static void fromDTO(CampaignEmailScheduleDto vCampaignEmailScheduleDto, CampaignEmailScheduleDao eCampaignEmailScheduleDao) {
        eCampaignEmailScheduleDao.setName(vCampaignEmailScheduleDto.name());
        eCampaignEmailScheduleDao.setCreation(vCampaignEmailScheduleDto.creation());
        eCampaignEmailScheduleDao.setModified(vCampaignEmailScheduleDto.modified());
        eCampaignEmailScheduleDao.setModifiedBy(vCampaignEmailScheduleDto.modifiedBy());
        eCampaignEmailScheduleDao.setOwner(vCampaignEmailScheduleDto.owner());
        eCampaignEmailScheduleDao.setIsDocStatus(vCampaignEmailScheduleDto.isDocStatus());
        eCampaignEmailScheduleDao.setIdx(vCampaignEmailScheduleDto.idx());
        eCampaignEmailScheduleDao.setEmailTemplate(vCampaignEmailScheduleDto.emailTemplate());
        eCampaignEmailScheduleDao.setSendAfterDays(vCampaignEmailScheduleDto.sendAfterDays());
        eCampaignEmailScheduleDao.setParent(vCampaignEmailScheduleDto.parent());
        eCampaignEmailScheduleDao.setParentField(vCampaignEmailScheduleDto.parentField());
        eCampaignEmailScheduleDao.setParentType(vCampaignEmailScheduleDto.parentType());
    }
}