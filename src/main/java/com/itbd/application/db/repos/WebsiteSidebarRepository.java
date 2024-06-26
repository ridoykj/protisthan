package com.itbd.application.db.repos;


import com.itbd.application.db.dao.website.website.WebsiteSidebarDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WebsiteSidebarRepository extends JpaRepository<WebsiteSidebarDao, String>, JpaSpecificationExecutor<WebsiteSidebarDao> {
}
