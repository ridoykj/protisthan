package com.itbd.application.db.repos;


import com.itbd.application.db.dao.quotations.QuotationLostReasonDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface QuotationLostReasonRepository extends JpaRepository<QuotationLostReasonDao, String>, JpaSpecificationExecutor<QuotationLostReasonDao> {
}
