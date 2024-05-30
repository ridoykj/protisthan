package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.pos.PosInvoiceItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PosInvoiceItemRepository extends JpaRepository<PosInvoiceItemDao, String>, JpaSpecificationExecutor<PosInvoiceItemDao> {
}
