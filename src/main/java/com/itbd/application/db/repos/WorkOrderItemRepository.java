package com.itbd.application.db.repos;


import com.itbd.application.db.dao.manufacturing.workorder.WorkOrderItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WorkOrderItemRepository extends JpaRepository<WorkOrderItemDao, String>, JpaSpecificationExecutor<WorkOrderItemDao> {
}
