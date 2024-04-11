package com.itbd.application.db.repos;


import com.itbd.application.db.dao.purchases.PurchaseTaxesAndChargesTemplateDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PurchaseTaxesAndChargesTemplateRepository extends JpaRepository<PurchaseTaxesAndChargesTemplateDao, String>, JpaSpecificationExecutor<PurchaseTaxesAndChargesTemplateDao> {
}
