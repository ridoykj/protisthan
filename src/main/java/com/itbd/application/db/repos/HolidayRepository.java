package com.itbd.application.db.repos;


import com.itbd.application.db.dao.setup.holiday.HolidayDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface HolidayRepository extends JpaRepository<HolidayDao, String>, JpaSpecificationExecutor<HolidayDao> {
}
