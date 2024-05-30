package com.itbd.application.db.repos;


import com.itbd.application.db.dao.core.LanguageDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface LanguageRepository extends JpaRepository<LanguageDao, String>, JpaSpecificationExecutor<LanguageDao> {
}
