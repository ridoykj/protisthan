package com.itbd.application.db.repos;


import com.itbd.application.db.dao.pos.PosClosingEntryDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PosClosingEntryRepository extends JpaRepository<PosClosingEntryDao, String>, JpaSpecificationExecutor<PosClosingEntryDao> {
}
