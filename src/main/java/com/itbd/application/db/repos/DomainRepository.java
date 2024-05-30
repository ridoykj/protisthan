package com.itbd.application.db.repos;


import com.itbd.application.db.dao.core.DomainDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface DomainRepository extends JpaRepository<DomainDao, String>, JpaSpecificationExecutor<DomainDao> {
}
