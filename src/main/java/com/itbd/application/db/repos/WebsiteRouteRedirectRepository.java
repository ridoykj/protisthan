package com.itbd.application.db.repos;


import com.itbd.application.db.dao.website.website.WebsiteRouteRedirectDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WebsiteRouteRedirectRepository extends JpaRepository<WebsiteRouteRedirectDao, String>, JpaSpecificationExecutor<WebsiteRouteRedirectDao> {
}
