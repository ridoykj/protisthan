package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.dunning.DunningDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface DunningRepository extends JpaRepository<DunningDao, String>, JpaSpecificationExecutor<DunningDao> {
}
