package com.itbd.application.db.repos;


import com.itbd.application.db.dao.core.doc.DocTypeStateDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface DocTypeStateRepository extends JpaRepository<DocTypeStateDao, String>, JpaSpecificationExecutor<DocTypeStateDao> {
}
