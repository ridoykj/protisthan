package com.itbd.application.db.repos;


import com.itbd.application.db.dao.OpeningInvoiceCreationToolItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface OpeningInvoiceCreationToolItemRepository extends JpaRepository<OpeningInvoiceCreationToolItemDao, String>, JpaSpecificationExecutor<OpeningInvoiceCreationToolItemDao> {
}
