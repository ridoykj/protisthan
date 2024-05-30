package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.pos.PosPaymentMethodDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PosPaymentMethodRepository extends JpaRepository<PosPaymentMethodDao, String>, JpaSpecificationExecutor<PosPaymentMethodDao> {
}
