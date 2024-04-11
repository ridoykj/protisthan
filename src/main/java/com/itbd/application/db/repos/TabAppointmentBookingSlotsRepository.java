package com.itbd.application.db.repos;


import com.itbd.application.db.dao.appointments.AppointmentBookingSlotsDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabAppointmentBookingSlotsRepository extends JpaRepository<AppointmentBookingSlotsDao, String>, JpaSpecificationExecutor<AppointmentBookingSlotsDao> {
}
