package com.itbd.application.db.repos;


import com.itbd.application.db.dao.website.PortalMenuItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PortalMenuItemRepository extends JpaRepository<PortalMenuItemDao, String>, JpaSpecificationExecutor<PortalMenuItemDao> {
}
