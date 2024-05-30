package com.itbd.application.db.repos;


import com.itbd.application.db.dao.manufacturing.DowntimeEntryDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface DowntimeEntryRepository extends JpaRepository<DowntimeEntryDao, String>, JpaSpecificationExecutor<DowntimeEntryDao> {
}
