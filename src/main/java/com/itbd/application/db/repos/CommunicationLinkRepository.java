package com.itbd.application.db.repos;


import com.itbd.application.db.dao.core.CommunicationLinkDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface CommunicationLinkRepository extends JpaRepository<CommunicationLinkDao, String>, JpaSpecificationExecutor<CommunicationLinkDao> {
}
