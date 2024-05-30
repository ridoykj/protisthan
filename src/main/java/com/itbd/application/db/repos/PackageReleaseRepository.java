package com.itbd.application.db.repos;


import com.itbd.application.db.dao.core.PackageReleaseDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PackageReleaseRepository extends JpaRepository<PackageReleaseDao, String>, JpaSpecificationExecutor<PackageReleaseDao> {
}
