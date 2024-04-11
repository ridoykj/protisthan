package com.itbd.application.db.dto.loyaltys;

import com.itbd.application.db.dao.loyaltys.LoyaltyPointEntryRedemptionDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record LoyaltyPointEntryRedemptionDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String salesInvoice,
        LocalDate redemptionDate,
        Integer redeemedPoints,
        String parent,
        String parentField,
        String parentType
) {
    public static LoyaltyPointEntryRedemptionDto fromEntity(LoyaltyPointEntryRedemptionDao eLoyaltyPointEntryRedemptionDao) {
        return new LoyaltyPointEntryRedemptionDto(
                eLoyaltyPointEntryRedemptionDao.getName(),
                eLoyaltyPointEntryRedemptionDao.getCreation(),
                eLoyaltyPointEntryRedemptionDao.getModified(),
                eLoyaltyPointEntryRedemptionDao.getModifiedBy(),
                eLoyaltyPointEntryRedemptionDao.getOwner(),
                eLoyaltyPointEntryRedemptionDao.getIsDocStatus(),
                eLoyaltyPointEntryRedemptionDao.getIdx(),
                eLoyaltyPointEntryRedemptionDao.getSalesInvoice(),
                eLoyaltyPointEntryRedemptionDao.getRedemptionDate(),
                eLoyaltyPointEntryRedemptionDao.getRedeemedPoints(),
                eLoyaltyPointEntryRedemptionDao.getParent(),
                eLoyaltyPointEntryRedemptionDao.getParentField(),
                eLoyaltyPointEntryRedemptionDao.getParentType());
    }

    public static void fromDTO(LoyaltyPointEntryRedemptionDto vLoyaltyPointEntryRedemptionDto, LoyaltyPointEntryRedemptionDao eLoyaltyPointEntryRedemptionDao) {
        eLoyaltyPointEntryRedemptionDao.setName(vLoyaltyPointEntryRedemptionDto.name());
        eLoyaltyPointEntryRedemptionDao.setCreation(vLoyaltyPointEntryRedemptionDto.creation());
        eLoyaltyPointEntryRedemptionDao.setModified(vLoyaltyPointEntryRedemptionDto.modified());
        eLoyaltyPointEntryRedemptionDao.setModifiedBy(vLoyaltyPointEntryRedemptionDto.modifiedBy());
        eLoyaltyPointEntryRedemptionDao.setOwner(vLoyaltyPointEntryRedemptionDto.owner());
        eLoyaltyPointEntryRedemptionDao.setIsDocStatus(vLoyaltyPointEntryRedemptionDto.isDocStatus());
        eLoyaltyPointEntryRedemptionDao.setIdx(vLoyaltyPointEntryRedemptionDto.idx());
        eLoyaltyPointEntryRedemptionDao.setSalesInvoice(vLoyaltyPointEntryRedemptionDto.salesInvoice());
        eLoyaltyPointEntryRedemptionDao.setRedemptionDate(vLoyaltyPointEntryRedemptionDto.redemptionDate());
        eLoyaltyPointEntryRedemptionDao.setRedeemedPoints(vLoyaltyPointEntryRedemptionDto.redeemedPoints());
        eLoyaltyPointEntryRedemptionDao.setParent(vLoyaltyPointEntryRedemptionDto.parent());
        eLoyaltyPointEntryRedemptionDao.setParentField(vLoyaltyPointEntryRedemptionDto.parentField());
        eLoyaltyPointEntryRedemptionDao.setParentType(vLoyaltyPointEntryRedemptionDto.parentType());
    }
}