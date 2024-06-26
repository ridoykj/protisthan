package com.itbd.application.db.repos;


import com.itbd.application.db.dao.core.doc.DocShareDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface DocShareRepository extends JpaRepository<DocShareDao, String>, JpaSpecificationExecutor<DocShareDao> {
}
