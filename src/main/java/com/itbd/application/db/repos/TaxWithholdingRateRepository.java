package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.tax.TaxWithholdingRateDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TaxWithholdingRateRepository extends JpaRepository<TaxWithholdingRateDao, String>, JpaSpecificationExecutor<TaxWithholdingRateDao> {
}
