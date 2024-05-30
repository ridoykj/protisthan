package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.pos.PosItemGroupDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PosItemGroupRepository extends JpaRepository<PosItemGroupDao, String>, JpaSpecificationExecutor<PosItemGroupDao> {
}
