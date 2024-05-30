package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.tax.TaxRuleDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TaxRuleRepository extends JpaRepository<TaxRuleDao, String>, JpaSpecificationExecutor<TaxRuleDao> {
}
