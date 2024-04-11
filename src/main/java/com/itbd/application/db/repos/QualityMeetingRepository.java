package com.itbd.application.db.repos;


import com.itbd.application.db.dao.qualitys.QualityMeetingDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface QualityMeetingRepository extends JpaRepository<QualityMeetingDao, String>, JpaSpecificationExecutor<QualityMeetingDao> {
}
