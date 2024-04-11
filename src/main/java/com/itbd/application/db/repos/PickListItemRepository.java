package com.itbd.application.db.repos;


import com.itbd.application.db.dao.PickListItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PickListItemRepository extends JpaRepository<PickListItemDao, String>, JpaSpecificationExecutor<PickListItemDao> {
}
