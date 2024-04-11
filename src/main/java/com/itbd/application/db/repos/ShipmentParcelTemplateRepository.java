package com.itbd.application.db.repos;


import com.itbd.application.db.dao.shipments.ShipmentParcelTemplateDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ShipmentParcelTemplateRepository extends JpaRepository<ShipmentParcelTemplateDao, String>, JpaSpecificationExecutor<ShipmentParcelTemplateDao> {
}
