package com.itbd.application.db.repos;

import com.itbd.application.db.dao.selling.InstallationNoteItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface InstallationNoteItemRepository extends JpaRepository<InstallationNoteItemDao, String>, JpaSpecificationExecutor<InstallationNoteItemDao> {
}
