package com.itbd.application.db.repos;


import com.itbd.application.db.dao.sales.SalesPartnerItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SalesPartnerItemRepository extends JpaRepository<SalesPartnerItemDao, String>, JpaSpecificationExecutor<SalesPartnerItemDao> {
}
