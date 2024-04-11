package com.itbd.application.db.repos;


import com.itbd.application.db.dao.AdvanceTaxDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabAdvanceTaxRepository extends JpaRepository<AdvanceTaxDao, String>, JpaSpecificationExecutor<AdvanceTaxDao> {
}
