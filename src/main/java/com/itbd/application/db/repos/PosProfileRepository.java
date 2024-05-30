package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.pos.PosProfileDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PosProfileRepository extends JpaRepository<PosProfileDao, String>, JpaSpecificationExecutor<PosProfileDao> {
}
