package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.pos.PosInvoiceReferenceDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PosInvoiceReferenceRepository extends JpaRepository<PosInvoiceReferenceDao, String>, JpaSpecificationExecutor<PosInvoiceReferenceDao> {
}
