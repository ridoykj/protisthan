package com.itbd.application.db.dto;

import com.itbd.application.db.dao.DunningDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public record DunningDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String namingSeries,
        String customer,
        String customerName,
        String company,
        LocalDate postingDate,
        LocalTime postingTime,
        String status,
        String currency,
        BigDecimal conversionRate,
        String customerAddress,
        String addressDisplay,
        String contactPerson,
        String contactDisplay,
        String companyAddress,
        String companyAddressDisplay,
        String contactMobile,
        String contactEmail,
        String dunningType,
        BigDecimal rateOfInterest,
        BigDecimal totalInterest,
        BigDecimal dunningFee,
        BigDecimal dunningAmount,
        BigDecimal baseDunningAmount,
        String spacer,
        BigDecimal totalOutstanding,
        BigDecimal grandTotal,
        String language,
        String bodyText,
        String letterHead,
        String closingText,
        String incomeAccount,
        String costCenter,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static DunningDto fromEntity(DunningDao eDunningDao) {
        return new DunningDto(
                eDunningDao.getName(),
                eDunningDao.getCreation(),
                eDunningDao.getModified(),
                eDunningDao.getModifiedBy(),
                eDunningDao.getOwner(),
                eDunningDao.getIsDocStatus(),
                eDunningDao.getIdx(),
                eDunningDao.getNamingSeries(),
                eDunningDao.getCustomer(),
                eDunningDao.getCustomerName(),
                eDunningDao.getCompany(),
                eDunningDao.getPostingDate(),
                eDunningDao.getPostingTime(),
                eDunningDao.getStatus(),
                eDunningDao.getCurrency(),
                eDunningDao.getConversionRate(),
                eDunningDao.getCustomerAddress(),
                eDunningDao.getAddressDisplay(),
                eDunningDao.getContactPerson(),
                eDunningDao.getContactDisplay(),
                eDunningDao.getCompanyAddress(),
                eDunningDao.getCompanyAddressDisplay(),
                eDunningDao.getContactMobile(),
                eDunningDao.getContactEmail(),
                eDunningDao.getDunningType(),
                eDunningDao.getRateOfInterest(),
                eDunningDao.getTotalInterest(),
                eDunningDao.getDunningFee(),
                eDunningDao.getDunningAmount(),
                eDunningDao.getBaseDunningAmount(),
                eDunningDao.getSpacer(),
                eDunningDao.getTotalOutstanding(),
                eDunningDao.getGrandTotal(),
                eDunningDao.getLanguage(),
                eDunningDao.getBodyText(),
                eDunningDao.getLetterHead(),
                eDunningDao.getClosingText(),
                eDunningDao.getIncomeAccount(),
                eDunningDao.getCostCenter(),
                eDunningDao.getAmendedFrom(),
                eDunningDao.getUserTags(),
                eDunningDao.getComments(),
                eDunningDao.getAssign(),
                eDunningDao.getLikedBy());
    }

    public static void fromDTO(DunningDto vDunningDto, DunningDao eDunningDao) {
        eDunningDao.setName(vDunningDto.name());
        eDunningDao.setCreation(vDunningDto.creation());
        eDunningDao.setModified(vDunningDto.modified());
        eDunningDao.setModifiedBy(vDunningDto.modifiedBy());
        eDunningDao.setOwner(vDunningDto.owner());
        eDunningDao.setIsDocStatus(vDunningDto.isDocStatus());
        eDunningDao.setIdx(vDunningDto.idx());
        eDunningDao.setNamingSeries(vDunningDto.namingSeries());
        eDunningDao.setCustomer(vDunningDto.customer());
        eDunningDao.setCustomerName(vDunningDto.customerName());
        eDunningDao.setCompany(vDunningDto.company());
        eDunningDao.setPostingDate(vDunningDto.postingDate());
        eDunningDao.setPostingTime(vDunningDto.postingTime());
        eDunningDao.setStatus(vDunningDto.status());
        eDunningDao.setCurrency(vDunningDto.currency());
        eDunningDao.setConversionRate(vDunningDto.conversionRate());
        eDunningDao.setCustomerAddress(vDunningDto.customerAddress());
        eDunningDao.setAddressDisplay(vDunningDto.addressDisplay());
        eDunningDao.setContactPerson(vDunningDto.contactPerson());
        eDunningDao.setContactDisplay(vDunningDto.contactDisplay());
        eDunningDao.setCompanyAddress(vDunningDto.companyAddress());
        eDunningDao.setCompanyAddressDisplay(vDunningDto.companyAddressDisplay());
        eDunningDao.setContactMobile(vDunningDto.contactMobile());
        eDunningDao.setContactEmail(vDunningDto.contactEmail());
        eDunningDao.setDunningType(vDunningDto.dunningType());
        eDunningDao.setRateOfInterest(vDunningDto.rateOfInterest());
        eDunningDao.setTotalInterest(vDunningDto.totalInterest());
        eDunningDao.setDunningFee(vDunningDto.dunningFee());
        eDunningDao.setDunningAmount(vDunningDto.dunningAmount());
        eDunningDao.setBaseDunningAmount(vDunningDto.baseDunningAmount());
        eDunningDao.setSpacer(vDunningDto.spacer());
        eDunningDao.setTotalOutstanding(vDunningDto.totalOutstanding());
        eDunningDao.setGrandTotal(vDunningDto.grandTotal());
        eDunningDao.setLanguage(vDunningDto.language());
        eDunningDao.setBodyText(vDunningDto.bodyText());
        eDunningDao.setLetterHead(vDunningDto.letterHead());
        eDunningDao.setClosingText(vDunningDto.closingText());
        eDunningDao.setIncomeAccount(vDunningDto.incomeAccount());
        eDunningDao.setCostCenter(vDunningDto.costCenter());
        eDunningDao.setAmendedFrom(vDunningDto.amendedFrom());
        eDunningDao.setUserTags(vDunningDto.userTags());
        eDunningDao.setComments(vDunningDto.comments());
        eDunningDao.setAssign(vDunningDto.assign());
        eDunningDao.setLikedBy(vDunningDto.likedBy());
    }
}