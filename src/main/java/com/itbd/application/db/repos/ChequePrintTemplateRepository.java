package com.itbd.application.db.repos;


import com.itbd.application.db.dao.ChequePrintTemplateDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ChequePrintTemplateRepository extends JpaRepository<ChequePrintTemplateDao, String>, JpaSpecificationExecutor<ChequePrintTemplateDao> {
}
