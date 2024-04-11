package com.itbd.application.db.repos;

import com.itbd.application.db.dao.issues.IssuePriorityDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface IssuePriorityRepository extends JpaRepository<IssuePriorityDao, String>, JpaSpecificationExecutor<IssuePriorityDao> {
}
