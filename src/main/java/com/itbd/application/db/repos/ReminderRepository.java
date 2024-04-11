package com.itbd.application.db.repos;


import com.itbd.application.db.dao.ReminderDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ReminderRepository extends JpaRepository<ReminderDao, String>, JpaSpecificationExecutor<ReminderDao> {
}
