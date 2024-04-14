package com.itbd.application.db.repos;


import com.itbd.application.db.dao.DataImportDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface DataImportRepository extends JpaRepository<DataImportDao, String>, JpaSpecificationExecutor<DataImportDao> {
}
