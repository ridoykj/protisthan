package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.AllowedToTransactWithDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface AllowedToTransactWithRepository extends JpaRepository<AllowedToTransactWithDao, String>, JpaSpecificationExecutor<AllowedToTransactWithDao> {
}
