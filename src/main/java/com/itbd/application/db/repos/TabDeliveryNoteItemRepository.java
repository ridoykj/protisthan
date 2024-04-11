package com.itbd.application.db.repos;


import com.itbd.application.db.dao.delivery.DeliveryNoteItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabDeliveryNoteItemRepository extends JpaRepository<DeliveryNoteItemDao, String>, JpaSpecificationExecutor<DeliveryNoteItemDao> {
}
