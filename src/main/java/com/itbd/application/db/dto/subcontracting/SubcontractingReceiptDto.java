package com.itbd.application.db.dto.subcontracting;

import com.itbd.application.db.dao.subcontracting.SubcontractingReceiptDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public record SubcontractingReceiptDto(
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
        String supplier,
        String supplierName,
        String supplierDeliveryNote,
        String company,
        LocalDate postingDate,
        LocalTime postingTime,
        Boolean setPostingTime,
        Boolean isReturn,
        String returnAgainst,
        String costCenter,
        String project,
        String supplierAddress,
        String contactPerson,
        String addressDisplay,
        String contactDisplay,
        String contactMobile,
        String contactEmail,
        String shippingAddress,
        String shippingAddressDisplay,
        String billingAddress,
        String billingAddressDisplay,
        String setWarehouse,
        String rejectedWarehouse,
        String supplierWarehouse,
        BigDecimal totalQty,
        BigDecimal total,
        String distributeAdditionalCostsBasedOn,
        BigDecimal totalAdditionalCosts,
        String inWords,
        String billNo,
        LocalDate billDate,
        String status,
        BigDecimal perReturned,
        String amendedFrom,
        String range,
        String representsCompany,
        String autoRepeat,
        String letterHead,
        String language,
        String instructions,
        String selectPrintHeading,
        String remarks,
        String transporterName,
        String lrNo,
        LocalDate lrDate,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static SubcontractingReceiptDto fromEntity(SubcontractingReceiptDao eSubcontractingReceiptDao) {
        return new SubcontractingReceiptDto(
                eSubcontractingReceiptDao.getName(),
                eSubcontractingReceiptDao.getCreation(),
                eSubcontractingReceiptDao.getModified(),
                eSubcontractingReceiptDao.getModifiedBy(),
                eSubcontractingReceiptDao.getOwner(),
                eSubcontractingReceiptDao.getIsDocStatus(),
                eSubcontractingReceiptDao.getIdx(),
                eSubcontractingReceiptDao.getTitle(),
                eSubcontractingReceiptDao.getNamingSeries(),
                eSubcontractingReceiptDao.getSupplier(),
                eSubcontractingReceiptDao.getSupplierName(),
                eSubcontractingReceiptDao.getSupplierDeliveryNote(),
                eSubcontractingReceiptDao.getCompany(),
                eSubcontractingReceiptDao.getPostingDate(),
                eSubcontractingReceiptDao.getPostingTime(),
                eSubcontractingReceiptDao.getSetPostingTime(),
                eSubcontractingReceiptDao.getIsReturn(),
                eSubcontractingReceiptDao.getReturnAgainst(),
                eSubcontractingReceiptDao.getCostCenter(),
                eSubcontractingReceiptDao.getProject(),
                eSubcontractingReceiptDao.getSupplierAddress(),
                eSubcontractingReceiptDao.getContactPerson(),
                eSubcontractingReceiptDao.getAddressDisplay(),
                eSubcontractingReceiptDao.getContactDisplay(),
                eSubcontractingReceiptDao.getContactMobile(),
                eSubcontractingReceiptDao.getContactEmail(),
                eSubcontractingReceiptDao.getShippingAddress(),
                eSubcontractingReceiptDao.getShippingAddressDisplay(),
                eSubcontractingReceiptDao.getBillingAddress(),
                eSubcontractingReceiptDao.getBillingAddressDisplay(),
                eSubcontractingReceiptDao.getSetWarehouse(),
                eSubcontractingReceiptDao.getRejectedWarehouse(),
                eSubcontractingReceiptDao.getSupplierWarehouse(),
                eSubcontractingReceiptDao.getTotalQty(),
                eSubcontractingReceiptDao.getTotal(),
                eSubcontractingReceiptDao.getDistributeAdditionalCostsBasedOn(),
                eSubcontractingReceiptDao.getTotalAdditionalCosts(),
                eSubcontractingReceiptDao.getInWords(),
                eSubcontractingReceiptDao.getBillNo(),
                eSubcontractingReceiptDao.getBillDate(),
                eSubcontractingReceiptDao.getStatus(),
                eSubcontractingReceiptDao.getPerReturned(),
                eSubcontractingReceiptDao.getAmendedFrom(),
                eSubcontractingReceiptDao.getRange(),
                eSubcontractingReceiptDao.getRepresentsCompany(),
                eSubcontractingReceiptDao.getAutoRepeat(),
                eSubcontractingReceiptDao.getLetterHead(),
                eSubcontractingReceiptDao.getLanguage(),
                eSubcontractingReceiptDao.getInstructions(),
                eSubcontractingReceiptDao.getSelectPrintHeading(),
                eSubcontractingReceiptDao.getRemarks(),
                eSubcontractingReceiptDao.getTransporterName(),
                eSubcontractingReceiptDao.getLrNo(),
                eSubcontractingReceiptDao.getLrDate(),
                eSubcontractingReceiptDao.getUserTags(),
                eSubcontractingReceiptDao.getComments(),
                eSubcontractingReceiptDao.getAssign(),
                eSubcontractingReceiptDao.getLikedBy());
    }

    public static void fromDTO(SubcontractingReceiptDto vSubcontractingReceiptDto, SubcontractingReceiptDao eSubcontractingReceiptDao) {
        eSubcontractingReceiptDao.setName(vSubcontractingReceiptDto.name());
        eSubcontractingReceiptDao.setCreation(vSubcontractingReceiptDto.creation());
        eSubcontractingReceiptDao.setModified(vSubcontractingReceiptDto.modified());
        eSubcontractingReceiptDao.setModifiedBy(vSubcontractingReceiptDto.modifiedBy());
        eSubcontractingReceiptDao.setOwner(vSubcontractingReceiptDto.owner());
        eSubcontractingReceiptDao.setIsDocStatus(vSubcontractingReceiptDto.isDocStatus());
        eSubcontractingReceiptDao.setIdx(vSubcontractingReceiptDto.idx());
        eSubcontractingReceiptDao.setTitle(vSubcontractingReceiptDto.title());
        eSubcontractingReceiptDao.setNamingSeries(vSubcontractingReceiptDto.namingSeries());
        eSubcontractingReceiptDao.setSupplier(vSubcontractingReceiptDto.supplier());
        eSubcontractingReceiptDao.setSupplierName(vSubcontractingReceiptDto.supplierName());
        eSubcontractingReceiptDao.setSupplierDeliveryNote(vSubcontractingReceiptDto.supplierDeliveryNote());
        eSubcontractingReceiptDao.setCompany(vSubcontractingReceiptDto.company());
        eSubcontractingReceiptDao.setPostingDate(vSubcontractingReceiptDto.postingDate());
        eSubcontractingReceiptDao.setPostingTime(vSubcontractingReceiptDto.postingTime());
        eSubcontractingReceiptDao.setSetPostingTime(vSubcontractingReceiptDto.setPostingTime());
        eSubcontractingReceiptDao.setIsReturn(vSubcontractingReceiptDto.isReturn());
        eSubcontractingReceiptDao.setReturnAgainst(vSubcontractingReceiptDto.returnAgainst());
        eSubcontractingReceiptDao.setCostCenter(vSubcontractingReceiptDto.costCenter());
        eSubcontractingReceiptDao.setProject(vSubcontractingReceiptDto.project());
        eSubcontractingReceiptDao.setSupplierAddress(vSubcontractingReceiptDto.supplierAddress());
        eSubcontractingReceiptDao.setContactPerson(vSubcontractingReceiptDto.contactPerson());
        eSubcontractingReceiptDao.setAddressDisplay(vSubcontractingReceiptDto.addressDisplay());
        eSubcontractingReceiptDao.setContactDisplay(vSubcontractingReceiptDto.contactDisplay());
        eSubcontractingReceiptDao.setContactMobile(vSubcontractingReceiptDto.contactMobile());
        eSubcontractingReceiptDao.setContactEmail(vSubcontractingReceiptDto.contactEmail());
        eSubcontractingReceiptDao.setShippingAddress(vSubcontractingReceiptDto.shippingAddress());
        eSubcontractingReceiptDao.setShippingAddressDisplay(vSubcontractingReceiptDto.shippingAddressDisplay());
        eSubcontractingReceiptDao.setBillingAddress(vSubcontractingReceiptDto.billingAddress());
        eSubcontractingReceiptDao.setBillingAddressDisplay(vSubcontractingReceiptDto.billingAddressDisplay());
        eSubcontractingReceiptDao.setSetWarehouse(vSubcontractingReceiptDto.setWarehouse());
        eSubcontractingReceiptDao.setRejectedWarehouse(vSubcontractingReceiptDto.rejectedWarehouse());
        eSubcontractingReceiptDao.setSupplierWarehouse(vSubcontractingReceiptDto.supplierWarehouse());
        eSubcontractingReceiptDao.setTotalQty(vSubcontractingReceiptDto.totalQty());
        eSubcontractingReceiptDao.setTotal(vSubcontractingReceiptDto.total());
        eSubcontractingReceiptDao.setDistributeAdditionalCostsBasedOn(vSubcontractingReceiptDto.distributeAdditionalCostsBasedOn());
        eSubcontractingReceiptDao.setTotalAdditionalCosts(vSubcontractingReceiptDto.totalAdditionalCosts());
        eSubcontractingReceiptDao.setInWords(vSubcontractingReceiptDto.inWords());
        eSubcontractingReceiptDao.setBillNo(vSubcontractingReceiptDto.billNo());
        eSubcontractingReceiptDao.setBillDate(vSubcontractingReceiptDto.billDate());
        eSubcontractingReceiptDao.setStatus(vSubcontractingReceiptDto.status());
        eSubcontractingReceiptDao.setPerReturned(vSubcontractingReceiptDto.perReturned());
        eSubcontractingReceiptDao.setAmendedFrom(vSubcontractingReceiptDto.amendedFrom());
        eSubcontractingReceiptDao.setRange(vSubcontractingReceiptDto.range());
        eSubcontractingReceiptDao.setRepresentsCompany(vSubcontractingReceiptDto.representsCompany());
        eSubcontractingReceiptDao.setAutoRepeat(vSubcontractingReceiptDto.autoRepeat());
        eSubcontractingReceiptDao.setLetterHead(vSubcontractingReceiptDto.letterHead());
        eSubcontractingReceiptDao.setLanguage(vSubcontractingReceiptDto.language());
        eSubcontractingReceiptDao.setInstructions(vSubcontractingReceiptDto.instructions());
        eSubcontractingReceiptDao.setSelectPrintHeading(vSubcontractingReceiptDto.selectPrintHeading());
        eSubcontractingReceiptDao.setRemarks(vSubcontractingReceiptDto.remarks());
        eSubcontractingReceiptDao.setTransporterName(vSubcontractingReceiptDto.transporterName());
        eSubcontractingReceiptDao.setLrNo(vSubcontractingReceiptDto.lrNo());
        eSubcontractingReceiptDao.setLrDate(vSubcontractingReceiptDto.lrDate());
        eSubcontractingReceiptDao.setUserTags(vSubcontractingReceiptDto.userTags());
        eSubcontractingReceiptDao.setComments(vSubcontractingReceiptDto.comments());
        eSubcontractingReceiptDao.setAssign(vSubcontractingReceiptDto.assign());
        eSubcontractingReceiptDao.setLikedBy(vSubcontractingReceiptDto.likedBy());
    }
}