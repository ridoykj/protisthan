package com.itbd.application.db.dto.emails;

import com.itbd.application.db.dao.crm.EmailCampaignDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record EmailCampaignDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String campaignName,
        String emailCampaignFor,
        String recipient,
        String sender,
        LocalDate startDate,
        LocalDate endDate,
        String status,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static EmailCampaignDto fromEntity(EmailCampaignDao eEmailCampaignDao) {
        return new EmailCampaignDto(
                eEmailCampaignDao.getName(),
                eEmailCampaignDao.getCreation(),
                eEmailCampaignDao.getModified(),
                eEmailCampaignDao.getModifiedBy(),
                eEmailCampaignDao.getOwner(),
                eEmailCampaignDao.getIsDocStatus(),
                eEmailCampaignDao.getIdx(),
                eEmailCampaignDao.getCampaignName(),
                eEmailCampaignDao.getEmailCampaignFor(),
                eEmailCampaignDao.getRecipient(),
                eEmailCampaignDao.getSender(),
                eEmailCampaignDao.getStartDate(),
                eEmailCampaignDao.getEndDate(),
                eEmailCampaignDao.getStatus(),
                eEmailCampaignDao.getUserTags(),
                eEmailCampaignDao.getComments(),
                eEmailCampaignDao.getAssign(),
                eEmailCampaignDao.getLikedBy());
    }

    public static void fromDTO(EmailCampaignDto vEmailCampaignDto, EmailCampaignDao eEmailCampaignDao) {
        eEmailCampaignDao.setName(vEmailCampaignDto.name());
        eEmailCampaignDao.setCreation(vEmailCampaignDto.creation());
        eEmailCampaignDao.setModified(vEmailCampaignDto.modified());
        eEmailCampaignDao.setModifiedBy(vEmailCampaignDto.modifiedBy());
        eEmailCampaignDao.setOwner(vEmailCampaignDto.owner());
        eEmailCampaignDao.setIsDocStatus(vEmailCampaignDto.isDocStatus());
        eEmailCampaignDao.setIdx(vEmailCampaignDto.idx());
        eEmailCampaignDao.setCampaignName(vEmailCampaignDto.campaignName());
        eEmailCampaignDao.setEmailCampaignFor(vEmailCampaignDto.emailCampaignFor());
        eEmailCampaignDao.setRecipient(vEmailCampaignDto.recipient());
        eEmailCampaignDao.setSender(vEmailCampaignDto.sender());
        eEmailCampaignDao.setStartDate(vEmailCampaignDto.startDate());
        eEmailCampaignDao.setEndDate(vEmailCampaignDto.endDate());
        eEmailCampaignDao.setStatus(vEmailCampaignDto.status());
        eEmailCampaignDao.setUserTags(vEmailCampaignDto.userTags());
        eEmailCampaignDao.setComments(vEmailCampaignDto.comments());
        eEmailCampaignDao.setAssign(vEmailCampaignDto.assign());
        eEmailCampaignDao.setLikedBy(vEmailCampaignDto.likedBy());
    }
}