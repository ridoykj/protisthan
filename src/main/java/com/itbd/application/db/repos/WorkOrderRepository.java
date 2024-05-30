package com.itbd.application.db.repos;


import com.itbd.application.db.dao.manufacturing.workorder.WorkOrderDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WorkOrderRepository extends JpaRepository<WorkOrderDao, String>, JpaSpecificationExecutor<WorkOrderDao> {
}
