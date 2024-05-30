package com.itbd.application.db.repos;


import com.itbd.application.db.dao.desk.EventParticipantsDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface EventParticipantsRepository extends JpaRepository<EventParticipantsDao, String>, JpaSpecificationExecutor<EventParticipantsDao> {
}
