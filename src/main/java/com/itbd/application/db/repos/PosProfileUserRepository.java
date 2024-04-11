package com.itbd.application.db.repos;


import com.itbd.application.db.dao.pos.PosProfileUserDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PosProfileUserRepository extends JpaRepository<PosProfileUserDao, String>, JpaSpecificationExecutor<PosProfileUserDao> {
}
