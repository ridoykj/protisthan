package com.itbd.application.db.repos;


import com.itbd.application.db.dao.TokenCacheDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TokenCacheRepository extends JpaRepository<TokenCacheDao, String>, JpaSpecificationExecutor<TokenCacheDao> {
}
