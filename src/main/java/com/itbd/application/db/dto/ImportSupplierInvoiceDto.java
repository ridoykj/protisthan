package com.itbd.application.db.dto;

import com.itbd.application.db.dao.ImportSupplierInvoiceDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record ImportSupplierInvoiceDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String invoiceSeries,
        String company,
        String itemCode,
        String supplierGroup,
        String taxAccount,
        String defaultBuyingPriceList,
        String zipFile,
        String status,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static ImportSupplierInvoiceDto fromEntity(ImportSupplierInvoiceDao eImportSupplierInvoiceDao) {
        return new ImportSupplierInvoiceDto(
                eImportSupplierInvoiceDao.getName(),
                eImportSupplierInvoiceDao.getCreation(),
                eImportSupplierInvoiceDao.getModified(),
                eImportSupplierInvoiceDao.getModifiedBy(),
                eImportSupplierInvoiceDao.getOwner(),
                eImportSupplierInvoiceDao.getIsDocStatus(),
                eImportSupplierInvoiceDao.getIdx(),
                eImportSupplierInvoiceDao.getInvoiceSeries(),
                eImportSupplierInvoiceDao.getCompany(),
                eImportSupplierInvoiceDao.getItemCode(),
                eImportSupplierInvoiceDao.getSupplierGroup(),
                eImportSupplierInvoiceDao.getTaxAccount(),
                eImportSupplierInvoiceDao.getDefaultBuyingPriceList(),
                eImportSupplierInvoiceDao.getZipFile(),
                eImportSupplierInvoiceDao.getStatus(),
                eImportSupplierInvoiceDao.getUserTags(),
                eImportSupplierInvoiceDao.getComments(),
                eImportSupplierInvoiceDao.getAssign(),
                eImportSupplierInvoiceDao.getLikedBy());
    }

    public static void fromDTO(ImportSupplierInvoiceDto vImportSupplierInvoiceDto, ImportSupplierInvoiceDao eImportSupplierInvoiceDao) {
        eImportSupplierInvoiceDao.setName(vImportSupplierInvoiceDto.name());
        eImportSupplierInvoiceDao.setCreation(vImportSupplierInvoiceDto.creation());
        eImportSupplierInvoiceDao.setModified(vImportSupplierInvoiceDto.modified());
        eImportSupplierInvoiceDao.setModifiedBy(vImportSupplierInvoiceDto.modifiedBy());
        eImportSupplierInvoiceDao.setOwner(vImportSupplierInvoiceDto.owner());
        eImportSupplierInvoiceDao.setIsDocStatus(vImportSupplierInvoiceDto.isDocStatus());
        eImportSupplierInvoiceDao.setIdx(vImportSupplierInvoiceDto.idx());
        eImportSupplierInvoiceDao.setInvoiceSeries(vImportSupplierInvoiceDto.invoiceSeries());
        eImportSupplierInvoiceDao.setCompany(vImportSupplierInvoiceDto.company());
        eImportSupplierInvoiceDao.setItemCode(vImportSupplierInvoiceDto.itemCode());
        eImportSupplierInvoiceDao.setSupplierGroup(vImportSupplierInvoiceDto.supplierGroup());
        eImportSupplierInvoiceDao.setTaxAccount(vImportSupplierInvoiceDto.taxAccount());
        eImportSupplierInvoiceDao.setDefaultBuyingPriceList(vImportSupplierInvoiceDto.defaultBuyingPriceList());
        eImportSupplierInvoiceDao.setZipFile(vImportSupplierInvoiceDto.zipFile());
        eImportSupplierInvoiceDao.setStatus(vImportSupplierInvoiceDto.status());
        eImportSupplierInvoiceDao.setUserTags(vImportSupplierInvoiceDto.userTags());
        eImportSupplierInvoiceDao.setComments(vImportSupplierInvoiceDto.comments());
        eImportSupplierInvoiceDao.setAssign(vImportSupplierInvoiceDto.assign());
        eImportSupplierInvoiceDao.setLikedBy(vImportSupplierInvoiceDto.likedBy());
    }
}