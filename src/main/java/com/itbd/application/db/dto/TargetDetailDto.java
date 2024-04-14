package com.itbd.application.db.dto;

import com.itbd.application.db.dao.TargetDetailDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record TargetDetailDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String itemGroup,
        String fiscalYear,
        BigDecimal targetQty,
        BigDecimal targetAmount,
        String distributionId,
        String parent,
        String parentField,
        String parentType
) {
    public static TargetDetailDto fromEntity(TargetDetailDao eTargetDetailDao) {
        return new TargetDetailDto(
                eTargetDetailDao.getName(),
                eTargetDetailDao.getCreation(),
                eTargetDetailDao.getModified(),
                eTargetDetailDao.getModifiedBy(),
                eTargetDetailDao.getOwner(),
                eTargetDetailDao.getIsDocStatus(),
                eTargetDetailDao.getIdx(),
                eTargetDetailDao.getItemGroup(),
                eTargetDetailDao.getFiscalYear(),
                eTargetDetailDao.getTargetQty(),
                eTargetDetailDao.getTargetAmount(),
                eTargetDetailDao.getDistributionId(),
                eTargetDetailDao.getParent(),
                eTargetDetailDao.getParentField(),
                eTargetDetailDao.getParentType());
    }

    public static void fromDTO(TargetDetailDto vTargetDetailDto, TargetDetailDao eTargetDetailDao) {
        eTargetDetailDao.setName(vTargetDetailDto.name());
        eTargetDetailDao.setCreation(vTargetDetailDto.creation());
        eTargetDetailDao.setModified(vTargetDetailDto.modified());
        eTargetDetailDao.setModifiedBy(vTargetDetailDto.modifiedBy());
        eTargetDetailDao.setOwner(vTargetDetailDto.owner());
        eTargetDetailDao.setIsDocStatus(vTargetDetailDto.isDocStatus());
        eTargetDetailDao.setIdx(vTargetDetailDto.idx());
        eTargetDetailDao.setItemGroup(vTargetDetailDto.itemGroup());
        eTargetDetailDao.setFiscalYear(vTargetDetailDto.fiscalYear());
        eTargetDetailDao.setTargetQty(vTargetDetailDto.targetQty());
        eTargetDetailDao.setTargetAmount(vTargetDetailDto.targetAmount());
        eTargetDetailDao.setDistributionId(vTargetDetailDto.distributionId());
        eTargetDetailDao.setParent(vTargetDetailDto.parent());
        eTargetDetailDao.setParentField(vTargetDetailDto.parentField());
        eTargetDetailDao.setParentType(vTargetDetailDto.parentType());
    }
}