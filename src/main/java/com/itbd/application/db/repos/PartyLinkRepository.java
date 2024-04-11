package com.itbd.application.db.repos;


import com.itbd.application.db.dao.PartyLinkDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PartyLinkRepository extends JpaRepository<PartyLinkDao, String>, JpaSpecificationExecutor<PartyLinkDao> {
}
