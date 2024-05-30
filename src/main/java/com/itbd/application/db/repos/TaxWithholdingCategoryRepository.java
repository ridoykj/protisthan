package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.tax.TaxWithholdingCategoryDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TaxWithholdingCategoryRepository extends JpaRepository<TaxWithholdingCategoryDao, String>, JpaSpecificationExecutor<TaxWithholdingCategoryDao> {
}
