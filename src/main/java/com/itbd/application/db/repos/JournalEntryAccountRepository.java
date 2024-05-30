package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.journal.JournalEntryAccountDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface JournalEntryAccountRepository extends JpaRepository<JournalEntryAccountDao, String>, JpaSpecificationExecutor<JournalEntryAccountDao> {
}
