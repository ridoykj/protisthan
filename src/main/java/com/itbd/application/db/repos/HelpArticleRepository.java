package com.itbd.application.db.repos;


import com.itbd.application.db.dao.website.HelpArticleDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface HelpArticleRepository extends JpaRepository<HelpArticleDao, String>, JpaSpecificationExecutor<HelpArticleDao> {
}
