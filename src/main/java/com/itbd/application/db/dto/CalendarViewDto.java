package com.itbd.application.db.dto;

import com.itbd.application.db.dao.CalendarViewDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record CalendarViewDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String referenceDocType,
        String subjectField,
        String startDateField,
        String endDateField,
        Boolean allDay,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static CalendarViewDto fromEntity(CalendarViewDao eCalendarViewDao) {
        return new CalendarViewDto(
                eCalendarViewDao.getName(),
                eCalendarViewDao.getCreation(),
                eCalendarViewDao.getModified(),
                eCalendarViewDao.getModifiedBy(),
                eCalendarViewDao.getOwner(),
                eCalendarViewDao.getIsDocStatus(),
                eCalendarViewDao.getIdx(),
                eCalendarViewDao.getReferenceDocType(),
                eCalendarViewDao.getSubjectField(),
                eCalendarViewDao.getStartDateField(),
                eCalendarViewDao.getEndDateField(),
                eCalendarViewDao.getAllDay(),
                eCalendarViewDao.getUserTags(),
                eCalendarViewDao.getComments(),
                eCalendarViewDao.getAssign(),
                eCalendarViewDao.getLikedBy());
    }

    public static void fromDTO(CalendarViewDto vCalendarViewDto, CalendarViewDao eCalendarViewDao) {
        eCalendarViewDao.setName(vCalendarViewDto.name());
        eCalendarViewDao.setCreation(vCalendarViewDto.creation());
        eCalendarViewDao.setModified(vCalendarViewDto.modified());
        eCalendarViewDao.setModifiedBy(vCalendarViewDto.modifiedBy());
        eCalendarViewDao.setOwner(vCalendarViewDto.owner());
        eCalendarViewDao.setIsDocStatus(vCalendarViewDto.isDocStatus());
        eCalendarViewDao.setIdx(vCalendarViewDto.idx());
        eCalendarViewDao.setReferenceDocType(vCalendarViewDto.referenceDocType());
        eCalendarViewDao.setSubjectField(vCalendarViewDto.subjectField());
        eCalendarViewDao.setStartDateField(vCalendarViewDto.startDateField());
        eCalendarViewDao.setEndDateField(vCalendarViewDto.endDateField());
        eCalendarViewDao.setAllDay(vCalendarViewDto.allDay());
        eCalendarViewDao.setUserTags(vCalendarViewDto.userTags());
        eCalendarViewDao.setComments(vCalendarViewDto.comments());
        eCalendarViewDao.setAssign(vCalendarViewDto.assign());
        eCalendarViewDao.setLikedBy(vCalendarViewDto.likedBy());
    }
}