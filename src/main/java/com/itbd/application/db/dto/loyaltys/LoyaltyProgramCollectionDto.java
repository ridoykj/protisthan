package com.itbd.application.db.dto.loyaltys;

import com.itbd.application.db.dao.accounts.loyalty.LoyaltyProgramCollectionDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record LoyaltyProgramCollectionDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String tierName,
        BigDecimal minSpent,
        BigDecimal collectionFactor,
        String parent,
        String parentField,
        String parentType
) {
    public static LoyaltyProgramCollectionDto fromEntity(LoyaltyProgramCollectionDao eLoyaltyProgramCollectionDao) {
        return new LoyaltyProgramCollectionDto(
                eLoyaltyProgramCollectionDao.getName(),
                eLoyaltyProgramCollectionDao.getCreation(),
                eLoyaltyProgramCollectionDao.getModified(),
                eLoyaltyProgramCollectionDao.getModifiedBy(),
                eLoyaltyProgramCollectionDao.getOwner(),
                eLoyaltyProgramCollectionDao.getIsDocStatus(),
                eLoyaltyProgramCollectionDao.getIdx(),
                eLoyaltyProgramCollectionDao.getTierName(),
                eLoyaltyProgramCollectionDao.getMinSpent(),
                eLoyaltyProgramCollectionDao.getCollectionFactor(),
                eLoyaltyProgramCollectionDao.getParent(),
                eLoyaltyProgramCollectionDao.getParentField(),
                eLoyaltyProgramCollectionDao.getParentType());
    }

    public static void fromDTO(LoyaltyProgramCollectionDto vLoyaltyProgramCollectionDto, LoyaltyProgramCollectionDao eLoyaltyProgramCollectionDao) {
        eLoyaltyProgramCollectionDao.setName(vLoyaltyProgramCollectionDto.name());
        eLoyaltyProgramCollectionDao.setCreation(vLoyaltyProgramCollectionDto.creation());
        eLoyaltyProgramCollectionDao.setModified(vLoyaltyProgramCollectionDto.modified());
        eLoyaltyProgramCollectionDao.setModifiedBy(vLoyaltyProgramCollectionDto.modifiedBy());
        eLoyaltyProgramCollectionDao.setOwner(vLoyaltyProgramCollectionDto.owner());
        eLoyaltyProgramCollectionDao.setIsDocStatus(vLoyaltyProgramCollectionDto.isDocStatus());
        eLoyaltyProgramCollectionDao.setIdx(vLoyaltyProgramCollectionDto.idx());
        eLoyaltyProgramCollectionDao.setTierName(vLoyaltyProgramCollectionDto.tierName());
        eLoyaltyProgramCollectionDao.setMinSpent(vLoyaltyProgramCollectionDto.minSpent());
        eLoyaltyProgramCollectionDao.setCollectionFactor(vLoyaltyProgramCollectionDto.collectionFactor());
        eLoyaltyProgramCollectionDao.setParent(vLoyaltyProgramCollectionDto.parent());
        eLoyaltyProgramCollectionDao.setParentField(vLoyaltyProgramCollectionDto.parentField());
        eLoyaltyProgramCollectionDao.setParentType(vLoyaltyProgramCollectionDto.parentType());
    }
}