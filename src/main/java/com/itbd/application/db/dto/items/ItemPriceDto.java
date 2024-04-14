package com.itbd.application.db.dto.items;

import com.itbd.application.db.dao.items.ItemPriceDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record ItemPriceDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String itemCode,
        String uom,
        Integer packingUnit,
        String itemName,
        String brand,
        String itemDescription,
        String priceList,
        String customer,
        String supplier,
        String batchNo,
        Boolean buying,
        Boolean selling,
        String currency,
        BigDecimal priceListRate,
        LocalDate validFrom,
        Integer leadTimeDays,
        LocalDate validUpto,
        String note,
        String reference,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ItemPriceDto fromEntity(ItemPriceDao eItemPriceDao) {
        return new ItemPriceDto(
                eItemPriceDao.getName(),
                eItemPriceDao.getCreation(),
                eItemPriceDao.getModified(),
                eItemPriceDao.getModifiedBy(),
                eItemPriceDao.getOwner(),
                eItemPriceDao.getIsDocStatus(),
                eItemPriceDao.getIdx(),
                eItemPriceDao.getItemCode(),
                eItemPriceDao.getUom(),
                eItemPriceDao.getPackingUnit(),
                eItemPriceDao.getItemName(),
                eItemPriceDao.getBrand(),
                eItemPriceDao.getItemDescription(),
                eItemPriceDao.getPriceList(),
                eItemPriceDao.getCustomer(),
                eItemPriceDao.getSupplier(),
                eItemPriceDao.getBatchNo(),
                eItemPriceDao.getBuying(),
                eItemPriceDao.getSelling(),
                eItemPriceDao.getCurrency(),
                eItemPriceDao.getPriceListRate(),
                eItemPriceDao.getValidFrom(),
                eItemPriceDao.getLeadTimeDays(),
                eItemPriceDao.getValidUpto(),
                eItemPriceDao.getNote(),
                eItemPriceDao.getReference(),
                eItemPriceDao.getUserTags(),
                eItemPriceDao.getComments(),
                eItemPriceDao.getAssign(),
                eItemPriceDao.getLikedBy());
    }

    public static void fromDTO(ItemPriceDto vItemPriceDto, ItemPriceDao eItemPriceDao) {
        eItemPriceDao.setName(vItemPriceDto.name());
        eItemPriceDao.setCreation(vItemPriceDto.creation());
        eItemPriceDao.setModified(vItemPriceDto.modified());
        eItemPriceDao.setModifiedBy(vItemPriceDto.modifiedBy());
        eItemPriceDao.setOwner(vItemPriceDto.owner());
        eItemPriceDao.setIsDocStatus(vItemPriceDto.isDocStatus());
        eItemPriceDao.setIdx(vItemPriceDto.idx());
        eItemPriceDao.setItemCode(vItemPriceDto.itemCode());
        eItemPriceDao.setUom(vItemPriceDto.uom());
        eItemPriceDao.setPackingUnit(vItemPriceDto.packingUnit());
        eItemPriceDao.setItemName(vItemPriceDto.itemName());
        eItemPriceDao.setBrand(vItemPriceDto.brand());
        eItemPriceDao.setItemDescription(vItemPriceDto.itemDescription());
        eItemPriceDao.setPriceList(vItemPriceDto.priceList());
        eItemPriceDao.setCustomer(vItemPriceDto.customer());
        eItemPriceDao.setSupplier(vItemPriceDto.supplier());
        eItemPriceDao.setBatchNo(vItemPriceDto.batchNo());
        eItemPriceDao.setBuying(vItemPriceDto.buying());
        eItemPriceDao.setSelling(vItemPriceDto.selling());
        eItemPriceDao.setCurrency(vItemPriceDto.currency());
        eItemPriceDao.setPriceListRate(vItemPriceDto.priceListRate());
        eItemPriceDao.setValidFrom(vItemPriceDto.validFrom());
        eItemPriceDao.setLeadTimeDays(vItemPriceDto.leadTimeDays());
        eItemPriceDao.setValidUpto(vItemPriceDto.validUpto());
        eItemPriceDao.setNote(vItemPriceDto.note());
        eItemPriceDao.setReference(vItemPriceDto.reference());
        eItemPriceDao.setUserTags(vItemPriceDto.userTags());
        eItemPriceDao.setComments(vItemPriceDto.comments());
        eItemPriceDao.setAssign(vItemPriceDto.assign());
        eItemPriceDao.setLikedBy(vItemPriceDto.likedBy());
    }
}