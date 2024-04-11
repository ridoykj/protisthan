package com.itbd.application.db.repos;


import com.itbd.application.db.dao.print.PrintStyleDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PrintStyleRepository extends JpaRepository<PrintStyleDao, String>, JpaSpecificationExecutor<PrintStyleDao> {
}
