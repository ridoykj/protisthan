package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.TerritoryItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TerritoryItemRepository extends JpaRepository<TerritoryItemDao, String>, JpaSpecificationExecutor<TerritoryItemDao> {
}
