package com.itbd.application.db.repos;


import com.itbd.application.db.dao.LostReasonDetailDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface LostReasonDetailRepository extends JpaRepository<LostReasonDetailDao, String>, JpaSpecificationExecutor<LostReasonDetailDao> {
}
