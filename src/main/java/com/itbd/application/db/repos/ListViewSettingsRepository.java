package com.itbd.application.db.repos;


import com.itbd.application.db.dao.desk.ListViewSettingsDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ListViewSettingsRepository extends JpaRepository<ListViewSettingsDao, String>, JpaSpecificationExecutor<ListViewSettingsDao> {
}
