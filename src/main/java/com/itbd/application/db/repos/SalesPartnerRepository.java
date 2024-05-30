package com.itbd.application.db.repos;


import com.itbd.application.db.dao.setup.SalesPartnerDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SalesPartnerRepository extends JpaRepository<SalesPartnerDao, String>, JpaSpecificationExecutor<SalesPartnerDao> {
}
