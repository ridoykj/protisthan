package com.itbd.application.db.repos;


import com.itbd.application.db.dao.support.service.ServiceDayDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ServiceDayRepository extends JpaRepository<ServiceDayDao, String>, JpaSpecificationExecutor<ServiceDayDao> {
}
