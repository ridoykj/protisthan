package com.itbd.application.db.repos;


import com.itbd.application.db.dao.pos.PosClosingEntryTaxesDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PosClosingEntryTaxesRepository extends JpaRepository<PosClosingEntryTaxesDao, String>, JpaSpecificationExecutor<PosClosingEntryTaxesDao> {
}
