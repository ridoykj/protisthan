package com.itbd.application.db.dto;

import com.itbd.application.db.dao.manufacturing.BlanketOrderDao;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record BlanketOrderDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String namingSeries,
        String blanketOrderType,
        String customer,
        String customerName,
        String supplier,
        String supplierName,
        LocalDate fromDate,
        LocalDate toDate,
        String company,
        String amendedFrom,
        String tcName,
        String terms,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static BlanketOrderDto fromEntity(BlanketOrderDao eBlanketOrderDao) {
        return new BlanketOrderDto(
                eBlanketOrderDao.getName(),
                eBlanketOrderDao.getCreation(),
                eBlanketOrderDao.getModified(),
                eBlanketOrderDao.getModifiedBy(),
                eBlanketOrderDao.getOwner(),
                eBlanketOrderDao.getIsDocStatus(),
                eBlanketOrderDao.getIdx(),
                eBlanketOrderDao.getNamingSeries(),
                eBlanketOrderDao.getBlanketOrderType(),
                eBlanketOrderDao.getCustomer(),
                eBlanketOrderDao.getCustomerName(),
                eBlanketOrderDao.getSupplier(),
                eBlanketOrderDao.getSupplierName(),
                eBlanketOrderDao.getFromDate(),
                eBlanketOrderDao.getToDate(),
                eBlanketOrderDao.getCompany(),
                eBlanketOrderDao.getAmendedFrom(),
                eBlanketOrderDao.getTcName(),
                eBlanketOrderDao.getTerms(),
                eBlanketOrderDao.getUserTags(),
                eBlanketOrderDao.getComments(),
                eBlanketOrderDao.getAssign(),
                eBlanketOrderDao.getLikedBy());
    }

    public static void fromDTO(BlanketOrderDto vBlanketOrderDto, BlanketOrderDao eBlanketOrderDao) {
        eBlanketOrderDao.setName(vBlanketOrderDto.name());
        eBlanketOrderDao.setCreation(vBlanketOrderDto.creation());
        eBlanketOrderDao.setModified(vBlanketOrderDto.modified());
        eBlanketOrderDao.setModifiedBy(vBlanketOrderDto.modifiedBy());
        eBlanketOrderDao.setOwner(vBlanketOrderDto.owner());
        eBlanketOrderDao.setIsDocStatus(vBlanketOrderDto.isDocStatus());
        eBlanketOrderDao.setIdx(vBlanketOrderDto.idx());
        eBlanketOrderDao.setNamingSeries(vBlanketOrderDto.namingSeries());
        eBlanketOrderDao.setBlanketOrderType(vBlanketOrderDto.blanketOrderType());
        eBlanketOrderDao.setCustomer(vBlanketOrderDto.customer());
        eBlanketOrderDao.setCustomerName(vBlanketOrderDto.customerName());
        eBlanketOrderDao.setSupplier(vBlanketOrderDto.supplier());
        eBlanketOrderDao.setSupplierName(vBlanketOrderDto.supplierName());
        eBlanketOrderDao.setFromDate(vBlanketOrderDto.fromDate());
        eBlanketOrderDao.setToDate(vBlanketOrderDto.toDate());
        eBlanketOrderDao.setCompany(vBlanketOrderDto.company());
        eBlanketOrderDao.setAmendedFrom(vBlanketOrderDto.amendedFrom());
        eBlanketOrderDao.setTcName(vBlanketOrderDto.tcName());
        eBlanketOrderDao.setTerms(vBlanketOrderDto.terms());
        eBlanketOrderDao.setUserTags(vBlanketOrderDto.userTags());
        eBlanketOrderDao.setComments(vBlanketOrderDto.comments());
        eBlanketOrderDao.setAssign(vBlanketOrderDto.assign());
        eBlanketOrderDao.setLikedBy(vBlanketOrderDto.likedBy());
    }
}