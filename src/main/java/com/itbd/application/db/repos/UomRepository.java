package com.itbd.application.db.repos;


import com.itbd.application.db.dao.uoms.UomDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface UomRepository extends JpaRepository<UomDao, String>, JpaSpecificationExecutor<UomDao> {
}
