package com.itbd.application.db.repos;


import com.itbd.application.db.dao.HelpCategoryDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabHelpCategoryRepository extends JpaRepository<HelpCategoryDao, String>, JpaSpecificationExecutor<HelpCategoryDao> {
}
