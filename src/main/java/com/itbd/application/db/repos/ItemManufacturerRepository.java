package com.itbd.application.db.repos;


import com.itbd.application.db.dao.stock.item.ItemManufacturerDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ItemManufacturerRepository extends JpaRepository<ItemManufacturerDao, String>, JpaSpecificationExecutor<ItemManufacturerDao> {
}
