package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.ClosedDocumentDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ClosedDocumentRepository extends JpaRepository<ClosedDocumentDao, String>, JpaSpecificationExecutor<ClosedDocumentDao> {
}
