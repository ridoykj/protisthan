package com.itbd.application.db.dto.opportunity;

import com.itbd.application.db.dao.opportunity.OpportunityLostReasonDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record OpportunityLostReasonDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String lostReason,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static OpportunityLostReasonDto fromEntity(OpportunityLostReasonDao eOpportunityLostReasonDao) {
        return new OpportunityLostReasonDto(
                eOpportunityLostReasonDao.getName(),
                eOpportunityLostReasonDao.getCreation(),
                eOpportunityLostReasonDao.getModified(),
                eOpportunityLostReasonDao.getModifiedBy(),
                eOpportunityLostReasonDao.getOwner(),
                eOpportunityLostReasonDao.getIsDocStatus(),
                eOpportunityLostReasonDao.getIdx(),
                eOpportunityLostReasonDao.getLostReason(),
                eOpportunityLostReasonDao.getUserTags(),
                eOpportunityLostReasonDao.getComments(),
                eOpportunityLostReasonDao.getAssign(),
                eOpportunityLostReasonDao.getLikedBy());
    }

    public static void fromDTO(OpportunityLostReasonDto vOpportunityLostReasonDto, OpportunityLostReasonDao eOpportunityLostReasonDao) {
        eOpportunityLostReasonDao.setName(vOpportunityLostReasonDto.name());
        eOpportunityLostReasonDao.setCreation(vOpportunityLostReasonDto.creation());
        eOpportunityLostReasonDao.setModified(vOpportunityLostReasonDto.modified());
        eOpportunityLostReasonDao.setModifiedBy(vOpportunityLostReasonDto.modifiedBy());
        eOpportunityLostReasonDao.setOwner(vOpportunityLostReasonDto.owner());
        eOpportunityLostReasonDao.setIsDocStatus(vOpportunityLostReasonDto.isDocStatus());
        eOpportunityLostReasonDao.setIdx(vOpportunityLostReasonDto.idx());
        eOpportunityLostReasonDao.setLostReason(vOpportunityLostReasonDto.lostReason());
        eOpportunityLostReasonDao.setUserTags(vOpportunityLostReasonDto.userTags());
        eOpportunityLostReasonDao.setComments(vOpportunityLostReasonDto.comments());
        eOpportunityLostReasonDao.setAssign(vOpportunityLostReasonDto.assign());
        eOpportunityLostReasonDao.setLikedBy(vOpportunityLostReasonDto.likedBy());
    }
}