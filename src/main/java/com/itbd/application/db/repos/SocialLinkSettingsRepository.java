package com.itbd.application.db.repos;


import com.itbd.application.db.dao.website.SocialLinkSettingsDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SocialLinkSettingsRepository extends JpaRepository<SocialLinkSettingsDao, String>, JpaSpecificationExecutor<SocialLinkSettingsDao> {
}
