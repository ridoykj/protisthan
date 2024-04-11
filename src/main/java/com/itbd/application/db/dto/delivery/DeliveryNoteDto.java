package com.itbd.application.db.dto.delivery;

import com.itbd.application.db.dao.delivery.DeliveryNoteDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public record DeliveryNoteDto(
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
        String customer,
        String taxId,
        String customerName,
        LocalDate postingDate,
        LocalTime postingTime,
        Boolean setPostingTime,
        String company,
        String amendedFrom,
        Boolean isReturn,
        Boolean issueCreditNote,
        String returnAgainst,
        String costCenter,
        String project,
        String currency,
        BigDecimal conversionRate,
        String sellingPriceList,
        String priceListCurrency,
        BigDecimal plcConversionRate,
        Boolean ignorePricingRule,
        String scanBarcode,
        String pickList,
        String setWarehouse,
        String setTargetWarehouse,
        BigDecimal totalQty,
        BigDecimal totalNetWeight,
        BigDecimal baseTotal,
        BigDecimal baseNetTotal,
        BigDecimal total,
        BigDecimal netTotal,
        String taxCategory,
        String taxesAndCharges,
        String shippingRule,
        String incoterm,
        String namedPlace,
        BigDecimal baseTotalTaxesAndCharges,
        BigDecimal totalTaxesAndCharges,
        BigDecimal baseGrandTotal,
        BigDecimal baseRoundingAdjustment,
        BigDecimal baseRoundedTotal,
        String baseInWords,
        BigDecimal grandTotal,
        BigDecimal roundingAdjustment,
        BigDecimal roundedTotal,
        String inWords,
        Boolean disableRoundedTotal,
        String applyDiscountOn,
        BigDecimal baseDiscountAmount,
        BigDecimal additionalDiscountPercentage,
        BigDecimal discountAmount,
        String otherChargesCalculation,
        String customerAddress,
        String addressDisplay,
        String contactPerson,
        String contactDisplay,
        String contactMobile,
        String contactEmail,
        String shippingAddressName,
        String shippingAddress,
        String dispatchAddressName,
        String dispatchAddress,
        String companyAddress,
        String companyAddressDisplay,
        String tcName,
        String terms,
        BigDecimal perBilled,
        String status,
        BigDecimal perInstalled,
        String installationStatus,
        BigDecimal perReturned,
        String transporter,
        String driver,
        String lrNo,
        String vehicleNo,
        String transporterName,
        String driverName,
        LocalDate lrDate,
        String poNo,
        LocalDate poDate,
        String salesPartner,
        BigDecimal amountEligibleForCommission,
        BigDecimal commissionRate,
        BigDecimal totalCommission,
        String autoRepeat,
        String letterHead,
        Boolean printWithoutAmount,
        Boolean groupSameItems,
        String selectPrintHeading,
        String language,
        Boolean isInternalCustomer,
        String representsCompany,
        String interCompanyReference,
        String customerGroup,
        String territory,
        String source,
        String campaign,
        String excisePage,
        String instructions,
        String userTags,
        String comments,
        String assign,
        String likedBy,
        String seen
) {
    public static DeliveryNoteDto fromEntity(DeliveryNoteDao eDeliveryNoteDao) {
        return new DeliveryNoteDto(
                eDeliveryNoteDao.getName(),
                eDeliveryNoteDao.getCreation(),
                eDeliveryNoteDao.getModified(),
                eDeliveryNoteDao.getModifiedBy(),
                eDeliveryNoteDao.getOwner(),
                eDeliveryNoteDao.getIsDocStatus(),
                eDeliveryNoteDao.getIdx(),
                eDeliveryNoteDao.getTitle(),
                eDeliveryNoteDao.getNamingSeries(),
                eDeliveryNoteDao.getCustomer(),
                eDeliveryNoteDao.getTaxId(),
                eDeliveryNoteDao.getCustomerName(),
                eDeliveryNoteDao.getPostingDate(),
                eDeliveryNoteDao.getPostingTime(),
                eDeliveryNoteDao.getSetPostingTime(),
                eDeliveryNoteDao.getCompany(),
                eDeliveryNoteDao.getAmendedFrom(),
                eDeliveryNoteDao.getIsReturn(),
                eDeliveryNoteDao.getIssueCreditNote(),
                eDeliveryNoteDao.getReturnAgainst(),
                eDeliveryNoteDao.getCostCenter(),
                eDeliveryNoteDao.getProject(),
                eDeliveryNoteDao.getCurrency(),
                eDeliveryNoteDao.getConversionRate(),
                eDeliveryNoteDao.getSellingPriceList(),
                eDeliveryNoteDao.getPriceListCurrency(),
                eDeliveryNoteDao.getPlcConversionRate(),
                eDeliveryNoteDao.getIgnorePricingRule(),
                eDeliveryNoteDao.getScanBarcode(),
                eDeliveryNoteDao.getPickList(),
                eDeliveryNoteDao.getSetWarehouse(),
                eDeliveryNoteDao.getSetTargetWarehouse(),
                eDeliveryNoteDao.getTotalQty(),
                eDeliveryNoteDao.getTotalNetWeight(),
                eDeliveryNoteDao.getBaseTotal(),
                eDeliveryNoteDao.getBaseNetTotal(),
                eDeliveryNoteDao.getTotal(),
                eDeliveryNoteDao.getNetTotal(),
                eDeliveryNoteDao.getTaxCategory(),
                eDeliveryNoteDao.getTaxesAndCharges(),
                eDeliveryNoteDao.getShippingRule(),
                eDeliveryNoteDao.getIncoterm(),
                eDeliveryNoteDao.getNamedPlace(),
                eDeliveryNoteDao.getBaseTotalTaxesAndCharges(),
                eDeliveryNoteDao.getTotalTaxesAndCharges(),
                eDeliveryNoteDao.getBaseGrandTotal(),
                eDeliveryNoteDao.getBaseRoundingAdjustment(),
                eDeliveryNoteDao.getBaseRoundedTotal(),
                eDeliveryNoteDao.getBaseInWords(),
                eDeliveryNoteDao.getGrandTotal(),
                eDeliveryNoteDao.getRoundingAdjustment(),
                eDeliveryNoteDao.getRoundedTotal(),
                eDeliveryNoteDao.getInWords(),
                eDeliveryNoteDao.getDisableRoundedTotal(),
                eDeliveryNoteDao.getApplyDiscountOn(),
                eDeliveryNoteDao.getBaseDiscountAmount(),
                eDeliveryNoteDao.getAdditionalDiscountPercentage(),
                eDeliveryNoteDao.getDiscountAmount(),
                eDeliveryNoteDao.getOtherChargesCalculation(),
                eDeliveryNoteDao.getCustomerAddress(),
                eDeliveryNoteDao.getAddressDisplay(),
                eDeliveryNoteDao.getContactPerson(),
                eDeliveryNoteDao.getContactDisplay(),
                eDeliveryNoteDao.getContactMobile(),
                eDeliveryNoteDao.getContactEmail(),
                eDeliveryNoteDao.getShippingAddressName(),
                eDeliveryNoteDao.getShippingAddress(),
                eDeliveryNoteDao.getDispatchAddressName(),
                eDeliveryNoteDao.getDispatchAddress(),
                eDeliveryNoteDao.getCompanyAddress(),
                eDeliveryNoteDao.getCompanyAddressDisplay(),
                eDeliveryNoteDao.getTcName(),
                eDeliveryNoteDao.getTerms(),
                eDeliveryNoteDao.getPerBilled(),
                eDeliveryNoteDao.getStatus(),
                eDeliveryNoteDao.getPerInstalled(),
                eDeliveryNoteDao.getInstallationStatus(),
                eDeliveryNoteDao.getPerReturned(),
                eDeliveryNoteDao.getTransporter(),
                eDeliveryNoteDao.getDriver(),
                eDeliveryNoteDao.getLrNo(),
                eDeliveryNoteDao.getVehicleNo(),
                eDeliveryNoteDao.getTransporterName(),
                eDeliveryNoteDao.getDriverName(),
                eDeliveryNoteDao.getLrDate(),
                eDeliveryNoteDao.getPoNo(),
                eDeliveryNoteDao.getPoDate(),
                eDeliveryNoteDao.getSalesPartner(),
                eDeliveryNoteDao.getAmountEligibleForCommission(),
                eDeliveryNoteDao.getCommissionRate(),
                eDeliveryNoteDao.getTotalCommission(),
                eDeliveryNoteDao.getAutoRepeat(),
                eDeliveryNoteDao.getLetterHead(),
                eDeliveryNoteDao.getPrintWithoutAmount(),
                eDeliveryNoteDao.getGroupSameItems(),
                eDeliveryNoteDao.getSelectPrintHeading(),
                eDeliveryNoteDao.getLanguage(),
                eDeliveryNoteDao.getIsInternalCustomer(),
                eDeliveryNoteDao.getRepresentsCompany(),
                eDeliveryNoteDao.getInterCompanyReference(),
                eDeliveryNoteDao.getCustomerGroup(),
                eDeliveryNoteDao.getTerritory(),
                eDeliveryNoteDao.getSource(),
                eDeliveryNoteDao.getCampaign(),
                eDeliveryNoteDao.getExcisePage(),
                eDeliveryNoteDao.getInstructions(),
                eDeliveryNoteDao.getUserTags(),
                eDeliveryNoteDao.getComments(),
                eDeliveryNoteDao.getAssign(),
                eDeliveryNoteDao.getLikedBy(),
                eDeliveryNoteDao.getSeen());
    }

    public static void fromDTO(DeliveryNoteDto vDeliveryNoteDto, DeliveryNoteDao eDeliveryNoteDao) {
        eDeliveryNoteDao.setName(vDeliveryNoteDto.name());
        eDeliveryNoteDao.setCreation(vDeliveryNoteDto.creation());
        eDeliveryNoteDao.setModified(vDeliveryNoteDto.modified());
        eDeliveryNoteDao.setModifiedBy(vDeliveryNoteDto.modifiedBy());
        eDeliveryNoteDao.setOwner(vDeliveryNoteDto.owner());
        eDeliveryNoteDao.setIsDocStatus(vDeliveryNoteDto.isDocStatus());
        eDeliveryNoteDao.setIdx(vDeliveryNoteDto.idx());
        eDeliveryNoteDao.setTitle(vDeliveryNoteDto.title());
        eDeliveryNoteDao.setNamingSeries(vDeliveryNoteDto.namingSeries());
        eDeliveryNoteDao.setCustomer(vDeliveryNoteDto.customer());
        eDeliveryNoteDao.setTaxId(vDeliveryNoteDto.taxId());
        eDeliveryNoteDao.setCustomerName(vDeliveryNoteDto.customerName());
        eDeliveryNoteDao.setPostingDate(vDeliveryNoteDto.postingDate());
        eDeliveryNoteDao.setPostingTime(vDeliveryNoteDto.postingTime());
        eDeliveryNoteDao.setSetPostingTime(vDeliveryNoteDto.setPostingTime());
        eDeliveryNoteDao.setCompany(vDeliveryNoteDto.company());
        eDeliveryNoteDao.setAmendedFrom(vDeliveryNoteDto.amendedFrom());
        eDeliveryNoteDao.setIsReturn(vDeliveryNoteDto.isReturn());
        eDeliveryNoteDao.setIssueCreditNote(vDeliveryNoteDto.issueCreditNote());
        eDeliveryNoteDao.setReturnAgainst(vDeliveryNoteDto.returnAgainst());
        eDeliveryNoteDao.setCostCenter(vDeliveryNoteDto.costCenter());
        eDeliveryNoteDao.setProject(vDeliveryNoteDto.project());
        eDeliveryNoteDao.setCurrency(vDeliveryNoteDto.currency());
        eDeliveryNoteDao.setConversionRate(vDeliveryNoteDto.conversionRate());
        eDeliveryNoteDao.setSellingPriceList(vDeliveryNoteDto.sellingPriceList());
        eDeliveryNoteDao.setPriceListCurrency(vDeliveryNoteDto.priceListCurrency());
        eDeliveryNoteDao.setPlcConversionRate(vDeliveryNoteDto.plcConversionRate());
        eDeliveryNoteDao.setIgnorePricingRule(vDeliveryNoteDto.ignorePricingRule());
        eDeliveryNoteDao.setScanBarcode(vDeliveryNoteDto.scanBarcode());
        eDeliveryNoteDao.setPickList(vDeliveryNoteDto.pickList());
        eDeliveryNoteDao.setSetWarehouse(vDeliveryNoteDto.setWarehouse());
        eDeliveryNoteDao.setSetTargetWarehouse(vDeliveryNoteDto.setTargetWarehouse());
        eDeliveryNoteDao.setTotalQty(vDeliveryNoteDto.totalQty());
        eDeliveryNoteDao.setTotalNetWeight(vDeliveryNoteDto.totalNetWeight());
        eDeliveryNoteDao.setBaseTotal(vDeliveryNoteDto.baseTotal());
        eDeliveryNoteDao.setBaseNetTotal(vDeliveryNoteDto.baseNetTotal());
        eDeliveryNoteDao.setTotal(vDeliveryNoteDto.total());
        eDeliveryNoteDao.setNetTotal(vDeliveryNoteDto.netTotal());
        eDeliveryNoteDao.setTaxCategory(vDeliveryNoteDto.taxCategory());
        eDeliveryNoteDao.setTaxesAndCharges(vDeliveryNoteDto.taxesAndCharges());
        eDeliveryNoteDao.setShippingRule(vDeliveryNoteDto.shippingRule());
        eDeliveryNoteDao.setIncoterm(vDeliveryNoteDto.incoterm());
        eDeliveryNoteDao.setNamedPlace(vDeliveryNoteDto.namedPlace());
        eDeliveryNoteDao.setBaseTotalTaxesAndCharges(vDeliveryNoteDto.baseTotalTaxesAndCharges());
        eDeliveryNoteDao.setTotalTaxesAndCharges(vDeliveryNoteDto.totalTaxesAndCharges());
        eDeliveryNoteDao.setBaseGrandTotal(vDeliveryNoteDto.baseGrandTotal());
        eDeliveryNoteDao.setBaseRoundingAdjustment(vDeliveryNoteDto.baseRoundingAdjustment());
        eDeliveryNoteDao.setBaseRoundedTotal(vDeliveryNoteDto.baseRoundedTotal());
        eDeliveryNoteDao.setBaseInWords(vDeliveryNoteDto.baseInWords());
        eDeliveryNoteDao.setGrandTotal(vDeliveryNoteDto.grandTotal());
        eDeliveryNoteDao.setRoundingAdjustment(vDeliveryNoteDto.roundingAdjustment());
        eDeliveryNoteDao.setRoundedTotal(vDeliveryNoteDto.roundedTotal());
        eDeliveryNoteDao.setInWords(vDeliveryNoteDto.inWords());
        eDeliveryNoteDao.setDisableRoundedTotal(vDeliveryNoteDto.disableRoundedTotal());
        eDeliveryNoteDao.setApplyDiscountOn(vDeliveryNoteDto.applyDiscountOn());
        eDeliveryNoteDao.setBaseDiscountAmount(vDeliveryNoteDto.baseDiscountAmount());
        eDeliveryNoteDao.setAdditionalDiscountPercentage(vDeliveryNoteDto.additionalDiscountPercentage());
        eDeliveryNoteDao.setDiscountAmount(vDeliveryNoteDto.discountAmount());
        eDeliveryNoteDao.setOtherChargesCalculation(vDeliveryNoteDto.otherChargesCalculation());
        eDeliveryNoteDao.setCustomerAddress(vDeliveryNoteDto.customerAddress());
        eDeliveryNoteDao.setAddressDisplay(vDeliveryNoteDto.addressDisplay());
        eDeliveryNoteDao.setContactPerson(vDeliveryNoteDto.contactPerson());
        eDeliveryNoteDao.setContactDisplay(vDeliveryNoteDto.contactDisplay());
        eDeliveryNoteDao.setContactMobile(vDeliveryNoteDto.contactMobile());
        eDeliveryNoteDao.setContactEmail(vDeliveryNoteDto.contactEmail());
        eDeliveryNoteDao.setShippingAddressName(vDeliveryNoteDto.shippingAddressName());
        eDeliveryNoteDao.setShippingAddress(vDeliveryNoteDto.shippingAddress());
        eDeliveryNoteDao.setDispatchAddressName(vDeliveryNoteDto.dispatchAddressName());
        eDeliveryNoteDao.setDispatchAddress(vDeliveryNoteDto.dispatchAddress());
        eDeliveryNoteDao.setCompanyAddress(vDeliveryNoteDto.companyAddress());
        eDeliveryNoteDao.setCompanyAddressDisplay(vDeliveryNoteDto.companyAddressDisplay());
        eDeliveryNoteDao.setTcName(vDeliveryNoteDto.tcName());
        eDeliveryNoteDao.setTerms(vDeliveryNoteDto.terms());
        eDeliveryNoteDao.setPerBilled(vDeliveryNoteDto.perBilled());
        eDeliveryNoteDao.setStatus(vDeliveryNoteDto.status());
        eDeliveryNoteDao.setPerInstalled(vDeliveryNoteDto.perInstalled());
        eDeliveryNoteDao.setInstallationStatus(vDeliveryNoteDto.installationStatus());
        eDeliveryNoteDao.setPerReturned(vDeliveryNoteDto.perReturned());
        eDeliveryNoteDao.setTransporter(vDeliveryNoteDto.transporter());
        eDeliveryNoteDao.setDriver(vDeliveryNoteDto.driver());
        eDeliveryNoteDao.setLrNo(vDeliveryNoteDto.lrNo());
        eDeliveryNoteDao.setVehicleNo(vDeliveryNoteDto.vehicleNo());
        eDeliveryNoteDao.setTransporterName(vDeliveryNoteDto.transporterName());
        eDeliveryNoteDao.setDriverName(vDeliveryNoteDto.driverName());
        eDeliveryNoteDao.setLrDate(vDeliveryNoteDto.lrDate());
        eDeliveryNoteDao.setPoNo(vDeliveryNoteDto.poNo());
        eDeliveryNoteDao.setPoDate(vDeliveryNoteDto.poDate());
        eDeliveryNoteDao.setSalesPartner(vDeliveryNoteDto.salesPartner());
        eDeliveryNoteDao.setAmountEligibleForCommission(vDeliveryNoteDto.amountEligibleForCommission());
        eDeliveryNoteDao.setCommissionRate(vDeliveryNoteDto.commissionRate());
        eDeliveryNoteDao.setTotalCommission(vDeliveryNoteDto.totalCommission());
        eDeliveryNoteDao.setAutoRepeat(vDeliveryNoteDto.autoRepeat());
        eDeliveryNoteDao.setLetterHead(vDeliveryNoteDto.letterHead());
        eDeliveryNoteDao.setPrintWithoutAmount(vDeliveryNoteDto.printWithoutAmount());
        eDeliveryNoteDao.setGroupSameItems(vDeliveryNoteDto.groupSameItems());
        eDeliveryNoteDao.setSelectPrintHeading(vDeliveryNoteDto.selectPrintHeading());
        eDeliveryNoteDao.setLanguage(vDeliveryNoteDto.language());
        eDeliveryNoteDao.setIsInternalCustomer(vDeliveryNoteDto.isInternalCustomer());
        eDeliveryNoteDao.setRepresentsCompany(vDeliveryNoteDto.representsCompany());
        eDeliveryNoteDao.setInterCompanyReference(vDeliveryNoteDto.interCompanyReference());
        eDeliveryNoteDao.setCustomerGroup(vDeliveryNoteDto.customerGroup());
        eDeliveryNoteDao.setTerritory(vDeliveryNoteDto.territory());
        eDeliveryNoteDao.setSource(vDeliveryNoteDto.source());
        eDeliveryNoteDao.setCampaign(vDeliveryNoteDto.campaign());
        eDeliveryNoteDao.setExcisePage(vDeliveryNoteDto.excisePage());
        eDeliveryNoteDao.setInstructions(vDeliveryNoteDto.instructions());
        eDeliveryNoteDao.setUserTags(vDeliveryNoteDto.userTags());
        eDeliveryNoteDao.setComments(vDeliveryNoteDto.comments());
        eDeliveryNoteDao.setAssign(vDeliveryNoteDto.assign());
        eDeliveryNoteDao.setLikedBy(vDeliveryNoteDto.likedBy());
        eDeliveryNoteDao.setSeen(vDeliveryNoteDto.seen());
    }
}