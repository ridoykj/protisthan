package com.itbd.application.db.dto;

import com.itbd.application.db.dao.HolidayListDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record HolidayListDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String holidayListName,
        LocalDate fromDate,
        LocalDate toDate,
        Integer totalHolidays,
        String weeklyOff,
        String country,
        String subdivision,
        String color,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static HolidayListDto fromEntity(HolidayListDao eHolidayListDao) {
        return new HolidayListDto(
                eHolidayListDao.getName(),
                eHolidayListDao.getCreation(),
                eHolidayListDao.getModified(),
                eHolidayListDao.getModifiedBy(),
                eHolidayListDao.getOwner(),
                eHolidayListDao.getIsDocStatus(),
                eHolidayListDao.getIdx(),
                eHolidayListDao.getHolidayListName(),
                eHolidayListDao.getFromDate(),
                eHolidayListDao.getToDate(),
                eHolidayListDao.getTotalHolidays(),
                eHolidayListDao.getWeeklyOff(),
                eHolidayListDao.getCountry(),
                eHolidayListDao.getSubdivision(),
                eHolidayListDao.getColor(),
                eHolidayListDao.getUserTags(),
                eHolidayListDao.getComments(),
                eHolidayListDao.getAssign(),
                eHolidayListDao.getLikedBy());
    }

    public static void fromDTO(HolidayListDto vHolidayListDto, HolidayListDao eHolidayListDao) {
        eHolidayListDao.setName(vHolidayListDto.name());
        eHolidayListDao.setCreation(vHolidayListDto.creation());
        eHolidayListDao.setModified(vHolidayListDto.modified());
        eHolidayListDao.setModifiedBy(vHolidayListDto.modifiedBy());
        eHolidayListDao.setOwner(vHolidayListDto.owner());
        eHolidayListDao.setIsDocStatus(vHolidayListDto.isDocStatus());
        eHolidayListDao.setIdx(vHolidayListDto.idx());
        eHolidayListDao.setHolidayListName(vHolidayListDto.holidayListName());
        eHolidayListDao.setFromDate(vHolidayListDto.fromDate());
        eHolidayListDao.setToDate(vHolidayListDto.toDate());
        eHolidayListDao.setTotalHolidays(vHolidayListDto.totalHolidays());
        eHolidayListDao.setWeeklyOff(vHolidayListDto.weeklyOff());
        eHolidayListDao.setCountry(vHolidayListDto.country());
        eHolidayListDao.setSubdivision(vHolidayListDto.subdivision());
        eHolidayListDao.setColor(vHolidayListDto.color());
        eHolidayListDao.setUserTags(vHolidayListDto.userTags());
        eHolidayListDao.setComments(vHolidayListDto.comments());
        eHolidayListDao.setAssign(vHolidayListDto.assign());
        eHolidayListDao.setLikedBy(vHolidayListDto.likedBy());
    }
}