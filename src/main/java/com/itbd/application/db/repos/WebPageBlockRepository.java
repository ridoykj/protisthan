package com.itbd.application.db.repos;


import com.itbd.application.db.dao.website.component.WebPageBlockDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WebPageBlockRepository extends JpaRepository<WebPageBlockDao, String>, JpaSpecificationExecutor<WebPageBlockDao> {
}
