package com.itbd.application.db.repos;


import com.itbd.application.db.dao.sales.SalesTaxesAndChargesTemplateDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SalesTaxesAndChargesTemplateRepository extends JpaRepository<SalesTaxesAndChargesTemplateDao, String>, JpaSpecificationExecutor<SalesTaxesAndChargesTemplateDao> {
}
