package com.itbd.application.db.repos;


import com.itbd.application.db.dao.stock.MaterialRequestDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface MaterialRequestRepository extends JpaRepository<MaterialRequestDao, String>, JpaSpecificationExecutor<MaterialRequestDao> {
}
