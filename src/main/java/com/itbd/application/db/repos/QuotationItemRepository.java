package com.itbd.application.db.repos;


import com.itbd.application.db.dao.quotations.QuotationItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface QuotationItemRepository extends JpaRepository<QuotationItemDao, String>, JpaSpecificationExecutor<QuotationItemDao> {
}
