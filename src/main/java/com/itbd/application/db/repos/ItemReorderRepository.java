package com.itbd.application.db.repos;


import com.itbd.application.db.dao.items.ItemReorderDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ItemReorderRepository extends JpaRepository<ItemReorderDao, String>, JpaSpecificationExecutor<ItemReorderDao> {
}
