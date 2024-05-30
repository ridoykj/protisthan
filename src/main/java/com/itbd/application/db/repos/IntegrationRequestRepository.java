package com.itbd.application.db.repos;

import com.itbd.application.db.dao.integrations.IntegrationRequestDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface IntegrationRequestRepository extends JpaRepository<IntegrationRequestDao, String>, JpaSpecificationExecutor<IntegrationRequestDao> {
}
