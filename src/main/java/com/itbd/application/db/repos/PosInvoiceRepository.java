package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.pos.PosInvoiceDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PosInvoiceRepository extends JpaRepository<PosInvoiceDao, String>, JpaSpecificationExecutor<PosInvoiceDao> {
}
