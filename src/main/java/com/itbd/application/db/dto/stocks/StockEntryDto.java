package com.itbd.application.db.dto.stocks;

import com.itbd.application.db.dao.stocks.StockEntryDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public record StockEntryDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String namingSeries,
        String stockEntryType,
        String outgoingStockEntry,
        String purpose,
        Boolean addToTransit,
        String workOrder,
        String purchaseOrder,
        String subcontractingOrder,
        String deliveryNoteNo,
        String salesInvoiceNo,
        String pickList,
        String purchaseReceiptNo,
        String company,
        LocalDate postingDate,
        LocalTime postingTime,
        Boolean setPostingTime,
        Boolean inspectionRequired,
        Boolean applyPutawayRule,
        Boolean fromBom,
        Boolean useMultiLevelBom,
        String bomNo,
        BigDecimal fgCompletedQty,
        BigDecimal processLossPercentage,
        BigDecimal processLossQty,
        String fromWarehouse,
        String sourceWarehouseAddress,
        String sourceAddressDisplay,
        String toWarehouse,
        String targetWarehouseAddress,
        String targetAddressDisplay,
        String scanBarcode,
        BigDecimal totalOutgoingValue,
        BigDecimal totalIncomingValue,
        BigDecimal valueDifference,
        BigDecimal totalAdditionalCosts,
        String supplier,
        String supplierName,
        String supplierAddress,
        String addressDisplay,
        String project,
        String selectPrintHeading,
        String letterHead,
        String isOpening,
        String remarks,
        BigDecimal perTransferred,
        BigDecimal totalAmount,
        String jobCard,
        String amendedFrom,
        String creditNote,
        Boolean isReturn,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static StockEntryDto fromEntity(StockEntryDao eStockEntryDao) {
        return new StockEntryDto(
                eStockEntryDao.getName(),
                eStockEntryDao.getCreation(),
                eStockEntryDao.getModified(),
                eStockEntryDao.getModifiedBy(),
                eStockEntryDao.getOwner(),
                eStockEntryDao.getIsDocStatus(),
                eStockEntryDao.getIdx(),
                eStockEntryDao.getNamingSeries(),
                eStockEntryDao.getStockEntryType(),
                eStockEntryDao.getOutgoingStockEntry(),
                eStockEntryDao.getPurpose(),
                eStockEntryDao.getAddToTransit(),
                eStockEntryDao.getWorkOrder(),
                eStockEntryDao.getPurchaseOrder(),
                eStockEntryDao.getSubcontractingOrder(),
                eStockEntryDao.getDeliveryNoteNo(),
                eStockEntryDao.getSalesInvoiceNo(),
                eStockEntryDao.getPickList(),
                eStockEntryDao.getPurchaseReceiptNo(),
                eStockEntryDao.getCompany(),
                eStockEntryDao.getPostingDate(),
                eStockEntryDao.getPostingTime(),
                eStockEntryDao.getSetPostingTime(),
                eStockEntryDao.getInspectionRequired(),
                eStockEntryDao.getApplyPutawayRule(),
                eStockEntryDao.getFromBom(),
                eStockEntryDao.getUseMultiLevelBom(),
                eStockEntryDao.getBomNo(),
                eStockEntryDao.getFgCompletedQty(),
                eStockEntryDao.getProcessLossPercentage(),
                eStockEntryDao.getProcessLossQty(),
                eStockEntryDao.getFromWarehouse(),
                eStockEntryDao.getSourceWarehouseAddress(),
                eStockEntryDao.getSourceAddressDisplay(),
                eStockEntryDao.getToWarehouse(),
                eStockEntryDao.getTargetWarehouseAddress(),
                eStockEntryDao.getTargetAddressDisplay(),
                eStockEntryDao.getScanBarcode(),
                eStockEntryDao.getTotalOutgoingValue(),
                eStockEntryDao.getTotalIncomingValue(),
                eStockEntryDao.getValueDifference(),
                eStockEntryDao.getTotalAdditionalCosts(),
                eStockEntryDao.getSupplier(),
                eStockEntryDao.getSupplierName(),
                eStockEntryDao.getSupplierAddress(),
                eStockEntryDao.getAddressDisplay(),
                eStockEntryDao.getProject(),
                eStockEntryDao.getSelectPrintHeading(),
                eStockEntryDao.getLetterHead(),
                eStockEntryDao.getIsOpening(),
                eStockEntryDao.getRemarks(),
                eStockEntryDao.getPerTransferred(),
                eStockEntryDao.getTotalAmount(),
                eStockEntryDao.getJobCard(),
                eStockEntryDao.getAmendedFrom(),
                eStockEntryDao.getCreditNote(),
                eStockEntryDao.getIsReturn(),
                eStockEntryDao.getUserTags(),
                eStockEntryDao.getComments(),
                eStockEntryDao.getAssign(),
                eStockEntryDao.getLikedBy());
    }

    public static void fromDTO(StockEntryDto vStockEntryDto, StockEntryDao eStockEntryDao) {
        eStockEntryDao.setName(vStockEntryDto.name());
        eStockEntryDao.setCreation(vStockEntryDto.creation());
        eStockEntryDao.setModified(vStockEntryDto.modified());
        eStockEntryDao.setModifiedBy(vStockEntryDto.modifiedBy());
        eStockEntryDao.setOwner(vStockEntryDto.owner());
        eStockEntryDao.setIsDocStatus(vStockEntryDto.isDocStatus());
        eStockEntryDao.setIdx(vStockEntryDto.idx());
        eStockEntryDao.setNamingSeries(vStockEntryDto.namingSeries());
        eStockEntryDao.setStockEntryType(vStockEntryDto.stockEntryType());
        eStockEntryDao.setOutgoingStockEntry(vStockEntryDto.outgoingStockEntry());
        eStockEntryDao.setPurpose(vStockEntryDto.purpose());
        eStockEntryDao.setAddToTransit(vStockEntryDto.addToTransit());
        eStockEntryDao.setWorkOrder(vStockEntryDto.workOrder());
        eStockEntryDao.setPurchaseOrder(vStockEntryDto.purchaseOrder());
        eStockEntryDao.setSubcontractingOrder(vStockEntryDto.subcontractingOrder());
        eStockEntryDao.setDeliveryNoteNo(vStockEntryDto.deliveryNoteNo());
        eStockEntryDao.setSalesInvoiceNo(vStockEntryDto.salesInvoiceNo());
        eStockEntryDao.setPickList(vStockEntryDto.pickList());
        eStockEntryDao.setPurchaseReceiptNo(vStockEntryDto.purchaseReceiptNo());
        eStockEntryDao.setCompany(vStockEntryDto.company());
        eStockEntryDao.setPostingDate(vStockEntryDto.postingDate());
        eStockEntryDao.setPostingTime(vStockEntryDto.postingTime());
        eStockEntryDao.setSetPostingTime(vStockEntryDto.setPostingTime());
        eStockEntryDao.setInspectionRequired(vStockEntryDto.inspectionRequired());
        eStockEntryDao.setApplyPutawayRule(vStockEntryDto.applyPutawayRule());
        eStockEntryDao.setFromBom(vStockEntryDto.fromBom());
        eStockEntryDao.setUseMultiLevelBom(vStockEntryDto.useMultiLevelBom());
        eStockEntryDao.setBomNo(vStockEntryDto.bomNo());
        eStockEntryDao.setFgCompletedQty(vStockEntryDto.fgCompletedQty());
        eStockEntryDao.setProcessLossPercentage(vStockEntryDto.processLossPercentage());
        eStockEntryDao.setProcessLossQty(vStockEntryDto.processLossQty());
        eStockEntryDao.setFromWarehouse(vStockEntryDto.fromWarehouse());
        eStockEntryDao.setSourceWarehouseAddress(vStockEntryDto.sourceWarehouseAddress());
        eStockEntryDao.setSourceAddressDisplay(vStockEntryDto.sourceAddressDisplay());
        eStockEntryDao.setToWarehouse(vStockEntryDto.toWarehouse());
        eStockEntryDao.setTargetWarehouseAddress(vStockEntryDto.targetWarehouseAddress());
        eStockEntryDao.setTargetAddressDisplay(vStockEntryDto.targetAddressDisplay());
        eStockEntryDao.setScanBarcode(vStockEntryDto.scanBarcode());
        eStockEntryDao.setTotalOutgoingValue(vStockEntryDto.totalOutgoingValue());
        eStockEntryDao.setTotalIncomingValue(vStockEntryDto.totalIncomingValue());
        eStockEntryDao.setValueDifference(vStockEntryDto.valueDifference());
        eStockEntryDao.setTotalAdditionalCosts(vStockEntryDto.totalAdditionalCosts());
        eStockEntryDao.setSupplier(vStockEntryDto.supplier());
        eStockEntryDao.setSupplierName(vStockEntryDto.supplierName());
        eStockEntryDao.setSupplierAddress(vStockEntryDto.supplierAddress());
        eStockEntryDao.setAddressDisplay(vStockEntryDto.addressDisplay());
        eStockEntryDao.setProject(vStockEntryDto.project());
        eStockEntryDao.setSelectPrintHeading(vStockEntryDto.selectPrintHeading());
        eStockEntryDao.setLetterHead(vStockEntryDto.letterHead());
        eStockEntryDao.setIsOpening(vStockEntryDto.isOpening());
        eStockEntryDao.setRemarks(vStockEntryDto.remarks());
        eStockEntryDao.setPerTransferred(vStockEntryDto.perTransferred());
        eStockEntryDao.setTotalAmount(vStockEntryDto.totalAmount());
        eStockEntryDao.setJobCard(vStockEntryDto.jobCard());
        eStockEntryDao.setAmendedFrom(vStockEntryDto.amendedFrom());
        eStockEntryDao.setCreditNote(vStockEntryDto.creditNote());
        eStockEntryDao.setIsReturn(vStockEntryDto.isReturn());
        eStockEntryDao.setUserTags(vStockEntryDto.userTags());
        eStockEntryDao.setComments(vStockEntryDto.comments());
        eStockEntryDao.setAssign(vStockEntryDto.assign());
        eStockEntryDao.setLikedBy(vStockEntryDto.likedBy());
    }
}