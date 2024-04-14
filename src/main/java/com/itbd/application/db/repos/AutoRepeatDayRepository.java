package com.itbd.application.db.repos;


import com.itbd.application.db.dao.AutoRepeatDayDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface AutoRepeatDayRepository extends JpaRepository<AutoRepeatDayDao, String>, JpaSpecificationExecutor<AutoRepeatDayDao> {
}
