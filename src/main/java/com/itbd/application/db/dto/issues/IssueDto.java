package com.itbd.application.db.dto.issues;

import com.itbd.application.db.dao.issues.IssueDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public record IssueDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String namingSeries,
        String subject,
        String customer,
        String raisedBy,
        String status,
        String priority,
        String issueType,
        String issueSplitFrom,
        String description,
        String serviceLevelAgreement,
        LocalDateTime responseBy,
        String agreementStatus,
        LocalDateTime resolutionBy,
        LocalDateTime serviceLevelAgreementCreation,
        LocalDateTime onHoldSince,
        BigDecimal totalHoldTime,
        BigDecimal firstResponseTime,
        LocalDateTime firstRespondedOn,
        BigDecimal avgResponseTime,
        String resolutionDetails,
        LocalDate openingDate,
        LocalTime openingTime,
        LocalDateTime resolutionDate,
        BigDecimal resolutionTime,
        BigDecimal userResolutionTime,
        String lead,
        String contact,
        String emailAccount,
        String customerName,
        String project,
        String company,
        Boolean viaCustomerPortal,
        String attachment,
        String contentType,
        String userTags,
        String comments,
        String assign,
        String likedBy,
        String seen
) {
    public static IssueDto fromEntity(IssueDao eIssueDao) {
        return new IssueDto(
                eIssueDao.getName(),
                eIssueDao.getCreation(),
                eIssueDao.getModified(),
                eIssueDao.getModifiedBy(),
                eIssueDao.getOwner(),
                eIssueDao.getIsDocStatus(),
                eIssueDao.getIdx(),
                eIssueDao.getNamingSeries(),
                eIssueDao.getSubject(),
                eIssueDao.getCustomer(),
                eIssueDao.getRaisedBy(),
                eIssueDao.getStatus(),
                eIssueDao.getPriority(),
                eIssueDao.getIssueType(),
                eIssueDao.getIssueSplitFrom(),
                eIssueDao.getDescription(),
                eIssueDao.getServiceLevelAgreement(),
                eIssueDao.getResponseBy(),
                eIssueDao.getAgreementStatus(),
                eIssueDao.getResolutionBy(),
                eIssueDao.getServiceLevelAgreementCreation(),
                eIssueDao.getOnHoldSince(),
                eIssueDao.getTotalHoldTime(),
                eIssueDao.getFirstResponseTime(),
                eIssueDao.getFirstRespondedOn(),
                eIssueDao.getAvgResponseTime(),
                eIssueDao.getResolutionDetails(),
                eIssueDao.getOpeningDate(),
                eIssueDao.getOpeningTime(),
                eIssueDao.getResolutionDate(),
                eIssueDao.getResolutionTime(),
                eIssueDao.getUserResolutionTime(),
                eIssueDao.getLead(),
                eIssueDao.getContact(),
                eIssueDao.getEmailAccount(),
                eIssueDao.getCustomerName(),
                eIssueDao.getProject(),
                eIssueDao.getCompany(),
                eIssueDao.getViaCustomerPortal(),
                eIssueDao.getAttachment(),
                eIssueDao.getContentType(),
                eIssueDao.getUserTags(),
                eIssueDao.getComments(),
                eIssueDao.getAssign(),
                eIssueDao.getLikedBy(),
                eIssueDao.getSeen());
    }

    public static void fromDTO(IssueDto vIssueDto, IssueDao eIssueDao) {
        eIssueDao.setName(vIssueDto.name());
        eIssueDao.setCreation(vIssueDto.creation());
        eIssueDao.setModified(vIssueDto.modified());
        eIssueDao.setModifiedBy(vIssueDto.modifiedBy());
        eIssueDao.setOwner(vIssueDto.owner());
        eIssueDao.setIsDocStatus(vIssueDto.isDocStatus());
        eIssueDao.setIdx(vIssueDto.idx());
        eIssueDao.setNamingSeries(vIssueDto.namingSeries());
        eIssueDao.setSubject(vIssueDto.subject());
        eIssueDao.setCustomer(vIssueDto.customer());
        eIssueDao.setRaisedBy(vIssueDto.raisedBy());
        eIssueDao.setStatus(vIssueDto.status());
        eIssueDao.setPriority(vIssueDto.priority());
        eIssueDao.setIssueType(vIssueDto.issueType());
        eIssueDao.setIssueSplitFrom(vIssueDto.issueSplitFrom());
        eIssueDao.setDescription(vIssueDto.description());
        eIssueDao.setServiceLevelAgreement(vIssueDto.serviceLevelAgreement());
        eIssueDao.setResponseBy(vIssueDto.responseBy());
        eIssueDao.setAgreementStatus(vIssueDto.agreementStatus());
        eIssueDao.setResolutionBy(vIssueDto.resolutionBy());
        eIssueDao.setServiceLevelAgreementCreation(vIssueDto.serviceLevelAgreementCreation());
        eIssueDao.setOnHoldSince(vIssueDto.onHoldSince());
        eIssueDao.setTotalHoldTime(vIssueDto.totalHoldTime());
        eIssueDao.setFirstResponseTime(vIssueDto.firstResponseTime());
        eIssueDao.setFirstRespondedOn(vIssueDto.firstRespondedOn());
        eIssueDao.setAvgResponseTime(vIssueDto.avgResponseTime());
        eIssueDao.setResolutionDetails(vIssueDto.resolutionDetails());
        eIssueDao.setOpeningDate(vIssueDto.openingDate());
        eIssueDao.setOpeningTime(vIssueDto.openingTime());
        eIssueDao.setResolutionDate(vIssueDto.resolutionDate());
        eIssueDao.setResolutionTime(vIssueDto.resolutionTime());
        eIssueDao.setUserResolutionTime(vIssueDto.userResolutionTime());
        eIssueDao.setLead(vIssueDto.lead());
        eIssueDao.setContact(vIssueDto.contact());
        eIssueDao.setEmailAccount(vIssueDto.emailAccount());
        eIssueDao.setCustomerName(vIssueDto.customerName());
        eIssueDao.setProject(vIssueDto.project());
        eIssueDao.setCompany(vIssueDto.company());
        eIssueDao.setViaCustomerPortal(vIssueDto.viaCustomerPortal());
        eIssueDao.setAttachment(vIssueDto.attachment());
        eIssueDao.setContentType(vIssueDto.contentType());
        eIssueDao.setUserTags(vIssueDto.userTags());
        eIssueDao.setComments(vIssueDto.comments());
        eIssueDao.setAssign(vIssueDto.assign());
        eIssueDao.setLikedBy(vIssueDto.likedBy());
        eIssueDao.setSeen(vIssueDto.seen());
    }
}