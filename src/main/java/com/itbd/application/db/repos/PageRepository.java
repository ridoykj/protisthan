package com.itbd.application.db.repos;


import com.itbd.application.db.dao.core.PageDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PageRepository extends JpaRepository<PageDao, String>, JpaSpecificationExecutor<PageDao> {
}
