package com.itbd.application.db.repos;


import com.itbd.application.db.dao.stock.SerialAndBatchBundleDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SerialAndBatchBundleRepository extends JpaRepository<SerialAndBatchBundleDao, String>, JpaSpecificationExecutor<SerialAndBatchBundleDao> {
}
