package com.itbd.application.db.repos;


import com.itbd.application.db.dao.website.blog.BloggerDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface BloggerRepository extends JpaRepository<BloggerDao, String>, JpaSpecificationExecutor<BloggerDao> {
}
