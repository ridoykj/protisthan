package com.itbd.application.db.repos;


import com.itbd.application.db.dao.shipments.ShipmentDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ShipmentRepository extends JpaRepository<ShipmentDao, String>, JpaSpecificationExecutor<ShipmentDao> {
}
