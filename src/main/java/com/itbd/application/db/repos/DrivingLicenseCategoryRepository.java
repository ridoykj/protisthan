package com.itbd.application.db.repos;


import com.itbd.application.db.dao.setup.DrivingLicenseCategoryDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface DrivingLicenseCategoryRepository extends JpaRepository<DrivingLicenseCategoryDao, String>, JpaSpecificationExecutor<DrivingLicenseCategoryDao> {
}
