package com.itbd.application.db.repos;

import com.itbd.application.db.dao.selling.InstallationNoteDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface InstallationNoteRepository extends JpaRepository<InstallationNoteDao, String>, JpaSpecificationExecutor<InstallationNoteDao> {
}
