package com.itbd.application.db.repos;


import com.itbd.application.db.dao.qualitys.QualityMeetingMinutesDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface QualityMeetingMinutesRepository extends JpaRepository<QualityMeetingMinutesDao, String>, JpaSpecificationExecutor<QualityMeetingMinutesDao> {
}
