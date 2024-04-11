package com.itbd.application.db.repos;


import com.itbd.application.db.dao.cummunication.CommunicationMediumDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabCommunicationMediumRepository extends JpaRepository<CommunicationMediumDao, String>, JpaSpecificationExecutor<CommunicationMediumDao> {
}
