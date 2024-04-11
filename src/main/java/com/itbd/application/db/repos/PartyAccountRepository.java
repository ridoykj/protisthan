package com.itbd.application.db.repos;


import com.itbd.application.db.dao.PartyAccountDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PartyAccountRepository extends JpaRepository<PartyAccountDao, String>, JpaSpecificationExecutor<PartyAccountDao> {
}
