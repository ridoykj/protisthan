package com.itbd.application.db.repos;


import com.itbd.application.db.dao.RequestForQuotationDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface RequestForQuotationRepository extends JpaRepository<RequestForQuotationDao, String>, JpaSpecificationExecutor<RequestForQuotationDao> {
}
