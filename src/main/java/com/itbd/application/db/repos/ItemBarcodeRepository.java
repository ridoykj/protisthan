package com.itbd.application.db.repos;


import com.itbd.application.db.dao.stock.item.ItemBarcodeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ItemBarcodeRepository extends JpaRepository<ItemBarcodeDao, String>, JpaSpecificationExecutor<ItemBarcodeDao> {
}
