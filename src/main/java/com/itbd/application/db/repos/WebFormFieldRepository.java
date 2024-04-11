package com.itbd.application.db.repos;


import com.itbd.application.db.dao.website.component.WebFormFieldDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WebFormFieldRepository extends JpaRepository<WebFormFieldDao, String>, JpaSpecificationExecutor<WebFormFieldDao> {
}
