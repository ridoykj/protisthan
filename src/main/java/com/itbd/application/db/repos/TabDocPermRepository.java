package com.itbd.application.db.repos;


import com.itbd.application.db.dao.doctypes.DocPermDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabDocPermRepository extends JpaRepository<DocPermDao, String>, JpaSpecificationExecutor<DocPermDao> {
}
