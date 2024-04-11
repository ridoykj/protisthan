package com.itbd.application.db.dto;

import com.itbd.application.db.dao.InstallationNoteDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public record InstallationNoteDto(
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
        String customerAddress,
        String contactPerson,
        String customerName,
        String addressDisplay,
        String contactDisplay,
        String contactMobile,
        String contactEmail,
        String territory,
        String customerGroup,
        LocalDate instDate,
        LocalTime instTime,
        String status,
        String company,
        String amendedFrom,
        String remarks,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static InstallationNoteDto fromEntity(InstallationNoteDao eInstallationNoteDao) {
        return new InstallationNoteDto(
                eInstallationNoteDao.getName(),
                eInstallationNoteDao.getCreation(),
                eInstallationNoteDao.getModified(),
                eInstallationNoteDao.getModifiedBy(),
                eInstallationNoteDao.getOwner(),
                eInstallationNoteDao.getIsDocStatus(),
                eInstallationNoteDao.getIdx(),
                eInstallationNoteDao.getNamingSeries(),
                eInstallationNoteDao.getCustomer(),
                eInstallationNoteDao.getCustomerAddress(),
                eInstallationNoteDao.getContactPerson(),
                eInstallationNoteDao.getCustomerName(),
                eInstallationNoteDao.getAddressDisplay(),
                eInstallationNoteDao.getContactDisplay(),
                eInstallationNoteDao.getContactMobile(),
                eInstallationNoteDao.getContactEmail(),
                eInstallationNoteDao.getTerritory(),
                eInstallationNoteDao.getCustomerGroup(),
                eInstallationNoteDao.getInstDate(),
                eInstallationNoteDao.getInstTime(),
                eInstallationNoteDao.getStatus(),
                eInstallationNoteDao.getCompany(),
                eInstallationNoteDao.getAmendedFrom(),
                eInstallationNoteDao.getRemarks(),
                eInstallationNoteDao.getUserTags(),
                eInstallationNoteDao.getComments(),
                eInstallationNoteDao.getAssign(),
                eInstallationNoteDao.getLikedBy());
    }

    public static void fromDTO(InstallationNoteDto vInstallationNoteDto, InstallationNoteDao eInstallationNoteDao) {
        eInstallationNoteDao.setName(vInstallationNoteDto.name());
        eInstallationNoteDao.setCreation(vInstallationNoteDto.creation());
        eInstallationNoteDao.setModified(vInstallationNoteDto.modified());
        eInstallationNoteDao.setModifiedBy(vInstallationNoteDto.modifiedBy());
        eInstallationNoteDao.setOwner(vInstallationNoteDto.owner());
        eInstallationNoteDao.setIsDocStatus(vInstallationNoteDto.isDocStatus());
        eInstallationNoteDao.setIdx(vInstallationNoteDto.idx());
        eInstallationNoteDao.setNamingSeries(vInstallationNoteDto.namingSeries());
        eInstallationNoteDao.setCustomer(vInstallationNoteDto.customer());
        eInstallationNoteDao.setCustomerAddress(vInstallationNoteDto.customerAddress());
        eInstallationNoteDao.setContactPerson(vInstallationNoteDto.contactPerson());
        eInstallationNoteDao.setCustomerName(vInstallationNoteDto.customerName());
        eInstallationNoteDao.setAddressDisplay(vInstallationNoteDto.addressDisplay());
        eInstallationNoteDao.setContactDisplay(vInstallationNoteDto.contactDisplay());
        eInstallationNoteDao.setContactMobile(vInstallationNoteDto.contactMobile());
        eInstallationNoteDao.setContactEmail(vInstallationNoteDto.contactEmail());
        eInstallationNoteDao.setTerritory(vInstallationNoteDto.territory());
        eInstallationNoteDao.setCustomerGroup(vInstallationNoteDto.customerGroup());
        eInstallationNoteDao.setInstDate(vInstallationNoteDto.instDate());
        eInstallationNoteDao.setInstTime(vInstallationNoteDto.instTime());
        eInstallationNoteDao.setStatus(vInstallationNoteDto.status());
        eInstallationNoteDao.setCompany(vInstallationNoteDto.company());
        eInstallationNoteDao.setAmendedFrom(vInstallationNoteDto.amendedFrom());
        eInstallationNoteDao.setRemarks(vInstallationNoteDto.remarks());
        eInstallationNoteDao.setUserTags(vInstallationNoteDto.userTags());
        eInstallationNoteDao.setComments(vInstallationNoteDto.comments());
        eInstallationNoteDao.setAssign(vInstallationNoteDto.assign());
        eInstallationNoteDao.setLikedBy(vInstallationNoteDto.likedBy());
    }
}