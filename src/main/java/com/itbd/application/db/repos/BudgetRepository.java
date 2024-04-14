package com.itbd.application.db.repos;


import com.itbd.application.db.dao.BudgetDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface BudgetRepository extends JpaRepository<BudgetDao, String>, JpaSpecificationExecutor<BudgetDao> {
}
