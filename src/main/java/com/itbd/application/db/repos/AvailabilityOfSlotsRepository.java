package com.itbd.application.db.repos;


import com.itbd.application.db.dao.crm.AvailabilityOfSlotsDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface AvailabilityOfSlotsRepository extends JpaRepository<AvailabilityOfSlotsDao, String>, JpaSpecificationExecutor<AvailabilityOfSlotsDao> {
}
