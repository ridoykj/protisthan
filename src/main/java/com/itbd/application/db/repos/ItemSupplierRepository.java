package com.itbd.application.db.repos;


import com.itbd.application.db.dao.stock.item.ItemSupplierDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ItemSupplierRepository extends JpaRepository<ItemSupplierDao, String>, JpaSpecificationExecutor<ItemSupplierDao> {
}
