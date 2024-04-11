package com.itbd.application.db.repos;


import com.itbd.application.db.dao.ServiceLevelAgreementDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ServiceLevelAgreementRepository extends JpaRepository<ServiceLevelAgreementDao, String>, JpaSpecificationExecutor<ServiceLevelAgreementDao> {
}
