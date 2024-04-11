package com.itbd.application.db.repos;


import com.itbd.application.db.dao.purchases.PurchaseTaxesAndChargesDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PurchaseTaxesAndChargesRepository extends JpaRepository<PurchaseTaxesAndChargesDao, String>, JpaSpecificationExecutor<PurchaseTaxesAndChargesDao> {
}
