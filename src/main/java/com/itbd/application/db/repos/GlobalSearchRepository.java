package com.itbd.application.db.repos;

import com.itbd.application.db.dao.system.GlobalSearchDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface GlobalSearchRepository extends JpaRepository<GlobalSearchDao, String>, JpaSpecificationExecutor<GlobalSearchDao> {
}
