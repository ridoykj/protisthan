package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.tax.TaxCategoryDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TaxCategoryRepository extends JpaRepository<TaxCategoryDao, String>, JpaSpecificationExecutor<TaxCategoryDao> {
}
