package com.itbd.application.db.repos;


import com.itbd.application.db.dao.buying.request.RequestForQuotationDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface RequestForQuotationRepository extends JpaRepository<RequestForQuotationDao, String>, JpaSpecificationExecutor<RequestForQuotationDao> {
}
