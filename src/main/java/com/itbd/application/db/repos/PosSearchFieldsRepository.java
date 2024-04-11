package com.itbd.application.db.repos;


import com.itbd.application.db.dao.pos.PosSearchFieldsDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PosSearchFieldsRepository extends JpaRepository<PosSearchFieldsDao, String>, JpaSpecificationExecutor<PosSearchFieldsDao> {
}
