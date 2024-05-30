package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.AdvanceTaxesAndChargesDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface AdvanceTaxesAndChargesRepository extends JpaRepository<AdvanceTaxesAndChargesDao, String>, JpaSpecificationExecutor<AdvanceTaxesAndChargesDao> {
}
