package com.itbd.application.db.repos;


import com.itbd.application.db.dao.oauths.OauthBearerTokenDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface OauthBearerTokenRepository extends JpaRepository<OauthBearerTokenDao, String>, JpaSpecificationExecutor<OauthBearerTokenDao> {
}
