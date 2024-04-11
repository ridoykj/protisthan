package com.itbd.application.db.dto;

import com.itbd.application.db.dao.PackingSlipItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PackingSlipItemDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String itemCode,
        String itemName,
        String batchNo,
        String description,
        BigDecimal qty,
        BigDecimal netWeight,
        String stockUom,
        String weightUom,
        Boolean pageBreak,
        String dnDetail,
        String piDetail,
        String parent,
        String parentField,
        String parentType
) {
    public static PackingSlipItemDto fromEntity(PackingSlipItemDao ePackingSlipItemDao) {
        return new PackingSlipItemDto(
                ePackingSlipItemDao.getName(),
                ePackingSlipItemDao.getCreation(),
                ePackingSlipItemDao.getModified(),
                ePackingSlipItemDao.getModifiedBy(),
                ePackingSlipItemDao.getOwner(),
                ePackingSlipItemDao.getIsDocStatus(),
                ePackingSlipItemDao.getIdx(),
                ePackingSlipItemDao.getItemCode(),
                ePackingSlipItemDao.getItemName(),
                ePackingSlipItemDao.getBatchNo(),
                ePackingSlipItemDao.getDescription(),
                ePackingSlipItemDao.getQty(),
                ePackingSlipItemDao.getNetWeight(),
                ePackingSlipItemDao.getStockUom(),
                ePackingSlipItemDao.getWeightUom(),
                ePackingSlipItemDao.getPageBreak(),
                ePackingSlipItemDao.getDnDetail(),
                ePackingSlipItemDao.getPiDetail(),
                ePackingSlipItemDao.getParent(),
                ePackingSlipItemDao.getParentField(),
                ePackingSlipItemDao.getParentType());
    }

    public static void fromDTO(PackingSlipItemDto vPackingSlipItemDto, PackingSlipItemDao ePackingSlipItemDao) {
        ePackingSlipItemDao.setName(vPackingSlipItemDto.name());
        ePackingSlipItemDao.setCreation(vPackingSlipItemDto.creation());
        ePackingSlipItemDao.setModified(vPackingSlipItemDto.modified());
        ePackingSlipItemDao.setModifiedBy(vPackingSlipItemDto.modifiedBy());
        ePackingSlipItemDao.setOwner(vPackingSlipItemDto.owner());
        ePackingSlipItemDao.setIsDocStatus(vPackingSlipItemDto.isDocStatus());
        ePackingSlipItemDao.setIdx(vPackingSlipItemDto.idx());
        ePackingSlipItemDao.setItemCode(vPackingSlipItemDto.itemCode());
        ePackingSlipItemDao.setItemName(vPackingSlipItemDto.itemName());
        ePackingSlipItemDao.setBatchNo(vPackingSlipItemDto.batchNo());
        ePackingSlipItemDao.setDescription(vPackingSlipItemDto.description());
        ePackingSlipItemDao.setQty(vPackingSlipItemDto.qty());
        ePackingSlipItemDao.setNetWeight(vPackingSlipItemDto.netWeight());
        ePackingSlipItemDao.setStockUom(vPackingSlipItemDto.stockUom());
        ePackingSlipItemDao.setWeightUom(vPackingSlipItemDto.weightUom());
        ePackingSlipItemDao.setPageBreak(vPackingSlipItemDto.pageBreak());
        ePackingSlipItemDao.setDnDetail(vPackingSlipItemDto.dnDetail());
        ePackingSlipItemDao.setPiDetail(vPackingSlipItemDto.piDetail());
        ePackingSlipItemDao.setParent(vPackingSlipItemDto.parent());
        ePackingSlipItemDao.setParentField(vPackingSlipItemDto.parentField());
        ePackingSlipItemDao.setParentType(vPackingSlipItemDto.parentType());
    }
}