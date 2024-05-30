package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.FiscalYearCompanyDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface FiscalYearCompanyRepository extends JpaRepository<FiscalYearCompanyDao, String>, JpaSpecificationExecutor<FiscalYearCompanyDao> {
}
