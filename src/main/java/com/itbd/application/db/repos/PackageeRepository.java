package com.itbd.application.db.repos;


import com.itbd.application.db.dao.PackageDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PackageeRepository extends JpaRepository<PackageDao, String>, JpaSpecificationExecutor<PackageDao> {
}
