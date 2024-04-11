package com.itbd.application.db.repos;


import com.itbd.application.db.dao.uoms.UomConversionFactorDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface UomConversionFactorRepository extends JpaRepository<UomConversionFactorDao, String>, JpaSpecificationExecutor<UomConversionFactorDao> {
}