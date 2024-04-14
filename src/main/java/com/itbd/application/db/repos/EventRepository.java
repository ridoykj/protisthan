package com.itbd.application.db.repos;


import com.itbd.application.db.dao.EventDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface EventRepository extends JpaRepository<EventDao, String>, JpaSpecificationExecutor<EventDao> {
}
