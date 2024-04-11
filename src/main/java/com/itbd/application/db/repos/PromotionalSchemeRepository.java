package com.itbd.application.db.repos;


import com.itbd.application.db.dao.PromotionalSchemeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PromotionalSchemeRepository extends JpaRepository<PromotionalSchemeDao, String>, JpaSpecificationExecutor<PromotionalSchemeDao> {
}
