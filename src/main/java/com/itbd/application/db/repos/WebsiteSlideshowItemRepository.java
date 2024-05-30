package com.itbd.application.db.repos;


import com.itbd.application.db.dao.website.website.WebsiteSlideshowItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WebsiteSlideshowItemRepository extends JpaRepository<WebsiteSlideshowItemDao, String>, JpaSpecificationExecutor<WebsiteSlideshowItemDao> {
}
