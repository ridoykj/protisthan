package com.itbd.application.db.repos;


import com.itbd.application.db.dao.DeletedDocumentDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabDeletedDocumentRepository extends JpaRepository<DeletedDocumentDao, String>, JpaSpecificationExecutor<DeletedDocumentDao> {
}
