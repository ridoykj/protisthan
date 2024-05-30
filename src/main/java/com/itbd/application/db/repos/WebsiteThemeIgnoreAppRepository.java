package com.itbd.application.db.repos;


import com.itbd.application.db.dao.website.website.WebsiteThemeIgnoreAppDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WebsiteThemeIgnoreAppRepository extends JpaRepository<WebsiteThemeIgnoreAppDao, String>, JpaSpecificationExecutor<WebsiteThemeIgnoreAppDao> {
}
