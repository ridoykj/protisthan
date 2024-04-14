package com.itbd.application.db.repos;


import com.itbd.application.db.dao.FiscalYearCompanyDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabFiscalYearCompanyRepository extends JpaRepository<FiscalYearCompanyDao, String>, JpaSpecificationExecutor<FiscalYearCompanyDao> {
}
