package com.itbd.application.db.repos;


import com.itbd.application.db.dao.core.TranslationDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TranslationRepository extends JpaRepository<TranslationDao, String>, JpaSpecificationExecutor<TranslationDao> {
}
