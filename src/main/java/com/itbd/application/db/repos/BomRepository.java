package com.itbd.application.db.repos;


import com.itbd.application.db.dao.bom.BomDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabBomRepository extends JpaRepository<BomDao, String>, JpaSpecificationExecutor<BomDao> {
}
