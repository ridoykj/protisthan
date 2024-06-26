package com.itbd.application.db.repos;


import com.itbd.application.db.dao.custom.CustomizeFormFieldDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface CustomizeFormFieldRepository extends JpaRepository<CustomizeFormFieldDao, String>, JpaSpecificationExecutor<CustomizeFormFieldDao> {
}
