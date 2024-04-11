package com.itbd.application.db.repos;


import com.itbd.application.db.dao.journals.JournalEntryTemplateAccountDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface JournalEntryTemplateAccountRepository extends JpaRepository<JournalEntryTemplateAccountDao, String>, JpaSpecificationExecutor<JournalEntryTemplateAccountDao> {
}
