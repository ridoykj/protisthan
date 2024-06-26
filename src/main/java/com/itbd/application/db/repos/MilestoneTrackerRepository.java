package com.itbd.application.db.repos;


import com.itbd.application.db.dao.automation.MilestoneTrackerDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface MilestoneTrackerRepository extends JpaRepository<MilestoneTrackerDao, String>, JpaSpecificationExecutor<MilestoneTrackerDao> {
}
