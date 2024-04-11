package com.itbd.application.db.repos;

import com.itbd.application.db.dao.IndustryTypeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface IndustryTypeRepository extends JpaRepository<IndustryTypeDao, String>, JpaSpecificationExecutor<IndustryTypeDao> {
}
