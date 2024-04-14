package com.itbd.application.db.repos;


import com.itbd.application.db.dao.CustomDocPermDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface CustomDocPermRepository extends JpaRepository<CustomDocPermDao, String>, JpaSpecificationExecutor<CustomDocPermDao> {
}
