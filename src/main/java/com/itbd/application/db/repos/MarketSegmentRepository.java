package com.itbd.application.db.repos;


import com.itbd.application.db.dao.MarketSegmentDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface MarketSegmentRepository extends JpaRepository<MarketSegmentDao, String>, JpaSpecificationExecutor<MarketSegmentDao> {
}
