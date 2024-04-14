package com.itbd.application.db.repos;


import com.itbd.application.db.dao.cummunication.CommunicationDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface CommunicationRepository extends JpaRepository<CommunicationDao, String>, JpaSpecificationExecutor<CommunicationDao> {
}
