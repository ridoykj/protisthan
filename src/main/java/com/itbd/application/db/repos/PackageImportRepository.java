package com.itbd.application.db.repos;


import com.itbd.application.db.dao.PackageImportDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PackageImportRepository extends JpaRepository<PackageImportDao, String>, JpaSpecificationExecutor<PackageImportDao> {
}
