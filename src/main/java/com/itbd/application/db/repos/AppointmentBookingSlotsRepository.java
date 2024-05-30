package com.itbd.application.db.repos;


import com.itbd.application.db.dao.crm.AppointmentBookingSlotsDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface AppointmentBookingSlotsRepository extends JpaRepository<AppointmentBookingSlotsDao, String>, JpaSpecificationExecutor<AppointmentBookingSlotsDao> {
}
