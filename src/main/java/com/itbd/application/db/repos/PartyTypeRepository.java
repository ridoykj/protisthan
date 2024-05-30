package com.itbd.application.db.repos;


import com.itbd.application.db.dao.setup.PartyTypeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PartyTypeRepository extends JpaRepository<PartyTypeDao, String>, JpaSpecificationExecutor<PartyTypeDao> {
}
