package com.itbd.application.db.dto;

import com.itbd.application.db.dao.PickListDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PickListDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String namingSeries,
        String company,
        String purpose,
        String customer,
        String customerName,
        String workOrder,
        String materialRequest,
        BigDecimal forQty,
        String parentWarehouse,
        Boolean considerRejectedWarehouses,
        String scanBarcode,
        Boolean scanMode,
        Boolean promptQty,
        String amendedFrom,
        Boolean groupSameItems,
        String status,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static PickListDto fromEntity(PickListDao ePickListDao) {
        return new PickListDto(
                ePickListDao.getName(),
                ePickListDao.getCreation(),
                ePickListDao.getModified(),
                ePickListDao.getModifiedBy(),
                ePickListDao.getOwner(),
                ePickListDao.getIsDocStatus(),
                ePickListDao.getIdx(),
                ePickListDao.getNamingSeries(),
                ePickListDao.getCompany(),
                ePickListDao.getPurpose(),
                ePickListDao.getCustomer(),
                ePickListDao.getCustomerName(),
                ePickListDao.getWorkOrder(),
                ePickListDao.getMaterialRequest(),
                ePickListDao.getForQty(),
                ePickListDao.getParentWarehouse(),
                ePickListDao.getConsiderRejectedWarehouses(),
                ePickListDao.getScanBarcode(),
                ePickListDao.getScanMode(),
                ePickListDao.getPromptQty(),
                ePickListDao.getAmendedFrom(),
                ePickListDao.getGroupSameItems(),
                ePickListDao.getStatus(),
                ePickListDao.getUserTags(),
                ePickListDao.getComments(),
                ePickListDao.getAssign(),
                ePickListDao.getLikedBy());
    }

    public static void fromDTO(PickListDto vPickListDto, PickListDao ePickListDao) {
        ePickListDao.setName(vPickListDto.name());
        ePickListDao.setCreation(vPickListDto.creation());
        ePickListDao.setModified(vPickListDto.modified());
        ePickListDao.setModifiedBy(vPickListDto.modifiedBy());
        ePickListDao.setOwner(vPickListDto.owner());
        ePickListDao.setIsDocStatus(vPickListDto.isDocStatus());
        ePickListDao.setIdx(vPickListDto.idx());
        ePickListDao.setNamingSeries(vPickListDto.namingSeries());
        ePickListDao.setCompany(vPickListDto.company());
        ePickListDao.setPurpose(vPickListDto.purpose());
        ePickListDao.setCustomer(vPickListDto.customer());
        ePickListDao.setCustomerName(vPickListDto.customerName());
        ePickListDao.setWorkOrder(vPickListDto.workOrder());
        ePickListDao.setMaterialRequest(vPickListDto.materialRequest());
        ePickListDao.setForQty(vPickListDto.forQty());
        ePickListDao.setParentWarehouse(vPickListDto.parentWarehouse());
        ePickListDao.setConsiderRejectedWarehouses(vPickListDto.considerRejectedWarehouses());
        ePickListDao.setScanBarcode(vPickListDto.scanBarcode());
        ePickListDao.setScanMode(vPickListDto.scanMode());
        ePickListDao.setPromptQty(vPickListDto.promptQty());
        ePickListDao.setAmendedFrom(vPickListDto.amendedFrom());
        ePickListDao.setGroupSameItems(vPickListDto.groupSameItems());
        ePickListDao.setStatus(vPickListDto.status());
        ePickListDao.setUserTags(vPickListDto.userTags());
        ePickListDao.setComments(vPickListDto.comments());
        ePickListDao.setAssign(vPickListDto.assign());
        ePickListDao.setLikedBy(vPickListDto.likedBy());
    }
}