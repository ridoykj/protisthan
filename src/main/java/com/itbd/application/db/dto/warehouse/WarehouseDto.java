package com.itbd.application.db.dto.warehouse;

import com.itbd.application.db.dao.warehouse.WarehouseDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record WarehouseDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Boolean disabled,
        String warehouseName,
        Boolean isGroup,
        String parentWarehouse,
        Boolean isRejectedWarehouse,
        String account,
        String company,
        String emailId,
        String phoneNo,
        String mobileNo,
        String addressLine1,
        String addressLine2,
        String city,
        String state,
        String pin,
        String warehouseType,
        String defaultInTransitWarehouse,
        Integer lft,
        Integer rgt,
        String oldParent,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static WarehouseDto fromEntity(WarehouseDao eWarehouseDao) {
        return new WarehouseDto(
                eWarehouseDao.getName(),
                eWarehouseDao.getCreation(),
                eWarehouseDao.getModified(),
                eWarehouseDao.getModifiedBy(),
                eWarehouseDao.getOwner(),
                eWarehouseDao.getIsDocStatus(),
                eWarehouseDao.getIdx(),
                eWarehouseDao.getDisabled(),
                eWarehouseDao.getWarehouseName(),
                eWarehouseDao.getIsGroup(),
                eWarehouseDao.getParentWarehouse(),
                eWarehouseDao.getIsRejectedWarehouse(),
                eWarehouseDao.getAccount(),
                eWarehouseDao.getCompany(),
                eWarehouseDao.getEmailId(),
                eWarehouseDao.getPhoneNo(),
                eWarehouseDao.getMobileNo(),
                eWarehouseDao.getAddressLine1(),
                eWarehouseDao.getAddressLine2(),
                eWarehouseDao.getCity(),
                eWarehouseDao.getState(),
                eWarehouseDao.getPin(),
                eWarehouseDao.getWarehouseType(),
                eWarehouseDao.getDefaultInTransitWarehouse(),
                eWarehouseDao.getLft(),
                eWarehouseDao.getRgt(),
                eWarehouseDao.getOldParent(),
                eWarehouseDao.getUserTags(),
                eWarehouseDao.getComments(),
                eWarehouseDao.getAssign(),
                eWarehouseDao.getLikedBy());
    }

    public static void fromDTO(WarehouseDto vWarehouseDto, WarehouseDao eWarehouseDao) {
        eWarehouseDao.setName(vWarehouseDto.name());
        eWarehouseDao.setCreation(vWarehouseDto.creation());
        eWarehouseDao.setModified(vWarehouseDto.modified());
        eWarehouseDao.setModifiedBy(vWarehouseDto.modifiedBy());
        eWarehouseDao.setOwner(vWarehouseDto.owner());
        eWarehouseDao.setIsDocStatus(vWarehouseDto.isDocStatus());
        eWarehouseDao.setIdx(vWarehouseDto.idx());
        eWarehouseDao.setDisabled(vWarehouseDto.disabled());
        eWarehouseDao.setWarehouseName(vWarehouseDto.warehouseName());
        eWarehouseDao.setIsGroup(vWarehouseDto.isGroup());
        eWarehouseDao.setParentWarehouse(vWarehouseDto.parentWarehouse());
        eWarehouseDao.setIsRejectedWarehouse(vWarehouseDto.isRejectedWarehouse());
        eWarehouseDao.setAccount(vWarehouseDto.account());
        eWarehouseDao.setCompany(vWarehouseDto.company());
        eWarehouseDao.setEmailId(vWarehouseDto.emailId());
        eWarehouseDao.setPhoneNo(vWarehouseDto.phoneNo());
        eWarehouseDao.setMobileNo(vWarehouseDto.mobileNo());
        eWarehouseDao.setAddressLine1(vWarehouseDto.addressLine1());
        eWarehouseDao.setAddressLine2(vWarehouseDto.addressLine2());
        eWarehouseDao.setCity(vWarehouseDto.city());
        eWarehouseDao.setState(vWarehouseDto.state());
        eWarehouseDao.setPin(vWarehouseDto.pin());
        eWarehouseDao.setWarehouseType(vWarehouseDto.warehouseType());
        eWarehouseDao.setDefaultInTransitWarehouse(vWarehouseDto.defaultInTransitWarehouse());
        eWarehouseDao.setLft(vWarehouseDto.lft());
        eWarehouseDao.setRgt(vWarehouseDto.rgt());
        eWarehouseDao.setOldParent(vWarehouseDto.oldParent());
        eWarehouseDao.setUserTags(vWarehouseDto.userTags());
        eWarehouseDao.setComments(vWarehouseDto.comments());
        eWarehouseDao.setAssign(vWarehouseDto.assign());
        eWarehouseDao.setLikedBy(vWarehouseDto.likedBy());
    }
}