package com.itbd.application.db.repos;


import com.itbd.application.db.dao.AutoRepeatDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface AutoRepeatRepository extends JpaRepository<AutoRepeatDao, String>, JpaSpecificationExecutor<AutoRepeatDao> {
}
