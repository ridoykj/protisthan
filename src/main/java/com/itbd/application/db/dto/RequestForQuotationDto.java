package com.itbd.application.db.dto;

import com.itbd.application.db.dao.RequestForQuotationDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record RequestForQuotationDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String namingSeries,
        String company,
        String billingAddress,
        String billingAddressDisplay,
        String vendor,
        LocalDate transactionDate,
        LocalDate scheduleDate,
        String status,
        String amendedFrom,
        String emailTemplate,
        Boolean sendAttachedFiles,
        Boolean sendDocumentPrint,
        String messageForSupplier,
        String incoterm,
        String namedPlace,
        String tcName,
        String terms,
        String selectPrintHeading,
        String letterHead,
        String opportunity,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static RequestForQuotationDto fromEntity(RequestForQuotationDao eRequestForQuotationDao) {
        return new RequestForQuotationDto(
                eRequestForQuotationDao.getName(),
                eRequestForQuotationDao.getCreation(),
                eRequestForQuotationDao.getModified(),
                eRequestForQuotationDao.getModifiedBy(),
                eRequestForQuotationDao.getOwner(),
                eRequestForQuotationDao.getIsDocStatus(),
                eRequestForQuotationDao.getIdx(),
                eRequestForQuotationDao.getNamingSeries(),
                eRequestForQuotationDao.getCompany(),
                eRequestForQuotationDao.getBillingAddress(),
                eRequestForQuotationDao.getBillingAddressDisplay(),
                eRequestForQuotationDao.getVendor(),
                eRequestForQuotationDao.getTransactionDate(),
                eRequestForQuotationDao.getScheduleDate(),
                eRequestForQuotationDao.getStatus(),
                eRequestForQuotationDao.getAmendedFrom(),
                eRequestForQuotationDao.getEmailTemplate(),
                eRequestForQuotationDao.getSendAttachedFiles(),
                eRequestForQuotationDao.getSendDocumentPrint(),
                eRequestForQuotationDao.getMessageForSupplier(),
                eRequestForQuotationDao.getIncoterm(),
                eRequestForQuotationDao.getNamedPlace(),
                eRequestForQuotationDao.getTcName(),
                eRequestForQuotationDao.getTerms(),
                eRequestForQuotationDao.getSelectPrintHeading(),
                eRequestForQuotationDao.getLetterHead(),
                eRequestForQuotationDao.getOpportunity(),
                eRequestForQuotationDao.getUserTags(),
                eRequestForQuotationDao.getComments(),
                eRequestForQuotationDao.getAssign(),
                eRequestForQuotationDao.getLikedBy());
    }

    public static void fromDTO(RequestForQuotationDto vRequestForQuotationDto, RequestForQuotationDao eRequestForQuotationDao) {
        eRequestForQuotationDao.setName(vRequestForQuotationDto.name());
        eRequestForQuotationDao.setCreation(vRequestForQuotationDto.creation());
        eRequestForQuotationDao.setModified(vRequestForQuotationDto.modified());
        eRequestForQuotationDao.setModifiedBy(vRequestForQuotationDto.modifiedBy());
        eRequestForQuotationDao.setOwner(vRequestForQuotationDto.owner());
        eRequestForQuotationDao.setIsDocStatus(vRequestForQuotationDto.isDocStatus());
        eRequestForQuotationDao.setIdx(vRequestForQuotationDto.idx());
        eRequestForQuotationDao.setNamingSeries(vRequestForQuotationDto.namingSeries());
        eRequestForQuotationDao.setCompany(vRequestForQuotationDto.company());
        eRequestForQuotationDao.setBillingAddress(vRequestForQuotationDto.billingAddress());
        eRequestForQuotationDao.setBillingAddressDisplay(vRequestForQuotationDto.billingAddressDisplay());
        eRequestForQuotationDao.setVendor(vRequestForQuotationDto.vendor());
        eRequestForQuotationDao.setTransactionDate(vRequestForQuotationDto.transactionDate());
        eRequestForQuotationDao.setScheduleDate(vRequestForQuotationDto.scheduleDate());
        eRequestForQuotationDao.setStatus(vRequestForQuotationDto.status());
        eRequestForQuotationDao.setAmendedFrom(vRequestForQuotationDto.amendedFrom());
        eRequestForQuotationDao.setEmailTemplate(vRequestForQuotationDto.emailTemplate());
        eRequestForQuotationDao.setSendAttachedFiles(vRequestForQuotationDto.sendAttachedFiles());
        eRequestForQuotationDao.setSendDocumentPrint(vRequestForQuotationDto.sendDocumentPrint());
        eRequestForQuotationDao.setMessageForSupplier(vRequestForQuotationDto.messageForSupplier());
        eRequestForQuotationDao.setIncoterm(vRequestForQuotationDto.incoterm());
        eRequestForQuotationDao.setNamedPlace(vRequestForQuotationDto.namedPlace());
        eRequestForQuotationDao.setTcName(vRequestForQuotationDto.tcName());
        eRequestForQuotationDao.setTerms(vRequestForQuotationDto.terms());
        eRequestForQuotationDao.setSelectPrintHeading(vRequestForQuotationDto.selectPrintHeading());
        eRequestForQuotationDao.setLetterHead(vRequestForQuotationDto.letterHead());
        eRequestForQuotationDao.setOpportunity(vRequestForQuotationDto.opportunity());
        eRequestForQuotationDao.setUserTags(vRequestForQuotationDto.userTags());
        eRequestForQuotationDao.setComments(vRequestForQuotationDto.comments());
        eRequestForQuotationDao.setAssign(vRequestForQuotationDto.assign());
        eRequestForQuotationDao.setLikedBy(vRequestForQuotationDto.likedBy());
    }
}