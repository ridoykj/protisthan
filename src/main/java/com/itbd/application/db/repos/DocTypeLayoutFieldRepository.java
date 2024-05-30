package com.itbd.application.db.repos;


import com.itbd.application.db.dao.custom.DocTypeLayoutFieldDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface DocTypeLayoutFieldRepository extends JpaRepository<DocTypeLayoutFieldDao, String>, JpaSpecificationExecutor<DocTypeLayoutFieldDao> {
}
