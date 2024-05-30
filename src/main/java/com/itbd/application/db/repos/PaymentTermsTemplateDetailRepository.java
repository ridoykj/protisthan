package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.payment.PaymentTermsTemplateDetailDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PaymentTermsTemplateDetailRepository extends JpaRepository<PaymentTermsTemplateDetailDao, String>, JpaSpecificationExecutor<PaymentTermsTemplateDetailDao> {
}
