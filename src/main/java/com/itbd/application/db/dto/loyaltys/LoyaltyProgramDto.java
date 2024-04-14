package com.itbd.application.db.dto.loyaltys;

import com.itbd.application.db.dao.loyaltys.LoyaltyProgramDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record LoyaltyProgramDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String loyaltyProgramName,
        String loyaltyProgramType,
        LocalDate fromDate,
        LocalDate toDate,
        String customerGroup,
        String customerTerritory,
        Boolean autoOptIn,
        BigDecimal conversionFactor,
        Integer expiryDuration,
        String expenseAccount,
        String company,
        String costCenter,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static LoyaltyProgramDto fromEntity(LoyaltyProgramDao eLoyaltyProgramDao) {
        return new LoyaltyProgramDto(
                eLoyaltyProgramDao.getName(),
                eLoyaltyProgramDao.getCreation(),
                eLoyaltyProgramDao.getModified(),
                eLoyaltyProgramDao.getModifiedBy(),
                eLoyaltyProgramDao.getOwner(),
                eLoyaltyProgramDao.getIsDocStatus(),
                eLoyaltyProgramDao.getIdx(),
                eLoyaltyProgramDao.getLoyaltyProgramName(),
                eLoyaltyProgramDao.getLoyaltyProgramType(),
                eLoyaltyProgramDao.getFromDate(),
                eLoyaltyProgramDao.getToDate(),
                eLoyaltyProgramDao.getCustomerGroup(),
                eLoyaltyProgramDao.getCustomerTerritory(),
                eLoyaltyProgramDao.getAutoOptIn(),
                eLoyaltyProgramDao.getConversionFactor(),
                eLoyaltyProgramDao.getExpiryDuration(),
                eLoyaltyProgramDao.getExpenseAccount(),
                eLoyaltyProgramDao.getCompany(),
                eLoyaltyProgramDao.getCostCenter(),
                eLoyaltyProgramDao.getUserTags(),
                eLoyaltyProgramDao.getComments(),
                eLoyaltyProgramDao.getAssign(),
                eLoyaltyProgramDao.getLikedBy());
    }

    public static void fromDTO(LoyaltyProgramDto vLoyaltyProgramDto, LoyaltyProgramDao eLoyaltyProgramDao) {
        eLoyaltyProgramDao.setName(vLoyaltyProgramDto.name());
        eLoyaltyProgramDao.setCreation(vLoyaltyProgramDto.creation());
        eLoyaltyProgramDao.setModified(vLoyaltyProgramDto.modified());
        eLoyaltyProgramDao.setModifiedBy(vLoyaltyProgramDto.modifiedBy());
        eLoyaltyProgramDao.setOwner(vLoyaltyProgramDto.owner());
        eLoyaltyProgramDao.setIsDocStatus(vLoyaltyProgramDto.isDocStatus());
        eLoyaltyProgramDao.setIdx(vLoyaltyProgramDto.idx());
        eLoyaltyProgramDao.setLoyaltyProgramName(vLoyaltyProgramDto.loyaltyProgramName());
        eLoyaltyProgramDao.setLoyaltyProgramType(vLoyaltyProgramDto.loyaltyProgramType());
        eLoyaltyProgramDao.setFromDate(vLoyaltyProgramDto.fromDate());
        eLoyaltyProgramDao.setToDate(vLoyaltyProgramDto.toDate());
        eLoyaltyProgramDao.setCustomerGroup(vLoyaltyProgramDto.customerGroup());
        eLoyaltyProgramDao.setCustomerTerritory(vLoyaltyProgramDto.customerTerritory());
        eLoyaltyProgramDao.setAutoOptIn(vLoyaltyProgramDto.autoOptIn());
        eLoyaltyProgramDao.setConversionFactor(vLoyaltyProgramDto.conversionFactor());
        eLoyaltyProgramDao.setExpiryDuration(vLoyaltyProgramDto.expiryDuration());
        eLoyaltyProgramDao.setExpenseAccount(vLoyaltyProgramDto.expenseAccount());
        eLoyaltyProgramDao.setCompany(vLoyaltyProgramDto.company());
        eLoyaltyProgramDao.setCostCenter(vLoyaltyProgramDto.costCenter());
        eLoyaltyProgramDao.setUserTags(vLoyaltyProgramDto.userTags());
        eLoyaltyProgramDao.setComments(vLoyaltyProgramDto.comments());
        eLoyaltyProgramDao.setAssign(vLoyaltyProgramDto.assign());
        eLoyaltyProgramDao.setLikedBy(vLoyaltyProgramDto.likedBy());
    }
}