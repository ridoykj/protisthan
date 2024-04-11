package com.itbd.application.db.repos;


import com.itbd.application.db.dao.items.ItemWebsiteSpecificationDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ItemWebsiteSpecificationRepository extends JpaRepository<ItemWebsiteSpecificationDao, String>, JpaSpecificationExecutor<ItemWebsiteSpecificationDao> {
}