package com.itbd.application.db.repos;


import com.itbd.application.db.dao.workorder.WorkOrderOperationDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface WorkOrderOperationRepository extends JpaRepository<WorkOrderOperationDao, String>, JpaSpecificationExecutor<WorkOrderOperationDao> {
}
