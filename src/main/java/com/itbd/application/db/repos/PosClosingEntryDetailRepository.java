package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.pos.PosClosingEntryDetailDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PosClosingEntryDetailRepository extends JpaRepository<PosClosingEntryDetailDao, String>, JpaSpecificationExecutor<PosClosingEntryDetailDao> {
}
