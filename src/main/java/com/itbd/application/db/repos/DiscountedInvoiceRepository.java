package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.DiscountedInvoiceDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface DiscountedInvoiceRepository extends JpaRepository<DiscountedInvoiceDao, String>, JpaSpecificationExecutor<DiscountedInvoiceDao> {
}
