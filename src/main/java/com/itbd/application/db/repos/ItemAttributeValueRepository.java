package com.itbd.application.db.repos;


import com.itbd.application.db.dao.stock.item.ItemAttributeValueDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ItemAttributeValueRepository extends JpaRepository<ItemAttributeValueDao, String>, JpaSpecificationExecutor<ItemAttributeValueDao> {
}
