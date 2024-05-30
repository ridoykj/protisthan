package com.itbd.application.db.repos;


import com.itbd.application.db.dao.stock.delivery.DeliveryNoteItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface DeliveryNoteItemRepository extends JpaRepository<DeliveryNoteItemDao, String>, JpaSpecificationExecutor<DeliveryNoteItemDao> {
}
