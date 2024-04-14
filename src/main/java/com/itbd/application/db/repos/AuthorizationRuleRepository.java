package com.itbd.application.db.repos;


import com.itbd.application.db.dao.AuthorizationRuleDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabAuthorizationRuleRepository extends JpaRepository<AuthorizationRuleDao, String>, JpaSpecificationExecutor<AuthorizationRuleDao> {
}
