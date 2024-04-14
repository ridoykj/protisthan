package com.itbd.application.db.dto.tasks;

import com.itbd.application.db.dao.tasks.TaxRuleDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record TaxRuleDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String taxType,
        Boolean useForShoppingCart,
        String salesTaxTemplate,
        String purchaseTaxTemplate,
        String customer,
        String supplier,
        String item,
        String billingCity,
        String billingCounty,
        String billingState,
        String billingZipcode,
        String billingCountry,
        String taxCategory,
        String customerGroup,
        String supplierGroup,
        String itemGroup,
        String shippingCity,
        String shippingCounty,
        String shippingState,
        String shippingZipcode,
        String shippingCountry,
        LocalDate fromDate,
        LocalDate toDate,
        Integer priority,
        String company,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static TaxRuleDto fromEntity(TaxRuleDao eTaxRuleDao) {
        return new TaxRuleDto(
                eTaxRuleDao.getName(),
                eTaxRuleDao.getCreation(),
                eTaxRuleDao.getModified(),
                eTaxRuleDao.getModifiedBy(),
                eTaxRuleDao.getOwner(),
                eTaxRuleDao.getIsDocStatus(),
                eTaxRuleDao.getIdx(),
                eTaxRuleDao.getTaxType(),
                eTaxRuleDao.getUseForShoppingCart(),
                eTaxRuleDao.getSalesTaxTemplate(),
                eTaxRuleDao.getPurchaseTaxTemplate(),
                eTaxRuleDao.getCustomer(),
                eTaxRuleDao.getSupplier(),
                eTaxRuleDao.getItem(),
                eTaxRuleDao.getBillingCity(),
                eTaxRuleDao.getBillingCounty(),
                eTaxRuleDao.getBillingState(),
                eTaxRuleDao.getBillingZipcode(),
                eTaxRuleDao.getBillingCountry(),
                eTaxRuleDao.getTaxCategory(),
                eTaxRuleDao.getCustomerGroup(),
                eTaxRuleDao.getSupplierGroup(),
                eTaxRuleDao.getItemGroup(),
                eTaxRuleDao.getShippingCity(),
                eTaxRuleDao.getShippingCounty(),
                eTaxRuleDao.getShippingState(),
                eTaxRuleDao.getShippingZipcode(),
                eTaxRuleDao.getShippingCountry(),
                eTaxRuleDao.getFromDate(),
                eTaxRuleDao.getToDate(),
                eTaxRuleDao.getPriority(),
                eTaxRuleDao.getCompany(),
                eTaxRuleDao.getUserTags(),
                eTaxRuleDao.getComments(),
                eTaxRuleDao.getAssign(),
                eTaxRuleDao.getLikedBy());
    }

    public static void fromDTO(TaxRuleDto vTaxRuleDto, TaxRuleDao eTaxRuleDao) {
        eTaxRuleDao.setName(vTaxRuleDto.name());
        eTaxRuleDao.setCreation(vTaxRuleDto.creation());
        eTaxRuleDao.setModified(vTaxRuleDto.modified());
        eTaxRuleDao.setModifiedBy(vTaxRuleDto.modifiedBy());
        eTaxRuleDao.setOwner(vTaxRuleDto.owner());
        eTaxRuleDao.setIsDocStatus(vTaxRuleDto.isDocStatus());
        eTaxRuleDao.setIdx(vTaxRuleDto.idx());
        eTaxRuleDao.setTaxType(vTaxRuleDto.taxType());
        eTaxRuleDao.setUseForShoppingCart(vTaxRuleDto.useForShoppingCart());
        eTaxRuleDao.setSalesTaxTemplate(vTaxRuleDto.salesTaxTemplate());
        eTaxRuleDao.setPurchaseTaxTemplate(vTaxRuleDto.purchaseTaxTemplate());
        eTaxRuleDao.setCustomer(vTaxRuleDto.customer());
        eTaxRuleDao.setSupplier(vTaxRuleDto.supplier());
        eTaxRuleDao.setItem(vTaxRuleDto.item());
        eTaxRuleDao.setBillingCity(vTaxRuleDto.billingCity());
        eTaxRuleDao.setBillingCounty(vTaxRuleDto.billingCounty());
        eTaxRuleDao.setBillingState(vTaxRuleDto.billingState());
        eTaxRuleDao.setBillingZipcode(vTaxRuleDto.billingZipcode());
        eTaxRuleDao.setBillingCountry(vTaxRuleDto.billingCountry());
        eTaxRuleDao.setTaxCategory(vTaxRuleDto.taxCategory());
        eTaxRuleDao.setCustomerGroup(vTaxRuleDto.customerGroup());
        eTaxRuleDao.setSupplierGroup(vTaxRuleDto.supplierGroup());
        eTaxRuleDao.setItemGroup(vTaxRuleDto.itemGroup());
        eTaxRuleDao.setShippingCity(vTaxRuleDto.shippingCity());
        eTaxRuleDao.setShippingCounty(vTaxRuleDto.shippingCounty());
        eTaxRuleDao.setShippingState(vTaxRuleDto.shippingState());
        eTaxRuleDao.setShippingZipcode(vTaxRuleDto.shippingZipcode());
        eTaxRuleDao.setShippingCountry(vTaxRuleDto.shippingCountry());
        eTaxRuleDao.setFromDate(vTaxRuleDto.fromDate());
        eTaxRuleDao.setToDate(vTaxRuleDto.toDate());
        eTaxRuleDao.setPriority(vTaxRuleDto.priority());
        eTaxRuleDao.setCompany(vTaxRuleDto.company());
        eTaxRuleDao.setUserTags(vTaxRuleDto.userTags());
        eTaxRuleDao.setComments(vTaxRuleDto.comments());
        eTaxRuleDao.setAssign(vTaxRuleDto.assign());
        eTaxRuleDao.setLikedBy(vTaxRuleDto.likedBy());
    }
}