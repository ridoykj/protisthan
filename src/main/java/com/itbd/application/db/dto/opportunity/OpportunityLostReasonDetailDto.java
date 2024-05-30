package com.itbd.application.db.dto.opportunity;

import com.itbd.application.db.dao.crm.opportunity.OpportunityLostReasonDetailDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record OpportunityLostReasonDetailDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String lostReason,
        String parent,
        String parentField,
        String parentType
) {
    public static OpportunityLostReasonDetailDto fromEntity(OpportunityLostReasonDetailDao eOpportunityLostReasonDetailDao) {
        return new OpportunityLostReasonDetailDto(
                eOpportunityLostReasonDetailDao.getName(),
                eOpportunityLostReasonDetailDao.getCreation(),
                eOpportunityLostReasonDetailDao.getModified(),
                eOpportunityLostReasonDetailDao.getModifiedBy(),
                eOpportunityLostReasonDetailDao.getOwner(),
                eOpportunityLostReasonDetailDao.getIsDocStatus(),
                eOpportunityLostReasonDetailDao.getIdx(),
                eOpportunityLostReasonDetailDao.getLostReason(),
                eOpportunityLostReasonDetailDao.getParent(),
                eOpportunityLostReasonDetailDao.getParentField(),
                eOpportunityLostReasonDetailDao.getParentType());
    }

    public static void fromDTO(OpportunityLostReasonDetailDto vOpportunityLostReasonDetailDto, OpportunityLostReasonDetailDao eOpportunityLostReasonDetailDao) {
        eOpportunityLostReasonDetailDao.setName(vOpportunityLostReasonDetailDto.name());
        eOpportunityLostReasonDetailDao.setCreation(vOpportunityLostReasonDetailDto.creation());
        eOpportunityLostReasonDetailDao.setModified(vOpportunityLostReasonDetailDto.modified());
        eOpportunityLostReasonDetailDao.setModifiedBy(vOpportunityLostReasonDetailDto.modifiedBy());
        eOpportunityLostReasonDetailDao.setOwner(vOpportunityLostReasonDetailDto.owner());
        eOpportunityLostReasonDetailDao.setIsDocStatus(vOpportunityLostReasonDetailDto.isDocStatus());
        eOpportunityLostReasonDetailDao.setIdx(vOpportunityLostReasonDetailDto.idx());
        eOpportunityLostReasonDetailDao.setLostReason(vOpportunityLostReasonDetailDto.lostReason());
        eOpportunityLostReasonDetailDao.setParent(vOpportunityLostReasonDetailDto.parent());
        eOpportunityLostReasonDetailDao.setParentField(vOpportunityLostReasonDetailDto.parentField());
        eOpportunityLostReasonDetailDao.setParentType(vOpportunityLostReasonDetailDto.parentType());
    }
}