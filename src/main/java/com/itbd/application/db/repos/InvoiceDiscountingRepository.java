package com.itbd.application.db.repos;

import com.itbd.application.db.dao.InvoiceDiscountingDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface InvoiceDiscountingRepository extends JpaRepository<InvoiceDiscountingDao, String>, JpaSpecificationExecutor<InvoiceDiscountingDao> {
}
