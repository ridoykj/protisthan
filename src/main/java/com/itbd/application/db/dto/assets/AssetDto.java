package com.itbd.application.db.dto.assets;

import com.itbd.application.db.dao.assets.AssetDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record AssetDto(
        @Id

        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String company,
        String itemCode,
        String itemName,
        String assetOwner,
        String assetOwnerCompany,
        Boolean isExistingAsset,
        Integer isCompositeAsset,
        String supplier,
        String customer,
        String image,
        String journalEntryForScrap,
        String namingSeries,
        String assetName,
        String assetCategory,
        String location,
        String splitFrom,
        String custodian,
        String department,
        LocalDate disposalDate,
        String costCenter,
        String purchaseReceipt,
        String purchaseInvoice,
        LocalDate availableForUseDate,
        BigDecimal totalAssetCost,
        BigDecimal additionalAssetCost,
        BigDecimal grossPurchaseAmount,
        Integer assetQuantity,
        LocalDate purchaseDate,
        Boolean calculateDepreciation,
        BigDecimal openingAccumulatedDepreciation,
        Integer numberOfDepreciationBooked,
        Boolean isFullyDepreciated,
        String depreciationMethod,
        BigDecimal valueAfterDepreciation,
        Integer totalNumberOfDepreciation,
        Integer frequencyOfDepreciation,
        LocalDate nextDepreciationDate,
        String policyNumber,
        String insurer,
        String insuredValue,
        LocalDate insuranceStartDate,
        LocalDate insuranceEndDate,
        String comprehensiveInsurance,
        Boolean maintenanceRequired,
        String status,
        Boolean bookedFixedAsset,
        BigDecimal purchaseReceiptAmount,
        String defaultFinanceBook,
        String deprEntryPostingStatus,
        String amendedFrom,
        String capitalizedIn,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static AssetDto fromEntity(AssetDao eAssetDao) {
        return new AssetDto(
                eAssetDao.getName(),
                eAssetDao.getCreation(),
                eAssetDao.getModified(),
                eAssetDao.getModifiedBy(),
                eAssetDao.getOwner(),
                eAssetDao.getIsDocStatus(),
                eAssetDao.getIdx(),
                eAssetDao.getCompany(),
                eAssetDao.getItemCode(),
                eAssetDao.getItemName(),
                eAssetDao.getAssetOwner(),
                eAssetDao.getAssetOwnerCompany(),
                eAssetDao.getIsExistingAsset(),
                eAssetDao.getIsCompositeAsset(),
                eAssetDao.getSupplier(),
                eAssetDao.getCustomer(),
                eAssetDao.getImage(),
                eAssetDao.getJournalEntryForScrap(),
                eAssetDao.getNamingSeries(),
                eAssetDao.getAssetName(),
                eAssetDao.getAssetCategory(),
                eAssetDao.getLocation(),
                eAssetDao.getSplitFrom(),
                eAssetDao.getCustodian(),
                eAssetDao.getDepartment(),
                eAssetDao.getDisposalDate(),
                eAssetDao.getCostCenter(),
                eAssetDao.getPurchaseReceipt(),
                eAssetDao.getPurchaseInvoice(),
                eAssetDao.getAvailableForUseDate(),
                eAssetDao.getTotalAssetCost(),
                eAssetDao.getAdditionalAssetCost(),
                eAssetDao.getGrossPurchaseAmount(),
                eAssetDao.getAssetQuantity(),
                eAssetDao.getPurchaseDate(),
                eAssetDao.getCalculateDepreciation(),
                eAssetDao.getOpeningAccumulatedDepreciation(),
                eAssetDao.getNumberOfDepreciationBooked(),
                eAssetDao.getIsFullyDepreciated(),
                eAssetDao.getDepreciationMethod(),
                eAssetDao.getValueAfterDepreciation(),
                eAssetDao.getTotalNumberOfDepreciation(),
                eAssetDao.getFrequencyOfDepreciation(),
                eAssetDao.getNextDepreciationDate(),
                eAssetDao.getPolicyNumber(),
                eAssetDao.getInsurer(),
                eAssetDao.getInsuredValue(),
                eAssetDao.getInsuranceStartDate(),
                eAssetDao.getInsuranceEndDate(),
                eAssetDao.getComprehensiveInsurance(),
                eAssetDao.getMaintenanceRequired(),
                eAssetDao.getStatus(),
                eAssetDao.getBookedFixedAsset(),
                eAssetDao.getPurchaseReceiptAmount(),
                eAssetDao.getDefaultFinanceBook(),
                eAssetDao.getDeprEntryPostingStatus(),
                eAssetDao.getAmendedFrom(),
                eAssetDao.getCapitalizedIn(),
                eAssetDao.getUserTags(),
                eAssetDao.getComments(),
                eAssetDao.getAssign(),
                eAssetDao.getLikedBy());
    }

    public static void fromDTO(AssetDto vAssetDto, AssetDao eAssetDao) {
        eAssetDao.setName(vAssetDto.name());
        eAssetDao.setCreation(vAssetDto.creation());
        eAssetDao.setModified(vAssetDto.modified());
        eAssetDao.setModifiedBy(vAssetDto.modifiedBy());
        eAssetDao.setOwner(vAssetDto.owner());
        eAssetDao.setIsDocStatus(vAssetDto.isDocStatus());
        eAssetDao.setIdx(vAssetDto.idx());
        eAssetDao.setCompany(vAssetDto.company());
        eAssetDao.setItemCode(vAssetDto.itemCode());
        eAssetDao.setItemName(vAssetDto.itemName());
        eAssetDao.setAssetOwner(vAssetDto.assetOwner());
        eAssetDao.setAssetOwnerCompany(vAssetDto.assetOwnerCompany());
        eAssetDao.setIsExistingAsset(vAssetDto.isExistingAsset());
        eAssetDao.setIsCompositeAsset(vAssetDto.isCompositeAsset());
        eAssetDao.setSupplier(vAssetDto.supplier());
        eAssetDao.setCustomer(vAssetDto.customer());
        eAssetDao.setImage(vAssetDto.image());
        eAssetDao.setJournalEntryForScrap(vAssetDto.journalEntryForScrap());
        eAssetDao.setNamingSeries(vAssetDto.namingSeries());
        eAssetDao.setAssetName(vAssetDto.assetName());
        eAssetDao.setAssetCategory(vAssetDto.assetCategory());
        eAssetDao.setLocation(vAssetDto.location());
        eAssetDao.setSplitFrom(vAssetDto.splitFrom());
        eAssetDao.setCustodian(vAssetDto.custodian());
        eAssetDao.setDepartment(vAssetDto.department());
        eAssetDao.setDisposalDate(vAssetDto.disposalDate());
        eAssetDao.setCostCenter(vAssetDto.costCenter());
        eAssetDao.setPurchaseReceipt(vAssetDto.purchaseReceipt());
        eAssetDao.setPurchaseInvoice(vAssetDto.purchaseInvoice());
        eAssetDao.setAvailableForUseDate(vAssetDto.availableForUseDate());
        eAssetDao.setTotalAssetCost(vAssetDto.totalAssetCost());
        eAssetDao.setAdditionalAssetCost(vAssetDto.additionalAssetCost());
        eAssetDao.setGrossPurchaseAmount(vAssetDto.grossPurchaseAmount());
        eAssetDao.setAssetQuantity(vAssetDto.assetQuantity());
        eAssetDao.setPurchaseDate(vAssetDto.purchaseDate());
        eAssetDao.setCalculateDepreciation(vAssetDto.calculateDepreciation());
        eAssetDao.setOpeningAccumulatedDepreciation(vAssetDto.openingAccumulatedDepreciation());
        eAssetDao.setNumberOfDepreciationBooked(vAssetDto.numberOfDepreciationBooked());
        eAssetDao.setIsFullyDepreciated(vAssetDto.isFullyDepreciated());
        eAssetDao.setDepreciationMethod(vAssetDto.depreciationMethod());
        eAssetDao.setValueAfterDepreciation(vAssetDto.valueAfterDepreciation());
        eAssetDao.setTotalNumberOfDepreciation(vAssetDto.totalNumberOfDepreciation());
        eAssetDao.setFrequencyOfDepreciation(vAssetDto.frequencyOfDepreciation());
        eAssetDao.setNextDepreciationDate(vAssetDto.nextDepreciationDate());
        eAssetDao.setPolicyNumber(vAssetDto.policyNumber());
        eAssetDao.setInsurer(vAssetDto.insurer());
        eAssetDao.setInsuredValue(vAssetDto.insuredValue());
        eAssetDao.setInsuranceStartDate(vAssetDto.insuranceStartDate());
        eAssetDao.setInsuranceEndDate(vAssetDto.insuranceEndDate());
        eAssetDao.setComprehensiveInsurance(vAssetDto.comprehensiveInsurance());
        eAssetDao.setMaintenanceRequired(vAssetDto.maintenanceRequired());
        eAssetDao.setStatus(vAssetDto.status());
        eAssetDao.setBookedFixedAsset(vAssetDto.bookedFixedAsset());
        eAssetDao.setPurchaseReceiptAmount(vAssetDto.purchaseReceiptAmount());
        eAssetDao.setDefaultFinanceBook(vAssetDto.defaultFinanceBook());
        eAssetDao.setDeprEntryPostingStatus(vAssetDto.deprEntryPostingStatus());
        eAssetDao.setAmendedFrom(vAssetDto.amendedFrom());
        eAssetDao.setCapitalizedIn(vAssetDto.capitalizedIn());
        eAssetDao.setUserTags(vAssetDto.userTags());
        eAssetDao.setComments(vAssetDto.comments());
        eAssetDao.setAssign(vAssetDto.assign());
        eAssetDao.setLikedBy(vAssetDto.likedBy());
    }
}