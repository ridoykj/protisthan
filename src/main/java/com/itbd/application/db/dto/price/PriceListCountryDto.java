package com.itbd.application.db.dto.price;

import com.itbd.application.db.dao.stock.PriceListCountryDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record PriceListCountryDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String country,
        String parent,
        String parentField,
        String parentType
) {
    public static PriceListCountryDto fromEntity(PriceListCountryDao ePriceListCountryDao) {
        return new PriceListCountryDto(
                ePriceListCountryDao.getName(),
                ePriceListCountryDao.getCreation(),
                ePriceListCountryDao.getModified(),
                ePriceListCountryDao.getModifiedBy(),
                ePriceListCountryDao.getOwner(),
                ePriceListCountryDao.getIsDocStatus(),
                ePriceListCountryDao.getIdx(),
                ePriceListCountryDao.getCountry(),
                ePriceListCountryDao.getParent(),
                ePriceListCountryDao.getParentField(),
                ePriceListCountryDao.getParentType());
    }

    public static void fromDTO(PriceListCountryDto vPriceListCountryDto, PriceListCountryDao ePriceListCountryDao) {
        ePriceListCountryDao.setName(vPriceListCountryDto.name());
        ePriceListCountryDao.setCreation(vPriceListCountryDto.creation());
        ePriceListCountryDao.setModified(vPriceListCountryDto.modified());
        ePriceListCountryDao.setModifiedBy(vPriceListCountryDto.modifiedBy());
        ePriceListCountryDao.setOwner(vPriceListCountryDto.owner());
        ePriceListCountryDao.setIsDocStatus(vPriceListCountryDto.isDocStatus());
        ePriceListCountryDao.setIdx(vPriceListCountryDto.idx());
        ePriceListCountryDao.setCountry(vPriceListCountryDto.country());
        ePriceListCountryDao.setParent(vPriceListCountryDto.parent());
        ePriceListCountryDao.setParentField(vPriceListCountryDto.parentField());
        ePriceListCountryDao.setParentType(vPriceListCountryDto.parentType());
    }
}