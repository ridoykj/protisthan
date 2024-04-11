package com.itbd.application.db.repos;


import com.itbd.application.db.dao.TopBarItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TopBarItemRepository extends JpaRepository<TopBarItemDao, String>, JpaSpecificationExecutor<TopBarItemDao> {
}
