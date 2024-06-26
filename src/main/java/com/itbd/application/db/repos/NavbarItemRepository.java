package com.itbd.application.db.repos;


import com.itbd.application.db.dao.core.NavbarItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface NavbarItemRepository extends JpaRepository<NavbarItemDao, String>, JpaSpecificationExecutor<NavbarItemDao> {
}
