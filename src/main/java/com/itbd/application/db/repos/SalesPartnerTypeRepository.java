package com.itbd.application.db.repos;


import com.itbd.application.db.dao.sales.SalesPartnerTypeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SalesPartnerTypeRepository extends JpaRepository<SalesPartnerTypeDao, String>, JpaSpecificationExecutor<SalesPartnerTypeDao> {
}
