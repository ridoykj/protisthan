package com.itbd.application.db.dto.appointments;

import com.itbd.application.db.dao.appointments.AppointmentDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record AppointmentDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        LocalDateTime scheduledTime,
        String status,
        String customerName,
        String customerPhoneNumber,
        String customerSkype,
        String customerEmail,
        String customerDetails,
        String appointmentWith,
        String party,
        String calendarEvent,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static AppointmentDto fromEntity(AppointmentDao eAppointmentDao) {
        return new AppointmentDto(
                eAppointmentDao.getName(),
                eAppointmentDao.getCreation(),
                eAppointmentDao.getModified(),
                eAppointmentDao.getModifiedBy(),
                eAppointmentDao.getOwner(),
                eAppointmentDao.getIsDocStatus(),
                eAppointmentDao.getIdx(),
                eAppointmentDao.getScheduledTime(),
                eAppointmentDao.getStatus(),
                eAppointmentDao.getCustomerName(),
                eAppointmentDao.getCustomerPhoneNumber(),
                eAppointmentDao.getCustomerSkype(),
                eAppointmentDao.getCustomerEmail(),
                eAppointmentDao.getCustomerDetails(),
                eAppointmentDao.getAppointmentWith(),
                eAppointmentDao.getParty(),
                eAppointmentDao.getCalendarEvent(),
                eAppointmentDao.getUserTags(),
                eAppointmentDao.getComments(),
                eAppointmentDao.getAssign(),
                eAppointmentDao.getLikedBy());
    }

    public static void fromDTO(AppointmentDto vAppointmentDto, AppointmentDao eAppointmentDao) {
        eAppointmentDao.setName(vAppointmentDto.name());
        eAppointmentDao.setCreation(vAppointmentDto.creation());
        eAppointmentDao.setModified(vAppointmentDto.modified());
        eAppointmentDao.setModifiedBy(vAppointmentDto.modifiedBy());
        eAppointmentDao.setOwner(vAppointmentDto.owner());
        eAppointmentDao.setIsDocStatus(vAppointmentDto.isDocStatus());
        eAppointmentDao.setIdx(vAppointmentDto.idx());
        eAppointmentDao.setScheduledTime(vAppointmentDto.scheduledTime());
        eAppointmentDao.setStatus(vAppointmentDto.status());
        eAppointmentDao.setCustomerName(vAppointmentDto.customerName());
        eAppointmentDao.setCustomerPhoneNumber(vAppointmentDto.customerPhoneNumber());
        eAppointmentDao.setCustomerSkype(vAppointmentDto.customerSkype());
        eAppointmentDao.setCustomerEmail(vAppointmentDto.customerEmail());
        eAppointmentDao.setCustomerDetails(vAppointmentDto.customerDetails());
        eAppointmentDao.setAppointmentWith(vAppointmentDto.appointmentWith());
        eAppointmentDao.setParty(vAppointmentDto.party());
        eAppointmentDao.setCalendarEvent(vAppointmentDto.calendarEvent());
        eAppointmentDao.setUserTags(vAppointmentDto.userTags());
        eAppointmentDao.setComments(vAppointmentDto.comments());
        eAppointmentDao.setAssign(vAppointmentDto.assign());
        eAppointmentDao.setLikedBy(vAppointmentDto.likedBy());
    }
}