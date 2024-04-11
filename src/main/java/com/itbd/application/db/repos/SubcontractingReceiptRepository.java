package com.itbd.application.db.repos;


import com.itbd.application.db.dao.subcontracting.SubcontractingReceiptDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SubcontractingReceiptRepository extends JpaRepository<SubcontractingReceiptDao, String>, JpaSpecificationExecutor<SubcontractingReceiptDao> {
}
