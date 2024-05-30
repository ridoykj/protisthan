package com.itbd.application.db.dto.emails;

import com.itbd.application.db.dao.setup.email.EmailDigestDao;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public record EmailDigestDto(
        @Id
        String name,
        LocalDateTime creation,
        LocalDateTime modified,
        String modifiedBy,
        String owner,
        Boolean isDocStatus,
        Integer idx,
        Boolean enabled,
        String company,
        String frequency,
        String nextSend,
        Boolean income,
        Boolean expensesBooked,
        Boolean incomeYearToDate,
        Boolean expenseYearToDate,
        Boolean bankBalance,
        Boolean creditBalance,
        Boolean invoicedAmount,
        Boolean payables,
        Boolean salesOrdersToBill,
        Boolean purchaseOrdersToBill,
        Boolean salesOrder,
        Boolean purchaseOrder,
        Boolean salesOrdersToDeliver,
        Boolean purchaseOrdersToReceive,
        Boolean salesInvoice,
        Boolean purchaseInvoice,
        Boolean newQuotations,
        Boolean pendingQuotations,
        Boolean issue,
        Boolean project,
        Integer purchaseOrdersItemsOverdue,
        Boolean calendarEvents,
        Boolean todoList,
        Boolean notifications,
        Boolean addQuote,
        String userTags,
        String comments,
        String assign,
        String likedBy
) {
    public static EmailDigestDto fromEntity(EmailDigestDao eEmailDigestDao) {
        return new EmailDigestDto(
                eEmailDigestDao.getName(),
                eEmailDigestDao.getCreation(),
                eEmailDigestDao.getModified(),
                eEmailDigestDao.getModifiedBy(),
                eEmailDigestDao.getOwner(),
                eEmailDigestDao.getIsDocStatus(),
                eEmailDigestDao.getIdx(),
                eEmailDigestDao.getEnabled(),
                eEmailDigestDao.getCompany(),
                eEmailDigestDao.getFrequency(),
                eEmailDigestDao.getNextSend(),
                eEmailDigestDao.getIncome(),
                eEmailDigestDao.getExpensesBooked(),
                eEmailDigestDao.getIncomeYearToDate(),
                eEmailDigestDao.getExpenseYearToDate(),
                eEmailDigestDao.getBankBalance(),
                eEmailDigestDao.getCreditBalance(),
                eEmailDigestDao.getInvoicedAmount(),
                eEmailDigestDao.getPayables(),
                eEmailDigestDao.getSalesOrdersToBill(),
                eEmailDigestDao.getPurchaseOrdersToBill(),
                eEmailDigestDao.getSalesOrder(),
                eEmailDigestDao.getPurchaseOrder(),
                eEmailDigestDao.getSalesOrdersToDeliver(),
                eEmailDigestDao.getPurchaseOrdersToReceive(),
                eEmailDigestDao.getSalesInvoice(),
                eEmailDigestDao.getPurchaseInvoice(),
                eEmailDigestDao.getNewQuotations(),
                eEmailDigestDao.getPendingQuotations(),
                eEmailDigestDao.getIssue(),
                eEmailDigestDao.getProject(),
                eEmailDigestDao.getPurchaseOrdersItemsOverdue(),
                eEmailDigestDao.getCalendarEvents(),
                eEmailDigestDao.getTodoList(),
                eEmailDigestDao.getNotifications(),
                eEmailDigestDao.getAddQuote(),
                eEmailDigestDao.getUserTags(),
                eEmailDigestDao.getComments(),
                eEmailDigestDao.getAssign(),
                eEmailDigestDao.getLikedBy());
    }

    public static void fromDTO(EmailDigestDto vEmailDigestDto, EmailDigestDao eEmailDigestDao) {
        eEmailDigestDao.setName(vEmailDigestDto.name());
        eEmailDigestDao.setCreation(vEmailDigestDto.creation());
        eEmailDigestDao.setModified(vEmailDigestDto.modified());
        eEmailDigestDao.setModifiedBy(vEmailDigestDto.modifiedBy());
        eEmailDigestDao.setOwner(vEmailDigestDto.owner());
        eEmailDigestDao.setIsDocStatus(vEmailDigestDto.isDocStatus());
        eEmailDigestDao.setIdx(vEmailDigestDto.idx());
        eEmailDigestDao.setEnabled(vEmailDigestDto.enabled());
        eEmailDigestDao.setCompany(vEmailDigestDto.company());
        eEmailDigestDao.setFrequency(vEmailDigestDto.frequency());
        eEmailDigestDao.setNextSend(vEmailDigestDto.nextSend());
        eEmailDigestDao.setIncome(vEmailDigestDto.income());
        eEmailDigestDao.setExpensesBooked(vEmailDigestDto.expensesBooked());
        eEmailDigestDao.setIncomeYearToDate(vEmailDigestDto.incomeYearToDate());
        eEmailDigestDao.setExpenseYearToDate(vEmailDigestDto.expenseYearToDate());
        eEmailDigestDao.setBankBalance(vEmailDigestDto.bankBalance());
        eEmailDigestDao.setCreditBalance(vEmailDigestDto.creditBalance());
        eEmailDigestDao.setInvoicedAmount(vEmailDigestDto.invoicedAmount());
        eEmailDigestDao.setPayables(vEmailDigestDto.payables());
        eEmailDigestDao.setSalesOrdersToBill(vEmailDigestDto.salesOrdersToBill());
        eEmailDigestDao.setPurchaseOrdersToBill(vEmailDigestDto.purchaseOrdersToBill());
        eEmailDigestDao.setSalesOrder(vEmailDigestDto.salesOrder());
        eEmailDigestDao.setPurchaseOrder(vEmailDigestDto.purchaseOrder());
        eEmailDigestDao.setSalesOrdersToDeliver(vEmailDigestDto.salesOrdersToDeliver());
        eEmailDigestDao.setPurchaseOrdersToReceive(vEmailDigestDto.purchaseOrdersToReceive());
        eEmailDigestDao.setSalesInvoice(vEmailDigestDto.salesInvoice());
        eEmailDigestDao.setPurchaseInvoice(vEmailDigestDto.purchaseInvoice());
        eEmailDigestDao.setNewQuotations(vEmailDigestDto.newQuotations());
        eEmailDigestDao.setPendingQuotations(vEmailDigestDto.pendingQuotations());
        eEmailDigestDao.setIssue(vEmailDigestDto.issue());
        eEmailDigestDao.setProject(vEmailDigestDto.project());
        eEmailDigestDao.setPurchaseOrdersItemsOverdue(vEmailDigestDto.purchaseOrdersItemsOverdue());
        eEmailDigestDao.setCalendarEvents(vEmailDigestDto.calendarEvents());
        eEmailDigestDao.setTodoList(vEmailDigestDto.todoList());
        eEmailDigestDao.setNotifications(vEmailDigestDto.notifications());
        eEmailDigestDao.setAddQuote(vEmailDigestDto.addQuote());
        eEmailDigestDao.setUserTags(vEmailDigestDto.userTags());
        eEmailDigestDao.setComments(vEmailDigestDto.comments());
        eEmailDigestDao.setAssign(vEmailDigestDto.assign());
        eEmailDigestDao.setLikedBy(vEmailDigestDto.likedBy());
    }
}