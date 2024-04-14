package com.itbd.application.db.repos;


import com.itbd.application.db.dao.GenderDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface GenderRepository extends JpaRepository<GenderDao, String>, JpaSpecificationExecutor<GenderDao> {
}
