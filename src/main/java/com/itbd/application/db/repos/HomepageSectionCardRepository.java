package com.itbd.application.db.repos;

import com.itbd.application.db.dao.HomepageSectionCardDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface HomepageSectionCardRepository extends JpaRepository<HomepageSectionCardDao, String>, JpaSpecificationExecutor<HomepageSectionCardDao> {
}
