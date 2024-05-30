package com.itbd.application.db.repos;


import com.itbd.application.db.dao.manufacturing.bom.BomCreatorDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface BomCreatorRepository extends JpaRepository<BomCreatorDao, String>, JpaSpecificationExecutor<BomCreatorDao> {
}
