package com.itbd.application.db.repos;


import com.itbd.application.db.dao.setup.SalesPersonDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SalesPersonRepository extends JpaRepository<SalesPersonDao, String>, JpaSpecificationExecutor<SalesPersonDao> {
}
