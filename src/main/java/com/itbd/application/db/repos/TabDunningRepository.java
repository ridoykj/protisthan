package com.itbd.application.db.repos;


import com.itbd.application.db.dao.DunningDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabDunningRepository extends JpaRepository<DunningDao, String>, JpaSpecificationExecutor<DunningDao> {
}
