package com.itbd.application.db.repos;


import com.itbd.application.db.dao.stock.RepostItemValuationDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface RepostItemValuationRepository extends JpaRepository<RepostItemValuationDao, String>, JpaSpecificationExecutor<RepostItemValuationDao> {
}
