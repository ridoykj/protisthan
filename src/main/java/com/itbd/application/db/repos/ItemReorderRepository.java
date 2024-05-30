package com.itbd.application.db.repos;


import com.itbd.application.db.dao.stock.item.ItemReorderDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ItemReorderRepository extends JpaRepository<ItemReorderDao, String>, JpaSpecificationExecutor<ItemReorderDao> {
}
