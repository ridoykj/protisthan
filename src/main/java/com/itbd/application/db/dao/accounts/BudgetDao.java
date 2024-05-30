package com.itbd.application.db.dao;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_budget", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class BudgetDao {

    @Id
    @Column(name = "tx_name", nullable = false, updatable = false, length = 140)
    private String name;

    @Column(name = "dtt_creation")
    private LocalDateTime creation;

    @Column(name = "dtt_modified")
    private LocalDateTime modified;

    @Column(name = "tx_modified_by", length = 140)
    private String modifiedBy;

    @Column(name = "tx_owner", length = 140)
    private String owner;

    @Column(name = "is_doc_status", nullable = false)
    @ColumnDefault("0")
    private Boolean isDocStatus;

    @Column(name = "ct_idx", nullable = false)
    @ColumnDefault("0")
    private Integer idx;

    @Column(name = "tx_budget_against", length = 140)
    @ColumnDefault("'Cost Center'")
    private String budgetAgainst;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "tx_cost_center", length = 140)
    private String costCenter;

    @Column(name = "tx_naming_series", length = 140)
    private String namingSeries;

    @Column(name = "tx_project", length = 140)
    private String project;

    @Column(name = "tx_fiscal_year", length = 140)
    private String fiscalYear;

    @Column(name = "tx_monthly_distribution", length = 140)
    private String monthlyDistribution;

    @Column(name = "tx_amended_from", length = 140)
    private String amendedFrom;

    @Column(name = "is_applicable_on_material_request", nullable = false)
    @ColumnDefault("0")
    private Boolean applicableOnMaterialRequest;

    @Column(name = "tx_action_if_annual_budget_exceeded_on_mr", length = 140)
    @ColumnDefault("'Stop'")
    private String actionIfAnnualBudgetExceededOnMr;

    @Column(name = "tx_action_if_accumulated_monthly_budget_exceeded_on_mr", length = 140)
    @ColumnDefault("'Warn'")
    private String actionIfAccumulatedMonthlyBudgetExceededOnMr;

    @Column(name = "is_applicable_on_purchase_order", nullable = false)
    @ColumnDefault("0")
    private Boolean applicableOnPurchaseOrder;

    @Column(name = "tx_action_if_annual_budget_exceeded_on_po", length = 140)
    @ColumnDefault("'Stop'")
    private String actionIfAnnualBudgetExceededOnPo;

    @Column(name = "tx_action_if_accumulated_monthly_budget_exceeded_on_po", length = 140)
    @ColumnDefault("'Warn'")
    private String actionIfAccumulatedMonthlyBudgetExceededOnPo;

    @Column(name = "is_applicable_on_booking_actual_expenses", nullable = false)
    @ColumnDefault("0")
    private Boolean applicableOnBookingActualExpenses;

    @Column(name = "tx_action_if_annual_budget_exceeded", length = 140)
    @ColumnDefault("'Stop'")
    private String actionIfAnnualBudgetExceeded;

    @Column(name = "tx_action_if_accumulated_monthly_budget_exceeded", length = 140)
    @ColumnDefault("'Warn'")
    private String actionIfAccumulatedMonthlyBudgetExceeded;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
