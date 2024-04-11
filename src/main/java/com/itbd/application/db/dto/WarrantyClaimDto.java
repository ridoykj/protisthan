package com.itbd.application.db.dto;

import com.itbd.application.db.dao.WarrantyClaimDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record WarrantyClaimDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String namingSeries,
        String status,
        LocalDate complaintDate,
        String customer,
        String serialNo,
        String complaint,
        String itemCode,
        String itemName,
        String description,
        String warrantyAmcStatus,
        LocalDate warrantyExpiryDate,
        LocalDate amcExpiryDate,
        LocalDateTime resolutionDate,
        String resolvedBy,
        String resolutionDetails,
        String customerName,
        String contactPerson,
        String contactDisplay,
        String contactMobile,
        String contactEmail,
        String territory,
        String customerGroup,
        String customerAddress,
        String addressDisplay,
        String serviceAddress,
        String company,
        String complaintRaisedBy,
        String fromCompany,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static WarrantyClaimDto fromEntity(WarrantyClaimDao eWarrantyClaimDao) {
        return new WarrantyClaimDto(
                eWarrantyClaimDao.getName(),
                eWarrantyClaimDao.getCreation(),
                eWarrantyClaimDao.getModified(),
                eWarrantyClaimDao.getModifiedBy(),
                eWarrantyClaimDao.getOwner(),
                eWarrantyClaimDao.getIsDocStatus(),
                eWarrantyClaimDao.getIdx(),
                eWarrantyClaimDao.getNamingSeries(),
                eWarrantyClaimDao.getStatus(),
                eWarrantyClaimDao.getComplaintDate(),
                eWarrantyClaimDao.getCustomer(),
                eWarrantyClaimDao.getSerialNo(),
                eWarrantyClaimDao.getComplaint(),
                eWarrantyClaimDao.getItemCode(),
                eWarrantyClaimDao.getItemName(),
                eWarrantyClaimDao.getDescription(),
                eWarrantyClaimDao.getWarrantyAmcStatus(),
                eWarrantyClaimDao.getWarrantyExpiryDate(),
                eWarrantyClaimDao.getAmcExpiryDate(),
                eWarrantyClaimDao.getResolutionDate(),
                eWarrantyClaimDao.getResolvedBy(),
                eWarrantyClaimDao.getResolutionDetails(),
                eWarrantyClaimDao.getCustomerName(),
                eWarrantyClaimDao.getContactPerson(),
                eWarrantyClaimDao.getContactDisplay(),
                eWarrantyClaimDao.getContactMobile(),
                eWarrantyClaimDao.getContactEmail(),
                eWarrantyClaimDao.getTerritory(),
                eWarrantyClaimDao.getCustomerGroup(),
                eWarrantyClaimDao.getCustomerAddress(),
                eWarrantyClaimDao.getAddressDisplay(),
                eWarrantyClaimDao.getServiceAddress(),
                eWarrantyClaimDao.getCompany(),
                eWarrantyClaimDao.getComplaintRaisedBy(),
                eWarrantyClaimDao.getFromCompany(),
                eWarrantyClaimDao.getAmendedFrom(),
                eWarrantyClaimDao.getUserTags(),
                eWarrantyClaimDao.getComments(),
                eWarrantyClaimDao.getAssign(),
                eWarrantyClaimDao.getLikedBy());
    }

    public static void fromDTO(WarrantyClaimDto vWarrantyClaimDto, WarrantyClaimDao eWarrantyClaimDao) {
        eWarrantyClaimDao.setName(vWarrantyClaimDto.name());
        eWarrantyClaimDao.setCreation(vWarrantyClaimDto.creation());
        eWarrantyClaimDao.setModified(vWarrantyClaimDto.modified());
        eWarrantyClaimDao.setModifiedBy(vWarrantyClaimDto.modifiedBy());
        eWarrantyClaimDao.setOwner(vWarrantyClaimDto.owner());
        eWarrantyClaimDao.setIsDocStatus(vWarrantyClaimDto.isDocStatus());
        eWarrantyClaimDao.setIdx(vWarrantyClaimDto.idx());
        eWarrantyClaimDao.setNamingSeries(vWarrantyClaimDto.namingSeries());
        eWarrantyClaimDao.setStatus(vWarrantyClaimDto.status());
        eWarrantyClaimDao.setComplaintDate(vWarrantyClaimDto.complaintDate());
        eWarrantyClaimDao.setCustomer(vWarrantyClaimDto.customer());
        eWarrantyClaimDao.setSerialNo(vWarrantyClaimDto.serialNo());
        eWarrantyClaimDao.setComplaint(vWarrantyClaimDto.complaint());
        eWarrantyClaimDao.setItemCode(vWarrantyClaimDto.itemCode());
        eWarrantyClaimDao.setItemName(vWarrantyClaimDto.itemName());
        eWarrantyClaimDao.setDescription(vWarrantyClaimDto.description());
        eWarrantyClaimDao.setWarrantyAmcStatus(vWarrantyClaimDto.warrantyAmcStatus());
        eWarrantyClaimDao.setWarrantyExpiryDate(vWarrantyClaimDto.warrantyExpiryDate());
        eWarrantyClaimDao.setAmcExpiryDate(vWarrantyClaimDto.amcExpiryDate());
        eWarrantyClaimDao.setResolutionDate(vWarrantyClaimDto.resolutionDate());
        eWarrantyClaimDao.setResolvedBy(vWarrantyClaimDto.resolvedBy());
        eWarrantyClaimDao.setResolutionDetails(vWarrantyClaimDto.resolutionDetails());
        eWarrantyClaimDao.setCustomerName(vWarrantyClaimDto.customerName());
        eWarrantyClaimDao.setContactPerson(vWarrantyClaimDto.contactPerson());
        eWarrantyClaimDao.setContactDisplay(vWarrantyClaimDto.contactDisplay());
        eWarrantyClaimDao.setContactMobile(vWarrantyClaimDto.contactMobile());
        eWarrantyClaimDao.setContactEmail(vWarrantyClaimDto.contactEmail());
        eWarrantyClaimDao.setTerritory(vWarrantyClaimDto.territory());
        eWarrantyClaimDao.setCustomerGroup(vWarrantyClaimDto.customerGroup());
        eWarrantyClaimDao.setCustomerAddress(vWarrantyClaimDto.customerAddress());
        eWarrantyClaimDao.setAddressDisplay(vWarrantyClaimDto.addressDisplay());
        eWarrantyClaimDao.setServiceAddress(vWarrantyClaimDto.serviceAddress());
        eWarrantyClaimDao.setCompany(vWarrantyClaimDto.company());
        eWarrantyClaimDao.setComplaintRaisedBy(vWarrantyClaimDto.complaintRaisedBy());
        eWarrantyClaimDao.setFromCompany(vWarrantyClaimDto.fromCompany());
        eWarrantyClaimDao.setAmendedFrom(vWarrantyClaimDto.amendedFrom());
        eWarrantyClaimDao.setUserTags(vWarrantyClaimDto.userTags());
        eWarrantyClaimDao.setComments(vWarrantyClaimDto.comments());
        eWarrantyClaimDao.setAssign(vWarrantyClaimDto.assign());
        eWarrantyClaimDao.setLikedBy(vWarrantyClaimDto.likedBy());
    }
}