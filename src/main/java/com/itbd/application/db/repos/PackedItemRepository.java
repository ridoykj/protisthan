package com.itbd.application.db.repos;


import com.itbd.application.db.dao.stock.PackedItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PackedItemRepository extends JpaRepository<PackedItemDao, String>, JpaSpecificationExecutor<PackedItemDao> {
}
