package com.itbd.application.db.repos;


import com.itbd.application.db.dao.cummunication.CommunicationMediumTimeslotDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabCommunicationMediumTimeslotRepository extends JpaRepository<CommunicationMediumTimeslotDao, String>, JpaSpecificationExecutor<CommunicationMediumTimeslotDao> {
}
