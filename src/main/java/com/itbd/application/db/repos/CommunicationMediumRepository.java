package com.itbd.application.db.repos;


import com.itbd.application.db.dao.communication.CommunicationMediumDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface CommunicationMediumRepository extends JpaRepository<CommunicationMediumDao, String>, JpaSpecificationExecutor<CommunicationMediumDao> {
}
