package com.itbd.application.db.repos;

import com.itbd.application.db.dao.stock.item.ItemAttributeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ItemAttributeRepository extends JpaRepository<ItemAttributeDao, String>, JpaSpecificationExecutor<ItemAttributeDao> {
}
