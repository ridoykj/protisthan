package com.itbd.application.db.repos;


import com.itbd.application.db.dao.warehouse.WarehouseDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WarehouseRepository extends JpaRepository<WarehouseDao, String>, JpaSpecificationExecutor<WarehouseDao> {
}
