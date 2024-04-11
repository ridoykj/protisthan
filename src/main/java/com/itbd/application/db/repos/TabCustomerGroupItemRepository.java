package com.itbd.application.db.repos;


import com.itbd.application.db.dao.customers.CustomerGroupItemDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TabCustomerGroupItemRepository extends JpaRepository<CustomerGroupItemDao, String>, JpaSpecificationExecutor<CustomerGroupItemDao> {
}
