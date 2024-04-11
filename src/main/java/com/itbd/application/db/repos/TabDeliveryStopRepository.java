package com.itbd.application.db.repos;


import com.itbd.application.db.dao.delivery.DeliveryStopDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabDeliveryStopRepository extends JpaRepository<DeliveryStopDao, String>, JpaSpecificationExecutor<DeliveryStopDao> {
}
