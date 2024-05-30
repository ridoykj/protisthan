package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.SupplierGroupItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SupplierGroupItemRepository extends JpaRepository<SupplierGroupItemDao, String>, JpaSpecificationExecutor<SupplierGroupItemDao> {
}
