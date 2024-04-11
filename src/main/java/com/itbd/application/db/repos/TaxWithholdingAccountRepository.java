package com.itbd.application.db.repos;


import com.itbd.application.db.dao.tasks.TaxWithholdingAccountDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TaxWithholdingAccountRepository extends JpaRepository<TaxWithholdingAccountDao, String>, JpaSpecificationExecutor<TaxWithholdingAccountDao> {
}
