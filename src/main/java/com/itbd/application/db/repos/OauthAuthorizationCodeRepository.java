package com.itbd.application.db.repos;


import com.itbd.application.db.dao.integrations.oauth.OauthAuthorizationCodeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface OauthAuthorizationCodeRepository extends JpaRepository<OauthAuthorizationCodeDao, String>, JpaSpecificationExecutor<OauthAuthorizationCodeDao> {
}
