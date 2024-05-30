package com.itbd.application.db.repos;

import com.itbd.application.db.dao.portal.HomepageSectionDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface HomepageSectionRepository extends JpaRepository<HomepageSectionDao, String>, JpaSpecificationExecutor<HomepageSectionDao> {
}
