package com.itbd.application.db.repos;


import com.itbd.application.db.dao.core.DocumentShareKeyDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface DocumentShareKeyRepository extends JpaRepository<DocumentShareKeyDao, String>, JpaSpecificationExecutor<DocumentShareKeyDao> {
}
