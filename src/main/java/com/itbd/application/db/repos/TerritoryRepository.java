package com.itbd.application.db.repos;


import com.itbd.application.db.dao.setup.TerritoryDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TerritoryRepository extends JpaRepository<TerritoryDao, String>, JpaSpecificationExecutor<TerritoryDao> {
}
