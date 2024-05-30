package com.itbd.application.db.repos;


import com.itbd.application.db.dao.stock.PackingSlipItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PackingSlipItemRepository extends JpaRepository<PackingSlipItemDao, String>, JpaSpecificationExecutor<PackingSlipItemDao> {
}
