package com.itbd.application.db.repos;


import com.itbd.application.db.dao.BlogCategoryDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface BlogCategoryRepository extends JpaRepository<BlogCategoryDao, String>, JpaSpecificationExecutor<BlogCategoryDao> {
}
