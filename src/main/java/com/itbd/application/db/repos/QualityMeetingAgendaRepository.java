package com.itbd.application.db.repos;


import com.itbd.application.db.dao.quality_management.QualityMeetingAgendaDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface QualityMeetingAgendaRepository extends JpaRepository<QualityMeetingAgendaDao, String>, JpaSpecificationExecutor<QualityMeetingAgendaDao> {
}
