package com.itbd.application.db.repos;


import com.itbd.application.db.dao.subcontracting.SubcontractingOrderSuppliedItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface SubcontractingOrderSuppliedItemRepository extends JpaRepository<SubcontractingOrderSuppliedItemDao, String>, JpaSpecificationExecutor<SubcontractingOrderSuppliedItemDao> {
}
