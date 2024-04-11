package com.itbd.application.db.dto.subcontracting;

import com.itbd.application.db.dao.subcontracting.SubcontractingOrderDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record SubcontractingOrderDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String title,
        String namingSeries,
        String purchaseOrder,
        String supplier,
        String supplierName,
        String supplierWarehouse,
        String company,
        LocalDate transactionDate,
        LocalDate scheduleDate,
        String amendedFrom,
        String costCenter,
        String project,
        String supplierAddress,
        String addressDisplay,
        String contactPerson,
        String contactDisplay,
        String contactMobile,
        String contactEmail,
        String shippingAddress,
        String shippingAddressDisplay,
        String billingAddress,
        String billingAddressDisplay,
        String setWarehouse,
        BigDecimal totalQty,
        BigDecimal total,
        String setReserveWarehouse,
        String distributeAdditionalCostsBasedOn,
        BigDecimal totalAdditionalCosts,
        String status,
        BigDecimal perReceived,
        String selectPrintHeading,
        String letterHead,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static SubcontractingOrderDto fromEntity(SubcontractingOrderDao eSubcontractingOrderDao) {
        return new SubcontractingOrderDto(
                eSubcontractingOrderDao.getName(),
                eSubcontractingOrderDao.getCreation(),
                eSubcontractingOrderDao.getModified(),
                eSubcontractingOrderDao.getModifiedBy(),
                eSubcontractingOrderDao.getOwner(),
                eSubcontractingOrderDao.getIsDocStatus(),
                eSubcontractingOrderDao.getIdx(),
                eSubcontractingOrderDao.getTitle(),
                eSubcontractingOrderDao.getNamingSeries(),
                eSubcontractingOrderDao.getPurchaseOrder(),
                eSubcontractingOrderDao.getSupplier(),
                eSubcontractingOrderDao.getSupplierName(),
                eSubcontractingOrderDao.getSupplierWarehouse(),
                eSubcontractingOrderDao.getCompany(),
                eSubcontractingOrderDao.getTransactionDate(),
                eSubcontractingOrderDao.getScheduleDate(),
                eSubcontractingOrderDao.getAmendedFrom(),
                eSubcontractingOrderDao.getCostCenter(),
                eSubcontractingOrderDao.getProject(),
                eSubcontractingOrderDao.getSupplierAddress(),
                eSubcontractingOrderDao.getAddressDisplay(),
                eSubcontractingOrderDao.getContactPerson(),
                eSubcontractingOrderDao.getContactDisplay(),
                eSubcontractingOrderDao.getContactMobile(),
                eSubcontractingOrderDao.getContactEmail(),
                eSubcontractingOrderDao.getShippingAddress(),
                eSubcontractingOrderDao.getShippingAddressDisplay(),
                eSubcontractingOrderDao.getBillingAddress(),
                eSubcontractingOrderDao.getBillingAddressDisplay(),
                eSubcontractingOrderDao.getSetWarehouse(),
                eSubcontractingOrderDao.getTotalQty(),
                eSubcontractingOrderDao.getTotal(),
                eSubcontractingOrderDao.getSetReserveWarehouse(),
                eSubcontractingOrderDao.getDistributeAdditionalCostsBasedOn(),
                eSubcontractingOrderDao.getTotalAdditionalCosts(),
                eSubcontractingOrderDao.getStatus(),
                eSubcontractingOrderDao.getPerReceived(),
                eSubcontractingOrderDao.getSelectPrintHeading(),
                eSubcontractingOrderDao.getLetterHead(),
                eSubcontractingOrderDao.getUserTags(),
                eSubcontractingOrderDao.getComments(),
                eSubcontractingOrderDao.getAssign(),
                eSubcontractingOrderDao.getLikedBy());
    }

    public static void fromDTO(SubcontractingOrderDto vSubcontractingOrderDto, SubcontractingOrderDao eSubcontractingOrderDao) {
        eSubcontractingOrderDao.setName(vSubcontractingOrderDto.name());
        eSubcontractingOrderDao.setCreation(vSubcontractingOrderDto.creation());
        eSubcontractingOrderDao.setModified(vSubcontractingOrderDto.modified());
        eSubcontractingOrderDao.setModifiedBy(vSubcontractingOrderDto.modifiedBy());
        eSubcontractingOrderDao.setOwner(vSubcontractingOrderDto.owner());
        eSubcontractingOrderDao.setIsDocStatus(vSubcontractingOrderDto.isDocStatus());
        eSubcontractingOrderDao.setIdx(vSubcontractingOrderDto.idx());
        eSubcontractingOrderDao.setTitle(vSubcontractingOrderDto.title());
        eSubcontractingOrderDao.setNamingSeries(vSubcontractingOrderDto.namingSeries());
        eSubcontractingOrderDao.setPurchaseOrder(vSubcontractingOrderDto.purchaseOrder());
        eSubcontractingOrderDao.setSupplier(vSubcontractingOrderDto.supplier());
        eSubcontractingOrderDao.setSupplierName(vSubcontractingOrderDto.supplierName());
        eSubcontractingOrderDao.setSupplierWarehouse(vSubcontractingOrderDto.supplierWarehouse());
        eSubcontractingOrderDao.setCompany(vSubcontractingOrderDto.company());
        eSubcontractingOrderDao.setTransactionDate(vSubcontractingOrderDto.transactionDate());
        eSubcontractingOrderDao.setScheduleDate(vSubcontractingOrderDto.scheduleDate());
        eSubcontractingOrderDao.setAmendedFrom(vSubcontractingOrderDto.amendedFrom());
        eSubcontractingOrderDao.setCostCenter(vSubcontractingOrderDto.costCenter());
        eSubcontractingOrderDao.setProject(vSubcontractingOrderDto.project());
        eSubcontractingOrderDao.setSupplierAddress(vSubcontractingOrderDto.supplierAddress());
        eSubcontractingOrderDao.setAddressDisplay(vSubcontractingOrderDto.addressDisplay());
        eSubcontractingOrderDao.setContactPerson(vSubcontractingOrderDto.contactPerson());
        eSubcontractingOrderDao.setContactDisplay(vSubcontractingOrderDto.contactDisplay());
        eSubcontractingOrderDao.setContactMobile(vSubcontractingOrderDto.contactMobile());
        eSubcontractingOrderDao.setContactEmail(vSubcontractingOrderDto.contactEmail());
        eSubcontractingOrderDao.setShippingAddress(vSubcontractingOrderDto.shippingAddress());
        eSubcontractingOrderDao.setShippingAddressDisplay(vSubcontractingOrderDto.shippingAddressDisplay());
        eSubcontractingOrderDao.setBillingAddress(vSubcontractingOrderDto.billingAddress());
        eSubcontractingOrderDao.setBillingAddressDisplay(vSubcontractingOrderDto.billingAddressDisplay());
        eSubcontractingOrderDao.setSetWarehouse(vSubcontractingOrderDto.setWarehouse());
        eSubcontractingOrderDao.setTotalQty(vSubcontractingOrderDto.totalQty());
        eSubcontractingOrderDao.setTotal(vSubcontractingOrderDto.total());
        eSubcontractingOrderDao.setSetReserveWarehouse(vSubcontractingOrderDto.setReserveWarehouse());
        eSubcontractingOrderDao.setDistributeAdditionalCostsBasedOn(vSubcontractingOrderDto.distributeAdditionalCostsBasedOn());
        eSubcontractingOrderDao.setTotalAdditionalCosts(vSubcontractingOrderDto.totalAdditionalCosts());
        eSubcontractingOrderDao.setStatus(vSubcontractingOrderDto.status());
        eSubcontractingOrderDao.setPerReceived(vSubcontractingOrderDto.perReceived());
        eSubcontractingOrderDao.setSelectPrintHeading(vSubcontractingOrderDto.selectPrintHeading());
        eSubcontractingOrderDao.setLetterHead(vSubcontractingOrderDto.letterHead());
        eSubcontractingOrderDao.setUserTags(vSubcontractingOrderDto.userTags());
        eSubcontractingOrderDao.setComments(vSubcontractingOrderDto.comments());
        eSubcontractingOrderDao.setAssign(vSubcontractingOrderDto.assign());
        eSubcontractingOrderDao.setLikedBy(vSubcontractingOrderDto.likedBy());
    }
}