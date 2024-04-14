package com.itbd.application.db.repos;


import com.itbd.application.db.dao.CalendarViewDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface CalendarViewRepository extends JpaRepository<CalendarViewDao, String>, JpaSpecificationExecutor<CalendarViewDao> {
}
