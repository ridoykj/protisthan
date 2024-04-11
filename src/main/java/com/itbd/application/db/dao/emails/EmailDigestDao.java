package com.itbd.application.db.dao.emails;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "t_email_digest", indexes = {
        @Index(name = "idx_modified", columnList = "dtt_modified")
})
public class EmailDigestDao {

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

    @Column(name = "is_enabled", nullable = false)
    @ColumnDefault("0")
    private Boolean enabled;

    @Column(name = "tx_company", length = 140)
    private String company;

    @Column(name = "tx_frequency", length = 140)
    private String frequency;

    @Column(name = "tx_next_send", length = 140)
    private String nextSend;

    @Column(name = "is_income", nullable = false)
    @ColumnDefault("0")
    private Boolean income;

    @Column(name = "is_expenses_booked", nullable = false)
    @ColumnDefault("0")
    private Boolean expensesBooked;

    @Column(name = "is_income_year_to_date", nullable = false)
    @ColumnDefault("0")
    private Boolean incomeYearToDate;

    @Column(name = "is_expense_year_to_date", nullable = false)
    @ColumnDefault("0")
    private Boolean expenseYearToDate;

    @Column(name = "is_bank_balance", nullable = false)
    @ColumnDefault("0")
    private Boolean bankBalance;

    @Column(name = "is_credit_balance", nullable = false)
    @ColumnDefault("0")
    private Boolean creditBalance;

    @Column(name = "is_invoiced_amount", nullable = false)
    @ColumnDefault("0")
    private Boolean invoicedAmount;

    @Column(name = "is_payables", nullable = false)
    @ColumnDefault("0")
    private Boolean payables;

    @Column(name = "is_sales_orders_to_bill", nullable = false)
    @ColumnDefault("0")
    private Boolean salesOrdersToBill;

    @Column(name = "is_purchase_orders_to_bill", nullable = false)
    @ColumnDefault("0")
    private Boolean purchaseOrdersToBill;

    @Column(name = "is_sales_order", nullable = false)
    @ColumnDefault("0")
    private Boolean salesOrder;

    @Column(name = "is_purchase_order", nullable = false)
    @ColumnDefault("0")
    private Boolean purchaseOrder;

    @Column(name = "is_sales_orders_to_deliver", nullable = false)
    @ColumnDefault("0")
    private Boolean salesOrdersToDeliver;

    @Column(name = "is_purchase_orders_to_receive", nullable = false)
    @ColumnDefault("0")
    private Boolean purchaseOrdersToReceive;

    @Column(name = "is_sales_invoice", nullable = false)
    @ColumnDefault("0")
    private Boolean salesInvoice;

    @Column(name = "is_purchase_invoice", nullable = false)
    @ColumnDefault("0")
    private Boolean purchaseInvoice;

    @Column(name = "is_new_quotations", nullable = false)
    @ColumnDefault("0")
    private Boolean newQuotations;

    @Column(name = "is_pending_quotations", nullable = false)
    @ColumnDefault("0")
    private Boolean pendingQuotations;

    @Column(name = "is_issue", nullable = false)
    @ColumnDefault("0")
    private Boolean issue;

    @Column(name = "is_project", nullable = false)
    @ColumnDefault("0")
    private Boolean project;

    @Column(name = "is_purchase_orders_items_overdue", nullable = false)
    @ColumnDefault("0")
    private Integer purchaseOrdersItemsOverdue;

    @Column(name = "is_calendar_events", nullable = false)
    @ColumnDefault("0")
    private Boolean calendarEvents;

    @Column(name = "is_todo_list", nullable = false)
    @ColumnDefault("0")
    private Boolean todoList;

    @Column(name = "is_notifications", nullable = false)
    @ColumnDefault("0")
    private Boolean notifications;

    @Column(name = "is_add_quote", nullable = false)
    @ColumnDefault("0")
    private Boolean addQuote;

    @Column(name = "_user_tags", columnDefinition = "text")
    private String userTags;

    @Column(name = "_comments", columnDefinition = "text")
    private String comments;

    @Column(name = "_assign", columnDefinition = "text")
    private String assign;

    @Column(name = "_liked_by", columnDefinition = "text")
    private String likedBy;

}
