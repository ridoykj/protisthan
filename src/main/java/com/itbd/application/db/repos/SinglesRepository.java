package com.itbd.application.db.repos;


import com.itbd.application.db.dao.SinglesDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SinglesRepository extends JpaRepository<SinglesDao, String>, JpaSpecificationExecutor<SinglesDao> {
}
