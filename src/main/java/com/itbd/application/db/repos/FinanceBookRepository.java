package com.itbd.application.db.repos;


import com.itbd.application.db.dao.FinanceBookDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface FinanceBookRepository extends JpaRepository<FinanceBookDao, String>, JpaSpecificationExecutor<FinanceBookDao> {
}
