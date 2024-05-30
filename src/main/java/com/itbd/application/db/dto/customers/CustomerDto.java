package com.itbd.application.db.dto.customers;

import com.itbd.application.db.dao.selling.CustomerDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record CustomerDto(
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
        String customerName,
        String customerType,
        String customerGroup,
        String territory,
        String gender,
        String leadName,
        String opportunityName,
        String accountManager,
        String image,
        String defaultCurrency,
        String defaultBankAccount,
        String defaultPriceList,
        Boolean isInternalCustomer,
        String representsCompany,
        String marketSegment,
        String industry,
        String customerPosId,
        String website,
        String language,
        String customerDetails,
        String customerPrimaryAddress,
        String primaryAddress,
        String customerPrimaryContact,
        String mobileNo,
        String emailId,
        String taxId,
        String taxCategory,
        String taxWithholdingCategory,
        String paymentTerms,
        String loyaltyProgram,
        String loyaltyProgramTier,
        String defaultSalesPartner,
        BigDecimal defaultCommissionRate,
        Boolean soRequired,
        Boolean dnRequired,
        Boolean isFrozen,
        Boolean disabled,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static CustomerDto fromEntity(CustomerDao eCustomerDao) {
        return new CustomerDto(
                eCustomerDao.getName(),
                eCustomerDao.getCreation(),
                eCustomerDao.getModified(),
                eCustomerDao.getModifiedBy(),
                eCustomerDao.getOwner(),
                eCustomerDao.getIsDocStatus(),
                eCustomerDao.getIdx(),
                eCustomerDao.getNamingSeries(),
                eCustomerDao.getSalutation(),
                eCustomerDao.getCustomerName(),
                eCustomerDao.getCustomerType(),
                eCustomerDao.getCustomerGroup(),
                eCustomerDao.getTerritory(),
                eCustomerDao.getGender(),
                eCustomerDao.getLeadName(),
                eCustomerDao.getOpportunityName(),
                eCustomerDao.getAccountManager(),
                eCustomerDao.getImage(),
                eCustomerDao.getDefaultCurrency(),
                eCustomerDao.getDefaultBankAccount(),
                eCustomerDao.getDefaultPriceList(),
                eCustomerDao.getIsInternalCustomer(),
                eCustomerDao.getRepresentsCompany(),
                eCustomerDao.getMarketSegment(),
                eCustomerDao.getIndustry(),
                eCustomerDao.getCustomerPosId(),
                eCustomerDao.getWebsite(),
                eCustomerDao.getLanguage(),
                eCustomerDao.getCustomerDetails(),
                eCustomerDao.getCustomerPrimaryAddress(),
                eCustomerDao.getPrimaryAddress(),
                eCustomerDao.getCustomerPrimaryContact(),
                eCustomerDao.getMobileNo(),
                eCustomerDao.getEmailId(),
                eCustomerDao.getTaxId(),
                eCustomerDao.getTaxCategory(),
                eCustomerDao.getTaxWithholdingCategory(),
                eCustomerDao.getPaymentTerms(),
                eCustomerDao.getLoyaltyProgram(),
                eCustomerDao.getLoyaltyProgramTier(),
                eCustomerDao.getDefaultSalesPartner(),
                eCustomerDao.getDefaultCommissionRate(),
                eCustomerDao.getSoRequired(),
                eCustomerDao.getDnRequired(),
                eCustomerDao.getIsFrozen(),
                eCustomerDao.getDisabled(),
                eCustomerDao.getUserTags(),
                eCustomerDao.getComments(),
                eCustomerDao.getAssign(),
                eCustomerDao.getLikedBy());
    }

    public static void fromDTO(CustomerDto vCustomerDto, CustomerDao eCustomerDao) {
        eCustomerDao.setName(vCustomerDto.name() != null ? vCustomerDto.name() : vCustomerDto.customerName().toLowerCase().replaceAll("\\s","_"));
        eCustomerDao.setCreation(vCustomerDto.creation());
        eCustomerDao.setModified(vCustomerDto.modified());
        eCustomerDao.setModifiedBy(vCustomerDto.modifiedBy());
        eCustomerDao.setOwner(vCustomerDto.owner());
        eCustomerDao.setIsDocStatus(vCustomerDto.isDocStatus());
        eCustomerDao.setIdx(vCustomerDto.idx());
        eCustomerDao.setNamingSeries(vCustomerDto.namingSeries());
        eCustomerDao.setSalutation(vCustomerDto.salutation());
        eCustomerDao.setCustomerName(vCustomerDto.customerName());
        eCustomerDao.setCustomerType(vCustomerDto.customerType());
        eCustomerDao.setCustomerGroup(vCustomerDto.customerGroup());
        eCustomerDao.setTerritory(vCustomerDto.territory());
        eCustomerDao.setGender(vCustomerDto.gender());
        eCustomerDao.setLeadName(vCustomerDto.leadName());
        eCustomerDao.setOpportunityName(vCustomerDto.opportunityName());
        eCustomerDao.setAccountManager(vCustomerDto.accountManager());
        eCustomerDao.setImage(vCustomerDto.image());
        eCustomerDao.setDefaultCurrency(vCustomerDto.defaultCurrency());
        eCustomerDao.setDefaultBankAccount(vCustomerDto.defaultBankAccount());
        eCustomerDao.setDefaultPriceList(vCustomerDto.defaultPriceList());
        eCustomerDao.setIsInternalCustomer(vCustomerDto.isInternalCustomer());
        eCustomerDao.setRepresentsCompany(vCustomerDto.representsCompany());
        eCustomerDao.setMarketSegment(vCustomerDto.marketSegment());
        eCustomerDao.setIndustry(vCustomerDto.industry());
        eCustomerDao.setCustomerPosId(vCustomerDto.customerPosId());
        eCustomerDao.setWebsite(vCustomerDto.website());
        eCustomerDao.setLanguage(vCustomerDto.language());
        eCustomerDao.setCustomerDetails(vCustomerDto.customerDetails());
        eCustomerDao.setCustomerPrimaryAddress(vCustomerDto.customerPrimaryAddress());
        eCustomerDao.setPrimaryAddress(vCustomerDto.primaryAddress());
        eCustomerDao.setCustomerPrimaryContact(vCustomerDto.customerPrimaryContact());
        eCustomerDao.setMobileNo(vCustomerDto.mobileNo());
        eCustomerDao.setEmailId(vCustomerDto.emailId());
        eCustomerDao.setTaxId(vCustomerDto.taxId());
        eCustomerDao.setTaxCategory(vCustomerDto.taxCategory());
        eCustomerDao.setTaxWithholdingCategory(vCustomerDto.taxWithholdingCategory());
        eCustomerDao.setPaymentTerms(vCustomerDto.paymentTerms());
        eCustomerDao.setLoyaltyProgram(vCustomerDto.loyaltyProgram());
        eCustomerDao.setLoyaltyProgramTier(vCustomerDto.loyaltyProgramTier());
        eCustomerDao.setDefaultSalesPartner(vCustomerDto.defaultSalesPartner());
        eCustomerDao.setDefaultCommissionRate(vCustomerDto.defaultCommissionRate());
        eCustomerDao.setSoRequired(vCustomerDto.soRequired());
        eCustomerDao.setDnRequired(vCustomerDto.dnRequired());
        eCustomerDao.setIsFrozen(vCustomerDto.isFrozen());
        eCustomerDao.setDisabled(vCustomerDto.disabled());
        eCustomerDao.setUserTags(vCustomerDto.userTags());
        eCustomerDao.setComments(vCustomerDto.comments());
        eCustomerDao.setAssign(vCustomerDto.assign());
        eCustomerDao.setLikedBy(vCustomerDto.likedBy());
    }
}