package com.itbd.application.db.repos;


import com.itbd.application.db.dao.BinDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabBinRepository extends JpaRepository<BinDao, String>, JpaSpecificationExecutor<BinDao> {
}
