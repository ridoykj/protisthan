package com.itbd.application.db.repos;


import com.itbd.application.db.dao.documents.DocumentShareKeyDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabDocumentShareKeyRepository extends JpaRepository<DocumentShareKeyDao, String>, JpaSpecificationExecutor<DocumentShareKeyDao> {
}
