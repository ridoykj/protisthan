package com.itbd.application.db.repos;


import com.itbd.application.db.dao.doctypes.DocFieldDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabDocFieldRepository extends JpaRepository<DocFieldDao, String>, JpaSpecificationExecutor<DocFieldDao> {
}
