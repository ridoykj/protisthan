package com.itbd.application.db.repos;


import com.itbd.application.db.dao.pos.PosFieldDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PosFieldRepository extends JpaRepository<PosFieldDao, String>, JpaSpecificationExecutor<PosFieldDao> {
}
