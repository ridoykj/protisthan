package com.itbd.application.db.repos;


import com.itbd.application.db.dao.selling.PartySpecificItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PartySpecificItemRepository extends JpaRepository<PartySpecificItemDao, String>, JpaSpecificationExecutor<PartySpecificItemDao> {
}
