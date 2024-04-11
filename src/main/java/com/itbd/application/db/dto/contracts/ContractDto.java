package com.itbd.application.db.dto.contracts;

import com.itbd.application.db.dao.contracts.ContractDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record ContractDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String partyType,
        Boolean isSigned,
        String partyName,
        String partyUser,
        String status,
        String fulfilmentStatus,
        LocalDate startDate,
        LocalDate endDate,
        String signe,
        LocalDateTime signedOn,
        String ipAddress,
        String contractTemplate,
        String contractTerms,
        Boolean requiresFulfilment,
        LocalDate fulfilmentDeadline,
        String signeCompany,
        String signedByCompany,
        String documentType,
        String documentName,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy,
        String seen
) {
    public static ContractDto fromEntity(ContractDao eContractDao) {
        return new ContractDto(
                eContractDao.getName(),
                eContractDao.getCreation(),
                eContractDao.getModified(),
                eContractDao.getModifiedBy(),
                eContractDao.getOwner(),
                eContractDao.getIsDocStatus(),
                eContractDao.getIdx(),
                eContractDao.getPartyType(),
                eContractDao.getIsSigned(),
                eContractDao.getPartyName(),
                eContractDao.getPartyUser(),
                eContractDao.getStatus(),
                eContractDao.getFulfilmentStatus(),
                eContractDao.getStartDate(),
                eContractDao.getEndDate(),
                eContractDao.getSigne(),
                eContractDao.getSignedOn(),
                eContractDao.getIpAddress(),
                eContractDao.getContractTemplate(),
                eContractDao.getContractTerms(),
                eContractDao.getRequiresFulfilment(),
                eContractDao.getFulfilmentDeadline(),
                eContractDao.getSigneCompany(),
                eContractDao.getSignedByCompany(),
                eContractDao.getDocumentType(),
                eContractDao.getDocumentName(),
                eContractDao.getAmendedFrom(),
                eContractDao.getUserTags(),
                eContractDao.getComments(),
                eContractDao.getAssign(),
                eContractDao.getLikedBy(),
                eContractDao.getSeen());
    }

    public static void fromDTO(ContractDto vContractDto, ContractDao eContractDao) {
        eContractDao.setName(vContractDto.name());
        eContractDao.setCreation(vContractDto.creation());
        eContractDao.setModified(vContractDto.modified());
        eContractDao.setModifiedBy(vContractDto.modifiedBy());
        eContractDao.setOwner(vContractDto.owner());
        eContractDao.setIsDocStatus(vContractDto.isDocStatus());
        eContractDao.setIdx(vContractDto.idx());
        eContractDao.setPartyType(vContractDto.partyType());
        eContractDao.setIsSigned(vContractDto.isSigned());
        eContractDao.setPartyName(vContractDto.partyName());
        eContractDao.setPartyUser(vContractDto.partyUser());
        eContractDao.setStatus(vContractDto.status());
        eContractDao.setFulfilmentStatus(vContractDto.fulfilmentStatus());
        eContractDao.setStartDate(vContractDto.startDate());
        eContractDao.setEndDate(vContractDto.endDate());
        eContractDao.setSigne(vContractDto.signe());
        eContractDao.setSignedOn(vContractDto.signedOn());
        eContractDao.setIpAddress(vContractDto.ipAddress());
        eContractDao.setContractTemplate(vContractDto.contractTemplate());
        eContractDao.setContractTerms(vContractDto.contractTerms());
        eContractDao.setRequiresFulfilment(vContractDto.requiresFulfilment());
        eContractDao.setFulfilmentDeadline(vContractDto.fulfilmentDeadline());
        eContractDao.setSigneCompany(vContractDto.signeCompany());
        eContractDao.setSignedByCompany(vContractDto.signedByCompany());
        eContractDao.setDocumentType(vContractDto.documentType());
        eContractDao.setDocumentName(vContractDto.documentName());
        eContractDao.setAmendedFrom(vContractDto.amendedFrom());
        eContractDao.setUserTags(vContractDto.userTags());
        eContractDao.setComments(vContractDto.comments());
        eContractDao.setAssign(vContractDto.assign());
        eContractDao.setLikedBy(vContractDto.likedBy());
        eContractDao.setSeen(vContractDto.seen());
    }
}