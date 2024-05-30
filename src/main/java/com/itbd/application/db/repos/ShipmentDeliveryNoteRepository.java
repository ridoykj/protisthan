package com.itbd.application.db.repos;


import com.itbd.application.db.dao.stock.shipment.ShipmentDeliveryNoteDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ShipmentDeliveryNoteRepository extends JpaRepository<ShipmentDeliveryNoteDao, String>, JpaSpecificationExecutor<ShipmentDeliveryNoteDao> {
}
