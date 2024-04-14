package com.itbd.application.db.repos;


import com.itbd.application.db.dao.BudgetAccountDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface BudgetAccountRepository extends JpaRepository<BudgetAccountDao, String>, JpaSpecificationExecutor<BudgetAccountDao> {
}
