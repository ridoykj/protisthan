package com.itbd.application.db.repos;


import com.itbd.application.db.dao.setup.ItemGroupDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ItemGroupRepository extends JpaRepository<ItemGroupDao, String>, JpaSpecificationExecutor<ItemGroupDao> {
}
