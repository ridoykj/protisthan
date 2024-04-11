package com.itbd.application.db.repos;


import com.itbd.application.db.dao.RequestForQuotationItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface RequestForQuotationItemRepository extends JpaRepository<RequestForQuotationItemDao, String>, JpaSpecificationExecutor<RequestForQuotationItemDao> {
}
