package com.itbd.application.db.repos;


import com.itbd.application.db.dao.website.component.WebTemplateFieldDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WebTemplateFieldRepository extends JpaRepository<WebTemplateFieldDao, String>, JpaSpecificationExecutor<WebTemplateFieldDao> {
}
