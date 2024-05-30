package com.itbd.application.db.repos;


import com.itbd.application.db.dao.website.blog.BlogPostDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface BlogPostRepository extends JpaRepository<BlogPostDao, String>, JpaSpecificationExecutor<BlogPostDao> {
}
