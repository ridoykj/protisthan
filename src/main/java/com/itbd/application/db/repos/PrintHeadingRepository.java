package com.itbd.application.db.repos;


import com.itbd.application.db.dao.print.PrintHeadingDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PrintHeadingRepository extends JpaRepository<PrintHeadingDao, String>, JpaSpecificationExecutor<PrintHeadingDao> {
}
