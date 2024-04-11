package com.itbd.application.db.repos;


import com.itbd.application.db.dao.website.component.WebTemplateDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WebTemplateRepository extends JpaRepository<WebTemplateDao, String>, JpaSpecificationExecutor<WebTemplateDao> {
}
