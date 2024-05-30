package com.itbd.application.db.repos;


import com.itbd.application.db.dao.website.website.WebsiteSidebarItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WebsiteSidebarItemRepository extends JpaRepository<WebsiteSidebarItemDao, String>, JpaSpecificationExecutor<WebsiteSidebarItemDao> {
}
