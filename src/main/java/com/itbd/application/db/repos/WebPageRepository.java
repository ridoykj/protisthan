package com.itbd.application.db.repos;


import com.itbd.application.db.dao.website.component.WebPageDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WebPageRepository extends JpaRepository<WebPageDao, String>, JpaSpecificationExecutor<WebPageDao> {
}
