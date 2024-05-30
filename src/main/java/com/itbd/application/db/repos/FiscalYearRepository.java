package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.FiscalYearDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface FiscalYearRepository extends JpaRepository<FiscalYearDao, String>, JpaSpecificationExecutor<FiscalYearDao> {
}
