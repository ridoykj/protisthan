package com.itbd.application.db.repos;


import com.itbd.application.db.dao.DrivingLicenseCategoryDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabDrivingLicenseCategoryRepository extends JpaRepository<DrivingLicenseCategoryDao, String>, JpaSpecificationExecutor<DrivingLicenseCategoryDao> {
}
