package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.promotional_scheme.PromotionalSchemeProductDiscountDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PromotionalSchemeProductDiscountRepository extends JpaRepository<PromotionalSchemeProductDiscountDao, String>, JpaSpecificationExecutor<PromotionalSchemeProductDiscountDao> {
}
