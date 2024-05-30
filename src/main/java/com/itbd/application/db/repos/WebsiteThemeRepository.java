package com.itbd.application.db.repos;


import com.itbd.application.db.dao.website.website.WebsiteThemeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WebsiteThemeRepository extends JpaRepository<WebsiteThemeDao, String>, JpaSpecificationExecutor<WebsiteThemeDao> {
}
