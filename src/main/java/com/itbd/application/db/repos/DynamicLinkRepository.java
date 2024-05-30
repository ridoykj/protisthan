package com.itbd.application.db.repos;


import com.itbd.application.db.dao.core.DynamicLinkDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface DynamicLinkRepository extends JpaRepository<DynamicLinkDao, String>, JpaSpecificationExecutor<DynamicLinkDao> {
}
