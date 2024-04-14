package com.itbd.application.db.repos;


import com.itbd.application.db.dao.doctypes.DocTypeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabDocTypeRepository extends JpaRepository<DocTypeDao, String>, JpaSpecificationExecutor<DocTypeDao> {
}
