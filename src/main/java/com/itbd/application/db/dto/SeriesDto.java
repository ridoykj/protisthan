package com.itbd.application.db.dto;

import com.itbd.application.db.dao.SeriesDao;
import jakarta.persistence.Id;

public record SeriesDto(
        @Id

        String name,
        Integer current
) {
    public static SeriesDto fromEntity(SeriesDao eSeriesDao) {
        return new SeriesDto(
                eSeriesDao.getName(),
                eSeriesDao.getCurrent());
    }

    public static void fromDTO(SeriesDto vSeriesDto, SeriesDao eSeriesDao) {
        eSeriesDao.setName(vSeriesDto.name());
        eSeriesDao.setCurrent(vSeriesDto.current());
    }
}