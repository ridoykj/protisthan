package com.itbd.application.db.repos;


import com.itbd.application.db.dao.SeriesDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SeriesRepository extends JpaRepository<SeriesDao, String>, JpaSpecificationExecutor<SeriesDao> {
}
