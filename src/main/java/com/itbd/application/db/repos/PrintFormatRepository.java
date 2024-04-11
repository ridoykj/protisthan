package com.itbd.application.db.repos;


import com.itbd.application.db.dao.print.PrintFormatDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PrintFormatRepository extends JpaRepository<PrintFormatDao, String>, JpaSpecificationExecutor<PrintFormatDao> {
}
