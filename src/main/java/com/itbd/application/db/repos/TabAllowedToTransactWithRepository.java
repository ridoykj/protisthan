package com.itbd.application.db.repos;


import com.itbd.application.db.dao.AllowedToTransactWithDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabAllowedToTransactWithRepository extends JpaRepository<AllowedToTransactWithDao, String>, JpaSpecificationExecutor<AllowedToTransactWithDao> {
}
