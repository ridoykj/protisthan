package com.itbd.application.db.repos;


import com.itbd.application.db.dao.stock.item.ItemPriceDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ItemPriceRepository extends JpaRepository<ItemPriceDao, String>, JpaSpecificationExecutor<ItemPriceDao> {
}
