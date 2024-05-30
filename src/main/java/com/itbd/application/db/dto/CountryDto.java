package com.itbd.application.db.dto;

import com.itbd.application.db.dao.geo.CountryDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record CountryDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String countryName,
        String dateFormat,
        String timeFormat,
        String timeZones,
        String code,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static CountryDto fromEntity(CountryDao eCountryDao) {
        return new CountryDto(
                eCountryDao.getName(),
                eCountryDao.getCreation(),
                eCountryDao.getModified(),
                eCountryDao.getModifiedBy(),
                eCountryDao.getOwner(),
                eCountryDao.getIsDocStatus(),
                eCountryDao.getIdx(),
                eCountryDao.getCountryName(),
                eCountryDao.getDateFormat(),
                eCountryDao.getTimeFormat(),
                eCountryDao.getTimeZones(),
                eCountryDao.getCode(),
                eCountryDao.getUserTags(),
                eCountryDao.getComments(),
                eCountryDao.getAssign(),
                eCountryDao.getLikedBy());
    }

    public static void fromDTO(CountryDto vCountryDto, CountryDao eCountryDao) {
        eCountryDao.setName(vCountryDto.name());
        eCountryDao.setCreation(vCountryDto.creation());
        eCountryDao.setModified(vCountryDto.modified());
        eCountryDao.setModifiedBy(vCountryDto.modifiedBy());
        eCountryDao.setOwner(vCountryDto.owner());
        eCountryDao.setIsDocStatus(vCountryDto.isDocStatus());
        eCountryDao.setIdx(vCountryDto.idx());
        eCountryDao.setCountryName(vCountryDto.countryName());
        eCountryDao.setDateFormat(vCountryDto.dateFormat());
        eCountryDao.setTimeFormat(vCountryDto.timeFormat());
        eCountryDao.setTimeZones(vCountryDto.timeZones());
        eCountryDao.setCode(vCountryDto.code());
        eCountryDao.setUserTags(vCountryDto.userTags());
        eCountryDao.setComments(vCountryDto.comments());
        eCountryDao.setAssign(vCountryDto.assign());
        eCountryDao.setLikedBy(vCountryDto.likedBy());
    }
}