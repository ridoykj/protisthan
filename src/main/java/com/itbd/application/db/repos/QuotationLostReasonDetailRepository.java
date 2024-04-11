package com.itbd.application.db.repos;


import com.itbd.application.db.dao.quotations.QuotationLostReasonDetailDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface QuotationLostReasonDetailRepository extends JpaRepository<QuotationLostReasonDetailDao, String>, JpaSpecificationExecutor<QuotationLostReasonDetailDao> {
}
