package com.itbd.application.db.repos;


import com.itbd.application.db.dao.setup.WebsiteItemGroupDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WebsiteItemGroupRepository extends JpaRepository<WebsiteItemGroupDao, String>, JpaSpecificationExecutor<WebsiteItemGroupDao> {
}
