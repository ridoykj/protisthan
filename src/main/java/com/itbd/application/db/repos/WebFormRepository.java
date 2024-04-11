package com.itbd.application.db.repos;


import com.itbd.application.db.dao.website.component.WebFormDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WebFormRepository extends JpaRepository<WebFormDao, String>, JpaSpecificationExecutor<WebFormDao> {
}
