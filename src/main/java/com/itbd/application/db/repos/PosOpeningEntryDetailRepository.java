package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.pos.PosOpeningEntryDetailDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PosOpeningEntryDetailRepository extends JpaRepository<PosOpeningEntryDetailDao, String>, JpaSpecificationExecutor<PosOpeningEntryDetailDao> {
}
