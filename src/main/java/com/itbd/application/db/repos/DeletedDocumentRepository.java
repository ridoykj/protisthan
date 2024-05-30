package com.itbd.application.db.repos;


import com.itbd.application.db.dao.core.DeletedDocumentDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface DeletedDocumentRepository extends JpaRepository<DeletedDocumentDao, String>, JpaSpecificationExecutor<DeletedDocumentDao> {
}
