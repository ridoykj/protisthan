package com.itbd.application.db.repos;


import com.itbd.application.db.dao.social.ReviewLevelDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ReviewLevelRepository extends JpaRepository<ReviewLevelDao, String>, JpaSpecificationExecutor<ReviewLevelDao> {
}
