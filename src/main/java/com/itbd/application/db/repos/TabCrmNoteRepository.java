package com.itbd.application.db.repos;


import com.itbd.application.db.dao.CrmNoteDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabCrmNoteRepository extends JpaRepository<CrmNoteDao, Long>, JpaSpecificationExecutor<CrmNoteDao> {
}
