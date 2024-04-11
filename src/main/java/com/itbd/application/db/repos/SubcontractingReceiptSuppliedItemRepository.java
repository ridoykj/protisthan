package com.itbd.application.db.repos;


import com.itbd.application.db.dao.subcontracting.SubcontractingReceiptSuppliedItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SubcontractingReceiptSuppliedItemRepository extends JpaRepository<SubcontractingReceiptSuppliedItemDao, String>, JpaSpecificationExecutor<SubcontractingReceiptSuppliedItemDao> {
}
