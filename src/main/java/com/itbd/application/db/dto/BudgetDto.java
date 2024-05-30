package com.itbd.application.db.dto;

import com.itbd.application.db.dao.accounts.BudgetDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record BudgetDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        String budgetAgainst,
        String company,
        String costCenter,
        String namingSeries,
        String project,
        String fiscalYear,
        String monthlyDistribution,
        String amendedFrom,
        Boolean applicableOnMaterialRequest,
        String actionIfAnnualBudgetExceededOnMr,
        String actionIfAccumulatedMonthlyBudgetExceededOnMr,
        Boolean applicableOnPurchaseOrder,
        String actionIfAnnualBudgetExceededOnPo,
        String actionIfAccumulatedMonthlyBudgetExceededOnPo,
        Boolean applicableOnBookingActualExpenses,
        String actionIfAnnualBudgetExceeded,
        String actionIfAccumulatedMonthlyBudgetExceeded,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static BudgetDto fromEntity(BudgetDao eBudgetDao) {
        return new BudgetDto(
                eBudgetDao.getName(),
                eBudgetDao.getCreation(),
                eBudgetDao.getModified(),
                eBudgetDao.getModifiedBy(),
                eBudgetDao.getOwner(),
                eBudgetDao.getIsDocStatus(),
                eBudgetDao.getIdx(),
                eBudgetDao.getBudgetAgainst(),
                eBudgetDao.getCompany(),
                eBudgetDao.getCostCenter(),
                eBudgetDao.getNamingSeries(),
                eBudgetDao.getProject(),
                eBudgetDao.getFiscalYear(),
                eBudgetDao.getMonthlyDistribution(),
                eBudgetDao.getAmendedFrom(),
                eBudgetDao.getApplicableOnMaterialRequest(),
                eBudgetDao.getActionIfAnnualBudgetExceededOnMr(),
                eBudgetDao.getActionIfAccumulatedMonthlyBudgetExceededOnMr(),
                eBudgetDao.getApplicableOnPurchaseOrder(),
                eBudgetDao.getActionIfAnnualBudgetExceededOnPo(),
                eBudgetDao.getActionIfAccumulatedMonthlyBudgetExceededOnPo(),
                eBudgetDao.getApplicableOnBookingActualExpenses(),
                eBudgetDao.getActionIfAnnualBudgetExceeded(),
                eBudgetDao.getActionIfAccumulatedMonthlyBudgetExceeded(),
                eBudgetDao.getUserTags(),
                eBudgetDao.getComments(),
                eBudgetDao.getAssign(),
                eBudgetDao.getLikedBy());
    }

    public static void fromDTO(BudgetDto vBudgetDto, BudgetDao eBudgetDao) {
        eBudgetDao.setName(vBudgetDto.name());
        eBudgetDao.setCreation(vBudgetDto.creation());
        eBudgetDao.setModified(vBudgetDto.modified());
        eBudgetDao.setModifiedBy(vBudgetDto.modifiedBy());
        eBudgetDao.setOwner(vBudgetDto.owner());
        eBudgetDao.setIsDocStatus(vBudgetDto.isDocStatus());
        eBudgetDao.setIdx(vBudgetDto.idx());
        eBudgetDao.setBudgetAgainst(vBudgetDto.budgetAgainst());
        eBudgetDao.setCompany(vBudgetDto.company());
        eBudgetDao.setCostCenter(vBudgetDto.costCenter());
        eBudgetDao.setNamingSeries(vBudgetDto.namingSeries());
        eBudgetDao.setProject(vBudgetDto.project());
        eBudgetDao.setFiscalYear(vBudgetDto.fiscalYear());
        eBudgetDao.setMonthlyDistribution(vBudgetDto.monthlyDistribution());
        eBudgetDao.setAmendedFrom(vBudgetDto.amendedFrom());
        eBudgetDao.setApplicableOnMaterialRequest(vBudgetDto.applicableOnMaterialRequest());
        eBudgetDao.setActionIfAnnualBudgetExceededOnMr(vBudgetDto.actionIfAnnualBudgetExceededOnMr());
        eBudgetDao.setActionIfAccumulatedMonthlyBudgetExceededOnMr(vBudgetDto.actionIfAccumulatedMonthlyBudgetExceededOnMr());
        eBudgetDao.setApplicableOnPurchaseOrder(vBudgetDto.applicableOnPurchaseOrder());
        eBudgetDao.setActionIfAnnualBudgetExceededOnPo(vBudgetDto.actionIfAnnualBudgetExceededOnPo());
        eBudgetDao.setActionIfAccumulatedMonthlyBudgetExceededOnPo(vBudgetDto.actionIfAccumulatedMonthlyBudgetExceededOnPo());
        eBudgetDao.setApplicableOnBookingActualExpenses(vBudgetDto.applicableOnBookingActualExpenses());
        eBudgetDao.setActionIfAnnualBudgetExceeded(vBudgetDto.actionIfAnnualBudgetExceeded());
        eBudgetDao.setActionIfAccumulatedMonthlyBudgetExceeded(vBudgetDto.actionIfAccumulatedMonthlyBudgetExceeded());
        eBudgetDao.setUserTags(vBudgetDto.userTags());
        eBudgetDao.setComments(vBudgetDto.comments());
        eBudgetDao.setAssign(vBudgetDto.assign());
        eBudgetDao.setLikedBy(vBudgetDto.likedBy());
    }
}