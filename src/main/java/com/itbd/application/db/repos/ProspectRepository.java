package com.itbd.application.db.repos;


import com.itbd.application.db.dao.crm.ProspectDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ProspectRepository extends JpaRepository<ProspectDao, String>, JpaSpecificationExecutor<ProspectDao> {
}
