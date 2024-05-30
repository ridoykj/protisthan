package com.itbd.application.db.repos;


import com.itbd.application.db.dao.stock.item.ItemQualityInspectionParameterDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ItemQualityInspectionParameterRepository extends JpaRepository<ItemQualityInspectionParameterDao, String>, JpaSpecificationExecutor<ItemQualityInspectionParameterDao> {
}
