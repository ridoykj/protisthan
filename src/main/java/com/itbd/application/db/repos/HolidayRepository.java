package com.itbd.application.db.repos;


import com.itbd.application.db.dao.HolidayDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabHolidayRepository extends JpaRepository<HolidayDao, String>, JpaSpecificationExecutor<HolidayDao> {
}
