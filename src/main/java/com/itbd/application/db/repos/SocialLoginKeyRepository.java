package com.itbd.application.db.repos;


import com.itbd.application.db.dao.integrations.SocialLoginKeyDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SocialLoginKeyRepository extends JpaRepository<SocialLoginKeyDao, String>, JpaSpecificationExecutor<SocialLoginKeyDao> {
}
