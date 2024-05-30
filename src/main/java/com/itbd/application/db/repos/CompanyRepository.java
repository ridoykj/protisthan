package com.itbd.application.db.repos;


import com.itbd.application.db.dao.setup.CompanyDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface CompanyRepository extends JpaRepository<CompanyDao, String>, JpaSpecificationExecutor<CompanyDao> {
}
