package com.itbd.application.db.repos;


import com.itbd.application.db.dao.geo.CountryDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface CountryRepository extends JpaRepository<CountryDao, String>, JpaSpecificationExecutor<CountryDao> {
}
