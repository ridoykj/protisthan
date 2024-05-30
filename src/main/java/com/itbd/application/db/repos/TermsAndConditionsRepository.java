package com.itbd.application.db.repos;


import com.itbd.application.db.dao.setup.TermsAndConditionsDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TermsAndConditionsRepository extends JpaRepository<TermsAndConditionsDao, String>, JpaSpecificationExecutor<TermsAndConditionsDao> {
}
