package com.itbd.application.db.dto.shipments;

import com.itbd.application.db.dao.shipments.ShipmentParcelTemplateDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ShipmentParcelTemplateDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String parcelTemplateName,
        Integer length,
        Integer width,
        Integer height,
        BigDecimal weight,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ShipmentParcelTemplateDto fromEntity(ShipmentParcelTemplateDao eShipmentParcelTemplateDao) {
        return new ShipmentParcelTemplateDto(
                eShipmentParcelTemplateDao.getName(),
                eShipmentParcelTemplateDao.getCreation(),
                eShipmentParcelTemplateDao.getModified(),
                eShipmentParcelTemplateDao.getModifiedBy(),
                eShipmentParcelTemplateDao.getOwner(),
                eShipmentParcelTemplateDao.getIsDocStatus(),
                eShipmentParcelTemplateDao.getIdx(),
                eShipmentParcelTemplateDao.getParcelTemplateName(),
                eShipmentParcelTemplateDao.getLength(),
                eShipmentParcelTemplateDao.getWidth(),
                eShipmentParcelTemplateDao.getHeight(),
                eShipmentParcelTemplateDao.getWeight(),
                eShipmentParcelTemplateDao.getUserTags(),
                eShipmentParcelTemplateDao.getComments(),
                eShipmentParcelTemplateDao.getAssign(),
                eShipmentParcelTemplateDao.getLikedBy());
    }

    public static void fromDTO(ShipmentParcelTemplateDto vShipmentParcelTemplateDto, ShipmentParcelTemplateDao eShipmentParcelTemplateDao) {
        eShipmentParcelTemplateDao.setName(vShipmentParcelTemplateDto.name());
        eShipmentParcelTemplateDao.setCreation(vShipmentParcelTemplateDto.creation());
        eShipmentParcelTemplateDao.setModified(vShipmentParcelTemplateDto.modified());
        eShipmentParcelTemplateDao.setModifiedBy(vShipmentParcelTemplateDto.modifiedBy());
        eShipmentParcelTemplateDao.setOwner(vShipmentParcelTemplateDto.owner());
        eShipmentParcelTemplateDao.setIsDocStatus(vShipmentParcelTemplateDto.isDocStatus());
        eShipmentParcelTemplateDao.setIdx(vShipmentParcelTemplateDto.idx());
        eShipmentParcelTemplateDao.setParcelTemplateName(vShipmentParcelTemplateDto.parcelTemplateName());
        eShipmentParcelTemplateDao.setLength(vShipmentParcelTemplateDto.length());
        eShipmentParcelTemplateDao.setWidth(vShipmentParcelTemplateDto.width());
        eShipmentParcelTemplateDao.setHeight(vShipmentParcelTemplateDto.height());
        eShipmentParcelTemplateDao.setWeight(vShipmentParcelTemplateDto.weight());
        eShipmentParcelTemplateDao.setUserTags(vShipmentParcelTemplateDto.userTags());
        eShipmentParcelTemplateDao.setComments(vShipmentParcelTemplateDto.comments());
        eShipmentParcelTemplateDao.setAssign(vShipmentParcelTemplateDto.assign());
        eShipmentParcelTemplateDao.setLikedBy(vShipmentParcelTemplateDto.likedBy());
    }
}