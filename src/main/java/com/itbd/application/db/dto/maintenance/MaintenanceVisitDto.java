package com.itbd.application.db.dto.maintenance;

import com.itbd.application.db.dao.maintenance.MaintenanceVisitDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public record MaintenanceVisitDto(
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
        String customerName,
        String addressDisplay,
        String contactDisplay,
        String contactMobile,
        String contactEmail,
        String maintenanceSchedule,
        String maintenanceScheduleDetail,
        LocalDate mntcDate,
        LocalTime mntcTime,
        String completionStatus,
        String maintenanceType,
        String customerFeedback,
        String status,
        String amendedFrom,
        String company,
        String customerAddress,
        String contactPerson,
        String territory,
        String customerGroup,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static MaintenanceVisitDto fromEntity(MaintenanceVisitDao eMaintenanceVisitDao) {
        return new MaintenanceVisitDto(
                eMaintenanceVisitDao.getName(),
                eMaintenanceVisitDao.getCreation(),
                eMaintenanceVisitDao.getModified(),
                eMaintenanceVisitDao.getModifiedBy(),
                eMaintenanceVisitDao.getOwner(),
                eMaintenanceVisitDao.getIsDocStatus(),
                eMaintenanceVisitDao.getIdx(),
                eMaintenanceVisitDao.getNamingSeries(),
                eMaintenanceVisitDao.getCustomer(),
                eMaintenanceVisitDao.getCustomerName(),
                eMaintenanceVisitDao.getAddressDisplay(),
                eMaintenanceVisitDao.getContactDisplay(),
                eMaintenanceVisitDao.getContactMobile(),
                eMaintenanceVisitDao.getContactEmail(),
                eMaintenanceVisitDao.getMaintenanceSchedule(),
                eMaintenanceVisitDao.getMaintenanceScheduleDetail(),
                eMaintenanceVisitDao.getMntcDate(),
                eMaintenanceVisitDao.getMntcTime(),
                eMaintenanceVisitDao.getCompletionStatus(),
                eMaintenanceVisitDao.getMaintenanceType(),
                eMaintenanceVisitDao.getCustomerFeedback(),
                eMaintenanceVisitDao.getStatus(),
                eMaintenanceVisitDao.getAmendedFrom(),
                eMaintenanceVisitDao.getCompany(),
                eMaintenanceVisitDao.getCustomerAddress(),
                eMaintenanceVisitDao.getContactPerson(),
                eMaintenanceVisitDao.getTerritory(),
                eMaintenanceVisitDao.getCustomerGroup(),
                eMaintenanceVisitDao.getUserTags(),
                eMaintenanceVisitDao.getComments(),
                eMaintenanceVisitDao.getAssign(),
                eMaintenanceVisitDao.getLikedBy());
    }

    public static void fromDTO(MaintenanceVisitDto vMaintenanceVisitDto, MaintenanceVisitDao eMaintenanceVisitDao) {
        eMaintenanceVisitDao.setName(vMaintenanceVisitDto.name());
        eMaintenanceVisitDao.setCreation(vMaintenanceVisitDto.creation());
        eMaintenanceVisitDao.setModified(vMaintenanceVisitDto.modified());
        eMaintenanceVisitDao.setModifiedBy(vMaintenanceVisitDto.modifiedBy());
        eMaintenanceVisitDao.setOwner(vMaintenanceVisitDto.owner());
        eMaintenanceVisitDao.setIsDocStatus(vMaintenanceVisitDto.isDocStatus());
        eMaintenanceVisitDao.setIdx(vMaintenanceVisitDto.idx());
        eMaintenanceVisitDao.setNamingSeries(vMaintenanceVisitDto.namingSeries());
        eMaintenanceVisitDao.setCustomer(vMaintenanceVisitDto.customer());
        eMaintenanceVisitDao.setCustomerName(vMaintenanceVisitDto.customerName());
        eMaintenanceVisitDao.setAddressDisplay(vMaintenanceVisitDto.addressDisplay());
        eMaintenanceVisitDao.setContactDisplay(vMaintenanceVisitDto.contactDisplay());
        eMaintenanceVisitDao.setContactMobile(vMaintenanceVisitDto.contactMobile());
        eMaintenanceVisitDao.setContactEmail(vMaintenanceVisitDto.contactEmail());
        eMaintenanceVisitDao.setMaintenanceSchedule(vMaintenanceVisitDto.maintenanceSchedule());
        eMaintenanceVisitDao.setMaintenanceScheduleDetail(vMaintenanceVisitDto.maintenanceScheduleDetail());
        eMaintenanceVisitDao.setMntcDate(vMaintenanceVisitDto.mntcDate());
        eMaintenanceVisitDao.setMntcTime(vMaintenanceVisitDto.mntcTime());
        eMaintenanceVisitDao.setCompletionStatus(vMaintenanceVisitDto.completionStatus());
        eMaintenanceVisitDao.setMaintenanceType(vMaintenanceVisitDto.maintenanceType());
        eMaintenanceVisitDao.setCustomerFeedback(vMaintenanceVisitDto.customerFeedback());
        eMaintenanceVisitDao.setStatus(vMaintenanceVisitDto.status());
        eMaintenanceVisitDao.setAmendedFrom(vMaintenanceVisitDto.amendedFrom());
        eMaintenanceVisitDao.setCompany(vMaintenanceVisitDto.company());
        eMaintenanceVisitDao.setCustomerAddress(vMaintenanceVisitDto.customerAddress());
        eMaintenanceVisitDao.setContactPerson(vMaintenanceVisitDto.contactPerson());
        eMaintenanceVisitDao.setTerritory(vMaintenanceVisitDto.territory());
        eMaintenanceVisitDao.setCustomerGroup(vMaintenanceVisitDto.customerGroup());
        eMaintenanceVisitDao.setUserTags(vMaintenanceVisitDto.userTags());
        eMaintenanceVisitDao.setComments(vMaintenanceVisitDto.comments());
        eMaintenanceVisitDao.setAssign(vMaintenanceVisitDto.assign());
        eMaintenanceVisitDao.setLikedBy(vMaintenanceVisitDto.likedBy());
    }
}