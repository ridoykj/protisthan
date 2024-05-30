package com.itbd.application.db.repos;


import com.itbd.application.db.dao.stock.warehouse.WarehouseTypeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WarehouseTypeRepository extends JpaRepository<WarehouseTypeDao, String>, JpaSpecificationExecutor<WarehouseTypeDao> {
}
