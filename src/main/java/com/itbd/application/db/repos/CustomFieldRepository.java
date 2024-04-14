package com.itbd.application.db.repos;


import com.itbd.application.db.dao.CustomFieldDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface CustomFieldRepository extends JpaRepository<CustomFieldDao, String>, JpaSpecificationExecutor<CustomFieldDao> {
}
