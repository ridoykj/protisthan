package com.itbd.application.db.dto;

import com.itbd.application.db.dao.crm.LeadDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record LeadDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String namingSeries,
        String salutation,
        String firstName,
        String middleName,
        String lastName,
        String leadName,
        String jobTitle,
        String gender,
        String source,
        String leadOwner,
        String status,
        String customer,
        String type,
        String requestType,
        String emailId,
        String website,
        String mobileNo,
        String whatsappNo,
        String phone,
        String phoneExt,
        String companyName,
        String noOfEmployees,
        BigDecimal annualRevenue,
        String industry,
        String marketSegment,
        String territory,
        String fax,
        String city,
        String state,
        String country,
        String qualificationStatus,
        String qualifiedBy,
        LocalDate qualifiedOn,
        String campaignName,
        String company,
        String language,
        String image,
        String title,
        Boolean disabled,
        Boolean unsubscribed,
        Boolean blogSubscriber,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static LeadDto fromEntity(LeadDao eLeadDao) {
        return new LeadDto(
                eLeadDao.getName(),
                eLeadDao.getCreation(),
                eLeadDao.getModified(),
                eLeadDao.getModifiedBy(),
                eLeadDao.getOwner(),
                eLeadDao.getIsDocStatus(),
                eLeadDao.getIdx(),
                eLeadDao.getNamingSeries(),
                eLeadDao.getSalutation(),
                eLeadDao.getFirstName(),
                eLeadDao.getMiddleName(),
                eLeadDao.getLastName(),
                eLeadDao.getLeadName(),
                eLeadDao.getJobTitle(),
                eLeadDao.getGender(),
                eLeadDao.getSource(),
                eLeadDao.getLeadOwner(),
                eLeadDao.getStatus(),
                eLeadDao.getCustomer(),
                eLeadDao.getType(),
                eLeadDao.getRequestType(),
                eLeadDao.getEmailId(),
                eLeadDao.getWebsite(),
                eLeadDao.getMobileNo(),
                eLeadDao.getWhatsappNo(),
                eLeadDao.getPhone(),
                eLeadDao.getPhoneExt(),
                eLeadDao.getCompanyName(),
                eLeadDao.getNoOfEmployees(),
                eLeadDao.getAnnualRevenue(),
                eLeadDao.getIndustry(),
                eLeadDao.getMarketSegment(),
                eLeadDao.getTerritory(),
                eLeadDao.getFax(),
                eLeadDao.getCity(),
                eLeadDao.getState(),
                eLeadDao.getCountry(),
                eLeadDao.getQualificationStatus(),
                eLeadDao.getQualifiedBy(),
                eLeadDao.getQualifiedOn(),
                eLeadDao.getCampaignName(),
                eLeadDao.getCompany(),
                eLeadDao.getLanguage(),
                eLeadDao.getImage(),
                eLeadDao.getTitle(),
                eLeadDao.getDisabled(),
                eLeadDao.getUnsubscribed(),
                eLeadDao.getBlogSubscriber(),
                eLeadDao.getUserTags(),
                eLeadDao.getComments(),
                eLeadDao.getAssign(),
                eLeadDao.getLikedBy());
    }

    public static void fromDTO(LeadDto vLeadDto, LeadDao eLeadDao) {
        eLeadDao.setName(vLeadDto.name());
        eLeadDao.setCreation(vLeadDto.creation());
        eLeadDao.setModified(vLeadDto.modified());
        eLeadDao.setModifiedBy(vLeadDto.modifiedBy());
        eLeadDao.setOwner(vLeadDto.owner());
        eLeadDao.setIsDocStatus(vLeadDto.isDocStatus());
        eLeadDao.setIdx(vLeadDto.idx());
        eLeadDao.setNamingSeries(vLeadDto.namingSeries());
        eLeadDao.setSalutation(vLeadDto.salutation());
        eLeadDao.setFirstName(vLeadDto.firstName());
        eLeadDao.setMiddleName(vLeadDto.middleName());
        eLeadDao.setLastName(vLeadDto.lastName());
        eLeadDao.setLeadName(vLeadDto.leadName());
        eLeadDao.setJobTitle(vLeadDto.jobTitle());
        eLeadDao.setGender(vLeadDto.gender());
        eLeadDao.setSource(vLeadDto.source());
        eLeadDao.setLeadOwner(vLeadDto.leadOwner());
        eLeadDao.setStatus(vLeadDto.status());
        eLeadDao.setCustomer(vLeadDto.customer());
        eLeadDao.setType(vLeadDto.type());
        eLeadDao.setRequestType(vLeadDto.requestType());
        eLeadDao.setEmailId(vLeadDto.emailId());
        eLeadDao.setWebsite(vLeadDto.website());
        eLeadDao.setMobileNo(vLeadDto.mobileNo());
        eLeadDao.setWhatsappNo(vLeadDto.whatsappNo());
        eLeadDao.setPhone(vLeadDto.phone());
        eLeadDao.setPhoneExt(vLeadDto.phoneExt());
        eLeadDao.setCompanyName(vLeadDto.companyName());
        eLeadDao.setNoOfEmployees(vLeadDto.noOfEmployees());
        eLeadDao.setAnnualRevenue(vLeadDto.annualRevenue());
        eLeadDao.setIndustry(vLeadDto.industry());
        eLeadDao.setMarketSegment(vLeadDto.marketSegment());
        eLeadDao.setTerritory(vLeadDto.territory());
        eLeadDao.setFax(vLeadDto.fax());
        eLeadDao.setCity(vLeadDto.city());
        eLeadDao.setState(vLeadDto.state());
        eLeadDao.setCountry(vLeadDto.country());
        eLeadDao.setQualificationStatus(vLeadDto.qualificationStatus());
        eLeadDao.setQualifiedBy(vLeadDto.qualifiedBy());
        eLeadDao.setQualifiedOn(vLeadDto.qualifiedOn());
        eLeadDao.setCampaignName(vLeadDto.campaignName());
        eLeadDao.setCompany(vLeadDto.company());
        eLeadDao.setLanguage(vLeadDto.language());
        eLeadDao.setImage(vLeadDto.image());
        eLeadDao.setTitle(vLeadDto.title());
        eLeadDao.setDisabled(vLeadDto.disabled());
        eLeadDao.setUnsubscribed(vLeadDto.unsubscribed());
        eLeadDao.setBlogSubscriber(vLeadDto.blogSubscriber());
        eLeadDao.setUserTags(vLeadDto.userTags());
        eLeadDao.setComments(vLeadDto.comments());
        eLeadDao.setAssign(vLeadDto.assign());
        eLeadDao.setLikedBy(vLeadDto.likedBy());
    }
}