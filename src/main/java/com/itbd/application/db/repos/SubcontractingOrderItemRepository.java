package com.itbd.application.db.repos;


import com.itbd.application.db.dao.subcontracting.SubcontractingOrderItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SubcontractingOrderItemRepository extends JpaRepository<SubcontractingOrderItemDao, String>, JpaSpecificationExecutor<SubcontractingOrderItemDao> {
}
