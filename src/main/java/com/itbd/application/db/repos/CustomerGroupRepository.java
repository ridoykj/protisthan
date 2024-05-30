package com.itbd.application.db.repos;


import com.itbd.application.db.dao.setup.CustomerGroupDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface CustomerGroupRepository extends JpaRepository<CustomerGroupDao, String>, JpaSpecificationExecutor<CustomerGroupDao> {
}
