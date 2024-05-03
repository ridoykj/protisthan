package com.itbd.application.db.dto.supplier;

import com.itbd.application.db.dao.supplier.SupplierDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record SupplierDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String namingSeries,
        String supplierName,
        String country,
        String supplierGroup,
        String supplierType,
        Boolean isTransporter,
        String image,
        String defaultCurrency,
        String defaultBankAccount,
        String defaultPriceList,
        Boolean isInternalSupplier,
        String representsCompany,
        String supplierDetails,
        String website,
        String language,
        String taxId,
        String taxCategory,
        String taxWithholdingCategory,
        String supplierPrimaryAddress,
        String primaryAddress,
        String supplierPrimaryContact,
        String mobileNo,
        String emailId,
        String paymentTerms,
        Boolean allowPurchaseInvoiceCreationWithoutPurchaseOrder,
        Boolean allowPurchaseInvoiceCreationWithoutPurchaseReceipt,
        Boolean isFrozen,
        Boolean disabled,
        Boolean warnRfqs,
        Boolean warnPos,
        Boolean preventRfqs,
        Boolean preventPos,
        Boolean onHold,
        String holdType,
        LocalDate releaseDate,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static SupplierDto fromEntity(SupplierDao eSupplierDao) {
        return new SupplierDto(
                eSupplierDao.getName(),
                eSupplierDao.getCreation(),
                eSupplierDao.getModified(),
                eSupplierDao.getModifiedBy(),
                eSupplierDao.getOwner(),
                eSupplierDao.getIsDocStatus(),
                eSupplierDao.getIdx(),
                eSupplierDao.getNamingSeries(),
                eSupplierDao.getSupplierName(),
                eSupplierDao.getCountry(),
                eSupplierDao.getSupplierGroup(),
                eSupplierDao.getSupplierType(),
                eSupplierDao.getIsTransporter(),
                eSupplierDao.getImage(),
                eSupplierDao.getDefaultCurrency(),
                eSupplierDao.getDefaultBankAccount(),
                eSupplierDao.getDefaultPriceList(),
                eSupplierDao.getIsInternalSupplier(),
                eSupplierDao.getRepresentsCompany(),
                eSupplierDao.getSupplierDetails(),
                eSupplierDao.getWebsite(),
                eSupplierDao.getLanguage(),
                eSupplierDao.getTaxId(),
                eSupplierDao.getTaxCategory(),
                eSupplierDao.getTaxWithholdingCategory(),
                eSupplierDao.getSupplierPrimaryAddress(),
                eSupplierDao.getPrimaryAddress(),
                eSupplierDao.getSupplierPrimaryContact(),
                eSupplierDao.getMobileNo(),
                eSupplierDao.getEmailId(),
                eSupplierDao.getPaymentTerms(),
                eSupplierDao.getAllowPurchaseInvoiceCreationWithoutPurchaseOrder(),
                eSupplierDao.getAllowPurchaseInvoiceCreationWithoutPurchaseReceipt(),
                eSupplierDao.getIsFrozen(),
                eSupplierDao.getDisabled(),
                eSupplierDao.getWarnRfqs(),
                eSupplierDao.getWarnPos(),
                eSupplierDao.getPreventRfqs(),
                eSupplierDao.getPreventPos(),
                eSupplierDao.getOnHold(),
                eSupplierDao.getHoldType(),
                eSupplierDao.getReleaseDate(),
                eSupplierDao.getUserTags(),
                eSupplierDao.getComments(),
                eSupplierDao.getAssign(),
                eSupplierDao.getLikedBy());
    }

    public static void fromDTO(SupplierDto vSupplierDto, SupplierDao eSupplierDao) {
        eSupplierDao.setName(vSupplierDto.name() != null ? vSupplierDto.name() : (vSupplierDto.supplierName()+"_"+vSupplierDto.supplierType()).toLowerCase().replaceAll("\\s","_"));
        eSupplierDao.setCreation(vSupplierDto.creation());
        eSupplierDao.setModified(vSupplierDto.modified());
        eSupplierDao.setModifiedBy(vSupplierDto.modifiedBy());
        eSupplierDao.setOwner(vSupplierDto.owner());
        eSupplierDao.setIsDocStatus(vSupplierDto.isDocStatus());
        eSupplierDao.setIdx(vSupplierDto.idx());
        eSupplierDao.setNamingSeries(vSupplierDto.namingSeries());
        eSupplierDao.setSupplierName(vSupplierDto.supplierName());
        eSupplierDao.setCountry(vSupplierDto.country());
        eSupplierDao.setSupplierGroup(vSupplierDto.supplierGroup());
        eSupplierDao.setSupplierType(vSupplierDto.supplierType());
        eSupplierDao.setIsTransporter(vSupplierDto.isTransporter());
        eSupplierDao.setImage(vSupplierDto.image());
        eSupplierDao.setDefaultCurrency(vSupplierDto.defaultCurrency());
        eSupplierDao.setDefaultBankAccount(vSupplierDto.defaultBankAccount());
        eSupplierDao.setDefaultPriceList(vSupplierDto.defaultPriceList());
        eSupplierDao.setIsInternalSupplier(vSupplierDto.isInternalSupplier());
        eSupplierDao.setRepresentsCompany(vSupplierDto.representsCompany());
        eSupplierDao.setSupplierDetails(vSupplierDto.supplierDetails());
        eSupplierDao.setWebsite(vSupplierDto.website());
        eSupplierDao.setLanguage(vSupplierDto.language());
        eSupplierDao.setTaxId(vSupplierDto.taxId());
        eSupplierDao.setTaxCategory(vSupplierDto.taxCategory());
        eSupplierDao.setTaxWithholdingCategory(vSupplierDto.taxWithholdingCategory());
        eSupplierDao.setSupplierPrimaryAddress(vSupplierDto.supplierPrimaryAddress());
        eSupplierDao.setPrimaryAddress(vSupplierDto.primaryAddress());
        eSupplierDao.setSupplierPrimaryContact(vSupplierDto.supplierPrimaryContact());
        eSupplierDao.setMobileNo(vSupplierDto.mobileNo());
        eSupplierDao.setEmailId(vSupplierDto.emailId());
        eSupplierDao.setPaymentTerms(vSupplierDto.paymentTerms());
        eSupplierDao.setAllowPurchaseInvoiceCreationWithoutPurchaseOrder(vSupplierDto.allowPurchaseInvoiceCreationWithoutPurchaseOrder());
        eSupplierDao.setAllowPurchaseInvoiceCreationWithoutPurchaseReceipt(vSupplierDto.allowPurchaseInvoiceCreationWithoutPurchaseReceipt());
        eSupplierDao.setIsFrozen(vSupplierDto.isFrozen());
        eSupplierDao.setDisabled(vSupplierDto.disabled());
        eSupplierDao.setWarnRfqs(vSupplierDto.warnRfqs());
        eSupplierDao.setWarnPos(vSupplierDto.warnPos());
        eSupplierDao.setPreventRfqs(vSupplierDto.preventRfqs());
        eSupplierDao.setPreventPos(vSupplierDto.preventPos());
        eSupplierDao.setOnHold(vSupplierDto.onHold());
        eSupplierDao.setHoldType(vSupplierDto.holdType());
        eSupplierDao.setReleaseDate(vSupplierDto.releaseDate());
        eSupplierDao.setUserTags(vSupplierDto.userTags());
        eSupplierDao.setComments(vSupplierDto.comments());
        eSupplierDao.setAssign(vSupplierDto.assign());
        eSupplierDao.setLikedBy(vSupplierDto.likedBy());
    }
}