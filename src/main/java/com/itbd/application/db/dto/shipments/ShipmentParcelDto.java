package com.itbd.application.db.dto.shipments;

import com.itbd.application.db.dao.stock.shipment.ShipmentParcelDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ShipmentParcelDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Integer length,
        Integer width,
        Integer height,
        BigDecimal weight,
        Integer count,
        String parent,
        String parentField,
        String parentType
) {
    public static ShipmentParcelDto fromEntity(ShipmentParcelDao eShipmentParcelDao) {
        return new ShipmentParcelDto(
                eShipmentParcelDao.getName(),
                eShipmentParcelDao.getCreation(),
                eShipmentParcelDao.getModified(),
                eShipmentParcelDao.getModifiedBy(),
                eShipmentParcelDao.getOwner(),
                eShipmentParcelDao.getIsDocStatus(),
                eShipmentParcelDao.getIdx(),
                eShipmentParcelDao.getLength(),
                eShipmentParcelDao.getWidth(),
                eShipmentParcelDao.getHeight(),
                eShipmentParcelDao.getWeight(),
                eShipmentParcelDao.getCount(),
                eShipmentParcelDao.getParent(),
                eShipmentParcelDao.getParentField(),
                eShipmentParcelDao.getParentType());
    }

    public static void fromDTO(ShipmentParcelDto vShipmentParcelDto, ShipmentParcelDao eShipmentParcelDao) {
        eShipmentParcelDao.setName(vShipmentParcelDto.name());
        eShipmentParcelDao.setCreation(vShipmentParcelDto.creation());
        eShipmentParcelDao.setModified(vShipmentParcelDto.modified());
        eShipmentParcelDao.setModifiedBy(vShipmentParcelDto.modifiedBy());
        eShipmentParcelDao.setOwner(vShipmentParcelDto.owner());
        eShipmentParcelDao.setIsDocStatus(vShipmentParcelDto.isDocStatus());
        eShipmentParcelDao.setIdx(vShipmentParcelDto.idx());
        eShipmentParcelDao.setLength(vShipmentParcelDto.length());
        eShipmentParcelDao.setWidth(vShipmentParcelDto.width());
        eShipmentParcelDao.setHeight(vShipmentParcelDto.height());
        eShipmentParcelDao.setWeight(vShipmentParcelDto.weight());
        eShipmentParcelDao.setCount(vShipmentParcelDto.count());
        eShipmentParcelDao.setParent(vShipmentParcelDto.parent());
        eShipmentParcelDao.setParentField(vShipmentParcelDto.parentField());
        eShipmentParcelDao.setParentType(vShipmentParcelDto.parentType());
    }
}