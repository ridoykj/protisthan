package com.itbd.application.db.dto.maintenance;

import com.itbd.application.db.dao.maintenance.MaintenanceScheduleDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record MaintenanceScheduleDto(
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
        String status,
        LocalDate transactionDate,
        String customerName,
        String contactPerson,
        String contactMobile,
        String contactEmail,
        String contactDisplay,
        String customerAddress,
        String addressDisplay,
        String territory,
        String customerGroup,
        String company,
        String amendedFrom,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static MaintenanceScheduleDto fromEntity(MaintenanceScheduleDao eMaintenanceScheduleDao) {
        return new MaintenanceScheduleDto(
                eMaintenanceScheduleDao.getName(),
                eMaintenanceScheduleDao.getCreation(),
                eMaintenanceScheduleDao.getModified(),
                eMaintenanceScheduleDao.getModifiedBy(),
                eMaintenanceScheduleDao.getOwner(),
                eMaintenanceScheduleDao.getIsDocStatus(),
                eMaintenanceScheduleDao.getIdx(),
                eMaintenanceScheduleDao.getNamingSeries(),
                eMaintenanceScheduleDao.getCustomer(),
                eMaintenanceScheduleDao.getStatus(),
                eMaintenanceScheduleDao.getTransactionDate(),
                eMaintenanceScheduleDao.getCustomerName(),
                eMaintenanceScheduleDao.getContactPerson(),
                eMaintenanceScheduleDao.getContactMobile(),
                eMaintenanceScheduleDao.getContactEmail(),
                eMaintenanceScheduleDao.getContactDisplay(),
                eMaintenanceScheduleDao.getCustomerAddress(),
                eMaintenanceScheduleDao.getAddressDisplay(),
                eMaintenanceScheduleDao.getTerritory(),
                eMaintenanceScheduleDao.getCustomerGroup(),
                eMaintenanceScheduleDao.getCompany(),
                eMaintenanceScheduleDao.getAmendedFrom(),
                eMaintenanceScheduleDao.getUserTags(),
                eMaintenanceScheduleDao.getComments(),
                eMaintenanceScheduleDao.getAssign(),
                eMaintenanceScheduleDao.getLikedBy());
    }

    public static void fromDTO(MaintenanceScheduleDto vMaintenanceScheduleDto, MaintenanceScheduleDao eMaintenanceScheduleDao) {
        eMaintenanceScheduleDao.setName(vMaintenanceScheduleDto.name());
        eMaintenanceScheduleDao.setCreation(vMaintenanceScheduleDto.creation());
        eMaintenanceScheduleDao.setModified(vMaintenanceScheduleDto.modified());
        eMaintenanceScheduleDao.setModifiedBy(vMaintenanceScheduleDto.modifiedBy());
        eMaintenanceScheduleDao.setOwner(vMaintenanceScheduleDto.owner());
        eMaintenanceScheduleDao.setIsDocStatus(vMaintenanceScheduleDto.isDocStatus());
        eMaintenanceScheduleDao.setIdx(vMaintenanceScheduleDto.idx());
        eMaintenanceScheduleDao.setNamingSeries(vMaintenanceScheduleDto.namingSeries());
        eMaintenanceScheduleDao.setCustomer(vMaintenanceScheduleDto.customer());
        eMaintenanceScheduleDao.setStatus(vMaintenanceScheduleDto.status());
        eMaintenanceScheduleDao.setTransactionDate(vMaintenanceScheduleDto.transactionDate());
        eMaintenanceScheduleDao.setCustomerName(vMaintenanceScheduleDto.customerName());
        eMaintenanceScheduleDao.setContactPerson(vMaintenanceScheduleDto.contactPerson());
        eMaintenanceScheduleDao.setContactMobile(vMaintenanceScheduleDto.contactMobile());
        eMaintenanceScheduleDao.setContactEmail(vMaintenanceScheduleDto.contactEmail());
        eMaintenanceScheduleDao.setContactDisplay(vMaintenanceScheduleDto.contactDisplay());
        eMaintenanceScheduleDao.setCustomerAddress(vMaintenanceScheduleDto.customerAddress());
        eMaintenanceScheduleDao.setAddressDisplay(vMaintenanceScheduleDto.addressDisplay());
        eMaintenanceScheduleDao.setTerritory(vMaintenanceScheduleDto.territory());
        eMaintenanceScheduleDao.setCustomerGroup(vMaintenanceScheduleDto.customerGroup());
        eMaintenanceScheduleDao.setCompany(vMaintenanceScheduleDto.company());
        eMaintenanceScheduleDao.setAmendedFrom(vMaintenanceScheduleDto.amendedFrom());
        eMaintenanceScheduleDao.setUserTags(vMaintenanceScheduleDto.userTags());
        eMaintenanceScheduleDao.setComments(vMaintenanceScheduleDto.comments());
        eMaintenanceScheduleDao.setAssign(vMaintenanceScheduleDto.assign());
        eMaintenanceScheduleDao.setLikedBy(vMaintenanceScheduleDto.likedBy());
    }
}