package com.itbd.application.db.repos;


import com.itbd.application.db.dao.delivery.DeliveryTripDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface DeliveryTripRepository extends JpaRepository<DeliveryTripDao, String>, JpaSpecificationExecutor<DeliveryTripDao> {
}
