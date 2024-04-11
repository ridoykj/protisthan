package com.itbd.application.db.repos;


import com.itbd.application.db.dao.doctypes.DocTypeStateDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabDocTypeStateRepository extends JpaRepository<DocTypeStateDao, String>, JpaSpecificationExecutor<DocTypeStateDao> {
}
