package com.itbd.application.db.dto.opportunity;

import com.itbd.application.db.dao.opportunity.OpportunityTypeDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record OpportunityTypeDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String description,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static OpportunityTypeDto fromEntity(OpportunityTypeDao eOpportunityTypeDao) {
        return new OpportunityTypeDto(
                eOpportunityTypeDao.getName(),
                eOpportunityTypeDao.getCreation(),
                eOpportunityTypeDao.getModified(),
                eOpportunityTypeDao.getModifiedBy(),
                eOpportunityTypeDao.getOwner(),
                eOpportunityTypeDao.getIsDocStatus(),
                eOpportunityTypeDao.getIdx(),
                eOpportunityTypeDao.getDescription(),
                eOpportunityTypeDao.getUserTags(),
                eOpportunityTypeDao.getComments(),
                eOpportunityTypeDao.getAssign(),
                eOpportunityTypeDao.getLikedBy());
    }

    public static void fromDTO(OpportunityTypeDto vOpportunityTypeDto, OpportunityTypeDao eOpportunityTypeDao) {
        eOpportunityTypeDao.setName(vOpportunityTypeDto.name());
        eOpportunityTypeDao.setCreation(vOpportunityTypeDto.creation());
        eOpportunityTypeDao.setModified(vOpportunityTypeDto.modified());
        eOpportunityTypeDao.setModifiedBy(vOpportunityTypeDto.modifiedBy());
        eOpportunityTypeDao.setOwner(vOpportunityTypeDto.owner());
        eOpportunityTypeDao.setIsDocStatus(vOpportunityTypeDto.isDocStatus());
        eOpportunityTypeDao.setIdx(vOpportunityTypeDto.idx());
        eOpportunityTypeDao.setDescription(vOpportunityTypeDto.description());
        eOpportunityTypeDao.setUserTags(vOpportunityTypeDto.userTags());
        eOpportunityTypeDao.setComments(vOpportunityTypeDto.comments());
        eOpportunityTypeDao.setAssign(vOpportunityTypeDto.assign());
        eOpportunityTypeDao.setLikedBy(vOpportunityTypeDto.likedBy());
    }
}