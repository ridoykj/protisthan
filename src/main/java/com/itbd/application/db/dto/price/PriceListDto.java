package com.itbd.application.db.dto.price;

import com.itbd.application.db.dao.price.PriceListDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record PriceListDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Boolean enabled,
        String priceListName,
        String currency,
        Boolean buying,
        Boolean selling,
        Boolean priceNotUomDependent,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static PriceListDto fromEntity(PriceListDao ePriceListDao) {
        return new PriceListDto(
                ePriceListDao.getName(),
                ePriceListDao.getCreation(),
                ePriceListDao.getModified(),
                ePriceListDao.getModifiedBy(),
                ePriceListDao.getOwner(),
                ePriceListDao.getIsDocStatus(),
                ePriceListDao.getIdx(),
                ePriceListDao.getEnabled(),
                ePriceListDao.getPriceListName(),
                ePriceListDao.getCurrency(),
                ePriceListDao.getBuying(),
                ePriceListDao.getSelling(),
                ePriceListDao.getPriceNotUomDependent(),
                ePriceListDao.getUserTags(),
                ePriceListDao.getComments(),
                ePriceListDao.getAssign(),
                ePriceListDao.getLikedBy());
    }

    public static void fromDTO(PriceListDto vPriceListDto, PriceListDao ePriceListDao) {
        ePriceListDao.setName(vPriceListDto.name());
        ePriceListDao.setCreation(vPriceListDto.creation());
        ePriceListDao.setModified(vPriceListDto.modified());
        ePriceListDao.setModifiedBy(vPriceListDto.modifiedBy());
        ePriceListDao.setOwner(vPriceListDto.owner());
        ePriceListDao.setIsDocStatus(vPriceListDto.isDocStatus());
        ePriceListDao.setIdx(vPriceListDto.idx());
        ePriceListDao.setEnabled(vPriceListDto.enabled());
        ePriceListDao.setPriceListName(vPriceListDto.priceListName());
        ePriceListDao.setCurrency(vPriceListDto.currency());
        ePriceListDao.setBuying(vPriceListDto.buying());
        ePriceListDao.setSelling(vPriceListDto.selling());
        ePriceListDao.setPriceNotUomDependent(vPriceListDto.priceNotUomDependent());
        ePriceListDao.setUserTags(vPriceListDto.userTags());
        ePriceListDao.setComments(vPriceListDto.comments());
        ePriceListDao.setAssign(vPriceListDto.assign());
        ePriceListDao.setLikedBy(vPriceListDto.likedBy());
    }
}