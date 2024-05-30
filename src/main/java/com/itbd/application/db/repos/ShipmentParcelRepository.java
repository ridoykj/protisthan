package com.itbd.application.db.repos;


import com.itbd.application.db.dao.stock.shipment.ShipmentParcelDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ShipmentParcelRepository extends JpaRepository<ShipmentParcelDao, String>, JpaSpecificationExecutor<ShipmentParcelDao> {
}
