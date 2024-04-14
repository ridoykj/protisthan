package com.itbd.application.db.repos;


import com.itbd.application.db.dao.EventParticipantsDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabEventParticipantsRepository extends JpaRepository<EventParticipantsDao, String>, JpaSpecificationExecutor<EventParticipantsDao> {
}
