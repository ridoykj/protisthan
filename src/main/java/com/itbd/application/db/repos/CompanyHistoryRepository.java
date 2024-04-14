package com.itbd.application.db.repos;


import com.itbd.application.db.dao.CompanyHistoryDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface CompanyHistoryRepository extends JpaRepository<CompanyHistoryDao, String>, JpaSpecificationExecutor<CompanyHistoryDao> {
}
