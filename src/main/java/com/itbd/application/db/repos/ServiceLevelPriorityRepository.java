package com.itbd.application.db.repos;


import com.itbd.application.db.dao.ServiceLevelPriorityDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ServiceLevelPriorityRepository extends JpaRepository<ServiceLevelPriorityDao, String>, JpaSpecificationExecutor<ServiceLevelPriorityDao> {
}
