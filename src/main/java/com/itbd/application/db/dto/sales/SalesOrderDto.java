package com.itbd.application.db.dto.sales;

import com.itbd.application.db.dao.sales.SalesOrderDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record SalesOrderDto(
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
        String customerName,
        String taxId,
        String orderType,
        LocalDate transactionDate,
        LocalDate deliveryDate,
        String poNo,
        LocalDate poDate,
        String company,
        Boolean skipDeliveryNote,
        String amendedFrom,
        String costCenter,
        String project,
        String currency,
        BigDecimal conversionRate,
        String sellingPriceList,
        String priceListCurrency,
        BigDecimal plcConversionRate,
        Boolean ignorePricingRule,
        String scanBarcode,
        String setWarehouse,
        Boolean reserveStock,
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
        BigDecimal advancePaid,
        Boolean disableRoundedTotal,
        String applyDiscountOn,
        BigDecimal baseDiscountAmount,
        String couponCode,
        BigDecimal additionalDiscountPercentage,
        BigDecimal discountAmount,
        String otherChargesCalculation,
        String customerAddress,
        String addressDisplay,
        String customerGroup,
        String territory,
        String contactPerson,
        String contactDisplay,
        String contactPhone,
        String contactMobile,
        String contactEmail,
        String shippingAddressName,
        String shippingAddress,
        String dispatchAddressName,
        String dispatchAddress,
        String companyAddress,
        String companyAddressDisplay,
        String paymentTermsTemplate,
        String tcName,
        String terms,
        String status,
        String deliveryStatus,
        BigDecimal perDelivered,
        BigDecimal perBilled,
        BigDecimal perPicked,
        String billingStatus,
        String salesPartner,
        BigDecimal amountEligibleForCommission,
        BigDecimal commissionRate,
        BigDecimal totalCommission,
        Integer loyaltyPoints,
        BigDecimal loyaltyAmount,
        LocalDate fromDate,
        LocalDate toDate,
        String autoRepeat,
        String letterHead,
        Boolean groupSameItems,
        String selectPrintHeading,
        String language,
        Boolean isInternalCustomer,
        String representsCompany,
        String source,
        String interCompanyOrderReference,
        String campaign,
        String partyAccountCurrency,
        String userTags,
        String comments,
        String assign,
        String likedBy,
        String seen
) {
    public static SalesOrderDto fromEntity(SalesOrderDao eSalesOrderDao) {
        return new SalesOrderDto(
                eSalesOrderDao.getName(),
                eSalesOrderDao.getCreation(),
                eSalesOrderDao.getModified(),
                eSalesOrderDao.getModifiedBy(),
                eSalesOrderDao.getOwner(),
                eSalesOrderDao.getIsDocStatus(),
                eSalesOrderDao.getIdx(),
                eSalesOrderDao.getTitle(),
                eSalesOrderDao.getNamingSeries(),
                eSalesOrderDao.getCustomer(),
                eSalesOrderDao.getCustomerName(),
                eSalesOrderDao.getTaxId(),
                eSalesOrderDao.getOrderType(),
                eSalesOrderDao.getTransactionDate(),
                eSalesOrderDao.getDeliveryDate(),
                eSalesOrderDao.getPoNo(),
                eSalesOrderDao.getPoDate(),
                eSalesOrderDao.getCompany(),
                eSalesOrderDao.getSkipDeliveryNote(),
                eSalesOrderDao.getAmendedFrom(),
                eSalesOrderDao.getCostCenter(),
                eSalesOrderDao.getProject(),
                eSalesOrderDao.getCurrency(),
                eSalesOrderDao.getConversionRate(),
                eSalesOrderDao.getSellingPriceList(),
                eSalesOrderDao.getPriceListCurrency(),
                eSalesOrderDao.getPlcConversionRate(),
                eSalesOrderDao.getIgnorePricingRule(),
                eSalesOrderDao.getScanBarcode(),
                eSalesOrderDao.getSetWarehouse(),
                eSalesOrderDao.getReserveStock(),
                eSalesOrderDao.getTotalQty(),
                eSalesOrderDao.getTotalNetWeight(),
                eSalesOrderDao.getBaseTotal(),
                eSalesOrderDao.getBaseNetTotal(),
                eSalesOrderDao.getTotal(),
                eSalesOrderDao.getNetTotal(),
                eSalesOrderDao.getTaxCategory(),
                eSalesOrderDao.getTaxesAndCharges(),
                eSalesOrderDao.getShippingRule(),
                eSalesOrderDao.getIncoterm(),
                eSalesOrderDao.getNamedPlace(),
                eSalesOrderDao.getBaseTotalTaxesAndCharges(),
                eSalesOrderDao.getTotalTaxesAndCharges(),
                eSalesOrderDao.getBaseGrandTotal(),
                eSalesOrderDao.getBaseRoundingAdjustment(),
                eSalesOrderDao.getBaseRoundedTotal(),
                eSalesOrderDao.getBaseInWords(),
                eSalesOrderDao.getGrandTotal(),
                eSalesOrderDao.getRoundingAdjustment(),
                eSalesOrderDao.getRoundedTotal(),
                eSalesOrderDao.getInWords(),
                eSalesOrderDao.getAdvancePaid(),
                eSalesOrderDao.getDisableRoundedTotal(),
                eSalesOrderDao.getApplyDiscountOn(),
                eSalesOrderDao.getBaseDiscountAmount(),
                eSalesOrderDao.getCouponCode(),
                eSalesOrderDao.getAdditionalDiscountPercentage(),
                eSalesOrderDao.getDiscountAmount(),
                eSalesOrderDao.getOtherChargesCalculation(),
                eSalesOrderDao.getCustomerAddress(),
                eSalesOrderDao.getAddressDisplay(),
                eSalesOrderDao.getCustomerGroup(),
                eSalesOrderDao.getTerritory(),
                eSalesOrderDao.getContactPerson(),
                eSalesOrderDao.getContactDisplay(),
                eSalesOrderDao.getContactPhone(),
                eSalesOrderDao.getContactMobile(),
                eSalesOrderDao.getContactEmail(),
                eSalesOrderDao.getShippingAddressName(),
                eSalesOrderDao.getShippingAddress(),
                eSalesOrderDao.getDispatchAddressName(),
                eSalesOrderDao.getDispatchAddress(),
                eSalesOrderDao.getCompanyAddress(),
                eSalesOrderDao.getCompanyAddressDisplay(),
                eSalesOrderDao.getPaymentTermsTemplate(),
                eSalesOrderDao.getTcName(),
                eSalesOrderDao.getTerms(),
                eSalesOrderDao.getStatus(),
                eSalesOrderDao.getDeliveryStatus(),
                eSalesOrderDao.getPerDelivered(),
                eSalesOrderDao.getPerBilled(),
                eSalesOrderDao.getPerPicked(),
                eSalesOrderDao.getBillingStatus(),
                eSalesOrderDao.getSalesPartner(),
                eSalesOrderDao.getAmountEligibleForCommission(),
                eSalesOrderDao.getCommissionRate(),
                eSalesOrderDao.getTotalCommission(),
                eSalesOrderDao.getLoyaltyPoints(),
                eSalesOrderDao.getLoyaltyAmount(),
                eSalesOrderDao.getFromDate(),
                eSalesOrderDao.getToDate(),
                eSalesOrderDao.getAutoRepeat(),
                eSalesOrderDao.getLetterHead(),
                eSalesOrderDao.getGroupSameItems(),
                eSalesOrderDao.getSelectPrintHeading(),
                eSalesOrderDao.getLanguage(),
                eSalesOrderDao.getIsInternalCustomer(),
                eSalesOrderDao.getRepresentsCompany(),
                eSalesOrderDao.getSource(),
                eSalesOrderDao.getInterCompanyOrderReference(),
                eSalesOrderDao.getCampaign(),
                eSalesOrderDao.getPartyAccountCurrency(),
                eSalesOrderDao.getUserTags(),
                eSalesOrderDao.getComments(),
                eSalesOrderDao.getAssign(),
                eSalesOrderDao.getLikedBy(),
                eSalesOrderDao.getSeen());
    }

    public static void fromDTO(SalesOrderDto vSalesOrderDto, SalesOrderDao eSalesOrderDao) {
        eSalesOrderDao.setName(vSalesOrderDto.name());
        eSalesOrderDao.setCreation(vSalesOrderDto.creation());
        eSalesOrderDao.setModified(vSalesOrderDto.modified());
        eSalesOrderDao.setModifiedBy(vSalesOrderDto.modifiedBy());
        eSalesOrderDao.setOwner(vSalesOrderDto.owner());
        eSalesOrderDao.setIsDocStatus(vSalesOrderDto.isDocStatus());
        eSalesOrderDao.setIdx(vSalesOrderDto.idx());
        eSalesOrderDao.setTitle(vSalesOrderDto.title());
        eSalesOrderDao.setNamingSeries(vSalesOrderDto.namingSeries());
        eSalesOrderDao.setCustomer(vSalesOrderDto.customer());
        eSalesOrderDao.setCustomerName(vSalesOrderDto.customerName());
        eSalesOrderDao.setTaxId(vSalesOrderDto.taxId());
        eSalesOrderDao.setOrderType(vSalesOrderDto.orderType());
        eSalesOrderDao.setTransactionDate(vSalesOrderDto.transactionDate());
        eSalesOrderDao.setDeliveryDate(vSalesOrderDto.deliveryDate());
        eSalesOrderDao.setPoNo(vSalesOrderDto.poNo());
        eSalesOrderDao.setPoDate(vSalesOrderDto.poDate());
        eSalesOrderDao.setCompany(vSalesOrderDto.company());
        eSalesOrderDao.setSkipDeliveryNote(vSalesOrderDto.skipDeliveryNote());
        eSalesOrderDao.setAmendedFrom(vSalesOrderDto.amendedFrom());
        eSalesOrderDao.setCostCenter(vSalesOrderDto.costCenter());
        eSalesOrderDao.setProject(vSalesOrderDto.project());
        eSalesOrderDao.setCurrency(vSalesOrderDto.currency());
        eSalesOrderDao.setConversionRate(vSalesOrderDto.conversionRate());
        eSalesOrderDao.setSellingPriceList(vSalesOrderDto.sellingPriceList());
        eSalesOrderDao.setPriceListCurrency(vSalesOrderDto.priceListCurrency());
        eSalesOrderDao.setPlcConversionRate(vSalesOrderDto.plcConversionRate());
        eSalesOrderDao.setIgnorePricingRule(vSalesOrderDto.ignorePricingRule());
        eSalesOrderDao.setScanBarcode(vSalesOrderDto.scanBarcode());
        eSalesOrderDao.setSetWarehouse(vSalesOrderDto.setWarehouse());
        eSalesOrderDao.setReserveStock(vSalesOrderDto.reserveStock());
        eSalesOrderDao.setTotalQty(vSalesOrderDto.totalQty());
        eSalesOrderDao.setTotalNetWeight(vSalesOrderDto.totalNetWeight());
        eSalesOrderDao.setBaseTotal(vSalesOrderDto.baseTotal());
        eSalesOrderDao.setBaseNetTotal(vSalesOrderDto.baseNetTotal());
        eSalesOrderDao.setTotal(vSalesOrderDto.total());
        eSalesOrderDao.setNetTotal(vSalesOrderDto.netTotal());
        eSalesOrderDao.setTaxCategory(vSalesOrderDto.taxCategory());
        eSalesOrderDao.setTaxesAndCharges(vSalesOrderDto.taxesAndCharges());
        eSalesOrderDao.setShippingRule(vSalesOrderDto.shippingRule());
        eSalesOrderDao.setIncoterm(vSalesOrderDto.incoterm());
        eSalesOrderDao.setNamedPlace(vSalesOrderDto.namedPlace());
        eSalesOrderDao.setBaseTotalTaxesAndCharges(vSalesOrderDto.baseTotalTaxesAndCharges());
        eSalesOrderDao.setTotalTaxesAndCharges(vSalesOrderDto.totalTaxesAndCharges());
        eSalesOrderDao.setBaseGrandTotal(vSalesOrderDto.baseGrandTotal());
        eSalesOrderDao.setBaseRoundingAdjustment(vSalesOrderDto.baseRoundingAdjustment());
        eSalesOrderDao.setBaseRoundedTotal(vSalesOrderDto.baseRoundedTotal());
        eSalesOrderDao.setBaseInWords(vSalesOrderDto.baseInWords());
        eSalesOrderDao.setGrandTotal(vSalesOrderDto.grandTotal());
        eSalesOrderDao.setRoundingAdjustment(vSalesOrderDto.roundingAdjustment());
        eSalesOrderDao.setRoundedTotal(vSalesOrderDto.roundedTotal());
        eSalesOrderDao.setInWords(vSalesOrderDto.inWords());
        eSalesOrderDao.setAdvancePaid(vSalesOrderDto.advancePaid());
        eSalesOrderDao.setDisableRoundedTotal(vSalesOrderDto.disableRoundedTotal());
        eSalesOrderDao.setApplyDiscountOn(vSalesOrderDto.applyDiscountOn());
        eSalesOrderDao.setBaseDiscountAmount(vSalesOrderDto.baseDiscountAmount());
        eSalesOrderDao.setCouponCode(vSalesOrderDto.couponCode());
        eSalesOrderDao.setAdditionalDiscountPercentage(vSalesOrderDto.additionalDiscountPercentage());
        eSalesOrderDao.setDiscountAmount(vSalesOrderDto.discountAmount());
        eSalesOrderDao.setOtherChargesCalculation(vSalesOrderDto.otherChargesCalculation());
        eSalesOrderDao.setCustomerAddress(vSalesOrderDto.customerAddress());
        eSalesOrderDao.setAddressDisplay(vSalesOrderDto.addressDisplay());
        eSalesOrderDao.setCustomerGroup(vSalesOrderDto.customerGroup());
        eSalesOrderDao.setTerritory(vSalesOrderDto.territory());
        eSalesOrderDao.setContactPerson(vSalesOrderDto.contactPerson());
        eSalesOrderDao.setContactDisplay(vSalesOrderDto.contactDisplay());
        eSalesOrderDao.setContactPhone(vSalesOrderDto.contactPhone());
        eSalesOrderDao.setContactMobile(vSalesOrderDto.contactMobile());
        eSalesOrderDao.setContactEmail(vSalesOrderDto.contactEmail());
        eSalesOrderDao.setShippingAddressName(vSalesOrderDto.shippingAddressName());
        eSalesOrderDao.setShippingAddress(vSalesOrderDto.shippingAddress());
        eSalesOrderDao.setDispatchAddressName(vSalesOrderDto.dispatchAddressName());
        eSalesOrderDao.setDispatchAddress(vSalesOrderDto.dispatchAddress());
        eSalesOrderDao.setCompanyAddress(vSalesOrderDto.companyAddress());
        eSalesOrderDao.setCompanyAddressDisplay(vSalesOrderDto.companyAddressDisplay());
        eSalesOrderDao.setPaymentTermsTemplate(vSalesOrderDto.paymentTermsTemplate());
        eSalesOrderDao.setTcName(vSalesOrderDto.tcName());
        eSalesOrderDao.setTerms(vSalesOrderDto.terms());
        eSalesOrderDao.setStatus(vSalesOrderDto.status());
        eSalesOrderDao.setDeliveryStatus(vSalesOrderDto.deliveryStatus());
        eSalesOrderDao.setPerDelivered(vSalesOrderDto.perDelivered());
        eSalesOrderDao.setPerBilled(vSalesOrderDto.perBilled());
        eSalesOrderDao.setPerPicked(vSalesOrderDto.perPicked());
        eSalesOrderDao.setBillingStatus(vSalesOrderDto.billingStatus());
        eSalesOrderDao.setSalesPartner(vSalesOrderDto.salesPartner());
        eSalesOrderDao.setAmountEligibleForCommission(vSalesOrderDto.amountEligibleForCommission());
        eSalesOrderDao.setCommissionRate(vSalesOrderDto.commissionRate());
        eSalesOrderDao.setTotalCommission(vSalesOrderDto.totalCommission());
        eSalesOrderDao.setLoyaltyPoints(vSalesOrderDto.loyaltyPoints());
        eSalesOrderDao.setLoyaltyAmount(vSalesOrderDto.loyaltyAmount());
        eSalesOrderDao.setFromDate(vSalesOrderDto.fromDate());
        eSalesOrderDao.setToDate(vSalesOrderDto.toDate());
        eSalesOrderDao.setAutoRepeat(vSalesOrderDto.autoRepeat());
        eSalesOrderDao.setLetterHead(vSalesOrderDto.letterHead());
        eSalesOrderDao.setGroupSameItems(vSalesOrderDto.groupSameItems());
        eSalesOrderDao.setSelectPrintHeading(vSalesOrderDto.selectPrintHeading());
        eSalesOrderDao.setLanguage(vSalesOrderDto.language());
        eSalesOrderDao.setIsInternalCustomer(vSalesOrderDto.isInternalCustomer());
        eSalesOrderDao.setRepresentsCompany(vSalesOrderDto.representsCompany());
        eSalesOrderDao.setSource(vSalesOrderDto.source());
        eSalesOrderDao.setInterCompanyOrderReference(vSalesOrderDto.interCompanyOrderReference());
        eSalesOrderDao.setCampaign(vSalesOrderDto.campaign());
        eSalesOrderDao.setPartyAccountCurrency(vSalesOrderDto.partyAccountCurrency());
        eSalesOrderDao.setUserTags(vSalesOrderDto.userTags());
        eSalesOrderDao.setComments(vSalesOrderDto.comments());
        eSalesOrderDao.setAssign(vSalesOrderDto.assign());
        eSalesOrderDao.setLikedBy(vSalesOrderDto.likedBy());
        eSalesOrderDao.setSeen(vSalesOrderDto.seen());
    }
}