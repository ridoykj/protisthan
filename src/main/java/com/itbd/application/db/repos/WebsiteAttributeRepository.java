package com.itbd.application.db.repos;


import com.itbd.application.db.dao.website.WebsiteAttributeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WebsiteAttributeRepository extends JpaRepository<WebsiteAttributeDao, String>, JpaSpecificationExecutor<WebsiteAttributeDao> {
}
