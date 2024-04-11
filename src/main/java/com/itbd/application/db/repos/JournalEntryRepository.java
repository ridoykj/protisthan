package com.itbd.application.db.repos;


import com.itbd.application.db.dao.journals.JournalEntryDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface JournalEntryRepository extends JpaRepository<JournalEntryDao, String>, JpaSpecificationExecutor<JournalEntryDao> {
}
