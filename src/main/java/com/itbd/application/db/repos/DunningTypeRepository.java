package com.itbd.application.db.repos;


import com.itbd.application.db.dao.DunningTypeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface DunningTypeRepository extends JpaRepository<DunningTypeDao, String>, JpaSpecificationExecutor<DunningTypeDao> {
}
