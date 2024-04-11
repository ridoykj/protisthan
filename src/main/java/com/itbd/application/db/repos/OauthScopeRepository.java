package com.itbd.application.db.repos;


import com.itbd.application.db.dao.oauths.OauthScopeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface OauthScopeRepository extends JpaRepository<OauthScopeDao, String>, JpaSpecificationExecutor<OauthScopeDao> {
}
