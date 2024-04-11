package com.itbd.application.db.repos;


import com.itbd.application.db.dao.CouponCodeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabCouponCodeRepository extends JpaRepository<CouponCodeDao, String>, JpaSpecificationExecutor<CouponCodeDao> {
}
