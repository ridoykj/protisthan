package com.itbd.application.db.dto;

import com.itbd.application.db.dao.accounts.process.ProcessStatementOfAccountsDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record ProcessStatementOfAccountsDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String report,
        LocalDate fromDate,
        LocalDate postingDate,
        String company,
        String account,
        String groupBy,
        String territory,
        Boolean ignoreExchangeRateRevaluationJournals,
        LocalDate toDate,
        String financeBook,
        String currency,
        String paymentTermsTemplate,
        String salesPartner,
        String salesPerson,
        Boolean basedOnPaymentTerms,
        String customerCollection,
        String collectionName,
        Boolean primaryMandatory,
        Boolean showNetValuesInPartyAccount,
        String orientation,
        Boolean includeBreak,
        Boolean includeAgeing,
        String ageingBasedOn,
        String letterHead,
        String termsAndConditions,
        Boolean enableAutoEmail,
        String sender,
        String frequency,
        Integer filterDuration,
        LocalDate startDate,
        String pdfName,
        String subject,
        String ccTo,
        String body,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ProcessStatementOfAccountsDto fromEntity(ProcessStatementOfAccountsDao eProcessStatementOfAccountsDao) {
        return new ProcessStatementOfAccountsDto(
                eProcessStatementOfAccountsDao.getName(),
                eProcessStatementOfAccountsDao.getCreation(),
                eProcessStatementOfAccountsDao.getModified(),
                eProcessStatementOfAccountsDao.getModifiedBy(),
                eProcessStatementOfAccountsDao.getOwner(),
                eProcessStatementOfAccountsDao.getIsDocStatus(),
                eProcessStatementOfAccountsDao.getIdx(),
                eProcessStatementOfAccountsDao.getReport(),
                eProcessStatementOfAccountsDao.getFromDate(),
                eProcessStatementOfAccountsDao.getPostingDate(),
                eProcessStatementOfAccountsDao.getCompany(),
                eProcessStatementOfAccountsDao.getAccount(),
                eProcessStatementOfAccountsDao.getGroupBy(),
                eProcessStatementOfAccountsDao.getTerritory(),
                eProcessStatementOfAccountsDao.getIgnoreExchangeRateRevaluationJournals(),
                eProcessStatementOfAccountsDao.getToDate(),
                eProcessStatementOfAccountsDao.getFinanceBook(),
                eProcessStatementOfAccountsDao.getCurrency(),
                eProcessStatementOfAccountsDao.getPaymentTermsTemplate(),
                eProcessStatementOfAccountsDao.getSalesPartner(),
                eProcessStatementOfAccountsDao.getSalesPerson(),
                eProcessStatementOfAccountsDao.getBasedOnPaymentTerms(),
                eProcessStatementOfAccountsDao.getCustomerCollection(),
                eProcessStatementOfAccountsDao.getCollectionName(),
                eProcessStatementOfAccountsDao.getPrimaryMandatory(),
                eProcessStatementOfAccountsDao.getShowNetValuesInPartyAccount(),
                eProcessStatementOfAccountsDao.getOrientation(),
                eProcessStatementOfAccountsDao.getIncludeBreak(),
                eProcessStatementOfAccountsDao.getIncludeAgeing(),
                eProcessStatementOfAccountsDao.getAgeingBasedOn(),
                eProcessStatementOfAccountsDao.getLetterHead(),
                eProcessStatementOfAccountsDao.getTermsAndConditions(),
                eProcessStatementOfAccountsDao.getEnableAutoEmail(),
                eProcessStatementOfAccountsDao.getSender(),
                eProcessStatementOfAccountsDao.getFrequency(),
                eProcessStatementOfAccountsDao.getFilterDuration(),
                eProcessStatementOfAccountsDao.getStartDate(),
                eProcessStatementOfAccountsDao.getPdfName(),
                eProcessStatementOfAccountsDao.getSubject(),
                eProcessStatementOfAccountsDao.getCcTo(),
                eProcessStatementOfAccountsDao.getBody(),
                eProcessStatementOfAccountsDao.getUserTags(),
                eProcessStatementOfAccountsDao.getComments(),
                eProcessStatementOfAccountsDao.getAssign(),
                eProcessStatementOfAccountsDao.getLikedBy());
    }

    public static void fromDTO(ProcessStatementOfAccountsDto vProcessStatementOfAccountsDto, ProcessStatementOfAccountsDao eProcessStatementOfAccountsDao) {
        eProcessStatementOfAccountsDao.setName(vProcessStatementOfAccountsDto.name());
        eProcessStatementOfAccountsDao.setCreation(vProcessStatementOfAccountsDto.creation());
        eProcessStatementOfAccountsDao.setModified(vProcessStatementOfAccountsDto.modified());
        eProcessStatementOfAccountsDao.setModifiedBy(vProcessStatementOfAccountsDto.modifiedBy());
        eProcessStatementOfAccountsDao.setOwner(vProcessStatementOfAccountsDto.owner());
        eProcessStatementOfAccountsDao.setIsDocStatus(vProcessStatementOfAccountsDto.isDocStatus());
        eProcessStatementOfAccountsDao.setIdx(vProcessStatementOfAccountsDto.idx());
        eProcessStatementOfAccountsDao.setReport(vProcessStatementOfAccountsDto.report());
        eProcessStatementOfAccountsDao.setFromDate(vProcessStatementOfAccountsDto.fromDate());
        eProcessStatementOfAccountsDao.setPostingDate(vProcessStatementOfAccountsDto.postingDate());
        eProcessStatementOfAccountsDao.setCompany(vProcessStatementOfAccountsDto.company());
        eProcessStatementOfAccountsDao.setAccount(vProcessStatementOfAccountsDto.account());
        eProcessStatementOfAccountsDao.setGroupBy(vProcessStatementOfAccountsDto.groupBy());
        eProcessStatementOfAccountsDao.setTerritory(vProcessStatementOfAccountsDto.territory());
        eProcessStatementOfAccountsDao.setIgnoreExchangeRateRevaluationJournals(vProcessStatementOfAccountsDto.ignoreExchangeRateRevaluationJournals());
        eProcessStatementOfAccountsDao.setToDate(vProcessStatementOfAccountsDto.toDate());
        eProcessStatementOfAccountsDao.setFinanceBook(vProcessStatementOfAccountsDto.financeBook());
        eProcessStatementOfAccountsDao.setCurrency(vProcessStatementOfAccountsDto.currency());
        eProcessStatementOfAccountsDao.setPaymentTermsTemplate(vProcessStatementOfAccountsDto.paymentTermsTemplate());
        eProcessStatementOfAccountsDao.setSalesPartner(vProcessStatementOfAccountsDto.salesPartner());
        eProcessStatementOfAccountsDao.setSalesPerson(vProcessStatementOfAccountsDto.salesPerson());
        eProcessStatementOfAccountsDao.setBasedOnPaymentTerms(vProcessStatementOfAccountsDto.basedOnPaymentTerms());
        eProcessStatementOfAccountsDao.setCustomerCollection(vProcessStatementOfAccountsDto.customerCollection());
        eProcessStatementOfAccountsDao.setCollectionName(vProcessStatementOfAccountsDto.collectionName());
        eProcessStatementOfAccountsDao.setPrimaryMandatory(vProcessStatementOfAccountsDto.primaryMandatory());
        eProcessStatementOfAccountsDao.setShowNetValuesInPartyAccount(vProcessStatementOfAccountsDto.showNetValuesInPartyAccount());
        eProcessStatementOfAccountsDao.setOrientation(vProcessStatementOfAccountsDto.orientation());
        eProcessStatementOfAccountsDao.setIncludeBreak(vProcessStatementOfAccountsDto.includeBreak());
        eProcessStatementOfAccountsDao.setIncludeAgeing(vProcessStatementOfAccountsDto.includeAgeing());
        eProcessStatementOfAccountsDao.setAgeingBasedOn(vProcessStatementOfAccountsDto.ageingBasedOn());
        eProcessStatementOfAccountsDao.setLetterHead(vProcessStatementOfAccountsDto.letterHead());
        eProcessStatementOfAccountsDao.setTermsAndConditions(vProcessStatementOfAccountsDto.termsAndConditions());
        eProcessStatementOfAccountsDao.setEnableAutoEmail(vProcessStatementOfAccountsDto.enableAutoEmail());
        eProcessStatementOfAccountsDao.setSender(vProcessStatementOfAccountsDto.sender());
        eProcessStatementOfAccountsDao.setFrequency(vProcessStatementOfAccountsDto.frequency());
        eProcessStatementOfAccountsDao.setFilterDuration(vProcessStatementOfAccountsDto.filterDuration());
        eProcessStatementOfAccountsDao.setStartDate(vProcessStatementOfAccountsDto.startDate());
        eProcessStatementOfAccountsDao.setPdfName(vProcessStatementOfAccountsDto.pdfName());
        eProcessStatementOfAccountsDao.setSubject(vProcessStatementOfAccountsDto.subject());
        eProcessStatementOfAccountsDao.setCcTo(vProcessStatementOfAccountsDto.ccTo());
        eProcessStatementOfAccountsDao.setBody(vProcessStatementOfAccountsDto.body());
        eProcessStatementOfAccountsDao.setUserTags(vProcessStatementOfAccountsDto.userTags());
        eProcessStatementOfAccountsDao.setComments(vProcessStatementOfAccountsDto.comments());
        eProcessStatementOfAccountsDao.setAssign(vProcessStatementOfAccountsDto.assign());
        eProcessStatementOfAccountsDao.setLikedBy(vProcessStatementOfAccountsDto.likedBy());
    }
}