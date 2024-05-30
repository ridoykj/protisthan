package com.itbd.application.db.repos;


import com.itbd.application.db.dao.manufacturing.SubOperationDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SubOperationRepository extends JpaRepository<SubOperationDao, String>, JpaSpecificationExecutor<SubOperationDao> {
}
