package com.itbd.application.db.repos;


import com.itbd.application.db.dao.doctypes.DocTypeLayoutDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabDocTypeLayoutRepository extends JpaRepository<DocTypeLayoutDao, String>, JpaSpecificationExecutor<DocTypeLayoutDao> {
}
