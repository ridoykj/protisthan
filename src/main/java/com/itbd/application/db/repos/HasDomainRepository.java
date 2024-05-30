package com.itbd.application.db.repos;


import com.itbd.application.db.dao.core.HasDomainDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface HasDomainRepository extends JpaRepository<HasDomainDao, String>, JpaSpecificationExecutor<HasDomainDao> {
}
