package com.itbd.application.db.dto;

import com.itbd.application.db.dao.CompanyDao;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record CompanyDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String companyName,
        String abbr,
        String defaultCurrency,
        String country,
        Boolean isGroup,
        String defaultHolidayList,
        String defaultLetterHead,
        String taxId,
        String domain,
        LocalDate dateOfEstablishment,
        String parentCompany,
        String companyLogo,
        LocalDate dateOfIncorporation,
        String phoneNo,
        String email,
        String companyDescription,
        LocalDate dateOfCommencement,
        String fax,
        String website,
        String registrationDetails,
        Integer lft,
        Integer rgt,
        String oldParent,
        String createChartOfAccountsBasedOn,
        String existingCompany,
        String chartOfAccounts,
        String defaultBankAccount,
        String defaultCashAccount,
        String defaultReceivableAccount,
        String roundOffAccount,
        String roundOffCostCenter,
        String writeOffAccount,
        String exchangeGainLossAccount,
        String unrealizedExchangeGainLossAccount,
        String unrealizedProfitLossAccount,
        Boolean allowAccountCreationAgainstChildCompany,
        String defaultPayableAccount,
        String defaultExpenseAccount,
        String defaultIncomeAccount,
        String defaultDeferredRevenueAccount,
        String defaultDeferredExpenseAccount,
        String defaultDiscountAccount,
        String paymentTerms,
        String costCenter,
        String defaultFinanceBook,
        Boolean bookAdvancePaymentsInSeparatePartyAccount,
        String defaultAdvanceReceivedAccount,
        String defaultAdvancePaidAccount,
        Boolean autoExchangeRateRevaluation,
        String autoErrFrequency,
        Boolean submitErrJv,
        String exceptionBudgetApproverRole,
        String accumulatedDepreciationAccount,
        String depreciationExpenseAccount,
        String seriesForDepreciationEntry,
        String expensesIncludedInAssetValuation,
        String disposalAccount,
        String depreciationCostCenter,
        String capitalWorkInProgressAccount,
        String assetReceivedButNotBilled,
        String defaultBuyingTerms,
        String salesMonthlyHistory,
        BigDecimal monthlySalesTarget,
        BigDecimal totalMonthlySales,
        String defaultSellingTerms,
        String defaultWarehouseForSalesReturn,
        BigDecimal creditLimit,
        String transactionsAnnualHistory,
        Boolean enablePerpetualInventory,
        Boolean enableProvisionalAccountingForNonStockItems,
        String defaultInventoryAccount,
        String stockAdjustmentAccount,
        String defaultInTransitWarehouse,
        String stockReceivedButNotBilled,
        String defaultProvisionalAccount,
        String expensesIncludedInValuation,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static CompanyDto fromEntity(CompanyDao eCompanyDao) {
        return new CompanyDto(
                eCompanyDao.getName(),
                eCompanyDao.getCreation(),
                eCompanyDao.getModified(),
                eCompanyDao.getModifiedBy(),
                eCompanyDao.getOwner(),
                eCompanyDao.getIsDocStatus(),
                eCompanyDao.getIdx(),
                eCompanyDao.getCompanyName(),
                eCompanyDao.getAbbr(),
                eCompanyDao.getDefaultCurrency(),
                eCompanyDao.getCountry(),
                eCompanyDao.getIsGroup(),
                eCompanyDao.getDefaultHolidayList(),
                eCompanyDao.getDefaultLetterHead(),
                eCompanyDao.getTaxId(),
                eCompanyDao.getDomain(),
                eCompanyDao.getDateOfEstablishment(),
                eCompanyDao.getParentCompany(),
                eCompanyDao.getCompanyLogo(),
                eCompanyDao.getDateOfIncorporation(),
                eCompanyDao.getPhoneNo(),
                eCompanyDao.getEmail(),
                eCompanyDao.getCompanyDescription(),
                eCompanyDao.getDateOfCommencement(),
                eCompanyDao.getFax(),
                eCompanyDao.getWebsite(),
                eCompanyDao.getRegistrationDetails(),
                eCompanyDao.getLft(),
                eCompanyDao.getRgt(),
                eCompanyDao.getOldParent(),
                eCompanyDao.getCreateChartOfAccountsBasedOn(),
                eCompanyDao.getExistingCompany(),
                eCompanyDao.getChartOfAccounts(),
                eCompanyDao.getDefaultBankAccount(),
                eCompanyDao.getDefaultCashAccount(),
                eCompanyDao.getDefaultReceivableAccount(),
                eCompanyDao.getRoundOffAccount(),
                eCompanyDao.getRoundOffCostCenter(),
                eCompanyDao.getWriteOffAccount(),
                eCompanyDao.getExchangeGainLossAccount(),
                eCompanyDao.getUnrealizedExchangeGainLossAccount(),
                eCompanyDao.getUnrealizedProfitLossAccount(),
                eCompanyDao.getAllowAccountCreationAgainstChildCompany(),
                eCompanyDao.getDefaultPayableAccount(),
                eCompanyDao.getDefaultExpenseAccount(),
                eCompanyDao.getDefaultIncomeAccount(),
                eCompanyDao.getDefaultDeferredRevenueAccount(),
                eCompanyDao.getDefaultDeferredExpenseAccount(),
                eCompanyDao.getDefaultDiscountAccount(),
                eCompanyDao.getPaymentTerms(),
                eCompanyDao.getCostCenter(),
                eCompanyDao.getDefaultFinanceBook(),
                eCompanyDao.getBookAdvancePaymentsInSeparatePartyAccount(),
                eCompanyDao.getDefaultAdvanceReceivedAccount(),
                eCompanyDao.getDefaultAdvancePaidAccount(),
                eCompanyDao.getAutoExchangeRateRevaluation(),
                eCompanyDao.getAutoErrFrequency(),
                eCompanyDao.getSubmitErrJv(),
                eCompanyDao.getExceptionBudgetApproverRole(),
                eCompanyDao.getAccumulatedDepreciationAccount(),
                eCompanyDao.getDepreciationExpenseAccount(),
                eCompanyDao.getSeriesForDepreciationEntry(),
                eCompanyDao.getExpensesIncludedInAssetValuation(),
                eCompanyDao.getDisposalAccount(),
                eCompanyDao.getDepreciationCostCenter(),
                eCompanyDao.getCapitalWorkInProgressAccount(),
                eCompanyDao.getAssetReceivedButNotBilled(),
                eCompanyDao.getDefaultBuyingTerms(),
                eCompanyDao.getSalesMonthlyHistory(),
                eCompanyDao.getMonthlySalesTarget(),
                eCompanyDao.getTotalMonthlySales(),
                eCompanyDao.getDefaultSellingTerms(),
                eCompanyDao.getDefaultWarehouseForSalesReturn(),
                eCompanyDao.getCreditLimit(),
                eCompanyDao.getTransactionsAnnualHistory(),
                eCompanyDao.getEnablePerpetualInventory(),
                eCompanyDao.getEnableProvisionalAccountingForNonStockItems(),
                eCompanyDao.getDefaultInventoryAccount(),
                eCompanyDao.getStockAdjustmentAccount(),
                eCompanyDao.getDefaultInTransitWarehouse(),
                eCompanyDao.getStockReceivedButNotBilled(),
                eCompanyDao.getDefaultProvisionalAccount(),
                eCompanyDao.getExpensesIncludedInValuation(),
                eCompanyDao.getUserTags(),
                eCompanyDao.getComments(),
                eCompanyDao.getAssign(),
                eCompanyDao.getLikedBy());
    }

    public static void fromDTO(CompanyDto vCompanyDto, CompanyDao eCompanyDao) {
        eCompanyDao.setName(vCompanyDto.name());
        eCompanyDao.setCreation(vCompanyDto.creation());
        eCompanyDao.setModified(vCompanyDto.modified());
        eCompanyDao.setModifiedBy(vCompanyDto.modifiedBy());
        eCompanyDao.setOwner(vCompanyDto.owner());
        eCompanyDao.setIsDocStatus(vCompanyDto.isDocStatus());
        eCompanyDao.setIdx(vCompanyDto.idx());
        eCompanyDao.setCompanyName(vCompanyDto.companyName());
        eCompanyDao.setAbbr(vCompanyDto.abbr());
        eCompanyDao.setDefaultCurrency(vCompanyDto.defaultCurrency());
        eCompanyDao.setCountry(vCompanyDto.country());
        eCompanyDao.setIsGroup(vCompanyDto.isGroup());
        eCompanyDao.setDefaultHolidayList(vCompanyDto.defaultHolidayList());
        eCompanyDao.setDefaultLetterHead(vCompanyDto.defaultLetterHead());
        eCompanyDao.setTaxId(vCompanyDto.taxId());
        eCompanyDao.setDomain(vCompanyDto.domain());
        eCompanyDao.setDateOfEstablishment(vCompanyDto.dateOfEstablishment());
        eCompanyDao.setParentCompany(vCompanyDto.parentCompany());
        eCompanyDao.setCompanyLogo(vCompanyDto.companyLogo());
        eCompanyDao.setDateOfIncorporation(vCompanyDto.dateOfIncorporation());
        eCompanyDao.setPhoneNo(vCompanyDto.phoneNo());
        eCompanyDao.setEmail(vCompanyDto.email());
        eCompanyDao.setCompanyDescription(vCompanyDto.companyDescription());
        eCompanyDao.setDateOfCommencement(vCompanyDto.dateOfCommencement());
        eCompanyDao.setFax(vCompanyDto.fax());
        eCompanyDao.setWebsite(vCompanyDto.website());
        eCompanyDao.setRegistrationDetails(vCompanyDto.registrationDetails());
        eCompanyDao.setLft(vCompanyDto.lft());
        eCompanyDao.setRgt(vCompanyDto.rgt());
        eCompanyDao.setOldParent(vCompanyDto.oldParent());
        eCompanyDao.setCreateChartOfAccountsBasedOn(vCompanyDto.createChartOfAccountsBasedOn());
        eCompanyDao.setExistingCompany(vCompanyDto.existingCompany());
        eCompanyDao.setChartOfAccounts(vCompanyDto.chartOfAccounts());
        eCompanyDao.setDefaultBankAccount(vCompanyDto.defaultBankAccount());
        eCompanyDao.setDefaultCashAccount(vCompanyDto.defaultCashAccount());
        eCompanyDao.setDefaultReceivableAccount(vCompanyDto.defaultReceivableAccount());
        eCompanyDao.setRoundOffAccount(vCompanyDto.roundOffAccount());
        eCompanyDao.setRoundOffCostCenter(vCompanyDto.roundOffCostCenter());
        eCompanyDao.setWriteOffAccount(vCompanyDto.writeOffAccount());
        eCompanyDao.setExchangeGainLossAccount(vCompanyDto.exchangeGainLossAccount());
        eCompanyDao.setUnrealizedExchangeGainLossAccount(vCompanyDto.unrealizedExchangeGainLossAccount());
        eCompanyDao.setUnrealizedProfitLossAccount(vCompanyDto.unrealizedProfitLossAccount());
        eCompanyDao.setAllowAccountCreationAgainstChildCompany(vCompanyDto.allowAccountCreationAgainstChildCompany());
        eCompanyDao.setDefaultPayableAccount(vCompanyDto.defaultPayableAccount());
        eCompanyDao.setDefaultExpenseAccount(vCompanyDto.defaultExpenseAccount());
        eCompanyDao.setDefaultIncomeAccount(vCompanyDto.defaultIncomeAccount());
        eCompanyDao.setDefaultDeferredRevenueAccount(vCompanyDto.defaultDeferredRevenueAccount());
        eCompanyDao.setDefaultDeferredExpenseAccount(vCompanyDto.defaultDeferredExpenseAccount());
        eCompanyDao.setDefaultDiscountAccount(vCompanyDto.defaultDiscountAccount());
        eCompanyDao.setPaymentTerms(vCompanyDto.paymentTerms());
        eCompanyDao.setCostCenter(vCompanyDto.costCenter());
        eCompanyDao.setDefaultFinanceBook(vCompanyDto.defaultFinanceBook());
        eCompanyDao.setBookAdvancePaymentsInSeparatePartyAccount(vCompanyDto.bookAdvancePaymentsInSeparatePartyAccount());
        eCompanyDao.setDefaultAdvanceReceivedAccount(vCompanyDto.defaultAdvanceReceivedAccount());
        eCompanyDao.setDefaultAdvancePaidAccount(vCompanyDto.defaultAdvancePaidAccount());
        eCompanyDao.setAutoExchangeRateRevaluation(vCompanyDto.autoExchangeRateRevaluation());
        eCompanyDao.setAutoErrFrequency(vCompanyDto.autoErrFrequency());
        eCompanyDao.setSubmitErrJv(vCompanyDto.submitErrJv());
        eCompanyDao.setExceptionBudgetApproverRole(vCompanyDto.exceptionBudgetApproverRole());
        eCompanyDao.setAccumulatedDepreciationAccount(vCompanyDto.accumulatedDepreciationAccount());
        eCompanyDao.setDepreciationExpenseAccount(vCompanyDto.depreciationExpenseAccount());
        eCompanyDao.setSeriesForDepreciationEntry(vCompanyDto.seriesForDepreciationEntry());
        eCompanyDao.setExpensesIncludedInAssetValuation(vCompanyDto.expensesIncludedInAssetValuation());
        eCompanyDao.setDisposalAccount(vCompanyDto.disposalAccount());
        eCompanyDao.setDepreciationCostCenter(vCompanyDto.depreciationCostCenter());
        eCompanyDao.setCapitalWorkInProgressAccount(vCompanyDto.capitalWorkInProgressAccount());
        eCompanyDao.setAssetReceivedButNotBilled(vCompanyDto.assetReceivedButNotBilled());
        eCompanyDao.setDefaultBuyingTerms(vCompanyDto.defaultBuyingTerms());
        eCompanyDao.setSalesMonthlyHistory(vCompanyDto.salesMonthlyHistory());
        eCompanyDao.setMonthlySalesTarget(vCompanyDto.monthlySalesTarget());
        eCompanyDao.setTotalMonthlySales(vCompanyDto.totalMonthlySales());
        eCompanyDao.setDefaultSellingTerms(vCompanyDto.defaultSellingTerms());
        eCompanyDao.setDefaultWarehouseForSalesReturn(vCompanyDto.defaultWarehouseForSalesReturn());
        eCompanyDao.setCreditLimit(vCompanyDto.creditLimit());
        eCompanyDao.setTransactionsAnnualHistory(vCompanyDto.transactionsAnnualHistory());
        eCompanyDao.setEnablePerpetualInventory(vCompanyDto.enablePerpetualInventory());
        eCompanyDao.setEnableProvisionalAccountingForNonStockItems(vCompanyDto.enableProvisionalAccountingForNonStockItems());
        eCompanyDao.setDefaultInventoryAccount(vCompanyDto.defaultInventoryAccount());
        eCompanyDao.setStockAdjustmentAccount(vCompanyDto.stockAdjustmentAccount());
        eCompanyDao.setDefaultInTransitWarehouse(vCompanyDto.defaultInTransitWarehouse());
        eCompanyDao.setStockReceivedButNotBilled(vCompanyDto.stockReceivedButNotBilled());
        eCompanyDao.setDefaultProvisionalAccount(vCompanyDto.defaultProvisionalAccount());
        eCompanyDao.setExpensesIncludedInValuation(vCompanyDto.expensesIncludedInValuation());
        eCompanyDao.setUserTags(vCompanyDto.userTags());
        eCompanyDao.setComments(vCompanyDto.comments());
        eCompanyDao.setAssign(vCompanyDto.assign());
        eCompanyDao.setLikedBy(vCompanyDto.likedBy());
    }
}