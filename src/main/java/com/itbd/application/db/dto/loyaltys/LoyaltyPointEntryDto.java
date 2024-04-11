package com.itbd.application.db.dto.loyaltys;

import com.itbd.application.db.dao.loyaltys.LoyaltyPointEntryDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record LoyaltyPointEntryDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String loyaltyProgram,
        String loyaltyProgramTier,
        String customer,
        String invoiceType,
        String invoice,
        String redeemAgainst,
        Integer loyaltyPoints,
        BigDecimal purchaseAmount,
        LocalDate expiryDate,
        LocalDate postingDate,
        String company,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static LoyaltyPointEntryDto fromEntity(LoyaltyPointEntryDao eLoyaltyPointEntryDao) {
        return new LoyaltyPointEntryDto(
                eLoyaltyPointEntryDao.getName(),
                eLoyaltyPointEntryDao.getCreation(),
                eLoyaltyPointEntryDao.getModified(),
                eLoyaltyPointEntryDao.getModifiedBy(),
                eLoyaltyPointEntryDao.getOwner(),
                eLoyaltyPointEntryDao.getIsDocStatus(),
                eLoyaltyPointEntryDao.getIdx(),
                eLoyaltyPointEntryDao.getLoyaltyProgram(),
                eLoyaltyPointEntryDao.getLoyaltyProgramTier(),
                eLoyaltyPointEntryDao.getCustomer(),
                eLoyaltyPointEntryDao.getInvoiceType(),
                eLoyaltyPointEntryDao.getInvoice(),
                eLoyaltyPointEntryDao.getRedeemAgainst(),
                eLoyaltyPointEntryDao.getLoyaltyPoints(),
                eLoyaltyPointEntryDao.getPurchaseAmount(),
                eLoyaltyPointEntryDao.getExpiryDate(),
                eLoyaltyPointEntryDao.getPostingDate(),
                eLoyaltyPointEntryDao.getCompany(),
                eLoyaltyPointEntryDao.getUserTags(),
                eLoyaltyPointEntryDao.getComments(),
                eLoyaltyPointEntryDao.getAssign(),
                eLoyaltyPointEntryDao.getLikedBy());
    }

    public static void fromDTO(LoyaltyPointEntryDto vLoyaltyPointEntryDto, LoyaltyPointEntryDao eLoyaltyPointEntryDao) {
        eLoyaltyPointEntryDao.setName(vLoyaltyPointEntryDto.name());
        eLoyaltyPointEntryDao.setCreation(vLoyaltyPointEntryDto.creation());
        eLoyaltyPointEntryDao.setModified(vLoyaltyPointEntryDto.modified());
        eLoyaltyPointEntryDao.setModifiedBy(vLoyaltyPointEntryDto.modifiedBy());
        eLoyaltyPointEntryDao.setOwner(vLoyaltyPointEntryDto.owner());
        eLoyaltyPointEntryDao.setIsDocStatus(vLoyaltyPointEntryDto.isDocStatus());
        eLoyaltyPointEntryDao.setIdx(vLoyaltyPointEntryDto.idx());
        eLoyaltyPointEntryDao.setLoyaltyProgram(vLoyaltyPointEntryDto.loyaltyProgram());
        eLoyaltyPointEntryDao.setLoyaltyProgramTier(vLoyaltyPointEntryDto.loyaltyProgramTier());
        eLoyaltyPointEntryDao.setCustomer(vLoyaltyPointEntryDto.customer());
        eLoyaltyPointEntryDao.setInvoiceType(vLoyaltyPointEntryDto.invoiceType());
        eLoyaltyPointEntryDao.setInvoice(vLoyaltyPointEntryDto.invoice());
        eLoyaltyPointEntryDao.setRedeemAgainst(vLoyaltyPointEntryDto.redeemAgainst());
        eLoyaltyPointEntryDao.setLoyaltyPoints(vLoyaltyPointEntryDto.loyaltyPoints());
        eLoyaltyPointEntryDao.setPurchaseAmount(vLoyaltyPointEntryDto.purchaseAmount());
        eLoyaltyPointEntryDao.setExpiryDate(vLoyaltyPointEntryDto.expiryDate());
        eLoyaltyPointEntryDao.setPostingDate(vLoyaltyPointEntryDto.postingDate());
        eLoyaltyPointEntryDao.setCompany(vLoyaltyPointEntryDto.company());
        eLoyaltyPointEntryDao.setUserTags(vLoyaltyPointEntryDto.userTags());
        eLoyaltyPointEntryDao.setComments(vLoyaltyPointEntryDto.comments());
        eLoyaltyPointEntryDao.setAssign(vLoyaltyPointEntryDto.assign());
        eLoyaltyPointEntryDao.setLikedBy(vLoyaltyPointEntryDto.likedBy());
    }
}