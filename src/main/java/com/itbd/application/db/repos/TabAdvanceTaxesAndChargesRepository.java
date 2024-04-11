package com.itbd.application.db.repos;


import com.itbd.application.db.dao.AdvanceTaxesAndChargesDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabAdvanceTaxesAndChargesRepository extends JpaRepository<AdvanceTaxesAndChargesDao, String>, JpaSpecificationExecutor<AdvanceTaxesAndChargesDao> {
}