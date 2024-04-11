package com.itbd.application.db.dto.shipments;

import com.itbd.application.db.dao.shipments.ShipmentDeliveryNoteDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ShipmentDeliveryNoteDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String deliveryNote,
        BigDecimal grandTotal,
        String parent,
        String parentField,
        String parentType
) {
    public static ShipmentDeliveryNoteDto fromEntity(ShipmentDeliveryNoteDao eShipmentDeliveryNoteDao) {
        return new ShipmentDeliveryNoteDto(
                eShipmentDeliveryNoteDao.getName(),
                eShipmentDeliveryNoteDao.getCreation(),
                eShipmentDeliveryNoteDao.getModified(),
                eShipmentDeliveryNoteDao.getModifiedBy(),
                eShipmentDeliveryNoteDao.getOwner(),
                eShipmentDeliveryNoteDao.getIsDocStatus(),
                eShipmentDeliveryNoteDao.getIdx(),
                eShipmentDeliveryNoteDao.getDeliveryNote(),
                eShipmentDeliveryNoteDao.getGrandTotal(),
                eShipmentDeliveryNoteDao.getParent(),
                eShipmentDeliveryNoteDao.getParentField(),
                eShipmentDeliveryNoteDao.getParentType());
    }

    public static void fromDTO(ShipmentDeliveryNoteDto vShipmentDeliveryNoteDto, ShipmentDeliveryNoteDao eShipmentDeliveryNoteDao) {
        eShipmentDeliveryNoteDao.setName(vShipmentDeliveryNoteDto.name());
        eShipmentDeliveryNoteDao.setCreation(vShipmentDeliveryNoteDto.creation());
        eShipmentDeliveryNoteDao.setModified(vShipmentDeliveryNoteDto.modified());
        eShipmentDeliveryNoteDao.setModifiedBy(vShipmentDeliveryNoteDto.modifiedBy());
        eShipmentDeliveryNoteDao.setOwner(vShipmentDeliveryNoteDto.owner());
        eShipmentDeliveryNoteDao.setIsDocStatus(vShipmentDeliveryNoteDto.isDocStatus());
        eShipmentDeliveryNoteDao.setIdx(vShipmentDeliveryNoteDto.idx());
        eShipmentDeliveryNoteDao.setDeliveryNote(vShipmentDeliveryNoteDto.deliveryNote());
        eShipmentDeliveryNoteDao.setGrandTotal(vShipmentDeliveryNoteDto.grandTotal());
        eShipmentDeliveryNoteDao.setParent(vShipmentDeliveryNoteDto.parent());
        eShipmentDeliveryNoteDao.setParentField(vShipmentDeliveryNoteDto.parentField());
        eShipmentDeliveryNoteDao.setParentType(vShipmentDeliveryNoteDto.parentType());
    }
}