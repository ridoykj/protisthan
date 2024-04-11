package com.itbd.application.db.dto.subscription;

import com.itbd.application.db.dao.subscription.SubscriptionDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record SubscriptionDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String partyType,
        String party,
        String company,
        String status,
        LocalDate startDate,
        LocalDate endDate,
        LocalDate cancelationDate,
        LocalDate trialPeriodStart,
        LocalDate trialPeriodEnd,
        Boolean followCalendarMonths,
        Boolean generateNewInvoicesPastDueDate,
        Boolean submitInvoice,
        LocalDate currentInvoiceStart,
        LocalDate currentInvoiceEnd,
        Integer daysUntilDue,
        String generateInvoiceAt,
        Integer numberOfDays,
        Boolean cancelAtPeriodEnd,
        String salesTaxTemplate,
        String purchaseTaxTemplate,
        String applyAdditionalDiscount,
        BigDecimal additionalDiscountPercentage,
        BigDecimal additionalDiscountAmount,
        String costCenter,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static SubscriptionDto fromEntity(SubscriptionDao eSubscriptionDao) {
        return new SubscriptionDto(
                eSubscriptionDao.getName(),
                eSubscriptionDao.getCreation(),
                eSubscriptionDao.getModified(),
                eSubscriptionDao.getModifiedBy(),
                eSubscriptionDao.getOwner(),
                eSubscriptionDao.getIsDocStatus(),
                eSubscriptionDao.getIdx(),
                eSubscriptionDao.getPartyType(),
                eSubscriptionDao.getParty(),
                eSubscriptionDao.getCompany(),
                eSubscriptionDao.getStatus(),
                eSubscriptionDao.getStartDate(),
                eSubscriptionDao.getEndDate(),
                eSubscriptionDao.getCancelationDate(),
                eSubscriptionDao.getTrialPeriodStart(),
                eSubscriptionDao.getTrialPeriodEnd(),
                eSubscriptionDao.getFollowCalendarMonths(),
                eSubscriptionDao.getGenerateNewInvoicesPastDueDate(),
                eSubscriptionDao.getSubmitInvoice(),
                eSubscriptionDao.getCurrentInvoiceStart(),
                eSubscriptionDao.getCurrentInvoiceEnd(),
                eSubscriptionDao.getDaysUntilDue(),
                eSubscriptionDao.getGenerateInvoiceAt(),
                eSubscriptionDao.getNumberOfDays(),
                eSubscriptionDao.getCancelAtPeriodEnd(),
                eSubscriptionDao.getSalesTaxTemplate(),
                eSubscriptionDao.getPurchaseTaxTemplate(),
                eSubscriptionDao.getApplyAdditionalDiscount(),
                eSubscriptionDao.getAdditionalDiscountPercentage(),
                eSubscriptionDao.getAdditionalDiscountAmount(),
                eSubscriptionDao.getCostCenter(),
                eSubscriptionDao.getUserTags(),
                eSubscriptionDao.getComments(),
                eSubscriptionDao.getAssign(),
                eSubscriptionDao.getLikedBy());
    }

    public static void fromDTO(SubscriptionDto vSubscriptionDto, SubscriptionDao eSubscriptionDao) {
        eSubscriptionDao.setName(vSubscriptionDto.name());
        eSubscriptionDao.setCreation(vSubscriptionDto.creation());
        eSubscriptionDao.setModified(vSubscriptionDto.modified());
        eSubscriptionDao.setModifiedBy(vSubscriptionDto.modifiedBy());
        eSubscriptionDao.setOwner(vSubscriptionDto.owner());
        eSubscriptionDao.setIsDocStatus(vSubscriptionDto.isDocStatus());
        eSubscriptionDao.setIdx(vSubscriptionDto.idx());
        eSubscriptionDao.setPartyType(vSubscriptionDto.partyType());
        eSubscriptionDao.setParty(vSubscriptionDto.party());
        eSubscriptionDao.setCompany(vSubscriptionDto.company());
        eSubscriptionDao.setStatus(vSubscriptionDto.status());
        eSubscriptionDao.setStartDate(vSubscriptionDto.startDate());
        eSubscriptionDao.setEndDate(vSubscriptionDto.endDate());
        eSubscriptionDao.setCancelationDate(vSubscriptionDto.cancelationDate());
        eSubscriptionDao.setTrialPeriodStart(vSubscriptionDto.trialPeriodStart());
        eSubscriptionDao.setTrialPeriodEnd(vSubscriptionDto.trialPeriodEnd());
        eSubscriptionDao.setFollowCalendarMonths(vSubscriptionDto.followCalendarMonths());
        eSubscriptionDao.setGenerateNewInvoicesPastDueDate(vSubscriptionDto.generateNewInvoicesPastDueDate());
        eSubscriptionDao.setSubmitInvoice(vSubscriptionDto.submitInvoice());
        eSubscriptionDao.setCurrentInvoiceStart(vSubscriptionDto.currentInvoiceStart());
        eSubscriptionDao.setCurrentInvoiceEnd(vSubscriptionDto.currentInvoiceEnd());
        eSubscriptionDao.setDaysUntilDue(vSubscriptionDto.daysUntilDue());
        eSubscriptionDao.setGenerateInvoiceAt(vSubscriptionDto.generateInvoiceAt());
        eSubscriptionDao.setNumberOfDays(vSubscriptionDto.numberOfDays());
        eSubscriptionDao.setCancelAtPeriodEnd(vSubscriptionDto.cancelAtPeriodEnd());
        eSubscriptionDao.setSalesTaxTemplate(vSubscriptionDto.salesTaxTemplate());
        eSubscriptionDao.setPurchaseTaxTemplate(vSubscriptionDto.purchaseTaxTemplate());
        eSubscriptionDao.setApplyAdditionalDiscount(vSubscriptionDto.applyAdditionalDiscount());
        eSubscriptionDao.setAdditionalDiscountPercentage(vSubscriptionDto.additionalDiscountPercentage());
        eSubscriptionDao.setAdditionalDiscountAmount(vSubscriptionDto.additionalDiscountAmount());
        eSubscriptionDao.setCostCenter(vSubscriptionDto.costCenter());
        eSubscriptionDao.setUserTags(vSubscriptionDto.userTags());
        eSubscriptionDao.setComments(vSubscriptionDto.comments());
        eSubscriptionDao.setAssign(vSubscriptionDto.assign());
        eSubscriptionDao.setLikedBy(vSubscriptionDto.likedBy());
    }
}