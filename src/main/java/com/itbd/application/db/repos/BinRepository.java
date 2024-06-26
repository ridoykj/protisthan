package com.itbd.application.db.repos;


import com.itbd.application.db.dao.stock.BinDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface BinRepository extends JpaRepository<BinDao, String>, JpaSpecificationExecutor<BinDao> {
}
