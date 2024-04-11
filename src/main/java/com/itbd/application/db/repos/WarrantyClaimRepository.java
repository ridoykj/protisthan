package com.itbd.application.db.repos;


import com.itbd.application.db.dao.WarrantyClaimDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WarrantyClaimRepository extends JpaRepository<WarrantyClaimDao, String>, JpaSpecificationExecutor<WarrantyClaimDao> {
}
