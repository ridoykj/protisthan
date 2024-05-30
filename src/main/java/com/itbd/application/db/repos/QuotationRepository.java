package com.itbd.application.db.repos;


import com.itbd.application.db.dao.selling.quotation.QuotationDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface QuotationRepository extends JpaRepository<QuotationDao, String>, JpaSpecificationExecutor<QuotationDao> {
}
