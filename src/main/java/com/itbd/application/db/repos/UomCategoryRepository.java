package com.itbd.application.db.repos;


import com.itbd.application.db.dao.uoms.UomCategoryDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface UomCategoryRepository extends JpaRepository<UomCategoryDao, String>, JpaSpecificationExecutor<UomCategoryDao> {
}
