package com.itbd.application.db.repos;


import com.itbd.application.db.dao.automation.MilestoneDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface MilestoneRepository extends JpaRepository<MilestoneDao, String>, JpaSpecificationExecutor<MilestoneDao> {
}
