package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.pos.PosOpeningEntryDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PosOpeningEntryRepository extends JpaRepository<PosOpeningEntryDao, String>, JpaSpecificationExecutor<PosOpeningEntryDao> {
}
