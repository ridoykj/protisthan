package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.promotional_scheme.PromotionalSchemePriceDiscountDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PromotionalSchemePriceDiscountRepository extends JpaRepository<PromotionalSchemePriceDiscountDao, String>, JpaSpecificationExecutor<PromotionalSchemePriceDiscountDao> {
}
