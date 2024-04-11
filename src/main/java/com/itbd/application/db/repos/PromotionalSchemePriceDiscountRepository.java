package com.itbd.application.db.repos;


import com.itbd.application.db.dao.PromotionalSchemePriceDiscountDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PromotionalSchemePriceDiscountRepository extends JpaRepository<PromotionalSchemePriceDiscountDao, String>, JpaSpecificationExecutor<PromotionalSchemePriceDiscountDao> {
}
