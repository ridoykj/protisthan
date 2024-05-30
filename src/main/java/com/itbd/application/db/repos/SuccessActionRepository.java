package com.itbd.application.db.repos;


import com.itbd.application.db.dao.core.SuccessActionDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SuccessActionRepository extends JpaRepository<SuccessActionDao, String>, JpaSpecificationExecutor<SuccessActionDao> {
}
