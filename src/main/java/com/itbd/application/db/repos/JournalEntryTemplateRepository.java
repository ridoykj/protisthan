package com.itbd.application.db.repos;


import com.itbd.application.db.dao.journals.JournalEntryTemplateDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface JournalEntryTemplateRepository extends JpaRepository<JournalEntryTemplateDao, String>, JpaSpecificationExecutor<JournalEntryTemplateDao> {
}
