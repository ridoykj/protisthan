package com.itbd.application.db.dto;

import com.itbd.application.db.dao.EventDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record EventDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String subject,
        String eventCategory,
        String eventType,
        String color,
        Boolean sendReminder,
        Boolean repeatThisEvent,
        LocalDateTime startsOn,
        LocalDateTime endsOn,
        String status,
        String sender,
        Boolean allDay,
        Integer syncWithGoogleCalendar,
        Integer addVideoConferencing,
        String googleCalendar,
        String googleCalendarId,
        String googleCalendarEventId,
        String googleMeetLink,
        Boolean pulledFromGoogleCalendar,
        String repeatOn,
        LocalDate repeatTill,
        Boolean monday,
        Boolean tuesday,
        Boolean wednesday,
        Boolean thursday,
        Boolean friday,
        Boolean saturday,
        Boolean sunday,
        String description,
        String userTags,
        String comments,
        String assign,
        String likedBy,
        String seen
) {
    public static EventDto fromEntity(EventDao eEventDao) {
        return new EventDto(
                eEventDao.getName(),
                eEventDao.getCreation(),
                eEventDao.getModified(),
                eEventDao.getModifiedBy(),
                eEventDao.getOwner(),
                eEventDao.getIsDocStatus(),
                eEventDao.getIdx(),
                eEventDao.getSubject(),
                eEventDao.getEventCategory(),
                eEventDao.getEventType(),
                eEventDao.getColor(),
                eEventDao.getSendReminder(),
                eEventDao.getRepeatThisEvent(),
                eEventDao.getStartsOn(),
                eEventDao.getEndsOn(),
                eEventDao.getStatus(),
                eEventDao.getSender(),
                eEventDao.getAllDay(),
                eEventDao.getSyncWithGoogleCalendar(),
                eEventDao.getAddVideoConferencing(),
                eEventDao.getGoogleCalendar(),
                eEventDao.getGoogleCalendarId(),
                eEventDao.getGoogleCalendarEventId(),
                eEventDao.getGoogleMeetLink(),
                eEventDao.getPulledFromGoogleCalendar(),
                eEventDao.getRepeatOn(),
                eEventDao.getRepeatTill(),
                eEventDao.getMonday(),
                eEventDao.getTuesday(),
                eEventDao.getWednesday(),
                eEventDao.getThursday(),
                eEventDao.getFriday(),
                eEventDao.getSaturday(),
                eEventDao.getSunday(),
                eEventDao.getDescription(),
                eEventDao.getUserTags(),
                eEventDao.getComments(),
                eEventDao.getAssign(),
                eEventDao.getLikedBy(),
                eEventDao.getSeen());
    }

    public static void fromDTO(EventDto vEventDto, EventDao eEventDao) {
        eEventDao.setName(vEventDto.name());
        eEventDao.setCreation(vEventDto.creation());
        eEventDao.setModified(vEventDto.modified());
        eEventDao.setModifiedBy(vEventDto.modifiedBy());
        eEventDao.setOwner(vEventDto.owner());
        eEventDao.setIsDocStatus(vEventDto.isDocStatus());
        eEventDao.setIdx(vEventDto.idx());
        eEventDao.setSubject(vEventDto.subject());
        eEventDao.setEventCategory(vEventDto.eventCategory());
        eEventDao.setEventType(vEventDto.eventType());
        eEventDao.setColor(vEventDto.color());
        eEventDao.setSendReminder(vEventDto.sendReminder());
        eEventDao.setRepeatThisEvent(vEventDto.repeatThisEvent());
        eEventDao.setStartsOn(vEventDto.startsOn());
        eEventDao.setEndsOn(vEventDto.endsOn());
        eEventDao.setStatus(vEventDto.status());
        eEventDao.setSender(vEventDto.sender());
        eEventDao.setAllDay(vEventDto.allDay());
        eEventDao.setSyncWithGoogleCalendar(vEventDto.syncWithGoogleCalendar());
        eEventDao.setAddVideoConferencing(vEventDto.addVideoConferencing());
        eEventDao.setGoogleCalendar(vEventDto.googleCalendar());
        eEventDao.setGoogleCalendarId(vEventDto.googleCalendarId());
        eEventDao.setGoogleCalendarEventId(vEventDto.googleCalendarEventId());
        eEventDao.setGoogleMeetLink(vEventDto.googleMeetLink());
        eEventDao.setPulledFromGoogleCalendar(vEventDto.pulledFromGoogleCalendar());
        eEventDao.setRepeatOn(vEventDto.repeatOn());
        eEventDao.setRepeatTill(vEventDto.repeatTill());
        eEventDao.setMonday(vEventDto.monday());
        eEventDao.setTuesday(vEventDto.tuesday());
        eEventDao.setWednesday(vEventDto.wednesday());
        eEventDao.setThursday(vEventDto.thursday());
        eEventDao.setFriday(vEventDto.friday());
        eEventDao.setSaturday(vEventDto.saturday());
        eEventDao.setSunday(vEventDto.sunday());
        eEventDao.setDescription(vEventDto.description());
        eEventDao.setUserTags(vEventDto.userTags());
        eEventDao.setComments(vEventDto.comments());
        eEventDao.setAssign(vEventDto.assign());
        eEventDao.setLikedBy(vEventDto.likedBy());
        eEventDao.setSeen(vEventDto.seen());
    }
}