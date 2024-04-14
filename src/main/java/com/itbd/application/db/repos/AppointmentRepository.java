package com.itbd.application.db.repos;


import com.itbd.application.db.dao.appointments.AppointmentDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabAppointmentRepository extends JpaRepository<AppointmentDao, String>, JpaSpecificationExecutor<AppointmentDao> {
}
