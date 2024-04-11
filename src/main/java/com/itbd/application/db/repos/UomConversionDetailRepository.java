package com.itbd.application.db.repos;


import com.itbd.application.db.dao.uoms.UomConversionDetailDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface UomConversionDetailRepository extends JpaRepository<UomConversionDetailDao, String>, JpaSpecificationExecutor<UomConversionDetailDao> {
}
