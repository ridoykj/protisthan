package com.itbd.application.db.repos;


import com.itbd.application.db.dao.PatchLogDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PatchLogRepository extends JpaRepository<PatchLogDao, String>, JpaSpecificationExecutor<PatchLogDao> {
}
