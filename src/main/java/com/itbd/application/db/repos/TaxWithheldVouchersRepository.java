package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.tax.TaxWithheldVouchersDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TaxWithheldVouchersRepository extends JpaRepository<TaxWithheldVouchersDao, String>, JpaSpecificationExecutor<TaxWithheldVouchersDao> {
}
