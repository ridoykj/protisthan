package com.itbd.application.db.repos;


import com.itbd.application.db.dao.website.WebsiteMetaTagDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WebsiteMetaTagRepository extends JpaRepository<WebsiteMetaTagDao, String>, JpaSpecificationExecutor<WebsiteMetaTagDao> {
}
