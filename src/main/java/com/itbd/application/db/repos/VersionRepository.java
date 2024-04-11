package com.itbd.application.db.repos;


import com.itbd.application.db.dao.VersionDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface VersionRepository extends JpaRepository<VersionDao, String>, JpaSpecificationExecutor<VersionDao> {
}
