package com.itbd.application.db.repos;


import com.itbd.application.db.dao.accounts.pos.PosCustomerGroupDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface PosCustomerGroupRepository extends JpaRepository<PosCustomerGroupDao, String>, JpaSpecificationExecutor<PosCustomerGroupDao> {
}
