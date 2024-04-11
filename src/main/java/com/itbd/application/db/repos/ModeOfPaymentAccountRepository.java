package com.itbd.application.db.repos;


import com.itbd.application.db.dao.ModeOfPaymentAccountDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ModeOfPaymentAccountRepository extends JpaRepository<ModeOfPaymentAccountDao, String>, JpaSpecificationExecutor<ModeOfPaymentAccountDao> {
}
