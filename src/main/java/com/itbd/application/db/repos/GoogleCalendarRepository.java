package com.itbd.application.db.repos;


import com.itbd.application.db.dao.GoogleCalendarDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabGoogleCalendarRepository extends JpaRepository<GoogleCalendarDao, String>, JpaSpecificationExecutor<GoogleCalendarDao> {
}
