package com.itbd.application.db.repos;


import com.itbd.application.db.dao.DataImportLogDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface DataImportLogRepository extends JpaRepository<DataImportLogDao, String>, JpaSpecificationExecutor<DataImportLogDao> {
}
