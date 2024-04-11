package com.itbd.application.db.repos;


import com.itbd.application.db.dao.website.WebsiteSlideshowDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WebsiteSlideshowRepository extends JpaRepository<WebsiteSlideshowDao, String>, JpaSpecificationExecutor<WebsiteSlideshowDao> {
}
