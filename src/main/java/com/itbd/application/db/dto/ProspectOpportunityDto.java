package com.itbd.application.db.dto;

import com.itbd.application.db.dao.ProspectOpportunityDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record ProspectOpportunityDto(
        @Id
        Long name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String opportunity,
        BigDecimal amount,
        String stage,
        String dealOwner,
        BigDecimal probability,
        LocalDate expectedClosing,
        String currency,
        String contactPerson,
        String parent,
        String parentField,
        String parentType
) {
    public static ProspectOpportunityDto fromEntity(ProspectOpportunityDao eProspectOpportunityDao) {
        return new ProspectOpportunityDto(
                eProspectOpportunityDao.getName(),
                eProspectOpportunityDao.getCreation(),
                eProspectOpportunityDao.getModified(),
                eProspectOpportunityDao.getModifiedBy(),
                eProspectOpportunityDao.getOwner(),
                eProspectOpportunityDao.getIsDocStatus(),
                eProspectOpportunityDao.getIdx(),
                eProspectOpportunityDao.getOpportunity(),
                eProspectOpportunityDao.getAmount(),
                eProspectOpportunityDao.getStage(),
                eProspectOpportunityDao.getDealOwner(),
                eProspectOpportunityDao.getProbability(),
                eProspectOpportunityDao.getExpectedClosing(),
                eProspectOpportunityDao.getCurrency(),
                eProspectOpportunityDao.getContactPerson(),
                eProspectOpportunityDao.getParent(),
                eProspectOpportunityDao.getParentField(),
                eProspectOpportunityDao.getParentType());
    }

    public static void fromDTO(ProspectOpportunityDto vProspectOpportunityDto, ProspectOpportunityDao eProspectOpportunityDao) {
        eProspectOpportunityDao.setName(vProspectOpportunityDto.name());
        eProspectOpportunityDao.setCreation(vProspectOpportunityDto.creation());
        eProspectOpportunityDao.setModified(vProspectOpportunityDto.modified());
        eProspectOpportunityDao.setModifiedBy(vProspectOpportunityDto.modifiedBy());
        eProspectOpportunityDao.setOwner(vProspectOpportunityDto.owner());
        eProspectOpportunityDao.setIsDocStatus(vProspectOpportunityDto.isDocStatus());
        eProspectOpportunityDao.setIdx(vProspectOpportunityDto.idx());
        eProspectOpportunityDao.setOpportunity(vProspectOpportunityDto.opportunity());
        eProspectOpportunityDao.setAmount(vProspectOpportunityDto.amount());
        eProspectOpportunityDao.setStage(vProspectOpportunityDto.stage());
        eProspectOpportunityDao.setDealOwner(vProspectOpportunityDto.dealOwner());
        eProspectOpportunityDao.setProbability(vProspectOpportunityDto.probability());
        eProspectOpportunityDao.setExpectedClosing(vProspectOpportunityDto.expectedClosing());
        eProspectOpportunityDao.setCurrency(vProspectOpportunityDto.currency());
        eProspectOpportunityDao.setContactPerson(vProspectOpportunityDto.contactPerson());
        eProspectOpportunityDao.setParent(vProspectOpportunityDto.parent());
        eProspectOpportunityDao.setParentField(vProspectOpportunityDto.parentField());
        eProspectOpportunityDao.setParentType(vProspectOpportunityDto.parentType());
    }
}