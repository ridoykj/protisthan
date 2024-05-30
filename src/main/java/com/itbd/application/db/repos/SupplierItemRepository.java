package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.SupplierItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SupplierItemRepository extends JpaRepository<SupplierItemDao, String>, JpaSpecificationExecutor<SupplierItemDao> {
}
