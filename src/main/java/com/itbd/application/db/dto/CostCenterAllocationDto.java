package com.itbd.application.db.dto;

import com.itbd.application.db.dao.accounts.CostCenterAllocationDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record CostCenterAllocationDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String mainCostCenter,
        String company,
        LocalDate validFrom,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static CostCenterAllocationDto fromEntity(CostCenterAllocationDao eCostCenterAllocationDao) {
        return new CostCenterAllocationDto(
                eCostCenterAllocationDao.getName(),
                eCostCenterAllocationDao.getCreation(),
                eCostCenterAllocationDao.getModified(),
                eCostCenterAllocationDao.getModifiedBy(),
                eCostCenterAllocationDao.getOwner(),
                eCostCenterAllocationDao.getIsDocStatus(),
                eCostCenterAllocationDao.getIdx(),
                eCostCenterAllocationDao.getMainCostCenter(),
                eCostCenterAllocationDao.getCompany(),
                eCostCenterAllocationDao.getValidFrom(),
                eCostCenterAllocationDao.getAmendedFrom(),
                eCostCenterAllocationDao.getUserTags(),
                eCostCenterAllocationDao.getComments(),
                eCostCenterAllocationDao.getAssign(),
                eCostCenterAllocationDao.getLikedBy());
    }

    public static void fromDTO(CostCenterAllocationDto vCostCenterAllocationDto, CostCenterAllocationDao eCostCenterAllocationDao) {
        eCostCenterAllocationDao.setName(vCostCenterAllocationDto.name());
        eCostCenterAllocationDao.setCreation(vCostCenterAllocationDto.creation());
        eCostCenterAllocationDao.setModified(vCostCenterAllocationDto.modified());
        eCostCenterAllocationDao.setModifiedBy(vCostCenterAllocationDto.modifiedBy());
        eCostCenterAllocationDao.setOwner(vCostCenterAllocationDto.owner());
        eCostCenterAllocationDao.setIsDocStatus(vCostCenterAllocationDto.isDocStatus());
        eCostCenterAllocationDao.setIdx(vCostCenterAllocationDto.idx());
        eCostCenterAllocationDao.setMainCostCenter(vCostCenterAllocationDto.mainCostCenter());
        eCostCenterAllocationDao.setCompany(vCostCenterAllocationDto.company());
        eCostCenterAllocationDao.setValidFrom(vCostCenterAllocationDto.validFrom());
        eCostCenterAllocationDao.setAmendedFrom(vCostCenterAllocationDto.amendedFrom());
        eCostCenterAllocationDao.setUserTags(vCostCenterAllocationDto.userTags());
        eCostCenterAllocationDao.setComments(vCostCenterAllocationDto.comments());
        eCostCenterAllocationDao.setAssign(vCostCenterAllocationDto.assign());
        eCostCenterAllocationDao.setLikedBy(vCostCenterAllocationDto.likedBy());
    }
}