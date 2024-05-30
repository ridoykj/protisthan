package com.itbd.application.db.repos;


import com.itbd.application.db.dao.stock.item.ItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ItemRepository extends JpaRepository<ItemDao, String>, JpaSpecificationExecutor<ItemDao> {
}
