package com.itbd.application.db.repos;


import com.itbd.application.db.dao.customers.CustomerItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface CustomerItemRepository extends JpaRepository<CustomerItemDao, String>, JpaSpecificationExecutor<CustomerItemDao> {
}
