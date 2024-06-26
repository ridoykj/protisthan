package com.itbd.application.db.repos;


import com.itbd.application.db.dao.setup.DesignationDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface DesignationRepository extends JpaRepository<DesignationDao, String>, JpaSpecificationExecutor<DesignationDao> {
}
