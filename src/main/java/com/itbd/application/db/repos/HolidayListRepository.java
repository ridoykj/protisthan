package com.itbd.application.db.repos;

import com.itbd.application.db.dao.HolidayListDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface HolidayListRepository extends JpaRepository<HolidayListDao, String>, JpaSpecificationExecutor<HolidayListDao> {
}
