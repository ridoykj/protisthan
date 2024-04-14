package com.itbd.application.db.dto;

import com.itbd.application.db.dao.CostCenterDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record CostCenterDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String costCenterName,
        String costCenterNumber,
        String parentCostCenter,
        String company,
        Boolean isGroup,
        Boolean disabled,
        Integer lft,
        Integer rgt,
        String oldParent,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static CostCenterDto fromEntity(CostCenterDao eCostCenterDao) {
        return new CostCenterDto(
                eCostCenterDao.getName(),
                eCostCenterDao.getCreation(),
                eCostCenterDao.getModified(),
                eCostCenterDao.getModifiedBy(),
                eCostCenterDao.getOwner(),
                eCostCenterDao.getIsDocStatus(),
                eCostCenterDao.getIdx(),
                eCostCenterDao.getCostCenterName(),
                eCostCenterDao.getCostCenterNumber(),
                eCostCenterDao.getParentCostCenter(),
                eCostCenterDao.getCompany(),
                eCostCenterDao.getIsGroup(),
                eCostCenterDao.getDisabled(),
                eCostCenterDao.getLft(),
                eCostCenterDao.getRgt(),
                eCostCenterDao.getOldParent(),
                eCostCenterDao.getUserTags(),
                eCostCenterDao.getComments(),
                eCostCenterDao.getAssign(),
                eCostCenterDao.getLikedBy());
    }

    public static void fromDTO(CostCenterDto vCostCenterDto, CostCenterDao eCostCenterDao) {
        eCostCenterDao.setName(vCostCenterDto.name());
        eCostCenterDao.setCreation(vCostCenterDto.creation());
        eCostCenterDao.setModified(vCostCenterDto.modified());
        eCostCenterDao.setModifiedBy(vCostCenterDto.modifiedBy());
        eCostCenterDao.setOwner(vCostCenterDto.owner());
        eCostCenterDao.setIsDocStatus(vCostCenterDto.isDocStatus());
        eCostCenterDao.setIdx(vCostCenterDto.idx());
        eCostCenterDao.setCostCenterName(vCostCenterDto.costCenterName());
        eCostCenterDao.setCostCenterNumber(vCostCenterDto.costCenterNumber());
        eCostCenterDao.setParentCostCenter(vCostCenterDto.parentCostCenter());
        eCostCenterDao.setCompany(vCostCenterDto.company());
        eCostCenterDao.setIsGroup(vCostCenterDto.isGroup());
        eCostCenterDao.setDisabled(vCostCenterDto.disabled());
        eCostCenterDao.setLft(vCostCenterDto.lft());
        eCostCenterDao.setRgt(vCostCenterDto.rgt());
        eCostCenterDao.setOldParent(vCostCenterDto.oldParent());
        eCostCenterDao.setUserTags(vCostCenterDto.userTags());
        eCostCenterDao.setComments(vCostCenterDto.comments());
        eCostCenterDao.setAssign(vCostCenterDto.assign());
        eCostCenterDao.setLikedBy(vCostCenterDto.likedBy());
    }
}