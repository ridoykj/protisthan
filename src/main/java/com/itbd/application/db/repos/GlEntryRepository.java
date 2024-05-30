package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.GlEntryDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface GlEntryRepository extends JpaRepository<GlEntryDao, String>, JpaSpecificationExecutor<GlEntryDao> {
}
