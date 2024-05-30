package com.itbd.application.db.repos;


import com.itbd.application.db.dao.assets.LinkedLocationDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface LinkedLocationRepository extends JpaRepository<LinkedLocationDao, String>, JpaSpecificationExecutor<LinkedLocationDao> {
}
