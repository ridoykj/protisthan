package com.itbd.application.db.repos;


import com.itbd.application.db.dao.integrations.oauth.OauthClientDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface OauthClientRepository extends JpaRepository<OauthClientDao, String>, JpaSpecificationExecutor<OauthClientDao> {
}
