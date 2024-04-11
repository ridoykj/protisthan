package com.itbd.application.db.dto.opportunity;

import com.itbd.application.db.dao.opportunity.OpportunityDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record OpportunityDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String namingSeries,
        String opportunityFrom,
        String partyName,
        String customerName,
        String status,
        String opportunityType,
        String source,
        String opportunityOwner,
        String salesStage,
        LocalDate expectedClosing,
        BigDecimal probability,
        String noOfEmployees,
        BigDecimal annualRevenue,
        String customerGroup,
        String industry,
        String marketSegment,
        String website,
        String city,
        String state,
        String country,
        String territory,
        String currency,
        BigDecimal conversionRate,
        BigDecimal opportunityAmount,
        BigDecimal baseOpportunityAmount,
        String company,
        String campaign,
        LocalDate transactionDate,
        String language,
        String amendedFrom,
        String title,
        BigDecimal firstResponseTime,
        String orderLostReason,
        String contactPerson,
        String jobTitle,
        String contactEmail,
        String contactMobile,
        String whatsapp,
        String phone,
        String phoneExt,
        String customerAddress,
        String addressDisplay,
        String contactDisplay,
        BigDecimal baseTotal,
        BigDecimal total,
        String userTags,
        String comments,
        String assign,
        String likedBy,
        String seen
) {
    public static OpportunityDto fromEntity(OpportunityDao eOpportunityDao) {
        return new OpportunityDto(
                eOpportunityDao.getName(),
                eOpportunityDao.getCreation(),
                eOpportunityDao.getModified(),
                eOpportunityDao.getModifiedBy(),
                eOpportunityDao.getOwner(),
                eOpportunityDao.getIsDocStatus(),
                eOpportunityDao.getIdx(),
                eOpportunityDao.getNamingSeries(),
                eOpportunityDao.getOpportunityFrom(),
                eOpportunityDao.getPartyName(),
                eOpportunityDao.getCustomerName(),
                eOpportunityDao.getStatus(),
                eOpportunityDao.getOpportunityType(),
                eOpportunityDao.getSource(),
                eOpportunityDao.getOpportunityOwner(),
                eOpportunityDao.getSalesStage(),
                eOpportunityDao.getExpectedClosing(),
                eOpportunityDao.getProbability(),
                eOpportunityDao.getNoOfEmployees(),
                eOpportunityDao.getAnnualRevenue(),
                eOpportunityDao.getCustomerGroup(),
                eOpportunityDao.getIndustry(),
                eOpportunityDao.getMarketSegment(),
                eOpportunityDao.getWebsite(),
                eOpportunityDao.getCity(),
                eOpportunityDao.getState(),
                eOpportunityDao.getCountry(),
                eOpportunityDao.getTerritory(),
                eOpportunityDao.getCurrency(),
                eOpportunityDao.getConversionRate(),
                eOpportunityDao.getOpportunityAmount(),
                eOpportunityDao.getBaseOpportunityAmount(),
                eOpportunityDao.getCompany(),
                eOpportunityDao.getCampaign(),
                eOpportunityDao.getTransactionDate(),
                eOpportunityDao.getLanguage(),
                eOpportunityDao.getAmendedFrom(),
                eOpportunityDao.getTitle(),
                eOpportunityDao.getFirstResponseTime(),
                eOpportunityDao.getOrderLostReason(),
                eOpportunityDao.getContactPerson(),
                eOpportunityDao.getJobTitle(),
                eOpportunityDao.getContactEmail(),
                eOpportunityDao.getContactMobile(),
                eOpportunityDao.getWhatsapp(),
                eOpportunityDao.getPhone(),
                eOpportunityDao.getPhoneExt(),
                eOpportunityDao.getCustomerAddress(),
                eOpportunityDao.getAddressDisplay(),
                eOpportunityDao.getContactDisplay(),
                eOpportunityDao.getBaseTotal(),
                eOpportunityDao.getTotal(),
                eOpportunityDao.getUserTags(),
                eOpportunityDao.getComments(),
                eOpportunityDao.getAssign(),
                eOpportunityDao.getLikedBy(),
                eOpportunityDao.getSeen());
    }

    public static void fromDTO(OpportunityDto vOpportunityDto, OpportunityDao eOpportunityDao) {
        eOpportunityDao.setName(vOpportunityDto.name());
        eOpportunityDao.setCreation(vOpportunityDto.creation());
        eOpportunityDao.setModified(vOpportunityDto.modified());
        eOpportunityDao.setModifiedBy(vOpportunityDto.modifiedBy());
        eOpportunityDao.setOwner(vOpportunityDto.owner());
        eOpportunityDao.setIsDocStatus(vOpportunityDto.isDocStatus());
        eOpportunityDao.setIdx(vOpportunityDto.idx());
        eOpportunityDao.setNamingSeries(vOpportunityDto.namingSeries());
        eOpportunityDao.setOpportunityFrom(vOpportunityDto.opportunityFrom());
        eOpportunityDao.setPartyName(vOpportunityDto.partyName());
        eOpportunityDao.setCustomerName(vOpportunityDto.customerName());
        eOpportunityDao.setStatus(vOpportunityDto.status());
        eOpportunityDao.setOpportunityType(vOpportunityDto.opportunityType());
        eOpportunityDao.setSource(vOpportunityDto.source());
        eOpportunityDao.setOpportunityOwner(vOpportunityDto.opportunityOwner());
        eOpportunityDao.setSalesStage(vOpportunityDto.salesStage());
        eOpportunityDao.setExpectedClosing(vOpportunityDto.expectedClosing());
        eOpportunityDao.setProbability(vOpportunityDto.probability());
        eOpportunityDao.setNoOfEmployees(vOpportunityDto.noOfEmployees());
        eOpportunityDao.setAnnualRevenue(vOpportunityDto.annualRevenue());
        eOpportunityDao.setCustomerGroup(vOpportunityDto.customerGroup());
        eOpportunityDao.setIndustry(vOpportunityDto.industry());
        eOpportunityDao.setMarketSegment(vOpportunityDto.marketSegment());
        eOpportunityDao.setWebsite(vOpportunityDto.website());
        eOpportunityDao.setCity(vOpportunityDto.city());
        eOpportunityDao.setState(vOpportunityDto.state());
        eOpportunityDao.setCountry(vOpportunityDto.country());
        eOpportunityDao.setTerritory(vOpportunityDto.territory());
        eOpportunityDao.setCurrency(vOpportunityDto.currency());
        eOpportunityDao.setConversionRate(vOpportunityDto.conversionRate());
        eOpportunityDao.setOpportunityAmount(vOpportunityDto.opportunityAmount());
        eOpportunityDao.setBaseOpportunityAmount(vOpportunityDto.baseOpportunityAmount());
        eOpportunityDao.setCompany(vOpportunityDto.company());
        eOpportunityDao.setCampaign(vOpportunityDto.campaign());
        eOpportunityDao.setTransactionDate(vOpportunityDto.transactionDate());
        eOpportunityDao.setLanguage(vOpportunityDto.language());
        eOpportunityDao.setAmendedFrom(vOpportunityDto.amendedFrom());
        eOpportunityDao.setTitle(vOpportunityDto.title());
        eOpportunityDao.setFirstResponseTime(vOpportunityDto.firstResponseTime());
        eOpportunityDao.setOrderLostReason(vOpportunityDto.orderLostReason());
        eOpportunityDao.setContactPerson(vOpportunityDto.contactPerson());
        eOpportunityDao.setJobTitle(vOpportunityDto.jobTitle());
        eOpportunityDao.setContactEmail(vOpportunityDto.contactEmail());
        eOpportunityDao.setContactMobile(vOpportunityDto.contactMobile());
        eOpportunityDao.setWhatsapp(vOpportunityDto.whatsapp());
        eOpportunityDao.setPhone(vOpportunityDto.phone());
        eOpportunityDao.setPhoneExt(vOpportunityDto.phoneExt());
        eOpportunityDao.setCustomerAddress(vOpportunityDto.customerAddress());
        eOpportunityDao.setAddressDisplay(vOpportunityDto.addressDisplay());
        eOpportunityDao.setContactDisplay(vOpportunityDto.contactDisplay());
        eOpportunityDao.setBaseTotal(vOpportunityDto.baseTotal());
        eOpportunityDao.setTotal(vOpportunityDto.total());
        eOpportunityDao.setUserTags(vOpportunityDto.userTags());
        eOpportunityDao.setComments(vOpportunityDto.comments());
        eOpportunityDao.setAssign(vOpportunityDto.assign());
        eOpportunityDao.setLikedBy(vOpportunityDto.likedBy());
        eOpportunityDao.setSeen(vOpportunityDto.seen());
    }
}