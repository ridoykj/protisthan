package com.itbd.application.db.repos;


import com.itbd.application.db.dao.AvailabilityOfSlotsDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabAvailabilityOfSlotsRepository extends JpaRepository<AvailabilityOfSlotsDao, String>, JpaSpecificationExecutor<AvailabilityOfSlotsDao> {
}
