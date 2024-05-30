package com.itbd.application.db.repos;


import com.itbd.application.db.dao.assets.LocationDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface LocationRepository extends JpaRepository<LocationDao, String>, JpaSpecificationExecutor<LocationDao> {
}
