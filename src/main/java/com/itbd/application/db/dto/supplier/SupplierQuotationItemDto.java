package com.itbd.application.db.dto.supplier;

import com.itbd.application.db.dao.buying.supplier.SupplierQuotationItemDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record SupplierQuotationItemDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String itemCode,
        String supplierPartNo,
        String itemName,
        Integer leadTimeDays,
        LocalDate expectedDeliveryDate,
        Boolean isFreeItem,
        String description,
        String itemGroup,
        String brand,
        String image,
        BigDecimal qty,
        String stockUom,
        String uom,
        BigDecimal conversionFactor,
        BigDecimal stockQty,
        BigDecimal priceListRate,
        BigDecimal discountPercentage,
        BigDecimal discountAmount,
        BigDecimal basePriceListRate,
        BigDecimal rate,
        BigDecimal amount,
        String itemTaxTemplate,
        BigDecimal baseRate,
        BigDecimal baseAmount,
        String pricingRules,
        BigDecimal netRate,
        BigDecimal netAmount,
        BigDecimal baseNetRate,
        BigDecimal baseNetAmount,
        BigDecimal weightPerUnit,
        BigDecimal totalWeight,
        String weightUom,
        String warehouse,
        String prevDocumentDocType,
        String materialRequest,
        String salesOrder,
        String requestForQuotation,
        String materialRequestItem,
        String requestForQuotationItem,
        String itemTaxRate,
        String manufacturer,
        String manufacturerPartNo,
        String costCenter,
        String project,
        Boolean pageBreak,
        String parent,
        String parentField,
        String parentType
) {
    public static SupplierQuotationItemDto fromEntity(SupplierQuotationItemDao eSupplierQuotationItemDao) {
        return new SupplierQuotationItemDto(
                eSupplierQuotationItemDao.getName(),
                eSupplierQuotationItemDao.getCreation(),
                eSupplierQuotationItemDao.getModified(),
                eSupplierQuotationItemDao.getModifiedBy(),
                eSupplierQuotationItemDao.getOwner(),
                eSupplierQuotationItemDao.getIsDocStatus(),
                eSupplierQuotationItemDao.getIdx(),
                eSupplierQuotationItemDao.getItemCode(),
                eSupplierQuotationItemDao.getSupplierPartNo(),
                eSupplierQuotationItemDao.getItemName(),
                eSupplierQuotationItemDao.getLeadTimeDays(),
                eSupplierQuotationItemDao.getExpectedDeliveryDate(),
                eSupplierQuotationItemDao.getIsFreeItem(),
                eSupplierQuotationItemDao.getDescription(),
                eSupplierQuotationItemDao.getItemGroup(),
                eSupplierQuotationItemDao.getBrand(),
                eSupplierQuotationItemDao.getImage(),
                eSupplierQuotationItemDao.getQty(),
                eSupplierQuotationItemDao.getStockUom(),
                eSupplierQuotationItemDao.getUom(),
                eSupplierQuotationItemDao.getConversionFactor(),
                eSupplierQuotationItemDao.getStockQty(),
                eSupplierQuotationItemDao.getPriceListRate(),
                eSupplierQuotationItemDao.getDiscountPercentage(),
                eSupplierQuotationItemDao.getDiscountAmount(),
                eSupplierQuotationItemDao.getBasePriceListRate(),
                eSupplierQuotationItemDao.getRate(),
                eSupplierQuotationItemDao.getAmount(),
                eSupplierQuotationItemDao.getItemTaxTemplate(),
                eSupplierQuotationItemDao.getBaseRate(),
                eSupplierQuotationItemDao.getBaseAmount(),
                eSupplierQuotationItemDao.getPricingRules(),
                eSupplierQuotationItemDao.getNetRate(),
                eSupplierQuotationItemDao.getNetAmount(),
                eSupplierQuotationItemDao.getBaseNetRate(),
                eSupplierQuotationItemDao.getBaseNetAmount(),
                eSupplierQuotationItemDao.getWeightPerUnit(),
                eSupplierQuotationItemDao.getTotalWeight(),
                eSupplierQuotationItemDao.getWeightUom(),
                eSupplierQuotationItemDao.getWarehouse(),
                eSupplierQuotationItemDao.getPrevDocumentDocType(),
                eSupplierQuotationItemDao.getMaterialRequest(),
                eSupplierQuotationItemDao.getSalesOrder(),
                eSupplierQuotationItemDao.getRequestForQuotation(),
                eSupplierQuotationItemDao.getMaterialRequestItem(),
                eSupplierQuotationItemDao.getRequestForQuotationItem(),
                eSupplierQuotationItemDao.getItemTaxRate(),
                eSupplierQuotationItemDao.getManufacturer(),
                eSupplierQuotationItemDao.getManufacturerPartNo(),
                eSupplierQuotationItemDao.getCostCenter(),
                eSupplierQuotationItemDao.getProject(),
                eSupplierQuotationItemDao.getPageBreak(),
                eSupplierQuotationItemDao.getParent(),
                eSupplierQuotationItemDao.getParentField(),
                eSupplierQuotationItemDao.getParentType());
    }

    public static void fromDTO(SupplierQuotationItemDto vSupplierQuotationItemDto, SupplierQuotationItemDao eSupplierQuotationItemDao) {
        eSupplierQuotationItemDao.setName(vSupplierQuotationItemDto.name());
        eSupplierQuotationItemDao.setCreation(vSupplierQuotationItemDto.creation());
        eSupplierQuotationItemDao.setModified(vSupplierQuotationItemDto.modified());
        eSupplierQuotationItemDao.setModifiedBy(vSupplierQuotationItemDto.modifiedBy());
        eSupplierQuotationItemDao.setOwner(vSupplierQuotationItemDto.owner());
        eSupplierQuotationItemDao.setIsDocStatus(vSupplierQuotationItemDto.isDocStatus());
        eSupplierQuotationItemDao.setIdx(vSupplierQuotationItemDto.idx());
        eSupplierQuotationItemDao.setItemCode(vSupplierQuotationItemDto.itemCode());
        eSupplierQuotationItemDao.setSupplierPartNo(vSupplierQuotationItemDto.supplierPartNo());
        eSupplierQuotationItemDao.setItemName(vSupplierQuotationItemDto.itemName());
        eSupplierQuotationItemDao.setLeadTimeDays(vSupplierQuotationItemDto.leadTimeDays());
        eSupplierQuotationItemDao.setExpectedDeliveryDate(vSupplierQuotationItemDto.expectedDeliveryDate());
        eSupplierQuotationItemDao.setIsFreeItem(vSupplierQuotationItemDto.isFreeItem());
        eSupplierQuotationItemDao.setDescription(vSupplierQuotationItemDto.description());
        eSupplierQuotationItemDao.setItemGroup(vSupplierQuotationItemDto.itemGroup());
        eSupplierQuotationItemDao.setBrand(vSupplierQuotationItemDto.brand());
        eSupplierQuotationItemDao.setImage(vSupplierQuotationItemDto.image());
        eSupplierQuotationItemDao.setQty(vSupplierQuotationItemDto.qty());
        eSupplierQuotationItemDao.setStockUom(vSupplierQuotationItemDto.stockUom());
        eSupplierQuotationItemDao.setUom(vSupplierQuotationItemDto.uom());
        eSupplierQuotationItemDao.setConversionFactor(vSupplierQuotationItemDto.conversionFactor());
        eSupplierQuotationItemDao.setStockQty(vSupplierQuotationItemDto.stockQty());
        eSupplierQuotationItemDao.setPriceListRate(vSupplierQuotationItemDto.priceListRate());
        eSupplierQuotationItemDao.setDiscountPercentage(vSupplierQuotationItemDto.discountPercentage());
        eSupplierQuotationItemDao.setDiscountAmount(vSupplierQuotationItemDto.discountAmount());
        eSupplierQuotationItemDao.setBasePriceListRate(vSupplierQuotationItemDto.basePriceListRate());
        eSupplierQuotationItemDao.setRate(vSupplierQuotationItemDto.rate());
        eSupplierQuotationItemDao.setAmount(vSupplierQuotationItemDto.amount());
        eSupplierQuotationItemDao.setItemTaxTemplate(vSupplierQuotationItemDto.itemTaxTemplate());
        eSupplierQuotationItemDao.setBaseRate(vSupplierQuotationItemDto.baseRate());
        eSupplierQuotationItemDao.setBaseAmount(vSupplierQuotationItemDto.baseAmount());
        eSupplierQuotationItemDao.setPricingRules(vSupplierQuotationItemDto.pricingRules());
        eSupplierQuotationItemDao.setNetRate(vSupplierQuotationItemDto.netRate());
        eSupplierQuotationItemDao.setNetAmount(vSupplierQuotationItemDto.netAmount());
        eSupplierQuotationItemDao.setBaseNetRate(vSupplierQuotationItemDto.baseNetRate());
        eSupplierQuotationItemDao.setBaseNetAmount(vSupplierQuotationItemDto.baseNetAmount());
        eSupplierQuotationItemDao.setWeightPerUnit(vSupplierQuotationItemDto.weightPerUnit());
        eSupplierQuotationItemDao.setTotalWeight(vSupplierQuotationItemDto.totalWeight());
        eSupplierQuotationItemDao.setWeightUom(vSupplierQuotationItemDto.weightUom());
        eSupplierQuotationItemDao.setWarehouse(vSupplierQuotationItemDto.warehouse());
        eSupplierQuotationItemDao.setPrevDocumentDocType(vSupplierQuotationItemDto.prevDocumentDocType());
        eSupplierQuotationItemDao.setMaterialRequest(vSupplierQuotationItemDto.materialRequest());
        eSupplierQuotationItemDao.setSalesOrder(vSupplierQuotationItemDto.salesOrder());
        eSupplierQuotationItemDao.setRequestForQuotation(vSupplierQuotationItemDto.requestForQuotation());
        eSupplierQuotationItemDao.setMaterialRequestItem(vSupplierQuotationItemDto.materialRequestItem());
        eSupplierQuotationItemDao.setRequestForQuotationItem(vSupplierQuotationItemDto.requestForQuotationItem());
        eSupplierQuotationItemDao.setItemTaxRate(vSupplierQuotationItemDto.itemTaxRate());
        eSupplierQuotationItemDao.setManufacturer(vSupplierQuotationItemDto.manufacturer());
        eSupplierQuotationItemDao.setManufacturerPartNo(vSupplierQuotationItemDto.manufacturerPartNo());
        eSupplierQuotationItemDao.setCostCenter(vSupplierQuotationItemDto.costCenter());
        eSupplierQuotationItemDao.setProject(vSupplierQuotationItemDto.project());
        eSupplierQuotationItemDao.setPageBreak(vSupplierQuotationItemDto.pageBreak());
        eSupplierQuotationItemDao.setParent(vSupplierQuotationItemDto.parent());
        eSupplierQuotationItemDao.setParentField(vSupplierQuotationItemDto.parentField());
        eSupplierQuotationItemDao.setParentType(vSupplierQuotationItemDto.parentType());
    }
}