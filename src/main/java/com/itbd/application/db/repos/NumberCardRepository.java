package com.itbd.application.db.repos;


import com.itbd.application.db.dao.desk.NumberCardDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface NumberCardRepository extends JpaRepository<NumberCardDao, String>, JpaSpecificationExecutor<NumberCardDao> {
}
