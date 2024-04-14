package com.itbd.application.db.repos;


import com.itbd.application.db.dao.CompetitorDetailDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface CompetitorDetailRepository extends JpaRepository<CompetitorDetailDao, String>, JpaSpecificationExecutor<CompetitorDetailDao> {
}
