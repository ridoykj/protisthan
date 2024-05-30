package com.itbd.application.db.repos;


import com.itbd.application.db.dao.website.website.WebsiteRouteMetaDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WebsiteRouteMetaRepository extends JpaRepository<WebsiteRouteMetaDao, String>, JpaSpecificationExecutor<WebsiteRouteMetaDao> {
}
