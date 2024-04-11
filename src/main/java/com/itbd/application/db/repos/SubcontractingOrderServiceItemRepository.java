package com.itbd.application.db.repos;


import com.itbd.application.db.dao.subcontracting.SubcontractingOrderServiceItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SubcontractingOrderServiceItemRepository extends JpaRepository<SubcontractingOrderServiceItemDao, String>, JpaSpecificationExecutor<SubcontractingOrderServiceItemDao> {
}
