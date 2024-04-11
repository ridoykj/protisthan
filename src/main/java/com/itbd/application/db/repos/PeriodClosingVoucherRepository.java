package com.itbd.application.db.repos;


import com.itbd.application.db.dao.PeriodClosingVoucherDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PeriodClosingVoucherRepository extends JpaRepository<PeriodClosingVoucherDao, String>, JpaSpecificationExecutor<PeriodClosingVoucherDao> {
}
