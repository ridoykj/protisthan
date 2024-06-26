package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.sales.SalesTaxesAndChargesDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SalesTaxesAndChargesRepository extends JpaRepository<SalesTaxesAndChargesDao, String>, JpaSpecificationExecutor<SalesTaxesAndChargesDao> {
}
