package com.itbd.application.db.repos;


import com.itbd.application.db.dao.email.DocumentFollowDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface DocumentFollowRepository extends JpaRepository<DocumentFollowDao, String>, JpaSpecificationExecutor<DocumentFollowDao> {
}
