package com.itbd.application.db.repos;


import com.itbd.application.db.dao.payments.PaymentTermsTemplateDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PaymentTermsTemplateRepository extends JpaRepository<PaymentTermsTemplateDao, String>, JpaSpecificationExecutor<PaymentTermsTemplateDao> {
}
