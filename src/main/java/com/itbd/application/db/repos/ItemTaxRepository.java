package com.itbd.application.db.repos;


import com.itbd.application.db.dao.stock.item.ItemTaxDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ItemTaxRepository extends JpaRepository<ItemTaxDao, String>, JpaSpecificationExecutor<ItemTaxDao> {
}
